/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.util.Optional;
import java.util.Random;

import javafx.application.Application;

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

public class Pelda extends Application  {public static class __CLR4_4_1axaxkags3rym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590065769419L,8589935092L,635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public  static boolean jatekVege = false;
    //public static Parent scene1= new Scene(createContent());
     public static boolean jatekKezdet = false;
     private static Tabla tablaE, tablaJ;
     static int Nyertel = 0;


     private static int hatralevoHajok = 5;
     static Button resetButton = new Button("Reset");
     static Text menuT = new Text("Menu");
     private static boolean ellensegKore = false;

     private static Random random = new Random();
     //private Stage stage31;
     //public SubScene sub = new SubScene(createContent(), 800,850);

/*
    public static SubScene createSubScene(Parent root) {


        SubScene subScene = new SubScene(root, 500, 400);

        return subScene;
    }
*/


    @Override
    public void start(Stage primaryStage) throws Exception {try{__CLR4_4_1axaxkags3rym.R.inc(393);
        //Scene scene1 = new Scene(createContent());

        //scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        //this.stage31 = primaryStage;

/*
        resetButton.setOnAction(e -> {
            reset(primaryStage);
        });
*/

    }finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}



//new Foo().nonStaticMethod();
//public Scene scene1 = new Scene(createContent());


