module com.example.conversordeunidades {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires okhttp3;
    requires com.google.gson;


    opens com.example.conversordeunidades to javafx.fxml;
    exports com.example.conversordeunidades;
    exports com.example.conversordeunidades.models;
    opens com.example.conversordeunidades.models to javafx.fxml;

}