package controller;
import Torpedo.jatektabla.Pelda;
import Torpedo.dataTabla.readFromJSON;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import main.MyApplication;

import java.io.IOException;
import java.util.*;


public class GameController {


/*
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }

 */



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
        Scene scene2 = new Scene(Pelda.createContent());
        primaryStage.setScene(scene2);
        primaryStage.show();
        Pelda.jatekVege = false;

    }

    public static void tablazat(ActionEvent actionEvent) throws IOException {


        readFromJSON.beolvas();
        //readFromJSON.kiakarokirni();
        // GameController.reverse(readFromJSON.jatekos);
        KisTablaController.feltoltes();
        Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }



}



