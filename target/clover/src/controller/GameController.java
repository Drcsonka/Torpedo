/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;
import Torpedo.Pelda;
import dataTabla.readFromJSON;
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


public class GameController {public static class __CLR4_4_19r9rkajoh2ot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590241069679L,8589935092L,393,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


/*
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }

 */



    public static void popUpAblak(){try{__CLR4_4_19r9rkajoh2ot.R.inc(351);


        __CLR4_4_19r9rkajoh2ot.R.inc(352);if((((Pelda.Nyertel == 1)&&(__CLR4_4_19r9rkajoh2ot.R.iget(353)!=0|true))||(__CLR4_4_19r9rkajoh2ot.R.iget(354)==0&false)))
        {{
            __CLR4_4_19r9rkajoh2ot.R.inc(355);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_19r9rkajoh2ot.R.inc(356);alert.setTitle("Vesztettel");
            __CLR4_4_19r9rkajoh2ot.R.inc(357);alert.setHeaderText(null);
            __CLR4_4_19r9rkajoh2ot.R.inc(358);alert.setGraphic(null);
            __CLR4_4_19r9rkajoh2ot.R.inc(359);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_19r9rkajoh2ot.R.inc(360);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_19r9rkajoh2ot.R.inc(361);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_19r9rkajoh2ot.R.iget(362)!=0|true))||(__CLR4_4_19r9rkajoh2ot.R.iget(363)==0&false)))
            {{
                __CLR4_4_19r9rkajoh2ot.R.inc(364);reset(MyApplication.stage31);
            }
        }}
        }else {__CLR4_4_19r9rkajoh2ot.R.inc(365);if((((Pelda.Nyertel == 2)&&(__CLR4_4_19r9rkajoh2ot.R.iget(366)!=0|true))||(__CLR4_4_19r9rkajoh2ot.R.iget(367)==0&false)))
        {{
            __CLR4_4_19r9rkajoh2ot.R.inc(368);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_19r9rkajoh2ot.R.inc(369);alert.setTitle("Nyertel");
            __CLR4_4_19r9rkajoh2ot.R.inc(370);alert.setHeaderText(null);
            __CLR4_4_19r9rkajoh2ot.R.inc(371);alert.setGraphic(null);
            __CLR4_4_19r9rkajoh2ot.R.inc(372);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_19r9rkajoh2ot.R.inc(373);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_19r9rkajoh2ot.R.inc(374);if ((((ButtonType.OK == result.get())&&(__CLR4_4_19r9rkajoh2ot.R.iget(375)!=0|true))||(__CLR4_4_19r9rkajoh2ot.R.iget(376)==0&false)))
            {{
                __CLR4_4_19r9rkajoh2ot.R.inc(377);reset(MyApplication.stage31);
            }
        }}


    }}}finally{__CLR4_4_19r9rkajoh2ot.R.flushNeeded();}}
    public static void reset(Stage primaryStage){try{__CLR4_4_19r9rkajoh2ot.R.inc(378);

        __CLR4_4_19r9rkajoh2ot.R.inc(379);primaryStage.close();
        __CLR4_4_19r9rkajoh2ot.R.inc(380);Pelda.jatekKezdet = false;
        __CLR4_4_19r9rkajoh2ot.R.inc(381);Pelda.hatralevoHajok = 5;
        __CLR4_4_19r9rkajoh2ot.R.inc(382);Scene scene2 = new Scene(Pelda.createContent());
        __CLR4_4_19r9rkajoh2ot.R.inc(383);primaryStage.setScene(scene2);
        __CLR4_4_19r9rkajoh2ot.R.inc(384);primaryStage.show();
        __CLR4_4_19r9rkajoh2ot.R.inc(385);Pelda.jatekVege = false;

    }finally{__CLR4_4_19r9rkajoh2ot.R.flushNeeded();}}

    public static void tablazat(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkajoh2ot.R.inc(386);


        __CLR4_4_19r9rkajoh2ot.R.inc(387);readFromJSON.beolvas();
        //readFromJSON.kiakarokirni();
        // GameController.reverse(readFromJSON.jatekos);
        __CLR4_4_19r9rkajoh2ot.R.inc(388);KisTablaController.feltoltes();
        __CLR4_4_19r9rkajoh2ot.R.inc(389);Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        __CLR4_4_19r9rkajoh2ot.R.inc(390);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkajoh2ot.R.inc(391);stage.setScene(new Scene(root));
        __CLR4_4_19r9rkajoh2ot.R.inc(392);stage.show();


    }finally{__CLR4_4_19r9rkajoh2ot.R.flushNeeded();}}



}


