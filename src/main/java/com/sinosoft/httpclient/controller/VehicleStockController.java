package com.sinosoft.httpclient.controller;

import com.alibaba.fastjson.JSONArray;
import com.sinosoft.httpclient.config.SecretKey;
import com.sinosoft.httpclient.domain.Tasksdetailsinfo;
import com.sinosoft.httpclient.domain.VehicleStock;
import com.sinosoft.httpclient.dto.VehicleStockDTO;
import com.sinosoft.httpclient.service.HttpClient;
import com.sinosoft.httpclient.service.TasksdetailsService;
import com.sinosoft.httpclient.service.VehicleStockService;
import com.sinosoft.httpclient.task.ScheduledOfTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class VehicleStockController  implements ScheduledOfTask {

    private Logger logger = LoggerFactory.getLogger(VehicleStockController.class);

    @Resource
    private HttpClient httpClient ;

    @Resource
    private VehicleStockService vehicleStockService;

    @Resource
    TasksdetailsService tasksdetailsService;
    /**
     * VehicleStock 接口接收解析报文 第一个接口
     */
    @Override
    public void execute() {
        try {
            long start = System.currentTimeMillis();
            Long endTime = new Date().getTime();
            Tasksdetailsinfo tasksdetailsinfo = new Tasksdetailsinfo();
            tasksdetailsinfo.setBatch("Vehicle_Stock");
            tasksdetailsinfo = tasksdetailsService.findTasksdetails(tasksdetailsinfo);
            String url = tasksdetailsinfo.getUrl();
            System.out.println("第一个接口的地址信息为:"+url);
            //添加参数
            Map<String, Long> uriMap = new HashMap<>(6);

            uriMap.put("startTime",Long.parseLong(tasksdetailsinfo.getEndTime()));
            uriMap.put("endTime", endTime);

            //保存接口结束日期
            tasksdetailsinfo.setStartTime(tasksdetailsinfo.getEndTime());
            tasksdetailsinfo.setEndTime(endTime.toString());
            tasksdetailsService.saveTasksdetails(tasksdetailsinfo);

            for(int i = 0 ; i < 2 ; i++){
                String headerValue ;
                if( i == 0 ){
                    headerValue = SecretKey.FIRST_KEY_MESSAGE;
                }else{
                    headerValue = SecretKey.SECOND_KEY_MESSAGE;
                }
                String returnStr = httpClient.sendGet(url,uriMap,headerValue);
                String str  ;
                if(returnStr.equals("接口调用失败")){
                    str = "接口调用失败"; // TODO 循环请求或者 其他原因导致请求失败，具体原因分析
                }else{
                    List<VehicleStock> vehicleStockList = (List<VehicleStock>) JSONArray.parseArray(returnStr, VehicleStock.class);

                    for(VehicleStock vehicleStock : vehicleStockList){
                        String companyNo = vehicleStock.getCompanyNo();
                        if(SecretKey.FIRST_COMPANY_NO.equals(companyNo)){
                            vehicleStock.setCompanyNo(SecretKey.FIRST_BRANCH_CODE);
                        }else if(SecretKey.SECOND_COMPANY_NO.equals(companyNo)){
                            vehicleStock.setCompanyNo(SecretKey.SECOND_BRANCH_CODE);
                        }
                    }
                    //保存入库
                    str =  vehicleStockService.savevehicleStockList(vehicleStockList,tasksdetailsinfo.getEndTime());
                }
                System.out.println("Vehicle_Stock 接口调用耗时："+(System.currentTimeMillis()-start)+"ms");
                System.out.println("第"+(i+1)+"个接口调用完毕！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("当前异常结果为："+e);
        }

    }


}
