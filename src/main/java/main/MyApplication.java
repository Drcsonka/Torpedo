package main;

import Torpedo.Pelda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/game.fxml"));
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        //primaryStage.setScene(new Scene(Pelda.scene1));
        primaryStage.show();
    }
}
