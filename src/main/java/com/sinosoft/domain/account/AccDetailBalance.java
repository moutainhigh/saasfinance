package com.sinosoft.domain.account;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "accdetailbalance")
public class AccDetailBalance {
    @EmbeddedId
    private AccDetailBalanceId id ;
    private String directionIdxName ;//科目方向段名称
    private String directionOther ;//专项方向段
    private String f01 ;//科目段
    private String f02 ;
    private String f03 ;
    private String f04 ;
    private String f05 ;
    private String f06 ;
    private String f07 ;
    private String f08 ;
    private String f09 ;
    private String f10 ;
    private String f11 ;
    private String f12 ;
    private String f13 ;
    private String f14 ;
    private String f15 ;
    private String f16 ;
    private String f17 ;
    private String f18 ;
    private String f19 ;
    private String f20 ;
    private String f21 ;
    private String f22 ;
    private String f23 ;
    private String f24 ;
    private String f25 ;
    private String f26 ;
    private String f27 ;
    private String f28 ;
    private String f29 ;
    private String f30 ;
    private String f31 ;
    private String f32 ;
    private String f33 ;
    private String f34 ;
    private String f35 ;
    private String f36 ;
    private String f37 ;
    private String f38 ;
    private String f39 ;
    private String f40 ;
    private String currency ;//原币别编码
    private BigDecimal debitSource ;//原币本月借方金额
    private BigDecimal creditSource ;//原币本月贷方金额
    private BigDecimal debitSourceQuarter ;//原币本季借方金额
    private BigDecimal creditSourceQuarter ;//原币本季贷方金额
    private BigDecimal debitSourceYear ;//原币本年借方金额
    private BigDecimal creditSourceYear ;//原币本年贷方金额
    private BigDecimal debitDest ;//本位币本月借方金额
    private BigDecimal creditDest ;//本位币本月贷方金额
    private BigDecimal debitDestQuarter ;//本位币本季借方金额
    private BigDecimal creditDestQuarter ;//本位币本季贷方金额
    private BigDecimal debitDestYear ;//本位币本年借方金额
    private BigDecimal creditDestYear ;//本位币本年贷方金额
    private BigDecimal balanceSource ;//原币期末余额
    private BigDecimal balanceBeginSource ;//原币期初余额
    private BigDecimal balanceDest ;//本位币期末余额
    private BigDecimal balanceBeginDest ;//本位币期初余额
    private String createBy ;//创建人
    private String createTime ;//创建时间
    private String temp ;//备注
    private String temp1 ;
    private String temp2 ;
    private String temp3 ;
    private String temp4 ;
    private String temp5 ;

    public AccDetailBalance() {
    }
    public AccDetailBalance(AccDetailBalanceId id) {
        this.id = id;
    }

    public AccDetailBalanceId getId() { return id; }
    public void setId(AccDetailBalanceId id) { this.id = id; }

    public String getDirectionIdxName() { return directionIdxName; }
    public void setDirectionIdxName(String directionIdxName) { this.directionIdxName = directionIdxName; }

    public String getDirectionOther() {
        return directionOther;
    }

    public void setDirectionOther(String directionOther) {
        this.directionOther = directionOther;
    }

    public String getF01() { return f01; }
    public void setF01(String f01) { this.f01 = f01; }

    public String getF02() { return f02; }
    public void setF02(String f02) { this.f02 = f02; }

    public String getF03() { return f03; }
    public void setF03(String f03) { this.f03 = f03; }

    public String getF04() { return f04; }
    public void setF04(String f04) { this.f04 = f04; }

    public String getF05() { return f05; }
    public void setF05(String f05) { this.f05 = f05; }

    public String getF06() { return f06; }
    public void setF06(String f06) { this.f06 = f06; }

    public String getF07() { return f07; }
    public void setF07(String f07) { this.f07 = f07; }

    public String getF08() { return f08; }
    public void setF08(String f08) { this.f08 = f08; }

    public String getF09() { return f09; }
    public void setF09(String f09) { this.f09 = f09; }

    public String getF10() { return f10; }
    public void setF10(String f10) { this.f10 = f10; }

    public String getF11() { return f11; }
    public void setF11(String f11) { this.f11 = f11; }

    public String getF12() { return f12; }
    public void setF12(String f12) { this.f12 = f12; }

    public String getF13() { return f13; }
    public void setF13(String f13) { this.f13 = f13; }

    public String getF14() { return f14; }
    public void setF14(String f14) { this.f14 = f14; }

    public String getF15() { return f15; }
    public void setF15(String f15) { this.f15 = f15; }

    public String getF16() { return f16; }
    public void setF16(String f16) { this.f16 = f16; }

    public String getF17() { return f17; }
    public void setF17(String f17) { this.f17 = f17; }

    public String getF18() { return f18; }
    public void setF18(String f18) { this.f18 = f18; }

    public String getF19() { return f19; }
    public void setF19(String f19) { this.f19 = f19; }

    public String getF20() { return f20; }
    public void setF20(String f20) { this.f20 = f20; }

    public String getF21() { return f21; }
    public void setF21(String f21) { this.f21 = f21; }

    public String getF22() { return f22; }
    public void setF22(String f22) { this.f22 = f22; }

    public String getF23() { return f23; }
    public void setF23(String f23) { this.f23 = f23; }

    public String getF24() { return f24; }
    public void setF24(String f24) { this.f24 = f24; }

