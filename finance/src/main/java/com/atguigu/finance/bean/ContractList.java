package com.atguigu.finance.bean;

import java.io.Serializable;
import java.util.List;

public class ContractList implements Serializable {


    private NplmBorrowerInfo nplmBorrowerInfo;
    private List<NplmRepaymentRecord> nplmRepaymentRecordList;
    private List<NplmRepaymentDetail> NplmRepaymentDetailList;

    private List<NplmRepaymentPlan> nplmRepaymentPlanList;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
   private String  clientName ;
    private  String  identityType;
    private  String identityNum;
    private  String proCategoryName;

    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    private  String businessType;
    private String loanContractNum;
    private String contractType;
    private    String city;
    private   String deptName;
    private   String isExpedited;
    private  String signType;
    private  String signDate;

    private  String loanInstalments;
    private  String startDate;
    private    String endDate;
    private   String settleDate;
    private  String loanAmount;

    private String repayAccountBankName;
    private  String repayAccount;
    private String preFee;
    private String loanType;
    private String putAmount;

    public NplmBorrowerInfo getNplmBorrowerInfo() {
        return nplmBorrowerInfo;
    }

    public void setNplmBorrowerInfo(NplmBorrowerInfo nplmBorrowerInfo) {
        this.nplmBorrowerInfo = nplmBorrowerInfo;
    }

    public List<NplmRepaymentDetail> getNplmRepaymentDetailList() {
        return NplmRepaymentDetailList;
    }

    public void setNplmRepaymentDetailList(List<NplmRepaymentDetail> nplmRepaymentDetailList) {
        NplmRepaymentDetailList = nplmRepaymentDetailList;
    }

    public List<NplmRepaymentRecord> getNplmRepaymentRecordList() {
        return nplmRepaymentRecordList;
    }

    public void setNplmRepaymentRecordList(List<NplmRepaymentRecord> nplmRepaymentRecordList) {
        this.nplmRepaymentRecordList = nplmRepaymentRecordList;
    }

    public List<NplmRepaymentPlan> getNplmRepaymentPlanList() {
        return nplmRepaymentPlanList;
    }

    public void setNplmRepaymentPlanList(List<NplmRepaymentPlan> nplmRepaymentPlanList) {
        this.nplmRepaymentPlanList = nplmRepaymentPlanList;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getProCategoryName() {
        return proCategoryName;
    }

    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(String loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
    }

    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    public String getPreFee() {
        return preFee;
    }

    public void setPreFee(String preFee) {
        this.preFee = preFee;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(String putAmount) {
        this.putAmount = putAmount;
    }
}
