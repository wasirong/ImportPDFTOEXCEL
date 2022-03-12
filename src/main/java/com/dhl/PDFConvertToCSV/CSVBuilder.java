package com.dhl.PDFConvertToCSV;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVBuilder {

    private File file;
    private FileWriter outputfile;

    public CSVBuilder(String filePath) {
        try {
            File file = new File(filePath);

            outputfile = new FileWriter(file, Charset.forName("GBK"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    public void writeDataToCSV(List<String[]> data) {
    public void writeDataToCSV(List<InputCSVData> data) {

        try {
            // create FileWriter object with file as parameter

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);
            // create a List which contains String array
            List<String[]> temData = new ArrayList<String[]>();
            temData.add(new String[]{"报关单号", "运单号",
                    "件数_报关单", "毛重_报关单", "净重_报关单",
                    "成交方式_报关单", "运费_报关单",
                    "总价_报关单", "币别_报关单",
                    "件数_CDMS", "毛重_CDMS", "运费_CDMS",
                    "原始价值_CDMS", "币别_CDMS",
                    "报关单逻辑有误", "报关单与CDMS匹配不一致"
            });
            for (InputCSVData inputCSVData : data) {
                CustomsDeclarationData cusData = inputCSVData.getCustomsDeclarationData();
                CDMSData cdmsData = inputCSVData.getCdmsData();
                temData.add(new String[]{cusData.getCustomsDeclarationNumber(), cusData.getWaybillNumber(),
                        cusData.getCount(), String.valueOf(cusData.getGrossWeight()), String.valueOf(cusData.getNetWeight()),
                        cusData.getTransactionMethod(), String.valueOf(cusData.getFreight()),
                        String.valueOf(cusData.getTotalPrice()), cusData.getCurrencyType(),
                        cdmsData.getCountCDMS(), String.valueOf(cdmsData.getGrossWeightCDMS()), String.valueOf(cdmsData.getFreightCDMS()),
                        String.valueOf(cdmsData.getOriginalValueCDMS()), cdmsData.getCurrencyTypeCDMS(),
                        inputCSVData.getCustomsLogicWrong(), inputCSVData.getMisMatch()
                });
            }
//            data.add(new String[] { "Name", "Class", "Marks" });
//            data.add(new String[] { "Aman", "10", "620" });
//            data.add(new String[] { "Suraj", "10", "630" });
//            for(String[] paperEntry : data ){
//                if(paperEntry != null) {
//
//                    for (String field : paperEntry) {
//                        System.out.print(field + " , ");
//                    }
//                    System.out.println("+++");
//                }
//            }
            writer.writeAll(temData);


            // closing writer connection
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
