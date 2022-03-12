package com.dhl.PDFConvertToCSV;

public class InputCSVData {

    private CustomsDeclarationData customsDeclarationData = new CustomsDeclarationData();

    private CDMSData cdmsData = new CDMSData();

    // 报关单逻辑有误
    // 计算的净重不等于取得的净重
    // 净重不小于等于毛重
    // 币别出现两种或两种以上(币别有误)
    private String customsLogicWrong = "";

    // 报关单与CDMS匹配不一致
    // 件数不等
    // 毛重不等
    // 运费
    // 价值
    // 币别
    private String misMatch = "";

    public CustomsDeclarationData getCustomsDeclarationData() {
        return customsDeclarationData;
    }

    public void setCustomsDeclarationData(CustomsDeclarationData customsDeclarationData) {
        this.customsDeclarationData = customsDeclarationData;
    }

    public CDMSData getCdmsData() {
        return cdmsData;
    }

    public String getCustomsLogicWrong() {
        return customsLogicWrong;
    }

    public void setCustomsLogicWrong(String customsLogicWrong) {
        this.customsLogicWrong = customsLogicWrong;
    }

    public String getMisMatch() {
        return misMatch;
    }

    public void setMisMatch(String misMatch) {
        this.misMatch = misMatch;
    }

    public void setCdmsData(CDMSData cdmsData) {
        this.cdmsData = cdmsData;
    }
}
