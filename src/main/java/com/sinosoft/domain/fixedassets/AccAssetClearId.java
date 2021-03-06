package com.sinosoft.domain.fixedassets;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author jiangyc
 * @Description
 * @create 2019-03-26 13:57
 */
@Embeddable
public class AccAssetClearId implements Serializable {
    private String centerCode;      //核算单位
    private String branchCode;      //基层单位
    private String accBookType;     //账套类型
    private String accBookCode;     //账套编码
    private String codeType;        //管理类别编码
    private String assetCode;       //固定资产编号

    public AccAssetClearId() { }

    public AccAssetClearId(String centerCode, String branchCode, String accBookType, String accBookCode, String codeType, String assetCode) {
        this.centerCode = centerCode;
        this.branchCode = branchCode;
        this.accBookType = accBookType;
        this.accBookCode = accBookCode;
        this.codeType = codeType;
        this.assetCode = assetCode;
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

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }
}
