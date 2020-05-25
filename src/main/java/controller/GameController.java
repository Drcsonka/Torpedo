package controller;
import Torpedo.dataTabla.writeToJSON;
import Torpedo.jatektabla.Pelda;
import Torpedo.dataTabla.readFromJSON;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import main.MyApplication;

import java.io.IOException;
import java.util.*;


public class GameController {


    public static Scene scene2;
    public static int meghivva = 0;


    public static void popUpAblak(){


        if(Pelda.Nyertel == 1)
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Vesztettel");
            alert.setHeaderText(null);
            alert.setGraphic(null);
            alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK)
            {
                reset(MyApplication.stage31);
            }
        }
        else if(Pelda.Nyertel == 2)
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Nyertel");
            alert.setHeaderText(null);
            alert.setGraphic(null);
            alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            Optional<ButtonType> result = alert.showAndWait();
            if (ButtonType.OK == result.get())
            {
                reset(MyApplication.stage31);
            }
        }


    }

    public static void reset(Stage primaryStage){

        primaryStage.close();
        Pelda.jatekKezdet = false;
        Pelda.hatralevoHajok = 5;
        scene2 = new Scene(Pelda.createContent());
        Pelda.jatekVege = false;
        meghivva++;
        writeToJSON.torles();
        Pelda.lepes =0;
        hatter();
        readFromJSON.torles();
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    public static void tablazat(ActionEvent actionEvent) throws IOException {


        readFromJSON.beolvas();
        readFromJSON.kiakarokirni();
        KisTablaController.feltoltes();
        Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }
    public static void hatter(){


    Image image = new Image("BG2.jpeg");

    BackgroundImage backgroundimage = new BackgroundImage(image,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(800, 1000, false, false, false, false));

    Background background = new Background(backgroundimage);

        Pelda.root.setBackground(background);
}


}



