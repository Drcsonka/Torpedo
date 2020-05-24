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


public class GameController {public static class __CLR4_4_1m2m2kakbcvdz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590279504923L,8589935092L,847,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


/*
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }

 */
    public static Scene scene2;
    public static int meghivva = 0;


    public static void popUpAblak(){try{__CLR4_4_1m2m2kakbcvdz.R.inc(794);


        __CLR4_4_1m2m2kakbcvdz.R.inc(795);if((((Pelda.Nyertel == 1)&&(__CLR4_4_1m2m2kakbcvdz.R.iget(796)!=0|true))||(__CLR4_4_1m2m2kakbcvdz.R.iget(797)==0&false)))
        {{
            __CLR4_4_1m2m2kakbcvdz.R.inc(798);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1m2m2kakbcvdz.R.inc(799);alert.setTitle("Vesztettel");
            __CLR4_4_1m2m2kakbcvdz.R.inc(800);alert.setHeaderText(null);
            __CLR4_4_1m2m2kakbcvdz.R.inc(801);alert.setGraphic(null);
            __CLR4_4_1m2m2kakbcvdz.R.inc(802);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_1m2m2kakbcvdz.R.inc(803);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1m2m2kakbcvdz.R.inc(804);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1m2m2kakbcvdz.R.iget(805)!=0|true))||(__CLR4_4_1m2m2kakbcvdz.R.iget(806)==0&false)))
            {{
                __CLR4_4_1m2m2kakbcvdz.R.inc(807);reset(MyApplication.stage31);
            }
        }}
        }else {__CLR4_4_1m2m2kakbcvdz.R.inc(808);if((((Pelda.Nyertel == 2)&&(__CLR4_4_1m2m2kakbcvdz.R.iget(809)!=0|true))||(__CLR4_4_1m2m2kakbcvdz.R.iget(810)==0&false)))
        {{
            __CLR4_4_1m2m2kakbcvdz.R.inc(811);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1m2m2kakbcvdz.R.inc(812);alert.setTitle("Nyertel");
            __CLR4_4_1m2m2kakbcvdz.R.inc(813);alert.setHeaderText(null);
            __CLR4_4_1m2m2kakbcvdz.R.inc(814);alert.setGraphic(null);
            __CLR4_4_1m2m2kakbcvdz.R.inc(815);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_1m2m2kakbcvdz.R.inc(816);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1m2m2kakbcvdz.R.inc(817);if ((((ButtonType.OK == result.get())&&(__CLR4_4_1m2m2kakbcvdz.R.iget(818)!=0|true))||(__CLR4_4_1m2m2kakbcvdz.R.iget(819)==0&false)))
            {{
                __CLR4_4_1m2m2kakbcvdz.R.inc(820);reset(MyApplication.stage31);
            }
        }}


    }}}finally{__CLR4_4_1m2m2kakbcvdz.R.flushNeeded();}}

    public static void reset(Stage primaryStage){try{__CLR4_4_1m2m2kakbcvdz.R.inc(821);

        __CLR4_4_1m2m2kakbcvdz.R.inc(822);primaryStage.close();
        __CLR4_4_1m2m2kakbcvdz.R.inc(823);Pelda.jatekKezdet = false;
        __CLR4_4_1m2m2kakbcvdz.R.inc(824);Pelda.hatralevoHajok = 5;
        __CLR4_4_1m2m2kakbcvdz.R.inc(825);scene2 = new Scene(Pelda.createContent());
        __CLR4_4_1m2m2kakbcvdz.R.inc(826);Pelda.jatekVege = false;
        __CLR4_4_1m2m2kakbcvdz.R.inc(827);meghivva++;
        __CLR4_4_1m2m2kakbcvdz.R.inc(828);writeToJSON.torles();
        __CLR4_4_1m2m2kakbcvdz.R.inc(829);Pelda.lepes =0;
        __CLR4_4_1m2m2kakbcvdz.R.inc(830);hatter();
        __CLR4_4_1m2m2kakbcvdz.R.inc(831);readFromJSON.torles();
        __CLR4_4_1m2m2kakbcvdz.R.inc(832);primaryStage.setScene(scene2);
        __CLR4_4_1m2m2kakbcvdz.R.inc(833);primaryStage.show();
    }finally{__CLR4_4_1m2m2kakbcvdz.R.flushNeeded();}}

    public static void tablazat(ActionEvent actionEvent) throws IOException {try{__CLR4_4_1m2m2kakbcvdz.R.inc(834);


        __CLR4_4_1m2m2kakbcvdz.R.inc(835);readFromJSON.beolvas();
        __CLR4_4_1m2m2kakbcvdz.R.inc(836);readFromJSON.kiakarokirni();
        __CLR4_4_1m2m2kakbcvdz.R.inc(837);KisTablaController.feltoltes();
        __CLR4_4_1m2m2kakbcvdz.R.inc(838);Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        __CLR4_4_1m2m2kakbcvdz.R.inc(839);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_1m2m2kakbcvdz.R.inc(840);stage.setScene(new Scene(root));
        __CLR4_4_1m2m2kakbcvdz.R.inc(841);stage.show();


    }finally{__CLR4_4_1m2m2kakbcvdz.R.flushNeeded();}}
    public static void hatter(){try{__CLR4_4_1m2m2kakbcvdz.R.inc(842);


    __CLR4_4_1m2m2kakbcvdz.R.inc(843);Image image = new Image("BG2.jpeg");

    __CLR4_4_1m2m2kakbcvdz.R.inc(844);BackgroundImage backgroundimage = new BackgroundImage(image,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(800, 1000, false, false, false, false));

    __CLR4_4_1m2m2kakbcvdz.R.inc(845);Background background = new Background(backgroundimage);

        __CLR4_4_1m2m2kakbcvdz.R.inc(846);Pelda.root.setBackground(background);
}finally{__CLR4_4_1m2m2kakbcvdz.R.flushNeeded();}}


}



