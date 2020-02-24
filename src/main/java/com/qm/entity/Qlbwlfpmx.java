package com.qm.entity;

import java.util.Date;

public class Qlbwlfpmx {
    private Long id;

    private Long no;

    private String FBILLNOTPYEID;

    private String FBILLNOTPYE;

    private String FMOBILLNO;

    private Long FMOENTRYSEQ;

    private String FBILLTYPEID;

    private String FBILLTYPE;

    private String FBILLNO;

    private Long FPRDORGID;

    private String FPRDORG;

    private Long FLOTID;

    private String FLOTNO;

    private String FBILLSEQ;

    private Long FWORKSHOPID;

    private String FWORKSHOP;

    private Date FCREATEDATE;

    private Date FENDDATE;

    private String FMATERIALNUMBER;

    private String FMATERIALNAME;

    private String fspecification;

    private String FMaterialattribute;

    private Double FAPPQTY;

    private Double FALREADYAPPQTY;

    private String FDOCUMENTSTATUSID;

    private String FDOCUMENTSTATUS;

    private String FCompleteMateriaStatus;

    private Long FResourceNo;

    private Long FCMATERIALID;

    private String FCMATERIALNUMBER;

    private String FCMATERIALNAME;

    private String FCFspecification;

    private String FPLANERName;

    private String FCATEGORYType;

    private Double FQuantityPerQTY;

    private Double FACTUALQTY;

    private Double stockQTY;

    private Double stockQTY_L;

    private Double understockQTY;

    private Double PRDOrderQTY;

    private Double SUBOrderQTY;

    private Double POQTY;

    private Double PRQTY;

    private Double PLNOrderQTY;

    private Double STOCKQTYSUM;

    private Double PRDOrderQTYSUM;

    private Double SUBOrderQTYSUM;

    private Double POQTYSUM;

    private Double PRQTYSUM;

    private Double PLNOrderQTYSUM;

    private Double demandQTY;

    private Double totalDemandQTY;

    private Double inspectionQTY;

    private String FSRCTYPE;

    private String FSRCBILLNO;

    private Long FSEQ;

    private String FCREATORName;

    private Date FDATE;

    private String requisitionType;

    private String requisitionBillNo;

    private Date requisitionDate;

    private Date deliveryDate;

    private Long FSRCTYPEID;

    private String FSRCStatus;

    private Long FMID;

    private String FMNUMBER;

    private Double FMQTY;

    private Double FMAllocatableQTY;

    private Double FMAllocatedQTY;

    private Double FMRemainingQTY;

    private String supplyUnit;

    private Long supplyPRDORGID;

    private String supplyPRDORG;

    private String FNote;

    private Date demandDate;

    private Date replyDeliveryDate;

    private Double replyQTY;

    private Date replyDate;

    private String dateType;

    private String replyNote;

    private String enoughStatus;

    private Date startDate;

    private Long resourceID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getFBILLNOTPYEID() {
        return FBILLNOTPYEID;
    }

    public void setFBILLNOTPYEID(String FBILLNOTPYEID) {
        this.FBILLNOTPYEID = FBILLNOTPYEID == null ? null : FBILLNOTPYEID.trim();
    }

    public String getFBILLNOTPYE() {
        return FBILLNOTPYE;
    }

    public void setFBILLNOTPYE(String FBILLNOTPYE) {
        this.FBILLNOTPYE = FBILLNOTPYE == null ? null : FBILLNOTPYE.trim();
    }

    public String getFMOBILLNO() {
        return FMOBILLNO;
    }

    public void setFMOBILLNO(String FMOBILLNO) {
        this.FMOBILLNO = FMOBILLNO == null ? null : FMOBILLNO.trim();
    }

    public Long getFMOENTRYSEQ() {
        return FMOENTRYSEQ;
    }

    public void setFMOENTRYSEQ(Long FMOENTRYSEQ) {
        this.FMOENTRYSEQ = FMOENTRYSEQ;
    }