    public String getF25() { return f25; }
    public void setF25(String f25) { this.f25 = f25; }

    public String getF26() { return f26; }
    public void setF26(String f26) { this.f26 = f26; }

    public String getF27() { return f27; }
    public void setF27(String f27) { this.f27 = f27; }

    public String getF28() { return f28; }
    public void setF28(String f28) { this.f28 = f28; }

    public String getF29() { return f29; }
    public void setF29(String f29) { this.f29 = f29; }

    public String getF30() { return f30; }
    public void setF30(String f30) { this.f30 = f30; }

    public String getF31() { return f31; }

    public void setF31(String f31) { this.f31 = f31; }

    public String getF32() { return f32; }

    public void setF32(String f32) { this.f32 = f32; }

    public String getF33() { return f33; }

    public void setF33(String f33) { this.f33 = f33; }

    public String getF34() { return f34; }

    public void setF34(String f34) { this.f34 = f34; }

    public String getF35() { return f35; }

    public void setF35(String f35) { this.f35 = f35; }

    public String getF36() { return f36; }

    public void setF36(String f36) { this.f36 = f36; }

    public String getF37() { return f37; }

    public void setF37(String f37) { this.f37 = f37; }

    public String getF38() { return f38; }

    public void setF38(String f38) { this.f38 = f38; }

    public String getF39() { return f39; }

    public void setF39(String f39) { this.f39 = f39; }

    public String getF40() { return f40; }

    public void setF40(String f40) { this.f40 = f40; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public BigDecimal getDebitSource() {
        return debitSource;
    }

    public void setDebitSource(BigDecimal debitSource) {
        this.debitSource = debitSource;
    }

    public BigDecimal getCreditSource() {
        return creditSource;
    }

    public void setCreditSource(BigDecimal creditSource) {
        this.creditSource = creditSource;
    }

    public BigDecimal getDebitSourceQuarter() {
        return debitSourceQuarter;
    }

    public void setDebitSourceQuarter(BigDecimal debitSourceQuarter) {
        this.debitSourceQuarter = debitSourceQuarter;
    }

    public BigDecimal getCreditSourceQuarter() {
        return creditSourceQuarter;
    }

    public void setCreditSourceQuarter(BigDecimal creditSourceQuarter) {
        this.creditSourceQuarter = creditSourceQuarter;
    }

    public BigDecimal getDebitSourceYear() {
        return debitSourceYear;
    }

    public void setDebitSourceYear(BigDecimal debitSourceYear) {
        this.debitSourceYear = debitSourceYear;
    }

    public BigDecimal getCreditSourceYear() {
        return creditSourceYear;
    }

    public void setCreditSourceYear(BigDecimal creditSourceYear) {
        this.creditSourceYear = creditSourceYear;
    }

    public BigDecimal getDebitDest() {
        return debitDest;
    }

    public void setDebitDest(BigDecimal debitDest) {
        this.debitDest = debitDest;
    }

    public BigDecimal getCreditDest() {
        return creditDest;
    }

    public void setCreditDest(BigDecimal creditDest) {
        this.creditDest = creditDest;
    }

    public BigDecimal getDebitDestQuarter() {
        return debitDestQuarter;
    }

    public void setDebitDestQuarter(BigDecimal debitDestQuarter) {
        this.debitDestQuarter = debitDestQuarter;
    }

    public BigDecimal getCreditDestQuarter() {
        return creditDestQuarter;
    }

    public void setCreditDestQuarter(BigDecimal creditDestQuarter) {
        this.creditDestQuarter = creditDestQuarter;
    }

    public BigDecimal getDebitDestYear() {
        return debitDestYear;
    }

    public void setDebitDestYear(BigDecimal debitDestYear) {
        this.debitDestYear = debitDestYear;
    }

    public BigDecimal getCreditDestYear() {
        return creditDestYear;
    }

    public void setCreditDestYear(BigDecimal creditDestYear) {
        this.creditDestYear = creditDestYear;
    }

    public BigDecimal getBalanceSource() {
        return balanceSource;
    }

    public void setBalanceSource(BigDecimal balanceSource) {
        this.balanceSource = balanceSource;
    }

    public BigDecimal getBalanceBeginSource() {
        return balanceBeginSource;
    }

    public void setBalanceBeginSource(BigDecimal balanceBeginSource) {
        this.balanceBeginSource = balanceBeginSource;
    }

    public BigDecimal getBalanceDest() {
        return balanceDest;
    }

    public void setBalanceDest(BigDecimal balanceDest) {
        this.balanceDest = balanceDest;
    }

    public BigDecimal getBalanceBeginDest() {
        return balanceBeginDest;
    }

    public void setBalanceBeginDest(BigDecimal balanceBeginDest) {
        this.balanceBeginDest = balanceBeginDest;
    }

    public String getCreateBy() { return createBy; }
    public void setCreateBy(String createBy) { this.createBy = createBy; }

    public String getCreateTime() { return createTime; }
    public void setCreateTime(String createTime) { this.createTime = createTime; }

    public String getTemp() { return temp; }
    public void setTemp(String temp) { this.temp = temp; }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3;
    }

    public String getTemp4() {
        return temp4;
    }

    public void setTemp4(String temp4) {
        this.temp4 = temp4;
    }

    public String getTemp5() {
        return temp5;
    }

    public void setTemp5(String temp5) {
        this.temp5 = temp5;
    }
}
