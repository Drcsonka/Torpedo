/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

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

public class KisTablaController {public static class __CLR4_4_119n19nkaivsm5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590192899444L,8589935092L,1666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    public TableView<jatekosLepes> tableview;


    public TableColumn<jatekosLepes, String> playerN;

    @FXML
    public TableColumn<jatekosLepes, String> playerM;

    @FXML
    public void initialize(){try{__CLR4_4_119n19nkaivsm5u.R.inc(1643);
        __CLR4_4_119n19nkaivsm5u.R.inc(1644);playerN.setCellValueFactory(new PropertyValueFactory<>("jatekosNev"));
        __CLR4_4_119n19nkaivsm5u.R.inc(1645);playerM.setCellValueFactory(new PropertyValueFactory<>("lepesek"));
        __CLR4_4_119n19nkaivsm5u.R.inc(1646);tableview.setItems(obvservableList);
    }finally{__CLR4_4_119n19nkaivsm5u.R.flushNeeded();}}

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

    public static void feltoltes(){try{__CLR4_4_119n19nkaivsm5u.R.inc(1647);

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


        __CLR4_4_119n19nkaivsm5u.R.inc(1648);obvservableList = FXCollections.observableArrayList(
                new jatekosLepes(readFromJSON.jatekos.get(Pelda.lepes-1), readFromJSON.lepesek.get(Pelda.lepes-1))
        );

        __CLR4_4_119n19nkaivsm5u.R.inc(1649);for(int i = Pelda.lepes-2; (((i >=0)&&(__CLR4_4_119n19nkaivsm5u.R.iget(1650)!=0|true))||(__CLR4_4_119n19nkaivsm5u.R.iget(1651)==0&false));i--){{


            __CLR4_4_119n19nkaivsm5u.R.inc(1652);obvservableList.add(new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i)));
        }




        //obvservableList.addAll(new jatekosLepes(readFromJSON.jatekos, readFromJSON.lepesek));
    }}finally{__CLR4_4_119n19nkaivsm5u.R.flushNeeded();}}





    public void goback(ActionEvent actionEvent) throws IOException {try{__CLR4_4_119n19nkaivsm5u.R.inc(1653);

        //MyApplication.stage31.setScene(new Scene(Pelda.createContent()));
        __CLR4_4_119n19nkaivsm5u.R.inc(1654);MyApplication.stage31.setScene(MyApplication.scene1);
        __CLR4_4_119n19nkaivsm5u.R.inc(1655);MyApplication.stage31.show();
        //log.info("Loading launch scene.");
    }finally{__CLR4_4_119n19nkaivsm5u.R.flushNeeded();}}
    public void leave(ActionEvent actionEvent) throws IOException {try{__CLR4_4_119n19nkaivsm5u.R.inc(1656);
        __CLR4_4_119n19nkaivsm5u.R.inc(1657);System.exit(0);

    }finally{__CLR4_4_119n19nkaivsm5u.R.flushNeeded();}}


    public static void tablazat(ActionEvent actionEvent) throws IOException {try{__CLR4_4_119n19nkaivsm5u.R.inc(1658);


        __CLR4_4_119n19nkaivsm5u.R.inc(1659);readFromJSON.beolvas();
        __CLR4_4_119n19nkaivsm5u.R.inc(1660);readFromJSON.kiakarokirni();
        // GameController.reverse(readFromJSON.jatekos);
        __CLR4_4_119n19nkaivsm5u.R.inc(1661);feltoltes();
        __CLR4_4_119n19nkaivsm5u.R.inc(1662);Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        __CLR4_4_119n19nkaivsm5u.R.inc(1663);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_119n19nkaivsm5u.R.inc(1664);stage.setScene(new Scene(root));
        __CLR4_4_119n19nkaivsm5u.R.inc(1665);stage.show();


    }finally{__CLR4_4_119n19nkaivsm5u.R.flushNeeded();}}
}
