/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import Torpedo.Pelda;
import dataTabla.jatekosLepes;
import dataTabla.readFromJSON;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import main.MyApplication;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class KisTablaController {public static class __CLR4_4_1axaxkajoh2p7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590241069679L,8589935092L,408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    public TableView<jatekosLepes> tableview;


    public TableColumn<jatekosLepes, String> playerN;

    @FXML
    public TableColumn<jatekosLepes, String> playerM;

    @FXML
    public void initialize(){try{__CLR4_4_1axaxkajoh2p7.R.inc(393);
        __CLR4_4_1axaxkajoh2p7.R.inc(394);playerN.setCellValueFactory(new PropertyValueFactory<>("jatekosNev"));
        __CLR4_4_1axaxkajoh2p7.R.inc(395);playerM.setCellValueFactory(new PropertyValueFactory<>("lepesek"));
        __CLR4_4_1axaxkajoh2p7.R.inc(396);tableview.setItems(obvservableList);
    }finally{__CLR4_4_1axaxkajoh2p7.R.flushNeeded();}}
    public static ObservableList<jatekosLepes> obvservableList ;


    public static void feltoltes(){try{__CLR4_4_1axaxkajoh2p7.R.inc(397);

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

        __CLR4_4_1axaxkajoh2p7.R.inc(398);obvservableList = FXCollections.observableArrayList(
                new jatekosLepes(readFromJSON.jatekos.get(Pelda.lepes-1), readFromJSON.lepesek.get(Pelda.lepes-1))
        );

        __CLR4_4_1axaxkajoh2p7.R.inc(399);for(int i = Pelda.lepes-2; (((i >=0)&&(__CLR4_4_1axaxkajoh2p7.R.iget(400)!=0|true))||(__CLR4_4_1axaxkajoh2p7.R.iget(401)==0&false));i--){{
            __CLR4_4_1axaxkajoh2p7.R.inc(402);obvservableList.add(new jatekosLepes(readFromJSON.jatekos.get(i), readFromJSON.lepesek.get(i)));
        }
    }}finally{__CLR4_4_1axaxkajoh2p7.R.flushNeeded();}}
    public void goback() {try{__CLR4_4_1axaxkajoh2p7.R.inc(403);

        __CLR4_4_1axaxkajoh2p7.R.inc(404);MyApplication.stage31.setScene(MyApplication.scene1);
        __CLR4_4_1axaxkajoh2p7.R.inc(405);MyApplication.stage31.show();
    }finally{__CLR4_4_1axaxkajoh2p7.R.flushNeeded();}}
    public void leave()  {try{__CLR4_4_1axaxkajoh2p7.R.inc(406);
        __CLR4_4_1axaxkajoh2p7.R.inc(407);System.exit(0);

    }finally{__CLR4_4_1axaxkajoh2p7.R.flushNeeded();}}


}
