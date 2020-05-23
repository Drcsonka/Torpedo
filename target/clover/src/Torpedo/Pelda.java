/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;

import controller.GameController;
import controller.KisTablaController;
import dataTabla.Main;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import Torpedo.Tabla.Cella;
import main.MyApplication;
import org.json.simple.JSONObject;

public class Pelda  {public static class __CLR4_4_112k12kkaivsm4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590192899444L,8589935092L,1642,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public  static boolean jatekVege = false;
    //public static Parent scene1= new Scene(createContent());
     public static boolean jatekKezdet = false;
     private static Tabla tablaE, tablaJ;
     static int Nyertel = 0;


     private static int hatralevoHajok = 5;
     static Button resetButton = new Button("Reset");
     static Button tablaButton = new Button( "Lepesek");
     static Text menuT = new Text("Menu");
     private static boolean ellensegKore = false;
     static String[] ybetuk = {"A","B","C","D","E","F","G","H","I","J"};
     public static String xyJ;
     public static String xyE;
     public static int lepes= 0;

    private static Label Lepes= new Label("lepes");
    private static Label LepesJ= new Label("lepes");

    public static boolean jatekoslepese = true;


     private static Random random = new Random();
     //private Stage stage31;
     //public SubScene sub = new SubScene(createContent(), 800,850);

/*
    public static SubScene createSubScene(Parent root) {


        SubScene subScene = new SubScene(root, 500, 400);

        return subScene;
    }
*/

/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        scene scene1 = new Scene(createContent());

        scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        this.stage31 = primaryStage;


        resetButton.setOnAction(e -> {
            reset(primaryStage);
        });


    }
*/


