package controller;

import Torpedo.Pelda;
import dataTabla.Tablazat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.MyApplication;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;

public class KisTablaController {

    @FXML
    private TableView kisTabla;

    @FXML
    private TableColumn jatekos;

    @FXML
    private TableColumn lepes;


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

        Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
}
