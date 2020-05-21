package main;

import Torpedo.Pelda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.SubScene;

public class MyApplication extends Application {


    public static Stage stage31;
    public static Scene scene1 = new Scene(Pelda.createContent());

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        this.stage31 = primaryStage;
        //MyApplication obj = new MyApplication();
        //obj.Pelda.createContent();
        //((Pane) scene2.getRoot()).getChildren().add(scene1.getRoot());
        //((BorderPane) scene1.getRoot()).getChildren().add(Pelda.scene1.getRoot());

        //primaryStage.setScene(new Scene(Pelda.createContent()));
        primaryStage.setScene(scene1);

        //reset(stage31);
        //primaryStage.setScene(new Scene(Pelda.scene1));
        primaryStage.show();

        //Pelda.createSubScene(Pelda.createContent());
    }

}
