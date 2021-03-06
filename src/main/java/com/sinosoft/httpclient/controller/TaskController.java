package com.sinosoft.httpclient.controller;

import com.sinosoft.httpclient.config.AppConsts;
import com.sinosoft.httpclient.config.SysTaskConfig;
import com.sinosoft.httpclient.domain.SpringScheduledCron;
import com.sinosoft.httpclient.dto.Result;
import com.sinosoft.httpclient.repository.SpringScheduledCronRepository;

import com.sinosoft.httpclient.task.ScheduledOfTask;
import com.sinosoft.httpclient.utils.CronUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 管理定时任务(需要做权限控制)
 *
 * @author yudong
 * @date 2019/5/10
 */
@Controller
@RequestMapping("/scheduled/task")
public class TaskController {

    @Autowired
    private ApplicationContext context;
    @Autowired
    private SpringScheduledCronRepository cronRepository;


    @RequestMapping("/list")
    public List<?> queryTaskList(){
        List<SpringScheduledCron> all = cronRepository.findAll();
        return all;
    }

    /**
     * 查看任务列表
     */
    @RequestMapping("/taskList")
    public String taskList(Model model) {
        model.addAttribute("cronList", cronRepository.findAll());
        return "taskList";
    }

    /**
     * 编辑任务cron表达式
     */
    @ResponseBody
    @RequestMapping("/editTaskCron")
    public Result<Void> editTaskCron(String cronKey, String newCron) {
        if (!CronUtils.isValidExpression(newCron)) {
            throw new IllegalArgumentException("失败,非法表达式:" + newCron);
        }
        cronRepository.updateCronExpressionByCronKey(newCron, cronKey);
        //状态为 1时 更新 scheduledFutureMap 集合 重启定时任务
        SpringScheduledCron task = cronRepository.findByCronKey(cronKey);
        if(task.getStatus()==1){
            SysTaskConfig.reset(task);
        }
        return new Result<>(AppConsts.SUCCESS, "更新成功");
    }

    /**
     * 执行定时任务
     */
    @ResponseBody
    @RequestMapping("/runTaskCron")
    public Result<Void> runTaskCron(String cronKey) throws Exception {
        ((ScheduledOfTask) context.getBean(Class.forName(cronKey))).execute();
        return new Result<>(AppConsts.SUCCESS, "执行成功");
    }

    /**
     * 启用或禁用定时任务
     */
    @ResponseBody
    @RequestMapping("/changeStatusTaskCron")
    public Result<Void> changeStatusTaskCron(Integer status, String cronKey) {

        SpringScheduledCron task = cronRepository.findByCronKey(cronKey);
        if( status ==1 ){
            if(!SysTaskConfig.checkOneData(task).equalsIgnoreCase("success")){
                return new Result<>(AppConsts.FAILED, "操作失败01");
            }else {
                SysTaskConfig.start(task);
            }
        }else {
            SysTaskConfig.cancel(task);
        }
        cronRepository.updateStatusByCronKey(status, cronKey);
        return new Result<>(AppConsts.SUCCESS, "操作成功");

    }

}