    public String getFBILLTYPEID() {
        return FBILLTYPEID;
    }

    public void setFBILLTYPEID(String FBILLTYPEID) {
        this.FBILLTYPEID = FBILLTYPEID == null ? null : FBILLTYPEID.trim();
    }

    public String getFBILLTYPE() {
        return FBILLTYPE;
    }

    public void setFBILLTYPE(String FBILLTYPE) {
        this.FBILLTYPE = FBILLTYPE == null ? null : FBILLTYPE.trim();
    }

    public String getFBILLNO() {
        return FBILLNO;
    }

    public void setFBILLNO(String FBILLNO) {
        this.FBILLNO = FBILLNO == null ? null : FBILLNO.trim();
    }

    public Long getFPRDORGID() {
        return FPRDORGID;
    }

    public void setFPRDORGID(Long FPRDORGID) {
        this.FPRDORGID = FPRDORGID;
    }

    public String getFPRDORG() {
        return FPRDORG;
    }

    public void setFPRDORG(String FPRDORG) {
        this.FPRDORG = FPRDORG == null ? null : FPRDORG.trim();
    }

    public Long getFLOTID() {
        return FLOTID;
    }

    public void setFLOTID(Long FLOTID) {
        this.FLOTID = FLOTID;
    }

    public String getFLOTNO() {
        return FLOTNO;
    }

    public void setFLOTNO(String FLOTNO) {
        this.FLOTNO = FLOTNO == null ? null : FLOTNO.trim();
    }

    public String getFBILLSEQ() {
        return FBILLSEQ;
    }

    public void setFBILLSEQ(String FBILLSEQ) {
        this.FBILLSEQ = FBILLSEQ == null ? null : FBILLSEQ.trim();
    }

    public Long getFWORKSHOPID() {
        return FWORKSHOPID;
    }

    public void setFWORKSHOPID(Long FWORKSHOPID) {
        this.FWORKSHOPID = FWORKSHOPID;
    }

    public String getFWORKSHOP() {
        return FWORKSHOP;
    }

    public void setFWORKSHOP(String FWORKSHOP) {
        this.FWORKSHOP = FWORKSHOP == null ? null : FWORKSHOP.trim();
    }

    public Date getFCREATEDATE() {
        return FCREATEDATE;
    }

    public void setFCREATEDATE(Date FCREATEDATE) {
        this.FCREATEDATE = FCREATEDATE;
    }

    public Date getFENDDATE() {
        return FENDDATE;
    }

    public void setFENDDATE(Date FENDDATE) {
        this.FENDDATE = FENDDATE;
    }

    public String getFMATERIALNUMBER() {
        return FMATERIALNUMBER;
    }

    public void setFMATERIALNUMBER(String FMATERIALNUMBER) {
        this.FMATERIALNUMBER = FMATERIALNUMBER == null ? null : FMATERIALNUMBER.trim();
    }

    public String getFMATERIALNAME() {
        return FMATERIALNAME;
    }

    public void setFMATERIALNAME(String FMATERIALNAME) {
        this.FMATERIALNAME = FMATERIALNAME == null ? null : FMATERIALNAME.trim();
    }

    public String getFspecification() {
        return fspecification;
    }

    public void setFspecification(String fspecification) {
        this.fspecification = fspecification == null ? null : fspecification.trim();
    }

    public String getFMaterialattribute() {
        return FMaterialattribute;
    }

    public void setFMaterialattribute(String FMaterialattribute) {
        this.FMaterialattribute = FMaterialattribute == null ? null : FMaterialattribute.trim();
    }

    public Double getFAPPQTY() {
        return FAPPQTY;
    }

    public void setFAPPQTY(Double FAPPQTY) {
        this.FAPPQTY = FAPPQTY;
    }

    public Double getFALREADYAPPQTY() {
        return FALREADYAPPQTY;
    }

