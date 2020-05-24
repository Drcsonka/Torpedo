package controller;

import Torpedo.jatektabla.Pelda;
import Torpedo.dataTabla.jatekosLepes;
import Torpedo.dataTabla.readFromJSON;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import main.MyApplication;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class KisTablaController {

    @FXML
    public  TableView<jatekosLepes> tableview;


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
    }

    public void goback() {

        if(GameController.meghivva == 0){
            MyApplication.stage31.setScene(MyApplication.scene1);
        }
        else{
            MyApplication.stage31.setScene(GameController.scene2);
        }

        MyApplication.stage31.show();
    }
    public static void resetList(){
        obvservableList.clear();
    }

    public void leave()  {
        System.exit(0);

    }


}
