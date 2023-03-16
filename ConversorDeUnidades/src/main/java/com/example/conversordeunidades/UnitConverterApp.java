package com.example.conversordeunidades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UnitConverterApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("unit_converter.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add("data:text/css;charset=utf-8,root{-fx-background-color: #FFC300;}");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Convertidor de Unidades");
        primaryStage.show();
    }

    public static void main(String[] args) {



        launch(args);
    }
}


