package com.qm.entity;

import java.util.Date;

public class CloudMaterial {
    private Long id;

    private String userId;

    private String FMATERIALID;

    private String FMATERIALName;

    private String FMATERIALNumber;

    private String FMATERIALGROUP;

    private String FMATERIALGROUPName;

    private String FCREATEORGID;

    private String FCREATEORGName;

    private String FUSEORGID;

    private String FUSEORGName;

    private String FCREATORID;

    private String FCREATORName;

    private Date FCREATEDATE;

    private String FDOCUMENTSTATUS;

    private String FFORBIDSTATUS;

    private String FAPPROVERID;

    private String FAPPROVERName;

    private Date FAPPROVEDATE;

    private String FSPECIFICATION;

    private String FBASEUNITID;

    private String FBASEUNITName;

    private String FErpClsID;

    private String FErpClsName;

    private String FCategoryID;

    private String FCategoryName;

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

    public String getFMATERIALID() {
        return FMATERIALID;
    }

    public void setFMATERIALID(String FMATERIALID) {
        this.FMATERIALID = FMATERIALID == null ? null : FMATERIALID.trim();
    }

    public String getFMATERIALName() {
        return FMATERIALName;
    }

    public void setFMATERIALName(String FMATERIALName) {
        this.FMATERIALName = FMATERIALName == null ? null : FMATERIALName.trim();
    }

    public String getFMATERIALNumber() {
        return FMATERIALNumber;
    }

    public void setFMATERIALNumber(String FMATERIALNumber) {
        this.FMATERIALNumber = FMATERIALNumber == null ? null : FMATERIALNumber.trim();
    }

    public String getFMATERIALGROUP() {
        return FMATERIALGROUP;
    }

    public void setFMATERIALGROUP(String FMATERIALGROUP) {
        this.FMATERIALGROUP = FMATERIALGROUP == null ? null : FMATERIALGROUP.trim();
    }

    public String getFMATERIALGROUPName() {
        return FMATERIALGROUPName;
    }

    public void setFMATERIALGROUPName(String FMATERIALGROUPName) {
        this.FMATERIALGROUPName = FMATERIALGROUPName == null ? null : FMATERIALGROUPName.trim();
    }

    public String getFCREATEORGID() {
        return FCREATEORGID;
    }

    public void setFCREATEORGID(String FCREATEORGID) {
        this.FCREATEORGID = FCREATEORGID == null ? null : FCREATEORGID.trim();
    }

    public String getFCREATEORGName() {
        return FCREATEORGName;
    }

    public void setFCREATEORGName(String FCREATEORGName) {
        this.FCREATEORGName = FCREATEORGName == null ? null : FCREATEORGName.trim();
    }

    public String getFUSEORGID() {
        return FUSEORGID;
    }

    public void setFUSEORGID(String FUSEORGID) {
        this.FUSEORGID = FUSEORGID == null ? null : FUSEORGID.trim();
    }

    public String getFUSEORGName() {
        return FUSEORGName;
    }

    public void setFUSEORGName(String FUSEORGName) {
        this.FUSEORGName = FUSEORGName == null ? null : FUSEORGName.trim();
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

    public Date getFCREATEDATE() {
        return FCREATEDATE;
    }

    public void setFCREATEDATE(Date FCREATEDATE) {
        this.FCREATEDATE = FCREATEDATE;
    }

    public String getFDOCUMENTSTATUS() {
        return FDOCUMENTSTATUS;
    }

    public void setFDOCUMENTSTATUS(String FDOCUMENTSTATUS) {
        this.FDOCUMENTSTATUS = FDOCUMENTSTATUS == null ? null : FDOCUMENTSTATUS.trim();
    }

    public String getFFORBIDSTATUS() {
        return FFORBIDSTATUS;
    }

    public void setFFORBIDSTATUS(String FFORBIDSTATUS) {
        this.FFORBIDSTATUS = FFORBIDSTATUS == null ? null : FFORBIDSTATUS.trim();
    }

    public String getFAPPROVERID() {
        return FAPPROVERID;
    }

    public void setFAPPROVERID(String FAPPROVERID) {
        this.FAPPROVERID = FAPPROVERID == null ? null : FAPPROVERID.trim();
    }

    public String getFAPPROVERName() {
        return FAPPROVERName;
    }

    public void setFAPPROVERName(String FAPPROVERName) {
        this.FAPPROVERName = FAPPROVERName == null ? null : FAPPROVERName.trim();
    }

    public Date getFAPPROVEDATE() {
        return FAPPROVEDATE;
    }

    public void setFAPPROVEDATE(Date FAPPROVEDATE) {
        this.FAPPROVEDATE = FAPPROVEDATE;
    }

    public String getFSPECIFICATION() {
        return FSPECIFICATION;
    }

    public void setFSPECIFICATION(String FSPECIFICATION) {
        this.FSPECIFICATION = FSPECIFICATION == null ? null : FSPECIFICATION.trim();
    }

    public String getFBASEUNITID() {
        return FBASEUNITID;
    }

    public void setFBASEUNITID(String FBASEUNITID) {
        this.FBASEUNITID = FBASEUNITID == null ? null : FBASEUNITID.trim();
    }

    public String getFBASEUNITName() {
        return FBASEUNITName;
    }

    public void setFBASEUNITName(String FBASEUNITName) {
        this.FBASEUNITName = FBASEUNITName == null ? null : FBASEUNITName.trim();
    }

    public String getFErpClsID() {
        return FErpClsID;
    }

    public void setFErpClsID(String FErpClsID) {
        this.FErpClsID = FErpClsID == null ? null : FErpClsID.trim();
    }

    public String getFErpClsName() {
        return FErpClsName;
    }

    public void setFErpClsName(String FErpClsName) {
        this.FErpClsName = FErpClsName == null ? null : FErpClsName.trim();
    }

    public String getFCategoryID() {
        return FCategoryID;
    }

    public void setFCategoryID(String FCategoryID) {
        this.FCategoryID = FCategoryID == null ? null : FCategoryID.trim();
    }

    public String getFCategoryName() {
        return FCategoryName;
    }

    public void setFCategoryName(String FCategoryName) {
        this.FCategoryName = FCategoryName == null ? null : FCategoryName.trim();
    }
}