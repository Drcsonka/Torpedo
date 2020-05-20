package main;

import Torpedo.Pelda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {


    public static Stage stage31;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/game.fxml"));
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        this.stage31 = primaryStage;
        primaryStage.setScene(new Scene(root));
        reset(stage31);
        //primaryStage.setScene(new Scene(Pelda.scene1));
        primaryStage.show();
    }

    private void reset( Stage primaryStage){

        primaryStage.close();
        Scene scene2 = new Scene(Pelda.createContent());
        primaryStage.setScene(scene2);
        primaryStage.show();

    }
}
