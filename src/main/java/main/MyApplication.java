package main;

import Torpedo.Pelda;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {


    public static Stage stage31;
    public static Scene scene1 = new Scene(Pelda.createContent());

    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        stage31 = primaryStage;
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

}
