package com.itx.feeds.templates.feedstemplateeditor;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootFeedsApplication {

    public static void main(String[] args){
        Application.launch(FeedsEditorApplication.class, args);
    }
}