    public void setFALREADYAPPQTY(Double FALREADYAPPQTY) {
        this.FALREADYAPPQTY = FALREADYAPPQTY;
    }

    public String getFDOCUMENTSTATUSID() {
        return FDOCUMENTSTATUSID;
    }

    public void setFDOCUMENTSTATUSID(String FDOCUMENTSTATUSID) {
        this.FDOCUMENTSTATUSID = FDOCUMENTSTATUSID == null ? null : FDOCUMENTSTATUSID.trim();
    }

    public String getFDOCUMENTSTATUS() {
        return FDOCUMENTSTATUS;
    }

    public void setFDOCUMENTSTATUS(String FDOCUMENTSTATUS) {
        this.FDOCUMENTSTATUS = FDOCUMENTSTATUS == null ? null : FDOCUMENTSTATUS.trim();
    }

    public String getFCompleteMateriaStatus() {
        return FCompleteMateriaStatus;
    }

    public void setFCompleteMateriaStatus(String FCompleteMateriaStatus) {
        this.FCompleteMateriaStatus = FCompleteMateriaStatus == null ? null : FCompleteMateriaStatus.trim();
    }

    public Long getFResourceNo() {
        return FResourceNo;
    }

    public void setFResourceNo(Long FResourceNo) {
        this.FResourceNo = FResourceNo;
    }

    public Long getFCMATERIALID() {
        return FCMATERIALID;
    }

    public void setFCMATERIALID(Long FCMATERIALID) {
        this.FCMATERIALID = FCMATERIALID;
    }

    public String getFCMATERIALNUMBER() {
        return FCMATERIALNUMBER;
    }

    public void setFCMATERIALNUMBER(String FCMATERIALNUMBER) {
        this.FCMATERIALNUMBER = FCMATERIALNUMBER == null ? null : FCMATERIALNUMBER.trim();
    }

    public String getFCMATERIALNAME() {
        return FCMATERIALNAME;
    }

    public void setFCMATERIALNAME(String FCMATERIALNAME) {
        this.FCMATERIALNAME = FCMATERIALNAME == null ? null : FCMATERIALNAME.trim();
    }

    public String getFCFspecification() {
        return FCFspecification;
    }

    public void setFCFspecification(String FCFspecification) {
        this.FCFspecification = FCFspecification == null ? null : FCFspecification.trim();
    }

    public String getFPLANERName() {
        return FPLANERName;
    }

    public void setFPLANERName(String FPLANERName) {
        this.FPLANERName = FPLANERName == null ? null : FPLANERName.trim();
    }

    public String getFCATEGORYType() {
        return FCATEGORYType;
    }

    public void setFCATEGORYType(String FCATEGORYType) {
        this.FCATEGORYType = FCATEGORYType == null ? null : FCATEGORYType.trim();
    }

    public Double getFQuantityPerQTY() {
        return FQuantityPerQTY;
    }

    public void setFQuantityPerQTY(Double FQuantityPerQTY) {
        this.FQuantityPerQTY = FQuantityPerQTY;
    }

    public Double getFACTUALQTY() {
        return FACTUALQTY;
    }

    public void setFACTUALQTY(Double FACTUALQTY) {
        this.FACTUALQTY = FACTUALQTY;
    }

    public Double getStockQTY() {
        return stockQTY;
    }

    public void setStockQTY(Double stockQTY) {
        this.stockQTY = stockQTY;
    }

    public Double getStockQTY_L() {
        return stockQTY_L;
    }

    public void setStockQTY_L(Double stockQTY_L) {
        this.stockQTY_L = stockQTY_L;
    }

    public Double getUnderstockQTY() {
        return understockQTY;
    }

    public void setUnderstockQTY(Double understockQTY) {
        this.understockQTY = understockQTY;
    }

    public Double getPRDOrderQTY() {
        return PRDOrderQTY;
    }

    public void setPRDOrderQTY(Double PRDOrderQTY) {
        this.PRDOrderQTY = PRDOrderQTY;
    }

