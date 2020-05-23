/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;
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


public class GameController {public static class __CLR4_4_11fc1fckajxpxs6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590256600038L,8589935092L,1891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


/*
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }

 */



    public static void popUpAblak(){try{__CLR4_4_11fc1fckajxpxs6.R.inc(1848);


        __CLR4_4_11fc1fckajxpxs6.R.inc(1849);if((((Pelda.Nyertel == 1)&&(__CLR4_4_11fc1fckajxpxs6.R.iget(1850)!=0|true))||(__CLR4_4_11fc1fckajxpxs6.R.iget(1851)==0&false)))
        {{
            __CLR4_4_11fc1fckajxpxs6.R.inc(1852);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1853);alert.setTitle("Vesztettel");
            __CLR4_4_11fc1fckajxpxs6.R.inc(1854);alert.setHeaderText(null);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1855);alert.setGraphic(null);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1856);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_11fc1fckajxpxs6.R.inc(1857);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_11fc1fckajxpxs6.R.inc(1858);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_11fc1fckajxpxs6.R.iget(1859)!=0|true))||(__CLR4_4_11fc1fckajxpxs6.R.iget(1860)==0&false)))
            {{
                __CLR4_4_11fc1fckajxpxs6.R.inc(1861);reset(MyApplication.stage31);
            }
        }}
        }else {__CLR4_4_11fc1fckajxpxs6.R.inc(1862);if((((Pelda.Nyertel == 2)&&(__CLR4_4_11fc1fckajxpxs6.R.iget(1863)!=0|true))||(__CLR4_4_11fc1fckajxpxs6.R.iget(1864)==0&false)))
        {{
            __CLR4_4_11fc1fckajxpxs6.R.inc(1865);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1866);alert.setTitle("Nyertel");
            __CLR4_4_11fc1fckajxpxs6.R.inc(1867);alert.setHeaderText(null);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1868);alert.setGraphic(null);
            __CLR4_4_11fc1fckajxpxs6.R.inc(1869);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_11fc1fckajxpxs6.R.inc(1870);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_11fc1fckajxpxs6.R.inc(1871);if ((((ButtonType.OK == result.get())&&(__CLR4_4_11fc1fckajxpxs6.R.iget(1872)!=0|true))||(__CLR4_4_11fc1fckajxpxs6.R.iget(1873)==0&false)))
            {{
                __CLR4_4_11fc1fckajxpxs6.R.inc(1874);reset(MyApplication.stage31);
            }
        }}


    }}}finally{__CLR4_4_11fc1fckajxpxs6.R.flushNeeded();}}
    public static void reset(Stage primaryStage){try{__CLR4_4_11fc1fckajxpxs6.R.inc(1875);

        __CLR4_4_11fc1fckajxpxs6.R.inc(1876);primaryStage.close();
        __CLR4_4_11fc1fckajxpxs6.R.inc(1877);Pelda.jatekKezdet = false;
        __CLR4_4_11fc1fckajxpxs6.R.inc(1878);Pelda.hatralevoHajok = 5;
        __CLR4_4_11fc1fckajxpxs6.R.inc(1879);Scene scene2 = new Scene(Pelda.createContent());
        __CLR4_4_11fc1fckajxpxs6.R.inc(1880);primaryStage.setScene(scene2);
        __CLR4_4_11fc1fckajxpxs6.R.inc(1881);primaryStage.show();
        __CLR4_4_11fc1fckajxpxs6.R.inc(1882);Pelda.jatekVege = false;

    }finally{__CLR4_4_11fc1fckajxpxs6.R.flushNeeded();}}

    public static void tablazat(ActionEvent actionEvent) throws IOException {try{__CLR4_4_11fc1fckajxpxs6.R.inc(1883);


        __CLR4_4_11fc1fckajxpxs6.R.inc(1884);readFromJSON.beolvas();
        __CLR4_4_11fc1fckajxpxs6.R.inc(1885);readFromJSON.kiakarokirni();
        // GameController.reverse(readFromJSON.jatekos);
        __CLR4_4_11fc1fckajxpxs6.R.inc(1886);KisTablaController.feltoltes();
        __CLR4_4_11fc1fckajxpxs6.R.inc(1887);Parent root = FXMLLoader.load(KisTablaController.class.getResource("/fxml/tabla.fxml"));
        __CLR4_4_11fc1fckajxpxs6.R.inc(1888);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_11fc1fckajxpxs6.R.inc(1889);stage.setScene(new Scene(root));
        __CLR4_4_11fc1fckajxpxs6.R.inc(1890);stage.show();


    }finally{__CLR4_4_11fc1fckajxpxs6.R.flushNeeded();}}



}



