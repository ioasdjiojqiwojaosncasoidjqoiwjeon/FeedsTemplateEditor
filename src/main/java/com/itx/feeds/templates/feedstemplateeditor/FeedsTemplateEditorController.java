package com.itx.feeds.templates.feedstemplateeditor;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FeedsTemplateEditorController {
    @FXML
    private TextField exportTypeText;

    @FXML
    private TextField brandIdText;

    @FXML
    protected void onLoadExportTypeBtnClick () {
        exportTypeText.setText("Hello!");
    }
}