//new Foo().nonStaticMethod();
//public Scene scene1 = new Scene(createContent());


    public static Parent createContent() {try{__CLR4_4_112k12kkaivsm4b.R.inc(1388);
        __CLR4_4_112k12kkaivsm4b.R.inc(1389);BorderPane root = new BorderPane();


        __CLR4_4_112k12kkaivsm4b.R.inc(1390);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_112k12kkaivsm4b.R.inc(1391);root.setPrefSize(800, 850);
        __CLR4_4_112k12kkaivsm4b.R.inc(1392);resetButton.setPrefWidth(150);
        __CLR4_4_112k12kkaivsm4b.R.inc(1393);resetButton.setPrefHeight(50);
        __CLR4_4_112k12kkaivsm4b.R.inc(1394);tablaButton.setPrefWidth(150);
        __CLR4_4_112k12kkaivsm4b.R.inc(1395);tablaButton.setPrefHeight(50);

        __CLR4_4_112k12kkaivsm4b.R.inc(1396);Lepes.setPrefHeight(50);
        __CLR4_4_112k12kkaivsm4b.R.inc(1397);Lepes.setPrefWidth(150);
        __CLR4_4_112k12kkaivsm4b.R.inc(1398);LepesJ.setPrefHeight(50);
        __CLR4_4_112k12kkaivsm4b.R.inc(1399);LepesJ.setPrefWidth(150);

        // Top margo

        __CLR4_4_112k12kkaivsm4b.R.inc(1400);Insets insets = new Insets(10);
        __CLR4_4_112k12kkaivsm4b.R.inc(1401);Node topNode = new Label("");
        __CLR4_4_112k12kkaivsm4b.R.inc(1402);root.setTop(topNode);
        __CLR4_4_112k12kkaivsm4b.R.inc(1403);BorderPane.setMargin(topNode, insets);

        __CLR4_4_112k12kkaivsm4b.R.inc(1404);resetButton.setOnAction(e -> {
                    __CLR4_4_112k12kkaivsm4b.R.inc(1405);reset(MyApplication.stage31);
        });

        __CLR4_4_112k12kkaivsm4b.R.inc(1406);tablaButton.setOnAction(e -> {
            __CLR4_4_112k12kkaivsm4b.R.inc(1407);try {
                __CLR4_4_112k12kkaivsm4b.R.inc(1408);KisTablaController.tablazat( e );
            } catch (IOException ex) {
                __CLR4_4_112k12kkaivsm4b.R.inc(1409);ex.printStackTrace();
            }
        });


        __CLR4_4_112k12kkaivsm4b.R.inc(1410);VBox menu = new VBox( 20,menuT, resetButton, tablaButton, Lepes, LepesJ);
        __CLR4_4_112k12kkaivsm4b.R.inc(1411);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_112k12kkaivsm4b.R.inc(1412);root.setRight(menu);



        //Hatter
        __CLR4_4_112k12kkaivsm4b.R.inc(1413);Image image = new Image("BG2.jpeg");

        __CLR4_4_112k12kkaivsm4b.R.inc(1414);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_112k12kkaivsm4b.R.inc(1415);Background background = new Background(backgroundimage);

        __CLR4_4_112k12kkaivsm4b.R.inc(1416);root.setBackground(background);





        __CLR4_4_112k12kkaivsm4b.R.inc(1417);tablaE = new Tabla(true, event -> {
            __CLR4_4_112k12kkaivsm4b.R.inc(1418);if ((((!jatekKezdet)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1419)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1420)==0&false)))
                {__CLR4_4_112k12kkaivsm4b.R.inc(1421);return;

            }__CLR4_4_112k12kkaivsm4b.R.inc(1422);Cella cell = (Cella) event.getSource();
            __CLR4_4_112k12kkaivsm4b.R.inc(1423);if ((((cell.wasShot)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1424)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1425)==0&false)))
                {__CLR4_4_112k12kkaivsm4b.R.inc(1426);return;

            }__CLR4_4_112k12kkaivsm4b.R.inc(1427);String xJ = String.valueOf(cell.x+1);
            __CLR4_4_112k12kkaivsm4b.R.inc(1428);String y22 = String.valueOf(cell.y+1);
            __CLR4_4_112k12kkaivsm4b.R.inc(1429);String yJ = ybetuk[cell.y];
            __CLR4_4_112k12kkaivsm4b.R.inc(1430);xyJ = xJ+yJ;
            __CLR4_4_112k12kkaivsm4b.R.inc(1431);jatekoslepese = true;
            __CLR4_4_112k12kkaivsm4b.R.inc(1432);lepes++;
            __CLR4_4_112k12kkaivsm4b.R.inc(1433);try {
                __CLR4_4_112k12kkaivsm4b.R.inc(1434);Main.ujtablaadat();
            } catch (IOException e) {
                __CLR4_4_112k12kkaivsm4b.R.inc(1435);e.printStackTrace();
            }

            __CLR4_4_112k12kkaivsm4b.R.inc(1436);LepesJ.setText(xyJ);

            __CLR4_4_112k12kkaivsm4b.R.inc(1437);ellensegKore = !cell.loves();


            __CLR4_4_112k12kkaivsm4b.R.inc(1438);if ((((tablaE.hajok == 4)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1439)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1440)==0&false))) {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1441);System.out.println("Nyertel");
                __CLR4_4_112k12kkaivsm4b.R.inc(1442);jatekVege = true;
                __CLR4_4_112k12kkaivsm4b.R.inc(1443);Nyertel = 2;
                __CLR4_4_112k12kkaivsm4b.R.inc(1444);popUpAblak();


            }

            }__CLR4_4_112k12kkaivsm4b.R.inc(1445);if ((((ellensegKore)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1446)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1447)==0&false)))
                {__CLR4_4_112k12kkaivsm4b.R.inc(1448);EllensegLepese();
        }});

        __CLR4_4_112k12kkaivsm4b.R.inc(1449);tablaJ = new Tabla(false, event -> {
            __CLR4_4_112k12kkaivsm4b.R.inc(1450);if ((((jatekKezdet)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1451)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1452)==0&false)))
                {__CLR4_4_112k12kkaivsm4b.R.inc(1453);return;

            }__CLR4_4_112k12kkaivsm4b.R.inc(1454);Cella cell = (Cella) event.getSource();
            __CLR4_4_112k12kkaivsm4b.R.inc(1455);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_112k12kkaivsm4b.R.iget(1456)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1457)==0&false))) {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1458);if ((((--hatralevoHajok == 0)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1459)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1460)==0&false))) {{
                    __CLR4_4_112k12kkaivsm4b.R.inc(1461);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_112k12kkaivsm4b.R.inc(1462);Label labelSz1 = new Label("   1");
        __CLR4_4_112k12kkaivsm4b.R.inc(1463);font(labelSz1);
        __CLR4_4_112k12kkaivsm4b.R.inc(1464);Label labelSz2 = new Label("2");
        __CLR4_4_112k12kkaivsm4b.R.inc(1465);font(labelSz2);
        __CLR4_4_112k12kkaivsm4b.R.inc(1466);Label labelSz3 = new Label("3");
        __CLR4_4_112k12kkaivsm4b.R.inc(1467);font(labelSz3);
        __CLR4_4_112k12kkaivsm4b.R.inc(1468);Label labelSz4 = new Label("4");
        __CLR4_4_112k12kkaivsm4b.R.inc(1469);font(labelSz4);
        __CLR4_4_112k12kkaivsm4b.R.inc(1470);Label labelSz5 = new Label("5");
        __CLR4_4_112k12kkaivsm4b.R.inc(1471);font(labelSz5);
        __CLR4_4_112k12kkaivsm4b.R.inc(1472);Label labelSz6 = new Label("6");
        __CLR4_4_112k12kkaivsm4b.R.inc(1473);font(labelSz6);
        __CLR4_4_112k12kkaivsm4b.R.inc(1474);Label labelSz7 = new Label("7");
        __CLR4_4_112k12kkaivsm4b.R.inc(1475);font(labelSz7);
        __CLR4_4_112k12kkaivsm4b.R.inc(1476);Label labelSz8 = new Label("8");
        __CLR4_4_112k12kkaivsm4b.R.inc(1477);font(labelSz8);
        __CLR4_4_112k12kkaivsm4b.R.inc(1478);Label labelSz9 = new Label("9");
        __CLR4_4_112k12kkaivsm4b.R.inc(1479);font(labelSz9);
        __CLR4_4_112k12kkaivsm4b.R.inc(1480);Label labelSz10 = new Label("10");
        __CLR4_4_112k12kkaivsm4b.R.inc(1481);font(labelSz10);

        __CLR4_4_112k12kkaivsm4b.R.inc(1482);Label labelB1 = new Label("A");
        __CLR4_4_112k12kkaivsm4b.R.inc(1483);font(labelB1);
        __CLR4_4_112k12kkaivsm4b.R.inc(1484);Label labelB2 = new Label("B");
        __CLR4_4_112k12kkaivsm4b.R.inc(1485);font(labelB2);
        __CLR4_4_112k12kkaivsm4b.R.inc(1486);Label labelB3 = new Label("C");
        __CLR4_4_112k12kkaivsm4b.R.inc(1487);font(labelB3);
        __CLR4_4_112k12kkaivsm4b.R.inc(1488);Label labelB4 = new Label("D");
        __CLR4_4_112k12kkaivsm4b.R.inc(1489);font(labelB4);
        __CLR4_4_112k12kkaivsm4b.R.inc(1490);Label labelB5 = new Label("E");
        __CLR4_4_112k12kkaivsm4b.R.inc(1491);font(labelB5);
        __CLR4_4_112k12kkaivsm4b.R.inc(1492);Label labelB6 = new Label("F");
        __CLR4_4_112k12kkaivsm4b.R.inc(1493);font(labelB6);
        __CLR4_4_112k12kkaivsm4b.R.inc(1494);Label labelB7 = new Label("G");
        __CLR4_4_112k12kkaivsm4b.R.inc(1495);font(labelB7);
        __CLR4_4_112k12kkaivsm4b.R.inc(1496);Label labelB8 = new Label("H");
        __CLR4_4_112k12kkaivsm4b.R.inc(1497);font(labelB8);
        __CLR4_4_112k12kkaivsm4b.R.inc(1498);Label labelB9 = new Label("I");
        __CLR4_4_112k12kkaivsm4b.R.inc(1499);font(labelB9);
        __CLR4_4_112k12kkaivsm4b.R.inc(1500);Label labelB10 = new Label("J");
        __CLR4_4_112k12kkaivsm4b.R.inc(1501);font(labelB10);

        __CLR4_4_112k12kkaivsm4b.R.inc(1502);Label labelSz21 = new Label("   1");
        __CLR4_4_112k12kkaivsm4b.R.inc(1503);font(labelSz21);
        __CLR4_4_112k12kkaivsm4b.R.inc(1504);Label labelSz22 = new Label("2");
        __CLR4_4_112k12kkaivsm4b.R.inc(1505);font(labelSz22);
        __CLR4_4_112k12kkaivsm4b.R.inc(1506);Label labelSz23 = new Label("3");
        __CLR4_4_112k12kkaivsm4b.R.inc(1507);font(labelSz23);
        __CLR4_4_112k12kkaivsm4b.R.inc(1508);Label labelSz24 = new Label("4");
        __CLR4_4_112k12kkaivsm4b.R.inc(1509);font(labelSz24);
        __CLR4_4_112k12kkaivsm4b.R.inc(1510);Label labelSz25 = new Label("5");
        __CLR4_4_112k12kkaivsm4b.R.inc(1511);font(labelSz25);
        __CLR4_4_112k12kkaivsm4b.R.inc(1512);Label labelSz26 = new Label("6");
        __CLR4_4_112k12kkaivsm4b.R.inc(1513);font(labelSz26);
        __CLR4_4_112k12kkaivsm4b.R.inc(1514);Label labelSz27 = new Label("7");
        __CLR4_4_112k12kkaivsm4b.R.inc(1515);font(labelSz27);
        __CLR4_4_112k12kkaivsm4b.R.inc(1516);Label labelSz28 = new Label("8");
        __CLR4_4_112k12kkaivsm4b.R.inc(1517);font(labelSz28);
        __CLR4_4_112k12kkaivsm4b.R.inc(1518);Label labelSz29 = new Label("9");
        __CLR4_4_112k12kkaivsm4b.R.inc(1519);font(labelSz29);
        __CLR4_4_112k12kkaivsm4b.R.inc(1520);Label labelSz210 = new Label("10");
        __CLR4_4_112k12kkaivsm4b.R.inc(1521);font(labelSz210);

        __CLR4_4_112k12kkaivsm4b.R.inc(1522);Label labelB21 = new Label("A");
        __CLR4_4_112k12kkaivsm4b.R.inc(1523);font(labelB21);
        __CLR4_4_112k12kkaivsm4b.R.inc(1524);Label labelB22 = new Label("B");
        __CLR4_4_112k12kkaivsm4b.R.inc(1525);font(labelB22);
        __CLR4_4_112k12kkaivsm4b.R.inc(1526);Label labelB23 = new Label("C");
        __CLR4_4_112k12kkaivsm4b.R.inc(1527);font(labelB23);
        __CLR4_4_112k12kkaivsm4b.R.inc(1528);Label labelB24 = new Label("D");
        __CLR4_4_112k12kkaivsm4b.R.inc(1529);font(labelB24);
        __CLR4_4_112k12kkaivsm4b.R.inc(1530);Label labelB25 = new Label("E");
        __CLR4_4_112k12kkaivsm4b.R.inc(1531);font(labelB25);
        __CLR4_4_112k12kkaivsm4b.R.inc(1532);Label labelB26 = new Label("F");
        __CLR4_4_112k12kkaivsm4b.R.inc(1533);font(labelB26);
        __CLR4_4_112k12kkaivsm4b.R.inc(1534);Label labelB27 = new Label("G");
        __CLR4_4_112k12kkaivsm4b.R.inc(1535);font(labelB27);
        __CLR4_4_112k12kkaivsm4b.R.inc(1536);Label labelB28 = new Label("H");
        __CLR4_4_112k12kkaivsm4b.R.inc(1537);font(labelB28);
        __CLR4_4_112k12kkaivsm4b.R.inc(1538);Label labelB29 = new Label("I");
        __CLR4_4_112k12kkaivsm4b.R.inc(1539);font(labelB29);
        __CLR4_4_112k12kkaivsm4b.R.inc(1540);Label labelB210 = new Label("J");
        __CLR4_4_112k12kkaivsm4b.R.inc(1541);font(labelB210);


        __CLR4_4_112k12kkaivsm4b.R.inc(1542);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_112k12kkaivsm4b.R.inc(1543);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_112k12kkaivsm4b.R.inc(1544);root.setCenter(Betu11);
        __CLR4_4_112k12kkaivsm4b.R.inc(1545);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);




        __CLR4_4_112k12kkaivsm4b.R.inc(1546);root.setCenter(Szam11);

        __CLR4_4_112k12kkaivsm4b.R.inc(1547);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_112k12kkaivsm4b.R.inc(1548);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_112k12kkaivsm4b.R.inc(1549);root.setCenter(Betu1);
        __CLR4_4_112k12kkaivsm4b.R.inc(1550);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_112k12kkaivsm4b.R.inc(1551);root.setCenter(Szam1);

        __CLR4_4_112k12kkaivsm4b.R.inc(1552);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_112k12kkaivsm4b.R.inc(1553);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_112k12kkaivsm4b.R.inc(1554);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_112k12kkaivsm4b.R.inc(1555);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_112k12kkaivsm4b.R.inc(1556);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_112k12kkaivsm4b.R.inc(1557);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_112k12kkaivsm4b.R.inc(1558);root.setCenter(tablak);




        __CLR4_4_112k12kkaivsm4b.R.inc(1559);return root;

    }finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}

