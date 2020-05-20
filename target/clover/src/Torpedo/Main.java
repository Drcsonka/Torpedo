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

public class Main {public static class __CLR4_4_188kaebnw0e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589917221894L,8589935092L,251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean jatekVege = false;
    private boolean jatekKezdet = false;
    private Tabla tablaE, tablaJ;
    int Nyertel = 0;


    private int hatralevoHajok = 5;
    Button resetButton = new Button("Reset");
    Button button2 = new Button("Teszt1");
    Text menuT = new Text("Menu");
    private boolean ellensegKore = false;

    private Random random = new Random();
    private Stage stage31;



/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        Scene scene1 = new Scene(createContent());
        //scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene1);
        primaryStage.show();
        this.stage31 = primaryStage;



        resetButton.setOnAction(e -> {
            reset(primaryStage);
        });

    }

*/

    public Parent createContent() {try{__CLR4_4_188kaebnw0e.R.inc(8);
        __CLR4_4_188kaebnw0e.R.inc(9);BorderPane root = new BorderPane();


        __CLR4_4_188kaebnw0e.R.inc(10);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_188kaebnw0e.R.inc(11);root.setPrefSize(800, 850);
        __CLR4_4_188kaebnw0e.R.inc(12);resetButton.setPrefWidth(150);
        __CLR4_4_188kaebnw0e.R.inc(13);resetButton.setPrefHeight(50);

        __CLR4_4_188kaebnw0e.R.inc(14);button2.setPrefHeight(50);
        __CLR4_4_188kaebnw0e.R.inc(15);button2.setPrefWidth(100);

        // Top margo

        __CLR4_4_188kaebnw0e.R.inc(16);Insets insets = new Insets(10);
        __CLR4_4_188kaebnw0e.R.inc(17);Node topNode = new Label("");
        __CLR4_4_188kaebnw0e.R.inc(18);root.setTop(topNode);
        __CLR4_4_188kaebnw0e.R.inc(19);BorderPane.setMargin(topNode, insets);




        __CLR4_4_188kaebnw0e.R.inc(20);VBox menu = new VBox( 20,menuT, resetButton, button2);
        __CLR4_4_188kaebnw0e.R.inc(21);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_188kaebnw0e.R.inc(22);root.setRight(menu);



        //Hatter
        __CLR4_4_188kaebnw0e.R.inc(23);Image image = new Image("BG2.jpeg");

        __CLR4_4_188kaebnw0e.R.inc(24);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_188kaebnw0e.R.inc(25);Background background = new Background(backgroundimage);

        __CLR4_4_188kaebnw0e.R.inc(26);root.setBackground(background);




        __CLR4_4_188kaebnw0e.R.inc(27);tablaE = new Tabla(true, event -> {
            __CLR4_4_188kaebnw0e.R.inc(28);if ((((!jatekKezdet)&&(__CLR4_4_188kaebnw0e.R.iget(29)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(30)==0&false)))
                {__CLR4_4_188kaebnw0e.R.inc(31);return;

            }__CLR4_4_188kaebnw0e.R.inc(32);Cella cell = (Cella) event.getSource();
            __CLR4_4_188kaebnw0e.R.inc(33);if ((((cell.wasShot)&&(__CLR4_4_188kaebnw0e.R.iget(34)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(35)==0&false)))
                {__CLR4_4_188kaebnw0e.R.inc(36);return;

            }__CLR4_4_188kaebnw0e.R.inc(37);ellensegKore = !cell.loves();

            __CLR4_4_188kaebnw0e.R.inc(38);if ((((tablaE.hajok == 4)&&(__CLR4_4_188kaebnw0e.R.iget(39)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(40)==0&false))) {{
                __CLR4_4_188kaebnw0e.R.inc(41);System.out.println("Nyertel");
                __CLR4_4_188kaebnw0e.R.inc(42);jatekVege = true;
                __CLR4_4_188kaebnw0e.R.inc(43);Nyertel = 2;
                __CLR4_4_188kaebnw0e.R.inc(44);popUpAblak();


            }

            }__CLR4_4_188kaebnw0e.R.inc(45);if ((((ellensegKore)&&(__CLR4_4_188kaebnw0e.R.iget(46)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(47)==0&false)))
                {__CLR4_4_188kaebnw0e.R.inc(48);EllensegLepese();
        }});

        __CLR4_4_188kaebnw0e.R.inc(49);tablaJ = new Tabla(false, event -> {
            __CLR4_4_188kaebnw0e.R.inc(50);if ((((jatekKezdet)&&(__CLR4_4_188kaebnw0e.R.iget(51)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(52)==0&false)))
                {__CLR4_4_188kaebnw0e.R.inc(53);return;

            }__CLR4_4_188kaebnw0e.R.inc(54);Cella cell = (Cella) event.getSource();
            __CLR4_4_188kaebnw0e.R.inc(55);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_188kaebnw0e.R.iget(56)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(57)==0&false))) {{
                __CLR4_4_188kaebnw0e.R.inc(58);if ((((--hatralevoHajok == 0)&&(__CLR4_4_188kaebnw0e.R.iget(59)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(60)==0&false))) {{
                    __CLR4_4_188kaebnw0e.R.inc(61);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_188kaebnw0e.R.inc(62);Label labelSz1 = new Label("   1");
        __CLR4_4_188kaebnw0e.R.inc(63);font(labelSz1);
        __CLR4_4_188kaebnw0e.R.inc(64);Label labelSz2 = new Label("2");
        __CLR4_4_188kaebnw0e.R.inc(65);font(labelSz2);
        __CLR4_4_188kaebnw0e.R.inc(66);Label labelSz3 = new Label("3");
        __CLR4_4_188kaebnw0e.R.inc(67);font(labelSz3);
        __CLR4_4_188kaebnw0e.R.inc(68);Label labelSz4 = new Label("4");
        __CLR4_4_188kaebnw0e.R.inc(69);font(labelSz4);
        __CLR4_4_188kaebnw0e.R.inc(70);Label labelSz5 = new Label("5");
        __CLR4_4_188kaebnw0e.R.inc(71);font(labelSz5);
        __CLR4_4_188kaebnw0e.R.inc(72);Label labelSz6 = new Label("6");
        __CLR4_4_188kaebnw0e.R.inc(73);font(labelSz6);
        __CLR4_4_188kaebnw0e.R.inc(74);Label labelSz7 = new Label("7");
        __CLR4_4_188kaebnw0e.R.inc(75);font(labelSz7);
        __CLR4_4_188kaebnw0e.R.inc(76);Label labelSz8 = new Label("8");
        __CLR4_4_188kaebnw0e.R.inc(77);font(labelSz8);
        __CLR4_4_188kaebnw0e.R.inc(78);Label labelSz9 = new Label("9");
        __CLR4_4_188kaebnw0e.R.inc(79);font(labelSz9);
        __CLR4_4_188kaebnw0e.R.inc(80);Label labelSz10 = new Label("10");
        __CLR4_4_188kaebnw0e.R.inc(81);font(labelSz10);

        __CLR4_4_188kaebnw0e.R.inc(82);Label labelB1 = new Label("A");
        __CLR4_4_188kaebnw0e.R.inc(83);font(labelB1);
        __CLR4_4_188kaebnw0e.R.inc(84);Label labelB2 = new Label("B");
        __CLR4_4_188kaebnw0e.R.inc(85);font(labelB2);
        __CLR4_4_188kaebnw0e.R.inc(86);Label labelB3 = new Label("C");
        __CLR4_4_188kaebnw0e.R.inc(87);font(labelB3);
        __CLR4_4_188kaebnw0e.R.inc(88);Label labelB4 = new Label("D");
        __CLR4_4_188kaebnw0e.R.inc(89);font(labelB4);
        __CLR4_4_188kaebnw0e.R.inc(90);Label labelB5 = new Label("E");
        __CLR4_4_188kaebnw0e.R.inc(91);font(labelB5);
        __CLR4_4_188kaebnw0e.R.inc(92);Label labelB6 = new Label("F");
        __CLR4_4_188kaebnw0e.R.inc(93);font(labelB6);
        __CLR4_4_188kaebnw0e.R.inc(94);Label labelB7 = new Label("G");
        __CLR4_4_188kaebnw0e.R.inc(95);font(labelB7);
        __CLR4_4_188kaebnw0e.R.inc(96);Label labelB8 = new Label("H");
        __CLR4_4_188kaebnw0e.R.inc(97);font(labelB8);
        __CLR4_4_188kaebnw0e.R.inc(98);Label labelB9 = new Label("I");
        __CLR4_4_188kaebnw0e.R.inc(99);font(labelB9);
        __CLR4_4_188kaebnw0e.R.inc(100);Label labelB10 = new Label("J");
        __CLR4_4_188kaebnw0e.R.inc(101);font(labelB10);

        __CLR4_4_188kaebnw0e.R.inc(102);Label labelSz21 = new Label("   1");
        __CLR4_4_188kaebnw0e.R.inc(103);font(labelSz21);
        __CLR4_4_188kaebnw0e.R.inc(104);Label labelSz22 = new Label("2");
        __CLR4_4_188kaebnw0e.R.inc(105);font(labelSz22);
        __CLR4_4_188kaebnw0e.R.inc(106);Label labelSz23 = new Label("3");
        __CLR4_4_188kaebnw0e.R.inc(107);font(labelSz23);
        __CLR4_4_188kaebnw0e.R.inc(108);Label labelSz24 = new Label("4");
        __CLR4_4_188kaebnw0e.R.inc(109);font(labelSz24);
        __CLR4_4_188kaebnw0e.R.inc(110);Label labelSz25 = new Label("5");
        __CLR4_4_188kaebnw0e.R.inc(111);font(labelSz25);
        __CLR4_4_188kaebnw0e.R.inc(112);Label labelSz26 = new Label("6");
        __CLR4_4_188kaebnw0e.R.inc(113);font(labelSz26);
        __CLR4_4_188kaebnw0e.R.inc(114);Label labelSz27 = new Label("7");
        __CLR4_4_188kaebnw0e.R.inc(115);font(labelSz27);
        __CLR4_4_188kaebnw0e.R.inc(116);Label labelSz28 = new Label("8");
        __CLR4_4_188kaebnw0e.R.inc(117);font(labelSz28);
        __CLR4_4_188kaebnw0e.R.inc(118);Label labelSz29 = new Label("9");
        __CLR4_4_188kaebnw0e.R.inc(119);font(labelSz29);
        __CLR4_4_188kaebnw0e.R.inc(120);Label labelSz210 = new Label("10");
        __CLR4_4_188kaebnw0e.R.inc(121);font(labelSz210);

        __CLR4_4_188kaebnw0e.R.inc(122);Label labelB21 = new Label("A");
        __CLR4_4_188kaebnw0e.R.inc(123);font(labelB21);
        __CLR4_4_188kaebnw0e.R.inc(124);Label labelB22 = new Label("B");
        __CLR4_4_188kaebnw0e.R.inc(125);font(labelB22);
        __CLR4_4_188kaebnw0e.R.inc(126);Label labelB23 = new Label("C");
        __CLR4_4_188kaebnw0e.R.inc(127);font(labelB23);
        __CLR4_4_188kaebnw0e.R.inc(128);Label labelB24 = new Label("D");
        __CLR4_4_188kaebnw0e.R.inc(129);font(labelB24);
        __CLR4_4_188kaebnw0e.R.inc(130);Label labelB25 = new Label("E");
        __CLR4_4_188kaebnw0e.R.inc(131);font(labelB25);
        __CLR4_4_188kaebnw0e.R.inc(132);Label labelB26 = new Label("F");
        __CLR4_4_188kaebnw0e.R.inc(133);font(labelB26);
        __CLR4_4_188kaebnw0e.R.inc(134);Label labelB27 = new Label("G");
        __CLR4_4_188kaebnw0e.R.inc(135);font(labelB27);
        __CLR4_4_188kaebnw0e.R.inc(136);Label labelB28 = new Label("H");
        __CLR4_4_188kaebnw0e.R.inc(137);font(labelB28);
        __CLR4_4_188kaebnw0e.R.inc(138);Label labelB29 = new Label("I");
        __CLR4_4_188kaebnw0e.R.inc(139);font(labelB29);
        __CLR4_4_188kaebnw0e.R.inc(140);Label labelB210 = new Label("J");
        __CLR4_4_188kaebnw0e.R.inc(141);font(labelB210);



        __CLR4_4_188kaebnw0e.R.inc(142);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_188kaebnw0e.R.inc(143);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_188kaebnw0e.R.inc(144);root.setCenter(Betu11);
        __CLR4_4_188kaebnw0e.R.inc(145);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);

        __CLR4_4_188kaebnw0e.R.inc(146);root.setCenter(Szam11);

        __CLR4_4_188kaebnw0e.R.inc(147);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_188kaebnw0e.R.inc(148);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_188kaebnw0e.R.inc(149);root.setCenter(Betu1);
        __CLR4_4_188kaebnw0e.R.inc(150);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_188kaebnw0e.R.inc(151);root.setCenter(Szam1);

        __CLR4_4_188kaebnw0e.R.inc(152);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_188kaebnw0e.R.inc(153);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_188kaebnw0e.R.inc(154);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_188kaebnw0e.R.inc(155);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_188kaebnw0e.R.inc(156);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_188kaebnw0e.R.inc(157);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_188kaebnw0e.R.inc(158);root.setCenter(tablak);


        __CLR4_4_188kaebnw0e.R.inc(159);return root;

    }finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}

    public void print(WritableImage writableImage, Stage primaryStage) {try{__CLR4_4_188kaebnw0e.R.inc(160);
        __CLR4_4_188kaebnw0e.R.inc(161);ImageView imageView =new ImageView(writableImage);
        __CLR4_4_188kaebnw0e.R.inc(162);Printer printer = Printer.getDefaultPrinter();
        __CLR4_4_188kaebnw0e.R.inc(163);PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, Printer.MarginType.DEFAULT);
        __CLR4_4_188kaebnw0e.R.inc(164);double scaleX = pageLayout.getPrintableWidth() / imageView.getBoundsInParent().getWidth();
        __CLR4_4_188kaebnw0e.R.inc(165);double scaleY = pageLayout.getPrintableHeight() / imageView.getBoundsInParent().getHeight();
        __CLR4_4_188kaebnw0e.R.inc(166);imageView.getTransforms().add(new Scale(scaleX, scaleY));

        __CLR4_4_188kaebnw0e.R.inc(167);PrinterJob job = PrinterJob.createPrinterJob();
        __CLR4_4_188kaebnw0e.R.inc(168);if ((((job != null)&&(__CLR4_4_188kaebnw0e.R.iget(169)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(170)==0&false))) {{
            __CLR4_4_188kaebnw0e.R.inc(171);boolean successPrintDialog = job.showPrintDialog(primaryStage.getOwner());
            __CLR4_4_188kaebnw0e.R.inc(172);if((((successPrintDialog)&&(__CLR4_4_188kaebnw0e.R.iget(173)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(174)==0&false))){{
                __CLR4_4_188kaebnw0e.R.inc(175);boolean success = job.printPage(pageLayout,imageView);
                __CLR4_4_188kaebnw0e.R.inc(176);if ((((success)&&(__CLR4_4_188kaebnw0e.R.iget(177)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(178)==0&false))) {{
                    __CLR4_4_188kaebnw0e.R.inc(179);job.endJob();
                }
            }}
        }}
    }}finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}

    private Label font(Label label){try{__CLR4_4_188kaebnw0e.R.inc(180);

        __CLR4_4_188kaebnw0e.R.inc(181);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_188kaebnw0e.R.inc(182);label.setFont(new Font("Arial", 17));
        __CLR4_4_188kaebnw0e.R.inc(183);label.setStyle("-fx-font-weight: bold;");
        __CLR4_4_188kaebnw0e.R.inc(184);return label;
    }finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}



    private void startGame() {try{__CLR4_4_188kaebnw0e.R.inc(185);
        __CLR4_4_188kaebnw0e.R.inc(186);int nagysag = 5;

        __CLR4_4_188kaebnw0e.R.inc(187);while ((((nagysag > 0)&&(__CLR4_4_188kaebnw0e.R.iget(188)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(189)==0&false))) {{
            __CLR4_4_188kaebnw0e.R.inc(190);int x = random.nextInt(10);
            __CLR4_4_188kaebnw0e.R.inc(191);int y = random.nextInt(10);

            __CLR4_4_188kaebnw0e.R.inc(192);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_188kaebnw0e.R.iget(193)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(194)==0&false))) {{
                __CLR4_4_188kaebnw0e.R.inc(195);nagysag--;
            }
        }}
        }__CLR4_4_188kaebnw0e.R.inc(196);jatekKezdet = true;
    }finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}



    private void EllensegLepese() {try{__CLR4_4_188kaebnw0e.R.inc(197);


        __CLR4_4_188kaebnw0e.R.inc(198);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_188kaebnw0e.R.iget(199)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(200)==0&false))) {{
            __CLR4_4_188kaebnw0e.R.inc(201);int x = random.nextInt(10);
            __CLR4_4_188kaebnw0e.R.inc(202);int y = random.nextInt(10);

            __CLR4_4_188kaebnw0e.R.inc(203);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_188kaebnw0e.R.inc(204);if ((((cella.wasShot)&&(__CLR4_4_188kaebnw0e.R.iget(205)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(206)==0&false)))
                {__CLR4_4_188kaebnw0e.R.inc(207);continue;

            }__CLR4_4_188kaebnw0e.R.inc(208);ellensegKore = cella.loves();

            __CLR4_4_188kaebnw0e.R.inc(209);if ((((tablaJ.hajok == 0)&&(__CLR4_4_188kaebnw0e.R.iget(210)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(211)==0&false))) {{
                __CLR4_4_188kaebnw0e.R.inc(212);System.out.println("Vesztettel");
                __CLR4_4_188kaebnw0e.R.inc(213);Nyertel = 1;
                __CLR4_4_188kaebnw0e.R.inc(214);jatekVege = true;
                __CLR4_4_188kaebnw0e.R.inc(215);popUpAblak();


                //System.exit(0);
            }
        }}
    }}finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}

    public void popUpAblak(){try{__CLR4_4_188kaebnw0e.R.inc(216);


        __CLR4_4_188kaebnw0e.R.inc(217);if((((Nyertel == 1)&&(__CLR4_4_188kaebnw0e.R.iget(218)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(219)==0&false)))
        {{
            __CLR4_4_188kaebnw0e.R.inc(220);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_188kaebnw0e.R.inc(221);alert.setTitle("Vesztettel");
            __CLR4_4_188kaebnw0e.R.inc(222);alert.setHeaderText(null);
            __CLR4_4_188kaebnw0e.R.inc(223);alert.setGraphic(null);
            __CLR4_4_188kaebnw0e.R.inc(224);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_188kaebnw0e.R.inc(225);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_188kaebnw0e.R.inc(226);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_188kaebnw0e.R.iget(227)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(228)==0&false)))
            {{
                __CLR4_4_188kaebnw0e.R.inc(229);reset(stage31);
            } }else
            {{

            }
        }}
        }else {__CLR4_4_188kaebnw0e.R.inc(230);if((((Nyertel == 2)&&(__CLR4_4_188kaebnw0e.R.iget(231)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(232)==0&false)))
        {{
            __CLR4_4_188kaebnw0e.R.inc(233);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_188kaebnw0e.R.inc(234);alert.setTitle("Nyertel");
            __CLR4_4_188kaebnw0e.R.inc(235);alert.setHeaderText(null);
            __CLR4_4_188kaebnw0e.R.inc(236);alert.setGraphic(null);
            __CLR4_4_188kaebnw0e.R.inc(237);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_188kaebnw0e.R.inc(238);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_188kaebnw0e.R.inc(239);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_188kaebnw0e.R.iget(240)!=0|true))||(__CLR4_4_188kaebnw0e.R.iget(241)==0&false)))
            {{
                __CLR4_4_188kaebnw0e.R.inc(242);reset(stage31);
            } }else
            {{

            }
        }}

    }}}finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}

    private void reset( Stage primaryStage){try{__CLR4_4_188kaebnw0e.R.inc(243);

            __CLR4_4_188kaebnw0e.R.inc(244);primaryStage.close();
        __CLR4_4_188kaebnw0e.R.inc(245);jatekKezdet = false;
        __CLR4_4_188kaebnw0e.R.inc(246);hatralevoHajok = 5;
        __CLR4_4_188kaebnw0e.R.inc(247);Scene scene2 = new Scene(createContent());
        __CLR4_4_188kaebnw0e.R.inc(248);primaryStage.setScene(scene2);
        __CLR4_4_188kaebnw0e.R.inc(249);primaryStage.show();
        __CLR4_4_188kaebnw0e.R.inc(250);jatekVege = false;

    }finally{__CLR4_4_188kaebnw0e.R.flushNeeded();}}


}