    public static Parent createContent() {try{__CLR4_4_1axaxkags3rym.R.inc(394);
        __CLR4_4_1axaxkags3rym.R.inc(395);BorderPane root = new BorderPane();


        __CLR4_4_1axaxkags3rym.R.inc(396);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_1axaxkags3rym.R.inc(397);root.setPrefSize(800, 850);
        __CLR4_4_1axaxkags3rym.R.inc(398);resetButton.setPrefWidth(150);
        __CLR4_4_1axaxkags3rym.R.inc(399);resetButton.setPrefHeight(50);

        // Top margo

        __CLR4_4_1axaxkags3rym.R.inc(400);Insets insets = new Insets(10);
        __CLR4_4_1axaxkags3rym.R.inc(401);Node topNode = new Label("");
        __CLR4_4_1axaxkags3rym.R.inc(402);root.setTop(topNode);
        __CLR4_4_1axaxkags3rym.R.inc(403);BorderPane.setMargin(topNode, insets);




        __CLR4_4_1axaxkags3rym.R.inc(404);VBox menu = new VBox( 20,menuT, resetButton);
        __CLR4_4_1axaxkags3rym.R.inc(405);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_1axaxkags3rym.R.inc(406);root.setRight(menu);



        //Hatter
        __CLR4_4_1axaxkags3rym.R.inc(407);Image image = new Image("BG2.jpeg");

        __CLR4_4_1axaxkags3rym.R.inc(408);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_1axaxkags3rym.R.inc(409);Background background = new Background(backgroundimage);

        __CLR4_4_1axaxkags3rym.R.inc(410);root.setBackground(background);




        __CLR4_4_1axaxkags3rym.R.inc(411);tablaE = new Tabla(true, event -> {
            __CLR4_4_1axaxkags3rym.R.inc(412);if ((((!jatekKezdet)&&(__CLR4_4_1axaxkags3rym.R.iget(413)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(414)==0&false)))
                {__CLR4_4_1axaxkags3rym.R.inc(415);return;

            }__CLR4_4_1axaxkags3rym.R.inc(416);Cella cell = (Cella) event.getSource();
            __CLR4_4_1axaxkags3rym.R.inc(417);if ((((cell.wasShot)&&(__CLR4_4_1axaxkags3rym.R.iget(418)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(419)==0&false)))
                {__CLR4_4_1axaxkags3rym.R.inc(420);return;

            }__CLR4_4_1axaxkags3rym.R.inc(421);ellensegKore = !cell.loves();

            __CLR4_4_1axaxkags3rym.R.inc(422);if ((((tablaE.hajok == 4)&&(__CLR4_4_1axaxkags3rym.R.iget(423)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(424)==0&false))) {{
                __CLR4_4_1axaxkags3rym.R.inc(425);System.out.println("Nyertel");
                __CLR4_4_1axaxkags3rym.R.inc(426);jatekVege = true;
                __CLR4_4_1axaxkags3rym.R.inc(427);Nyertel = 2;
                __CLR4_4_1axaxkags3rym.R.inc(428);popUpAblak();


            }

            }__CLR4_4_1axaxkags3rym.R.inc(429);if ((((ellensegKore)&&(__CLR4_4_1axaxkags3rym.R.iget(430)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(431)==0&false)))
                {__CLR4_4_1axaxkags3rym.R.inc(432);EllensegLepese();
        }});

        __CLR4_4_1axaxkags3rym.R.inc(433);tablaJ = new Tabla(false, event -> {
            __CLR4_4_1axaxkags3rym.R.inc(434);if ((((jatekKezdet)&&(__CLR4_4_1axaxkags3rym.R.iget(435)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(436)==0&false)))
                {__CLR4_4_1axaxkags3rym.R.inc(437);return;

            }__CLR4_4_1axaxkags3rym.R.inc(438);Cella cell = (Cella) event.getSource();
            __CLR4_4_1axaxkags3rym.R.inc(439);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_1axaxkags3rym.R.iget(440)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(441)==0&false))) {{
                __CLR4_4_1axaxkags3rym.R.inc(442);if ((((--hatralevoHajok == 0)&&(__CLR4_4_1axaxkags3rym.R.iget(443)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(444)==0&false))) {{
                    __CLR4_4_1axaxkags3rym.R.inc(445);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_1axaxkags3rym.R.inc(446);Label labelSz1 = new Label("   1");
        __CLR4_4_1axaxkags3rym.R.inc(447);font(labelSz1);
        __CLR4_4_1axaxkags3rym.R.inc(448);Label labelSz2 = new Label("2");
        __CLR4_4_1axaxkags3rym.R.inc(449);font(labelSz2);
        __CLR4_4_1axaxkags3rym.R.inc(450);Label labelSz3 = new Label("3");
        __CLR4_4_1axaxkags3rym.R.inc(451);font(labelSz3);
        __CLR4_4_1axaxkags3rym.R.inc(452);Label labelSz4 = new Label("4");
        __CLR4_4_1axaxkags3rym.R.inc(453);font(labelSz4);
        __CLR4_4_1axaxkags3rym.R.inc(454);Label labelSz5 = new Label("5");
        __CLR4_4_1axaxkags3rym.R.inc(455);font(labelSz5);
        __CLR4_4_1axaxkags3rym.R.inc(456);Label labelSz6 = new Label("6");
        __CLR4_4_1axaxkags3rym.R.inc(457);font(labelSz6);
        __CLR4_4_1axaxkags3rym.R.inc(458);Label labelSz7 = new Label("7");
        __CLR4_4_1axaxkags3rym.R.inc(459);font(labelSz7);
        __CLR4_4_1axaxkags3rym.R.inc(460);Label labelSz8 = new Label("8");
        __CLR4_4_1axaxkags3rym.R.inc(461);font(labelSz8);
        __CLR4_4_1axaxkags3rym.R.inc(462);Label labelSz9 = new Label("9");
        __CLR4_4_1axaxkags3rym.R.inc(463);font(labelSz9);
        __CLR4_4_1axaxkags3rym.R.inc(464);Label labelSz10 = new Label("10");
        __CLR4_4_1axaxkags3rym.R.inc(465);font(labelSz10);

        __CLR4_4_1axaxkags3rym.R.inc(466);Label labelB1 = new Label("A");
        __CLR4_4_1axaxkags3rym.R.inc(467);font(labelB1);
        __CLR4_4_1axaxkags3rym.R.inc(468);Label labelB2 = new Label("B");
        __CLR4_4_1axaxkags3rym.R.inc(469);font(labelB2);
        __CLR4_4_1axaxkags3rym.R.inc(470);Label labelB3 = new Label("C");
        __CLR4_4_1axaxkags3rym.R.inc(471);font(labelB3);
        __CLR4_4_1axaxkags3rym.R.inc(472);Label labelB4 = new Label("D");
        __CLR4_4_1axaxkags3rym.R.inc(473);font(labelB4);
        __CLR4_4_1axaxkags3rym.R.inc(474);Label labelB5 = new Label("E");
        __CLR4_4_1axaxkags3rym.R.inc(475);font(labelB5);
        __CLR4_4_1axaxkags3rym.R.inc(476);Label labelB6 = new Label("F");
        __CLR4_4_1axaxkags3rym.R.inc(477);font(labelB6);
        __CLR4_4_1axaxkags3rym.R.inc(478);Label labelB7 = new Label("G");
        __CLR4_4_1axaxkags3rym.R.inc(479);font(labelB7);
        __CLR4_4_1axaxkags3rym.R.inc(480);Label labelB8 = new Label("H");
        __CLR4_4_1axaxkags3rym.R.inc(481);font(labelB8);
        __CLR4_4_1axaxkags3rym.R.inc(482);Label labelB9 = new Label("I");
        __CLR4_4_1axaxkags3rym.R.inc(483);font(labelB9);
        __CLR4_4_1axaxkags3rym.R.inc(484);Label labelB10 = new Label("J");
        __CLR4_4_1axaxkags3rym.R.inc(485);font(labelB10);

        __CLR4_4_1axaxkags3rym.R.inc(486);Label labelSz21 = new Label("   1");
        __CLR4_4_1axaxkags3rym.R.inc(487);font(labelSz21);
        __CLR4_4_1axaxkags3rym.R.inc(488);Label labelSz22 = new Label("2");
        __CLR4_4_1axaxkags3rym.R.inc(489);font(labelSz22);
        __CLR4_4_1axaxkags3rym.R.inc(490);Label labelSz23 = new Label("3");
        __CLR4_4_1axaxkags3rym.R.inc(491);font(labelSz23);
        __CLR4_4_1axaxkags3rym.R.inc(492);Label labelSz24 = new Label("4");
        __CLR4_4_1axaxkags3rym.R.inc(493);font(labelSz24);
        __CLR4_4_1axaxkags3rym.R.inc(494);Label labelSz25 = new Label("5");
        __CLR4_4_1axaxkags3rym.R.inc(495);font(labelSz25);
        __CLR4_4_1axaxkags3rym.R.inc(496);Label labelSz26 = new Label("6");
        __CLR4_4_1axaxkags3rym.R.inc(497);font(labelSz26);
        __CLR4_4_1axaxkags3rym.R.inc(498);Label labelSz27 = new Label("7");
        __CLR4_4_1axaxkags3rym.R.inc(499);font(labelSz27);
        __CLR4_4_1axaxkags3rym.R.inc(500);Label labelSz28 = new Label("8");
        __CLR4_4_1axaxkags3rym.R.inc(501);font(labelSz28);
        __CLR4_4_1axaxkags3rym.R.inc(502);Label labelSz29 = new Label("9");
        __CLR4_4_1axaxkags3rym.R.inc(503);font(labelSz29);
        __CLR4_4_1axaxkags3rym.R.inc(504);Label labelSz210 = new Label("10");
        __CLR4_4_1axaxkags3rym.R.inc(505);font(labelSz210);

        __CLR4_4_1axaxkags3rym.R.inc(506);Label labelB21 = new Label("A");
        __CLR4_4_1axaxkags3rym.R.inc(507);font(labelB21);
        __CLR4_4_1axaxkags3rym.R.inc(508);Label labelB22 = new Label("B");
        __CLR4_4_1axaxkags3rym.R.inc(509);font(labelB22);
        __CLR4_4_1axaxkags3rym.R.inc(510);Label labelB23 = new Label("C");
        __CLR4_4_1axaxkags3rym.R.inc(511);font(labelB23);
        __CLR4_4_1axaxkags3rym.R.inc(512);Label labelB24 = new Label("D");
        __CLR4_4_1axaxkags3rym.R.inc(513);font(labelB24);
        __CLR4_4_1axaxkags3rym.R.inc(514);Label labelB25 = new Label("E");
        __CLR4_4_1axaxkags3rym.R.inc(515);font(labelB25);
        __CLR4_4_1axaxkags3rym.R.inc(516);Label labelB26 = new Label("F");
        __CLR4_4_1axaxkags3rym.R.inc(517);font(labelB26);
        __CLR4_4_1axaxkags3rym.R.inc(518);Label labelB27 = new Label("G");
        __CLR4_4_1axaxkags3rym.R.inc(519);font(labelB27);
        __CLR4_4_1axaxkags3rym.R.inc(520);Label labelB28 = new Label("H");
        __CLR4_4_1axaxkags3rym.R.inc(521);font(labelB28);
        __CLR4_4_1axaxkags3rym.R.inc(522);Label labelB29 = new Label("I");
        __CLR4_4_1axaxkags3rym.R.inc(523);font(labelB29);
        __CLR4_4_1axaxkags3rym.R.inc(524);Label labelB210 = new Label("J");
        __CLR4_4_1axaxkags3rym.R.inc(525);font(labelB210);



        __CLR4_4_1axaxkags3rym.R.inc(526);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_1axaxkags3rym.R.inc(527);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_1axaxkags3rym.R.inc(528);root.setCenter(Betu11);
        __CLR4_4_1axaxkags3rym.R.inc(529);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);

        __CLR4_4_1axaxkags3rym.R.inc(530);root.setCenter(Szam11);

        __CLR4_4_1axaxkags3rym.R.inc(531);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_1axaxkags3rym.R.inc(532);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_1axaxkags3rym.R.inc(533);root.setCenter(Betu1);
        __CLR4_4_1axaxkags3rym.R.inc(534);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_1axaxkags3rym.R.inc(535);root.setCenter(Szam1);

        __CLR4_4_1axaxkags3rym.R.inc(536);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_1axaxkags3rym.R.inc(537);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_1axaxkags3rym.R.inc(538);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_1axaxkags3rym.R.inc(539);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_1axaxkags3rym.R.inc(540);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_1axaxkags3rym.R.inc(541);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_1axaxkags3rym.R.inc(542);root.setCenter(tablak);




        __CLR4_4_1axaxkags3rym.R.inc(543);return root;

    }finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}

    public void print(WritableImage writableImage, Stage primaryStage) {try{__CLR4_4_1axaxkags3rym.R.inc(544);
        __CLR4_4_1axaxkags3rym.R.inc(545);ImageView imageView =new ImageView(writableImage);
        __CLR4_4_1axaxkags3rym.R.inc(546);Printer printer = Printer.getDefaultPrinter();
        __CLR4_4_1axaxkags3rym.R.inc(547);PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, Printer.MarginType.DEFAULT);
        __CLR4_4_1axaxkags3rym.R.inc(548);double scaleX = pageLayout.getPrintableWidth() / imageView.getBoundsInParent().getWidth();
        __CLR4_4_1axaxkags3rym.R.inc(549);double scaleY = pageLayout.getPrintableHeight() / imageView.getBoundsInParent().getHeight();
        __CLR4_4_1axaxkags3rym.R.inc(550);imageView.getTransforms().add(new Scale(scaleX, scaleY));

        __CLR4_4_1axaxkags3rym.R.inc(551);PrinterJob job = PrinterJob.createPrinterJob();
        __CLR4_4_1axaxkags3rym.R.inc(552);if ((((job != null)&&(__CLR4_4_1axaxkags3rym.R.iget(553)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(554)==0&false))) {{
            __CLR4_4_1axaxkags3rym.R.inc(555);boolean successPrintDialog = job.showPrintDialog(primaryStage.getOwner());
            __CLR4_4_1axaxkags3rym.R.inc(556);if((((successPrintDialog)&&(__CLR4_4_1axaxkags3rym.R.iget(557)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(558)==0&false))){{
                __CLR4_4_1axaxkags3rym.R.inc(559);boolean success = job.printPage(pageLayout,imageView);
                __CLR4_4_1axaxkags3rym.R.inc(560);if ((((success)&&(__CLR4_4_1axaxkags3rym.R.iget(561)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(562)==0&false))) {{
                    __CLR4_4_1axaxkags3rym.R.inc(563);job.endJob();
                }
            }}
        }}
    }}finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}

    private static Label font(Label label){try{__CLR4_4_1axaxkags3rym.R.inc(564);

        __CLR4_4_1axaxkags3rym.R.inc(565);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_1axaxkags3rym.R.inc(566);label.setFont(new Font("Arial", 17));
        __CLR4_4_1axaxkags3rym.R.inc(567);label.setStyle("-fx-font-weight: bold;");
        __CLR4_4_1axaxkags3rym.R.inc(568);return label;
    }finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}



    private static void startGame() {try{__CLR4_4_1axaxkags3rym.R.inc(569);
        __CLR4_4_1axaxkags3rym.R.inc(570);int nagysag = 5;

        __CLR4_4_1axaxkags3rym.R.inc(571);while ((((nagysag > 0)&&(__CLR4_4_1axaxkags3rym.R.iget(572)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(573)==0&false))) {{
            __CLR4_4_1axaxkags3rym.R.inc(574);int x = random.nextInt(10);
            __CLR4_4_1axaxkags3rym.R.inc(575);int y = random.nextInt(10);

            __CLR4_4_1axaxkags3rym.R.inc(576);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_1axaxkags3rym.R.iget(577)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(578)==0&false))) {{
                __CLR4_4_1axaxkags3rym.R.inc(579);nagysag--;
            }
        }}
        }__CLR4_4_1axaxkags3rym.R.inc(580);jatekKezdet = true;
    }finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}



    public static void EllensegLepese() {try{__CLR4_4_1axaxkags3rym.R.inc(581);


        __CLR4_4_1axaxkags3rym.R.inc(582);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_1axaxkags3rym.R.iget(583)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(584)==0&false))) {{
            __CLR4_4_1axaxkags3rym.R.inc(585);int x = random.nextInt(10);
            __CLR4_4_1axaxkags3rym.R.inc(586);int y = random.nextInt(10);

            __CLR4_4_1axaxkags3rym.R.inc(587);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_1axaxkags3rym.R.inc(588);if ((((cella.wasShot)&&(__CLR4_4_1axaxkags3rym.R.iget(589)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(590)==0&false)))
                {__CLR4_4_1axaxkags3rym.R.inc(591);continue;

            }__CLR4_4_1axaxkags3rym.R.inc(592);ellensegKore = cella.loves();

            __CLR4_4_1axaxkags3rym.R.inc(593);if ((((tablaJ.hajok == 0)&&(__CLR4_4_1axaxkags3rym.R.iget(594)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(595)==0&false))) {{
                __CLR4_4_1axaxkags3rym.R.inc(596);System.out.println("Vesztettel");
                __CLR4_4_1axaxkags3rym.R.inc(597);Nyertel = 1;
                __CLR4_4_1axaxkags3rym.R.inc(598);jatekVege = true;
                __CLR4_4_1axaxkags3rym.R.inc(599);popUpAblak();


                //System.exit(0);
            }
        }}
    }}finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}

    public static void popUpAblak(){try{__CLR4_4_1axaxkags3rym.R.inc(600);


        __CLR4_4_1axaxkags3rym.R.inc(601);if((((Nyertel == 1)&&(__CLR4_4_1axaxkags3rym.R.iget(602)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(603)==0&false)))
        {{
            __CLR4_4_1axaxkags3rym.R.inc(604);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1axaxkags3rym.R.inc(605);alert.setTitle("Vesztettel");
            __CLR4_4_1axaxkags3rym.R.inc(606);alert.setHeaderText(null);
            __CLR4_4_1axaxkags3rym.R.inc(607);alert.setGraphic(null);
            __CLR4_4_1axaxkags3rym.R.inc(608);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_1axaxkags3rym.R.inc(609);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1axaxkags3rym.R.inc(610);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1axaxkags3rym.R.iget(611)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(612)==0&false)))
            {{
                __CLR4_4_1axaxkags3rym.R.inc(613);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}
        }else {__CLR4_4_1axaxkags3rym.R.inc(614);if((((Nyertel == 2)&&(__CLR4_4_1axaxkags3rym.R.iget(615)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(616)==0&false)))
        {{
            __CLR4_4_1axaxkags3rym.R.inc(617);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1axaxkags3rym.R.inc(618);alert.setTitle("Nyertel");
            __CLR4_4_1axaxkags3rym.R.inc(619);alert.setHeaderText(null);
            __CLR4_4_1axaxkags3rym.R.inc(620);alert.setGraphic(null);
            __CLR4_4_1axaxkags3rym.R.inc(621);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_1axaxkags3rym.R.inc(622);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1axaxkags3rym.R.inc(623);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1axaxkags3rym.R.iget(624)!=0|true))||(__CLR4_4_1axaxkags3rym.R.iget(625)==0&false)))
            {{
                __CLR4_4_1axaxkags3rym.R.inc(626);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}


    }}}finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}
    public Scene scene1 = new Scene(createContent());

    private static void reset(Stage primaryStage){try{__CLR4_4_1axaxkags3rym.R.inc(627);

            __CLR4_4_1axaxkags3rym.R.inc(628);primaryStage.close();
        __CLR4_4_1axaxkags3rym.R.inc(629);jatekKezdet = false;
        __CLR4_4_1axaxkags3rym.R.inc(630);hatralevoHajok = 5;
        __CLR4_4_1axaxkags3rym.R.inc(631);Scene scene2 = new Scene(createContent());
        __CLR4_4_1axaxkags3rym.R.inc(632);primaryStage.setScene(scene2);
        __CLR4_4_1axaxkags3rym.R.inc(633);primaryStage.show();
        __CLR4_4_1axaxkags3rym.R.inc(634);jatekVege = false;

    }finally{__CLR4_4_1axaxkags3rym.R.flushNeeded();}}


}