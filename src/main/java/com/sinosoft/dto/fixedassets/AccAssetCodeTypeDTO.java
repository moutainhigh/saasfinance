package com.sinosoft.dto.fixedassets;

import java.math.BigDecimal;

/**
 * @author jiangyc
 * @Description
 * @create 2019-03-26 17:04
 */
public class AccAssetCodeTypeDTO {
    private String centerCode;      //核算单位
    private String branchCode;      //基层单位
    private String accBookType;     //账套类型
    private String accBookCode;     //账套编码
    private String codeType;        //管理类别编码
    private String assetType;       //固定资产类别编码

    private String ct;              //代码类别

    private String assetSimpleName;        //固定资产类别简称
    private String assetComplexName;       //固定资产类别全称
    private String level;                  //固定资产类别层级
    private String endFlag;                //末级标志
    private String superCode;              //父级编码
    private String itemCode1;              //科目编码1
    private String articleCode1;           //专项编码1
    private String itemCode2;              //科目编码2
    private String articleCode2;           //专项编码2
    private String itemCode3;              //科目编码3
    private String articleCode3;           //专项编码3
    private String itemCode4;              //科目编码4
    private String articleCode4;           //专项编码4
    private String itemCode5;              //科目编码5
    private String articleCode5;           //专项编码5
    private String itemCode6;              //科目编码6
    private String articleCode6;           //专项编码6
    private BigDecimal netSurplusRate;     //净残值率
    private BigDecimal depYears;           //折旧年限
    private String depType;                //折旧方法
    private String useFlag;                //使用状态
    private String createOper;             //录入人
    private String createTime;             //录入时间
    private String updateOper;             //修改人
    private String updateTime;             //修改时间
    private String temp;                   //备用

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccBookType() {
        return accBookType;
    }

    public void setAccBookType(String accBookType) {
        this.accBookType = accBookType;
    }

    public String getAccBookCode() {
        return accBookCode;
    }

    public void setAccBookCode(String accBookCode) {
        this.accBookCode = accBookCode;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetSimpleName() {
        return assetSimpleName;
    }

    public void setAssetSimpleName(String assetSimpleName) {
        this.assetSimpleName = assetSimpleName;
    }

    public String getAssetComplexName() {
        return assetComplexName;
    }

    public void setAssetComplexName(String assetComplexName) {
        this.assetComplexName = assetComplexName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public String getSuperCode() {
        return superCode;
    }

    public void setSuperCode(String superCode) {
        this.superCode = superCode;
    }

    public String getItemCode1() {
        return itemCode1;
    }

    public void setItemCode1(String itemCode1) {
        this.itemCode1 = itemCode1;
    }

    public String getArticleCode1() {
        return articleCode1;
    }

    public void setArticleCode1(String articleCode1) {
        this.articleCode1 = articleCode1;
    }

    public String getItemCode2() {
        return itemCode2;
    }

    public void setItemCode2(String itemCode2) {
        this.itemCode2 = itemCode2;
    }

    public String getArticleCode2() {
        return articleCode2;
    }

    public void setArticleCode2(String articleCode2) {
        this.articleCode2 = articleCode2;
    }

    public String getItemCode3() {
        return itemCode3;
    }

    public void setItemCode3(String itemCode3) {
        this.itemCode3 = itemCode3;
    }

    public String getArticleCode3() {
        return articleCode3;
    }

    public void setArticleCode3(String articleCode3) {
        this.articleCode3 = articleCode3;
    }

    public String getItemCode4() {
        return itemCode4;
    }

    public void setItemCode4(String itemCode4) {
        this.itemCode4 = itemCode4;
    }

    public String getArticleCode4() {
        return articleCode4;
    }

    public void setArticleCode4(String articleCode4) {
        this.articleCode4 = articleCode4;
    }

    public String getItemCode5() {
        return itemCode5;
    }

    public void setItemCode5(String itemCode5) {
        this.itemCode5 = itemCode5;
    }

    public String getArticleCode5() {
        return articleCode5;
    }

    public void setArticleCode5(String articleCode5) {
        this.articleCode5 = articleCode5;
    }

    public String getItemCode6() {
        return itemCode6;
    }

    public void setItemCode6(String itemCode6) {
        this.itemCode6 = itemCode6;
    }

    public String getArticleCode6() {
        return articleCode6;
    }

    public void setArticleCode6(String articleCode6) {
        this.articleCode6 = articleCode6;
    }

    public BigDecimal getNetSurplusRate() {
        return netSurplusRate;
    }

    public void setNetSurplusRate(BigDecimal netSurplusRate) {
        this.netSurplusRate = netSurplusRate;
    }

    public BigDecimal getDepYears() {
        return depYears;
    }

    public void setDepYears(BigDecimal depYears) {
        this.depYears = depYears;
    }

    public String getDepType() {
        return depType;
    }

    public void setDepType(String depType) {
        this.depType = depType;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getCreateOper() {
        return createOper;
    }

    public void setCreateOper(String createOper) {
        this.createOper = createOper;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateOper() {
        return updateOper;
    }

    public void setUpdateOper(String updateOper) {
        this.updateOper = updateOper;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
