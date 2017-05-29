package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            final FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            final Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Einscann-Application");

            primaryStage.setMinHeight(400.00);
            primaryStage.setMinWidth(500.00);

            primaryStage.setScene(scene);
            primaryStage.show();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