    public Double getSUBOrderQTY() {
        return SUBOrderQTY;
    }

    public void setSUBOrderQTY(Double SUBOrderQTY) {
        this.SUBOrderQTY = SUBOrderQTY;
    }

    public Double getPOQTY() {
        return POQTY;
    }

    public void setPOQTY(Double POQTY) {
        this.POQTY = POQTY;
    }

    public Double getPRQTY() {
        return PRQTY;
    }

    public void setPRQTY(Double PRQTY) {
        this.PRQTY = PRQTY;
    }

    public Double getPLNOrderQTY() {
        return PLNOrderQTY;
    }

    public void setPLNOrderQTY(Double PLNOrderQTY) {
        this.PLNOrderQTY = PLNOrderQTY;
    }

    public Double getSTOCKQTYSUM() {
        return STOCKQTYSUM;
    }

    public void setSTOCKQTYSUM(Double STOCKQTYSUM) {
        this.STOCKQTYSUM = STOCKQTYSUM;
    }

    public Double getPRDOrderQTYSUM() {
        return PRDOrderQTYSUM;
    }

    public void setPRDOrderQTYSUM(Double PRDOrderQTYSUM) {
        this.PRDOrderQTYSUM = PRDOrderQTYSUM;
    }

    public Double getSUBOrderQTYSUM() {
        return SUBOrderQTYSUM;
    }

    public void setSUBOrderQTYSUM(Double SUBOrderQTYSUM) {
        this.SUBOrderQTYSUM = SUBOrderQTYSUM;
    }

    public Double getPOQTYSUM() {
        return POQTYSUM;
    }

    public void setPOQTYSUM(Double POQTYSUM) {
        this.POQTYSUM = POQTYSUM;
    }

    public Double getPRQTYSUM() {
        return PRQTYSUM;
    }

    public void setPRQTYSUM(Double PRQTYSUM) {
        this.PRQTYSUM = PRQTYSUM;
    }

    public Double getPLNOrderQTYSUM() {
        return PLNOrderQTYSUM;
    }

    public void setPLNOrderQTYSUM(Double PLNOrderQTYSUM) {
        this.PLNOrderQTYSUM = PLNOrderQTYSUM;
    }

    public Double getDemandQTY() {
        return demandQTY;
    }

    public void setDemandQTY(Double demandQTY) {
        this.demandQTY = demandQTY;
    }

    public Double getTotalDemandQTY() {
        return totalDemandQTY;
    }

    public void setTotalDemandQTY(Double totalDemandQTY) {
        this.totalDemandQTY = totalDemandQTY;
    }

    public Double getInspectionQTY() {
        return inspectionQTY;
    }

    public void setInspectionQTY(Double inspectionQTY) {
        this.inspectionQTY = inspectionQTY;
    }

    public String getFSRCTYPE() {
        return FSRCTYPE;
    }

    public void setFSRCTYPE(String FSRCTYPE) {
        this.FSRCTYPE = FSRCTYPE == null ? null : FSRCTYPE.trim();
    }

    public String getFSRCBILLNO() {
        return FSRCBILLNO;
    }

    public void setFSRCBILLNO(String FSRCBILLNO) {
        this.FSRCBILLNO = FSRCBILLNO == null ? null : FSRCBILLNO.trim();
    }

    public Long getFSEQ() {
        return FSEQ;
    }

    public void setFSEQ(Long FSEQ) {
        this.FSEQ = FSEQ;
    }

    public String getFCREATORName() {
        return FCREATORName;
    }

    public void setFCREATORName(String FCREATORName) {
        this.FCREATORName = FCREATORName == null ? null : FCREATORName.trim();
    }

    public Date getFDATE() {
        return FDATE;
    }

    public void setFDATE(Date FDATE) {
        this.FDATE = FDATE;
    }

    public String getRequisitionType() {
        return requisitionType;
    }

    public void setRequisitionType(String requisitionType) {
        this.requisitionType = requisitionType == null ? null : requisitionType.trim();
    }

