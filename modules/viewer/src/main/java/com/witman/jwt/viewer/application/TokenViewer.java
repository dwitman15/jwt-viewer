package com.witman.jwt.viewer.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TokenViewer extends Application
{
    @Override
    public void start(Stage stage) {
        var l = new Label("Welcome to the JWTViewer Application.");
        var scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
