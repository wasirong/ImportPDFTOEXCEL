package com.dhl.PDFConvertToCSV;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private Button SelectInputDicID;
    @FXML
    private Button SelectOutputDicID;
    @FXML
    private Button GenerateCsvID;
    @FXML
    private TextField inputDirPathID;
    @FXML
    private TextField outputDirPathID;
    @FXML
    private Label ActionTarget;

    public static String inputDirPath;

    public static String outputDirPath;

//    Logger LOG = LoggerFactory.getLogger(Controller.class);

    @FXML
    public void SelectInputDicAction() {
        DirectoryChooser inputDirChooser = new DirectoryChooser();
        inputDirChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File selectedDirectory = inputDirChooser.showDialog((Stage) SelectInputDicID.getScene().getWindow());
        if (selectedDirectory != null) {
            inputDirPath = selectedDirectory.getAbsolutePath();
            if (!inputDirPath.equals("")) {
                inputDirPathID.setText(inputDirPath);
//                LOG.info("选择PDF路径:" + inputDirPath);
            }
        }
    }

    @FXML
    public void SelectOutputDicAction() {
        DirectoryChooser outputDirChooser = new DirectoryChooser();
        outputDirChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File selectedDirectory = outputDirChooser.showDialog((Stage) SelectOutputDicID.getScene().getWindow());
        if (selectedDirectory != null) {
            outputDirPath = selectedDirectory.getAbsolutePath();
            if (!outputDirPath.equals("")) {
                outputDirPathID.setText(outputDirPath);
//                LOG.info("选择CSV路径:" + inputDirPath);
            }
        }
    }

    @FXML
    public void ConvertPDFTOCSV() {
        if (!inputDirPath.equals("") || !outputDirPath.equals("")) {
//            LOG.info("开始转换");
            ActionTarget.setText("Processing...");
            TurnitInPDFReportProcessor pdfProcessor = new TurnitInPDFReportProcessor(inputDirPath, outputDirPath);
            pdfProcessor.startProcess();
            ActionTarget.setText("Done!");
        } else {
            ActionTarget.setText("Please specify input and output directories.");
        }
    }
}
