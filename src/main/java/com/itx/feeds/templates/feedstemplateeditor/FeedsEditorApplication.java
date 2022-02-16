package com.itx.feeds.templates.feedstemplateeditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class FeedsEditorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FeedsEditorApplication.class.getResource("feeds-editor.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), Screen.getScreens().get(0).getBounds().getMaxX() - 50, Screen.getScreens().get(0).getBounds().getMaxY() - 100);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