/*
    public void print(WritableImage writableImage, Stage primaryStage) {
        ImageView imageView =new ImageView(writableImage);
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, Printer.MarginType.DEFAULT);
        double scaleX = pageLayout.getPrintableWidth() / imageView.getBoundsInParent().getWidth();
        double scaleY = pageLayout.getPrintableHeight() / imageView.getBoundsInParent().getHeight();
        imageView.getTransforms().add(new Scale(scaleX, scaleY));

        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            boolean successPrintDialog = job.showPrintDialog(primaryStage.getOwner());
            if(successPrintDialog){
                boolean success = job.printPage(pageLayout,imageView);
                if (success) {
                    job.endJob();
                }
            }
        }
    }

    */

    private static Label font(Label label){try{__CLR4_4_112k12kkaivsm4b.R.inc(1560);

        __CLR4_4_112k12kkaivsm4b.R.inc(1561);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_112k12kkaivsm4b.R.inc(1562);label.setFont(new Font("Arial", 17));
        __CLR4_4_112k12kkaivsm4b.R.inc(1563);label.setStyle("-fx-font-weight: bold;");
        __CLR4_4_112k12kkaivsm4b.R.inc(1564);return label;
    }finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}



    private static void startGame() {try{__CLR4_4_112k12kkaivsm4b.R.inc(1565);
        __CLR4_4_112k12kkaivsm4b.R.inc(1566);int nagysag = 5;

        __CLR4_4_112k12kkaivsm4b.R.inc(1567);while ((((nagysag > 0)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1568)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1569)==0&false))) {{
            __CLR4_4_112k12kkaivsm4b.R.inc(1570);int x = random.nextInt(10);
            __CLR4_4_112k12kkaivsm4b.R.inc(1571);int y = random.nextInt(10);

            __CLR4_4_112k12kkaivsm4b.R.inc(1572);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_112k12kkaivsm4b.R.iget(1573)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1574)==0&false))) {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1575);nagysag--;
            }
        }}
        }__CLR4_4_112k12kkaivsm4b.R.inc(1576);jatekKezdet = true;
    }finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}



    public static void EllensegLepese() {try{__CLR4_4_112k12kkaivsm4b.R.inc(1577);


        __CLR4_4_112k12kkaivsm4b.R.inc(1578);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1579)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1580)==0&false))) {{
            __CLR4_4_112k12kkaivsm4b.R.inc(1581);int x = random.nextInt(10);
            __CLR4_4_112k12kkaivsm4b.R.inc(1582);int y = random.nextInt(10);
            __CLR4_4_112k12kkaivsm4b.R.inc(1583);String x1 = String.valueOf(x+1);
            __CLR4_4_112k12kkaivsm4b.R.inc(1584);String y21 = String.valueOf(y+1);

            __CLR4_4_112k12kkaivsm4b.R.inc(1585);String yE = ybetuk[y];
            __CLR4_4_112k12kkaivsm4b.R.inc(1586);String xE = x1;

            __CLR4_4_112k12kkaivsm4b.R.inc(1587);xyE = xE + yE;
            __CLR4_4_112k12kkaivsm4b.R.inc(1588);jatekoslepese = false;
            __CLR4_4_112k12kkaivsm4b.R.inc(1589);lepes++;

            __CLR4_4_112k12kkaivsm4b.R.inc(1590);Lepes.setText(xyE);
            __CLR4_4_112k12kkaivsm4b.R.inc(1591);try {
                __CLR4_4_112k12kkaivsm4b.R.inc(1592);Main.ujtablaadat();
            } catch (IOException e) {
                __CLR4_4_112k12kkaivsm4b.R.inc(1593);e.printStackTrace();
            }


            __CLR4_4_112k12kkaivsm4b.R.inc(1594);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_112k12kkaivsm4b.R.inc(1595);if ((((cella.wasShot)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1596)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1597)==0&false)))
                {__CLR4_4_112k12kkaivsm4b.R.inc(1598);continue;

            }__CLR4_4_112k12kkaivsm4b.R.inc(1599);ellensegKore = cella.loves();

            __CLR4_4_112k12kkaivsm4b.R.inc(1600);if ((((tablaJ.hajok == 0)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1601)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1602)==0&false))) {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1603);System.out.println("Vesztettel");
                __CLR4_4_112k12kkaivsm4b.R.inc(1604);Nyertel = 1;
                __CLR4_4_112k12kkaivsm4b.R.inc(1605);jatekVege = true;
                __CLR4_4_112k12kkaivsm4b.R.inc(1606);popUpAblak();

            }
        }}
    }}finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}

    public static void popUpAblak(){try{__CLR4_4_112k12kkaivsm4b.R.inc(1607);


        __CLR4_4_112k12kkaivsm4b.R.inc(1608);if((((Nyertel == 1)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1609)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1610)==0&false)))
        {{
            __CLR4_4_112k12kkaivsm4b.R.inc(1611);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_112k12kkaivsm4b.R.inc(1612);alert.setTitle("Vesztettel");
            __CLR4_4_112k12kkaivsm4b.R.inc(1613);alert.setHeaderText(null);
            __CLR4_4_112k12kkaivsm4b.R.inc(1614);alert.setGraphic(null);
            __CLR4_4_112k12kkaivsm4b.R.inc(1615);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_112k12kkaivsm4b.R.inc(1616);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_112k12kkaivsm4b.R.inc(1617);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1618)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1619)==0&false)))
            {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1620);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}
        }else {__CLR4_4_112k12kkaivsm4b.R.inc(1621);if((((Nyertel == 2)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1622)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1623)==0&false)))
        {{
            __CLR4_4_112k12kkaivsm4b.R.inc(1624);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_112k12kkaivsm4b.R.inc(1625);alert.setTitle("Nyertel");
            __CLR4_4_112k12kkaivsm4b.R.inc(1626);alert.setHeaderText(null);
            __CLR4_4_112k12kkaivsm4b.R.inc(1627);alert.setGraphic(null);
            __CLR4_4_112k12kkaivsm4b.R.inc(1628);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_112k12kkaivsm4b.R.inc(1629);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_112k12kkaivsm4b.R.inc(1630);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_112k12kkaivsm4b.R.iget(1631)!=0|true))||(__CLR4_4_112k12kkaivsm4b.R.iget(1632)==0&false)))
            {{
                __CLR4_4_112k12kkaivsm4b.R.inc(1633);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}


    }}}finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}
    //public Scene scene1 = new Scene(createContent());

    private static void reset(Stage primaryStage){try{__CLR4_4_112k12kkaivsm4b.R.inc(1634);

        __CLR4_4_112k12kkaivsm4b.R.inc(1635);primaryStage.close();
        __CLR4_4_112k12kkaivsm4b.R.inc(1636);jatekKezdet = false;
        __CLR4_4_112k12kkaivsm4b.R.inc(1637);hatralevoHajok = 5;
        __CLR4_4_112k12kkaivsm4b.R.inc(1638);Scene scene2 = new Scene(createContent());
        __CLR4_4_112k12kkaivsm4b.R.inc(1639);primaryStage.setScene(scene2);
        __CLR4_4_112k12kkaivsm4b.R.inc(1640);primaryStage.show();
        __CLR4_4_112k12kkaivsm4b.R.inc(1641);jatekVege = false;

    }finally{__CLR4_4_112k12kkaivsm4b.R.flushNeeded();}}


}