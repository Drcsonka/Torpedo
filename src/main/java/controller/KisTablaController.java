package controller;

import Torpedo.Pelda;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dataTabla.Tablazat;
import dataTabla.jatekosLepes;
import dataTabla.readFromJSON;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.MyApplication;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;

import org.json.*;

public class KisTablaController {

    @FXML
    public TableView<jatekosLepes> tableview;


    public TableColumn<jatekosLepes, String> playerN;

    @FXML
    public TableColumn<jatekosLepes, String> playerM;

    @FXML
    public void initialize(){
        playerN.setCellValueFactory(new PropertyValueFactory<>("jatekosNev"));
        playerM.setCellValueFactory(new PropertyValueFactory<>("lepesek"));
        tableview.setItems(obvservableList);
    }

    public static ObservableList<jatekosLepes> obvservableList ;

/*
    {
        for(int i = 0; i <=hossz;i++){


        obvservableList = FXCollections.observableArrayList(
                new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i))
        );
    }
    }

 */

    public static void feltoltes(){

        /*
        obvservableList = FXCollections.observableArrayList(
                new jatekosLepes(readFromJSON.jatekos.get(0), readFromJSON.lepesek.get(0))
        );

        for(int i = 1; i <=Pelda.lepes-1;i++){
            //obvservableList.add(new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i)));
            //obvservableList.add( new jatekosLepes("jatekos", "lepes"));
            //obvservableList.
            /*
            obvservableList = FXCollections.observableArrayList(
                    new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i))
            );

             // csillag/

            obvservableList.add(new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i)));
        }

*/


        obvservableList = FXCollections.observableArrayList(
                new jatekosLepes(readFromJSON.jatekos.get(Pelda.lepes-1), readFromJSON.lepesek.get(Pelda.lepes-1))
        );

        for(int i = Pelda.lepes-2; i >=0;i--){


            obvservableList.add(new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i)));
        }




        //obvservableList.addAll(new jatekosLepes(readFromJSON.jatekos, readFromJSON.lepesek));
    }





    public void goback(ActionEvent actionEvent) throws IOException {

        //MyApplication.stage31.setScene(new Scene(Pelda.createContent()));
        MyApplication.stage31.setScene(MyApplication.scene1);
        MyApplication.stage31.show();
        //log.info("Loading launch scene.");
    }
    public void leave(ActionEvent actionEvent) throws IOException {
        System.exit(0);

    }


    public static void tablazat(ActionEvent actionEvent) throws IOException {


        readFromJSON.beolvas();
        readFromJSON.kiakarokirni();
        // GameController.reverse(readFromJSON.jatekos);
        feltoltes();
        Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }
}
