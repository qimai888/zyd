package com.qm.entity;

import java.util.Date;

public class CloudSaleOrder {
    private Long id;

    private String userId;

    private String FID;

    private String FBillNo;

    private Date FDate;

    private String FDOCUMENTSTATUS;

    private String FCANCELSTATUS;

    private String FSALEORGID;

    private String FSALEORGName;

    private String FCREATORID;

    private String FCREATORName;

    private String FMaterialID;

    private String FMaterialName;

    private String FMaterialNumber;

    private String FSPECIFICATION;

    private String FQTY;

    private String FSTOCKOUTQTY;

    private Date FDELIVERYDATE;

    private String FMRPCLOSESTATUS;

    private String FMRPTERMINATESTATUS;

    private String FMRPFREEZESTATUS;

    private String FCLOSESTATUS;

    private Long illegalId;

    private Date getTime;

    private Long enterpriseId;

    private String FWCQty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID == null ? null : FID.trim();
    }

    public String getFBillNo() {
        return FBillNo;
    }

    public void setFBillNo(String FBillNo) {
        this.FBillNo = FBillNo == null ? null : FBillNo.trim();
    }

    public Date getFDate() {
        return FDate;
    }

    public void setFDate(Date FDate) {
        this.FDate = FDate;
    }

    public String getFDOCUMENTSTATUS() {
        return FDOCUMENTSTATUS;
    }

    public void setFDOCUMENTSTATUS(String FDOCUMENTSTATUS) {
        this.FDOCUMENTSTATUS = FDOCUMENTSTATUS == null ? null : FDOCUMENTSTATUS.trim();
    }

    public String getFCANCELSTATUS() {
        return FCANCELSTATUS;
    }

    public void setFCANCELSTATUS(String FCANCELSTATUS) {
        this.FCANCELSTATUS = FCANCELSTATUS == null ? null : FCANCELSTATUS.trim();
    }

    public String getFSALEORGID() {
        return FSALEORGID;
    }

    public void setFSALEORGID(String FSALEORGID) {
        this.FSALEORGID = FSALEORGID == null ? null : FSALEORGID.trim();
    }

    public String getFSALEORGName() {
        return FSALEORGName;
    }

    public void setFSALEORGName(String FSALEORGName) {
        this.FSALEORGName = FSALEORGName == null ? null : FSALEORGName.trim();
    }

    public String getFCREATORID() {
        return FCREATORID;
    }

    public void setFCREATORID(String FCREATORID) {
        this.FCREATORID = FCREATORID == null ? null : FCREATORID.trim();
    }

    public String getFCREATORName() {
        return FCREATORName;
    }

    public void setFCREATORName(String FCREATORName) {
        this.FCREATORName = FCREATORName == null ? null : FCREATORName.trim();
    }

    public String getFMaterialID() {
        return FMaterialID;
    }

    public void setFMaterialID(String FMaterialID) {
        this.FMaterialID = FMaterialID == null ? null : FMaterialID.trim();
    }

    public String getFMaterialName() {
        return FMaterialName;
    }

    public void setFMaterialName(String FMaterialName) {
        this.FMaterialName = FMaterialName == null ? null : FMaterialName.trim();
    }

    public String getFMaterialNumber() {
        return FMaterialNumber;
    }

    public void setFMaterialNumber(String FMaterialNumber) {
        this.FMaterialNumber = FMaterialNumber == null ? null : FMaterialNumber.trim();
    }

    public String getFSPECIFICATION() {
        return FSPECIFICATION;
    }

    public void setFSPECIFICATION(String FSPECIFICATION) {
        this.FSPECIFICATION = FSPECIFICATION == null ? null : FSPECIFICATION.trim();
    }

    public String getFQTY() {
        return FQTY;
    }

    public void setFQTY(String FQTY) {
        this.FQTY = FQTY == null ? null : FQTY.trim();
    }

    public String getFSTOCKOUTQTY() {
        return FSTOCKOUTQTY;
    }

    public void setFSTOCKOUTQTY(String FSTOCKOUTQTY) {
        this.FSTOCKOUTQTY = FSTOCKOUTQTY == null ? null : FSTOCKOUTQTY.trim();
    }

    public Date getFDELIVERYDATE() {
        return FDELIVERYDATE;
    }

    public void setFDELIVERYDATE(Date FDELIVERYDATE) {
        this.FDELIVERYDATE = FDELIVERYDATE;
    }

    public String getFMRPCLOSESTATUS() {
        return FMRPCLOSESTATUS;
    }

    public void setFMRPCLOSESTATUS(String FMRPCLOSESTATUS) {
        this.FMRPCLOSESTATUS = FMRPCLOSESTATUS == null ? null : FMRPCLOSESTATUS.trim();
    }

    public String getFMRPTERMINATESTATUS() {
        return FMRPTERMINATESTATUS;
    }

    public void setFMRPTERMINATESTATUS(String FMRPTERMINATESTATUS) {
        this.FMRPTERMINATESTATUS = FMRPTERMINATESTATUS == null ? null : FMRPTERMINATESTATUS.trim();
    }

    public String getFMRPFREEZESTATUS() {
        return FMRPFREEZESTATUS;
    }

    public void setFMRPFREEZESTATUS(String FMRPFREEZESTATUS) {
        this.FMRPFREEZESTATUS = FMRPFREEZESTATUS == null ? null : FMRPFREEZESTATUS.trim();
    }

    public String getFCLOSESTATUS() {
        return FCLOSESTATUS;
    }

    public void setFCLOSESTATUS(String FCLOSESTATUS) {
        this.FCLOSESTATUS = FCLOSESTATUS == null ? null : FCLOSESTATUS.trim();
    }

    public Long getIllegalId() {
        return illegalId;
    }

    public void setIllegalId(Long illegalId) {
        this.illegalId = illegalId;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getFWCQty() {
        return FWCQty;
    }

    public void setFWCQty(String FWCQty) {
        this.FWCQty = FWCQty == null ? null : FWCQty.trim();
    }
}