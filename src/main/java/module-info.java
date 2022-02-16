module com.itx.feeds.templates.feedstemplateeditor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires spring.boot.autoconfigure;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens com.itx.feeds.templates.feedstemplateeditor to javafx.fxml;
    exports com.itx.feeds.templates.feedstemplateeditor;
}
