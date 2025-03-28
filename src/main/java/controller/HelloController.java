package controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import ucr.lab.HelloApplication;

import java.io.IOException;

public class HelloController {

    @FXML
    private Text txtMessage;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    private void load(String form) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(form));
        try {
            this.bp.setCenter(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void Home(ActionEvent actionEvent) {
        this.txtMessage.setText("Laboratory 1");
        this.bp.setCenter(ap);
    }

    @FXML
    public void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void exampleOnMousePressed(Event event) {
        this.txtMessage.setText("Loading Example. Please wait!!!");

    }

    @FXML
    public void vectorOnAction(ActionEvent actionEvent) {
        load("vector.fxml");
    }

    @FXML
    public void probabilisticOnAction(ActionEvent actionEvent) {
        load("probabilistic.fxml");
    }

    @FXML
    public void dynamicOnAction(ActionEvent actionEvent) {
        load("dynamic.fxml");
    }
}