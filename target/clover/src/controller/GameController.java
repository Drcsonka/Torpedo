/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;
import Torpedo.dataTabla.writeToJSON;
import Torpedo.jatektabla.Pelda;
import Torpedo.dataTabla.readFromJSON;
import Torpedo.jatektabla.Tabla;
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


public class GameController {public static class __CLR4_4_1bebekal10300{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590322578201L,8589935092L,463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


/*
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }

 */
    public static Scene scene2;
    public static int meghivva = 0;


    public static void popUpAblak(){try{__CLR4_4_1bebekal10300.R.inc(410);


        __CLR4_4_1bebekal10300.R.inc(411);if((((Pelda.Nyertel == 1)&&(__CLR4_4_1bebekal10300.R.iget(412)!=0|true))||(__CLR4_4_1bebekal10300.R.iget(413)==0&false)))
        {{
            __CLR4_4_1bebekal10300.R.inc(414);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1bebekal10300.R.inc(415);alert.setTitle("Vesztettel");
            __CLR4_4_1bebekal10300.R.inc(416);alert.setHeaderText(null);
            __CLR4_4_1bebekal10300.R.inc(417);alert.setGraphic(null);
            __CLR4_4_1bebekal10300.R.inc(418);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_1bebekal10300.R.inc(419);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1bebekal10300.R.inc(420);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1bebekal10300.R.iget(421)!=0|true))||(__CLR4_4_1bebekal10300.R.iget(422)==0&false)))
            {{
                __CLR4_4_1bebekal10300.R.inc(423);reset(MyApplication.stage31);
            }
        }}
        }else {__CLR4_4_1bebekal10300.R.inc(424);if((((Pelda.Nyertel == 2)&&(__CLR4_4_1bebekal10300.R.iget(425)!=0|true))||(__CLR4_4_1bebekal10300.R.iget(426)==0&false)))
        {{
            __CLR4_4_1bebekal10300.R.inc(427);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1bebekal10300.R.inc(428);alert.setTitle("Nyertel");
            __CLR4_4_1bebekal10300.R.inc(429);alert.setHeaderText(null);
            __CLR4_4_1bebekal10300.R.inc(430);alert.setGraphic(null);
            __CLR4_4_1bebekal10300.R.inc(431);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_1bebekal10300.R.inc(432);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1bebekal10300.R.inc(433);if ((((ButtonType.OK == result.get())&&(__CLR4_4_1bebekal10300.R.iget(434)!=0|true))||(__CLR4_4_1bebekal10300.R.iget(435)==0&false)))
            {{
                __CLR4_4_1bebekal10300.R.inc(436);reset(MyApplication.stage31);
            }
        }}


    }}}finally{__CLR4_4_1bebekal10300.R.flushNeeded();}}

    public static void reset(Stage primaryStage){try{__CLR4_4_1bebekal10300.R.inc(437);

        __CLR4_4_1bebekal10300.R.inc(438);primaryStage.close();
        __CLR4_4_1bebekal10300.R.inc(439);Pelda.jatekKezdet = false;
        __CLR4_4_1bebekal10300.R.inc(440);Pelda.hatralevoHajok = 5;
        __CLR4_4_1bebekal10300.R.inc(441);scene2 = new Scene(Pelda.createContent());
        __CLR4_4_1bebekal10300.R.inc(442);Pelda.jatekVege = false;
        __CLR4_4_1bebekal10300.R.inc(443);meghivva++;
        __CLR4_4_1bebekal10300.R.inc(444);writeToJSON.torles();
        __CLR4_4_1bebekal10300.R.inc(445);Pelda.lepes =0;
        __CLR4_4_1bebekal10300.R.inc(446);hatter();
        __CLR4_4_1bebekal10300.R.inc(447);readFromJSON.torles();
        __CLR4_4_1bebekal10300.R.inc(448);primaryStage.setScene(scene2);
        __CLR4_4_1bebekal10300.R.inc(449);primaryStage.show();
    }finally{__CLR4_4_1bebekal10300.R.flushNeeded();}}

    public static void tablazat(ActionEvent actionEvent) throws IOException {try{__CLR4_4_1bebekal10300.R.inc(450);


        __CLR4_4_1bebekal10300.R.inc(451);readFromJSON.beolvas();
        __CLR4_4_1bebekal10300.R.inc(452);readFromJSON.kiakarokirni();
        __CLR4_4_1bebekal10300.R.inc(453);KisTablaController.feltoltes();
        __CLR4_4_1bebekal10300.R.inc(454);Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        __CLR4_4_1bebekal10300.R.inc(455);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_1bebekal10300.R.inc(456);stage.setScene(new Scene(root));
        __CLR4_4_1bebekal10300.R.inc(457);stage.show();


    }finally{__CLR4_4_1bebekal10300.R.flushNeeded();}}
    public static void hatter(){try{__CLR4_4_1bebekal10300.R.inc(458);


    __CLR4_4_1bebekal10300.R.inc(459);Image image = new Image("BG2.jpeg");

    __CLR4_4_1bebekal10300.R.inc(460);BackgroundImage backgroundimage = new BackgroundImage(image,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(800, 1000, false, false, false, false));

    __CLR4_4_1bebekal10300.R.inc(461);Background background = new Background(backgroundimage);

        __CLR4_4_1bebekal10300.R.inc(462);Pelda.root.setBackground(background);
}finally{__CLR4_4_1bebekal10300.R.flushNeeded();}}


}