    public String getRequisitionBillNo() {
        return requisitionBillNo;
    }

    public void setRequisitionBillNo(String requisitionBillNo) {
        this.requisitionBillNo = requisitionBillNo == null ? null : requisitionBillNo.trim();
    }

    public Date getRequisitionDate() {
        return requisitionDate;
    }

    public void setRequisitionDate(Date requisitionDate) {
        this.requisitionDate = requisitionDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getFSRCTYPEID() {
        return FSRCTYPEID;
    }

    public void setFSRCTYPEID(Long FSRCTYPEID) {
        this.FSRCTYPEID = FSRCTYPEID;
    }

    public String getFSRCStatus() {
        return FSRCStatus;
    }

    public void setFSRCStatus(String FSRCStatus) {
        this.FSRCStatus = FSRCStatus == null ? null : FSRCStatus.trim();
    }

    public Long getFMID() {
        return FMID;
    }

    public void setFMID(Long FMID) {
        this.FMID = FMID;
    }

    public String getFMNUMBER() {
        return FMNUMBER;
    }

    public void setFMNUMBER(String FMNUMBER) {
        this.FMNUMBER = FMNUMBER == null ? null : FMNUMBER.trim();
    }

    public Double getFMQTY() {
        return FMQTY;
    }

    public void setFMQTY(Double FMQTY) {
        this.FMQTY = FMQTY;
    }

    public Double getFMAllocatableQTY() {
        return FMAllocatableQTY;
    }

    public void setFMAllocatableQTY(Double FMAllocatableQTY) {
        this.FMAllocatableQTY = FMAllocatableQTY;
    }

    public Double getFMAllocatedQTY() {
        return FMAllocatedQTY;
    }

    public void setFMAllocatedQTY(Double FMAllocatedQTY) {
        this.FMAllocatedQTY = FMAllocatedQTY;
    }

    public Double getFMRemainingQTY() {
        return FMRemainingQTY;
    }

    public void setFMRemainingQTY(Double FMRemainingQTY) {
        this.FMRemainingQTY = FMRemainingQTY;
    }

    public String getSupplyUnit() {
        return supplyUnit;
    }

    public void setSupplyUnit(String supplyUnit) {
        this.supplyUnit = supplyUnit == null ? null : supplyUnit.trim();
    }

    public Long getSupplyPRDORGID() {
        return supplyPRDORGID;
    }

    public void setSupplyPRDORGID(Long supplyPRDORGID) {
        this.supplyPRDORGID = supplyPRDORGID;
    }

    public String getSupplyPRDORG() {
        return supplyPRDORG;
    }

    public void setSupplyPRDORG(String supplyPRDORG) {
        this.supplyPRDORG = supplyPRDORG == null ? null : supplyPRDORG.trim();
    }

    public String getFNote() {
        return FNote;
    }

    public void setFNote(String FNote) {
        this.FNote = FNote == null ? null : FNote.trim();
    }

    public Date getDemandDate() {
        return demandDate;
    }

    public void setDemandDate(Date demandDate) {
        this.demandDate = demandDate;
    }

    public Date getReplyDeliveryDate() {
        return replyDeliveryDate;
    }

    public void setReplyDeliveryDate(Date replyDeliveryDate) {
        this.replyDeliveryDate = replyDeliveryDate;
    }

    public Double getReplyQTY() {
        return replyQTY;
    }

    public void setReplyQTY(Double replyQTY) {
        this.replyQTY = replyQTY;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType == null ? null : dateType.trim();
    }

    public String getReplyNote() {
        return replyNote;
    }

    public void setReplyNote(String replyNote) {
        this.replyNote = replyNote == null ? null : replyNote.trim();
    }

    public String getEnoughStatus() {
        return enoughStatus;
    }

    public void setEnoughStatus(String enoughStatus) {
        this.enoughStatus = enoughStatus == null ? null : enoughStatus.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }
}