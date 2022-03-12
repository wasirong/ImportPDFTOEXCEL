package com.dhl.PDFConvertToCSV;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        primaryStage.setTitle("DHL进口报关单自动核对 Version.1.0.0.3");
        primaryStage.setScene(new Scene(root, 960, 335));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Main+++++++++++++++++++++++");
        launch(args);
    }
}
