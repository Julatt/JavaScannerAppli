package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Node node;
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;
    private Parent root;


    @FXML AnchorPane mainAnchorPane;

    @FXML Button btnscann;
    @FXML Button btnanzeigen;
    @FXML Button btnback;
    @FXML Button btnclose;

    @FXML
    protected void handleExitBtnEvent(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    protected void handleScannerBtnEvent(ActionEvent event) {
        try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("Scanner.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleProdukteBtnEvent(ActionEvent event) {
        try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("Produkte.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    protected void handleBackToMainWindowtBtnEvent(ActionEvent event) {
        try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
