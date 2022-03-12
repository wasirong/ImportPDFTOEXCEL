package com.dhl.PDFConvertToCSV;

import java.math.BigDecimal;

public class CDMSData {

    // 件数
    private String CountCDMS = "";

    // 毛重
    private BigDecimal GrossWeightCDMS = new BigDecimal("0");

    // 运费
    private BigDecimal freightCDMS = new BigDecimal("0");

    // 原始价值
    private BigDecimal originalValueCDMS = new BigDecimal("0");

    // 币别
    private String currencyTypeCDMS = "";

    public String getCountCDMS() {
        return CountCDMS;
    }

    public void setCountCDMS(String countCDMS) {
        CountCDMS = countCDMS;
    }

    public BigDecimal getGrossWeightCDMS() {
        return GrossWeightCDMS;
    }

    public void setGrossWeightCDMS(BigDecimal grossWeightCDMS) {
        GrossWeightCDMS = grossWeightCDMS;
    }

    public BigDecimal getFreightCDMS() {
        return freightCDMS;
    }

    public void setFreightCDMS(BigDecimal freightCDMS) {
        this.freightCDMS = freightCDMS;
    }

    public BigDecimal getOriginalValueCDMS() {
        return originalValueCDMS;
    }

    public void setOriginalValueCDMS(BigDecimal originalValueCDMS) {
        this.originalValueCDMS = originalValueCDMS;
    }

    public String getCurrencyTypeCDMS() {
        return currencyTypeCDMS;
    }

    public void setCurrencyTypeCDMS(String currencyTypeCDMS) {
        this.currencyTypeCDMS = currencyTypeCDMS;
    }

    @Override
    public String toString() {
        return "CDMSData{" +
                "CountCDMS='" + CountCDMS + '\'' +
                ", GrossWeightCDMS='" + GrossWeightCDMS + '\'' +
                ", freightCDMS='" + freightCDMS + '\'' +
                ", originalValueCDMS='" + originalValueCDMS + '\'' +
                ", currencyTypeCDMS='" + currencyTypeCDMS + '\'' +
                '}';
    }
}
