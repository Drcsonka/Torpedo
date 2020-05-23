/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.io.IOException;
import java.util.Random;

import controller.GameController;
import dataTabla.Main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import Torpedo.Tabla.Cella;
import main.MyApplication;

public class Pelda  {public static class __CLR4_4_1cckaji58p6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590230440115L,8589935092L,219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

     public  static boolean jatekVege = false;
    //public static Parent scene1= new Scene(createContent());
     public static boolean jatekKezdet = false;
     private static Tabla tablaE, tablaJ;
     public static int Nyertel = 0;


     public static int hatralevoHajok = 5;
     static Button resetButton = new Button("Reset");
     static Button tablaButton = new Button( "Lepesek");
     static Button exitButton = new Button("Exit");
     static Text menuT = new Text("Menu");
     private static boolean ellensegKore = false;
     static String[] ybetuk = {"A","B","C","D","E","F","G","H","I","J"};
     public static String xyJ;
     public static String xyE;
     public static int lepes= 0;

    public static boolean jatekoslepese = true;


     private static final Random random = new Random();


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


    public static Parent createContent() {try{__CLR4_4_1cckaji58p6.R.inc(12);
        __CLR4_4_1cckaji58p6.R.inc(13);BorderPane root = new BorderPane();


        __CLR4_4_1cckaji58p6.R.inc(14);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_1cckaji58p6.R.inc(15);root.setPrefSize(800, 850);
        __CLR4_4_1cckaji58p6.R.inc(16);resetButton.setPrefWidth(150);
        __CLR4_4_1cckaji58p6.R.inc(17);resetButton.setPrefHeight(50);
        __CLR4_4_1cckaji58p6.R.inc(18);tablaButton.setPrefWidth(150);
        __CLR4_4_1cckaji58p6.R.inc(19);tablaButton.setPrefHeight(50);
        __CLR4_4_1cckaji58p6.R.inc(20);exitButton.setPrefWidth(150);
        __CLR4_4_1cckaji58p6.R.inc(21);exitButton.setPrefHeight(50);

        // Top margo

        __CLR4_4_1cckaji58p6.R.inc(22);Insets insets = new Insets(10);
        __CLR4_4_1cckaji58p6.R.inc(23);Node topNode = new Label("");
        __CLR4_4_1cckaji58p6.R.inc(24);root.setTop(topNode);
        __CLR4_4_1cckaji58p6.R.inc(25);BorderPane.setMargin(topNode, insets);

        __CLR4_4_1cckaji58p6.R.inc(26);resetButton.setOnAction(e -> GameController.reset(MyApplication.stage31));

        __CLR4_4_1cckaji58p6.R.inc(27);exitButton.setOnAction(e -> System.exit(0));

        __CLR4_4_1cckaji58p6.R.inc(28);tablaButton.setOnAction(e -> {
            __CLR4_4_1cckaji58p6.R.inc(29);try {
                __CLR4_4_1cckaji58p6.R.inc(30);GameController.tablazat( e );
            } catch (IOException ex) {
                __CLR4_4_1cckaji58p6.R.inc(31);ex.printStackTrace();
            }
        });


        __CLR4_4_1cckaji58p6.R.inc(32);VBox menu = new VBox( 20,menuT, resetButton, tablaButton, exitButton);
        __CLR4_4_1cckaji58p6.R.inc(33);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_1cckaji58p6.R.inc(34);root.setRight(menu);



        //Hatter
        __CLR4_4_1cckaji58p6.R.inc(35);Image image = new Image("BG2.jpeg");

        __CLR4_4_1cckaji58p6.R.inc(36);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_1cckaji58p6.R.inc(37);Background background = new Background(backgroundimage);

        __CLR4_4_1cckaji58p6.R.inc(38);root.setBackground(background);





        __CLR4_4_1cckaji58p6.R.inc(39);tablaE = new Tabla(true, event -> {
            __CLR4_4_1cckaji58p6.R.inc(40);if ((((!jatekKezdet)&&(__CLR4_4_1cckaji58p6.R.iget(41)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(42)==0&false)))
                {__CLR4_4_1cckaji58p6.R.inc(43);return;

            }__CLR4_4_1cckaji58p6.R.inc(44);Cella cell = (Cella) event.getSource();
            __CLR4_4_1cckaji58p6.R.inc(45);if ((((cell.wasShot)&&(__CLR4_4_1cckaji58p6.R.iget(46)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(47)==0&false)))
                {__CLR4_4_1cckaji58p6.R.inc(48);return;

            }__CLR4_4_1cckaji58p6.R.inc(49);String xJ = String.valueOf(cell.x+1);
            __CLR4_4_1cckaji58p6.R.inc(50);String yJ = ybetuk[cell.y];
            __CLR4_4_1cckaji58p6.R.inc(51);xyJ = xJ+yJ;
            __CLR4_4_1cckaji58p6.R.inc(52);jatekoslepese = true;
            __CLR4_4_1cckaji58p6.R.inc(53);lepes++;
            __CLR4_4_1cckaji58p6.R.inc(54);Main.ujtablaadat();


            __CLR4_4_1cckaji58p6.R.inc(55);ellensegKore = !cell.loves();


            __CLR4_4_1cckaji58p6.R.inc(56);if ((((tablaE.hajok == 4)&&(__CLR4_4_1cckaji58p6.R.iget(57)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(58)==0&false))) {{
                __CLR4_4_1cckaji58p6.R.inc(59);System.out.println("Nyertel");
                __CLR4_4_1cckaji58p6.R.inc(60);jatekVege = true;
                __CLR4_4_1cckaji58p6.R.inc(61);Nyertel = 2;
                __CLR4_4_1cckaji58p6.R.inc(62);GameController.popUpAblak();


            }

            }__CLR4_4_1cckaji58p6.R.inc(63);if ((((ellensegKore)&&(__CLR4_4_1cckaji58p6.R.iget(64)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(65)==0&false)))
                {__CLR4_4_1cckaji58p6.R.inc(66);EllensegLepese();
        }});

        __CLR4_4_1cckaji58p6.R.inc(67);tablaJ = new Tabla(false, event -> {
            __CLR4_4_1cckaji58p6.R.inc(68);if ((((jatekKezdet)&&(__CLR4_4_1cckaji58p6.R.iget(69)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(70)==0&false)))
                {__CLR4_4_1cckaji58p6.R.inc(71);return;

            }__CLR4_4_1cckaji58p6.R.inc(72);Cella cell = (Cella) event.getSource();
            __CLR4_4_1cckaji58p6.R.inc(73);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_1cckaji58p6.R.iget(74)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(75)==0&false))) {{
                __CLR4_4_1cckaji58p6.R.inc(76);if ((((--hatralevoHajok == 0)&&(__CLR4_4_1cckaji58p6.R.iget(77)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(78)==0&false))) {{
                    __CLR4_4_1cckaji58p6.R.inc(79);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_1cckaji58p6.R.inc(80);Label labelSz1 = new Label("   1");
        __CLR4_4_1cckaji58p6.R.inc(81);font(labelSz1);
        __CLR4_4_1cckaji58p6.R.inc(82);Label labelSz2 = new Label("2");
        __CLR4_4_1cckaji58p6.R.inc(83);font(labelSz2);
        __CLR4_4_1cckaji58p6.R.inc(84);Label labelSz3 = new Label("3");
        __CLR4_4_1cckaji58p6.R.inc(85);font(labelSz3);
        __CLR4_4_1cckaji58p6.R.inc(86);Label labelSz4 = new Label("4");
        __CLR4_4_1cckaji58p6.R.inc(87);font(labelSz4);
        __CLR4_4_1cckaji58p6.R.inc(88);Label labelSz5 = new Label("5");
        __CLR4_4_1cckaji58p6.R.inc(89);font(labelSz5);
        __CLR4_4_1cckaji58p6.R.inc(90);Label labelSz6 = new Label("6");
        __CLR4_4_1cckaji58p6.R.inc(91);font(labelSz6);
        __CLR4_4_1cckaji58p6.R.inc(92);Label labelSz7 = new Label("7");
        __CLR4_4_1cckaji58p6.R.inc(93);font(labelSz7);
        __CLR4_4_1cckaji58p6.R.inc(94);Label labelSz8 = new Label("8");
        __CLR4_4_1cckaji58p6.R.inc(95);font(labelSz8);
        __CLR4_4_1cckaji58p6.R.inc(96);Label labelSz9 = new Label("9");
        __CLR4_4_1cckaji58p6.R.inc(97);font(labelSz9);
        __CLR4_4_1cckaji58p6.R.inc(98);Label labelSz10 = new Label("10");
        __CLR4_4_1cckaji58p6.R.inc(99);font(labelSz10);

        __CLR4_4_1cckaji58p6.R.inc(100);Label labelB1 = new Label("A");
        __CLR4_4_1cckaji58p6.R.inc(101);font(labelB1);
        __CLR4_4_1cckaji58p6.R.inc(102);Label labelB2 = new Label("B");
        __CLR4_4_1cckaji58p6.R.inc(103);font(labelB2);
        __CLR4_4_1cckaji58p6.R.inc(104);Label labelB3 = new Label("C");
        __CLR4_4_1cckaji58p6.R.inc(105);font(labelB3);
        __CLR4_4_1cckaji58p6.R.inc(106);Label labelB4 = new Label("D");
        __CLR4_4_1cckaji58p6.R.inc(107);font(labelB4);
        __CLR4_4_1cckaji58p6.R.inc(108);Label labelB5 = new Label("E");
        __CLR4_4_1cckaji58p6.R.inc(109);font(labelB5);
        __CLR4_4_1cckaji58p6.R.inc(110);Label labelB6 = new Label("F");
        __CLR4_4_1cckaji58p6.R.inc(111);font(labelB6);
        __CLR4_4_1cckaji58p6.R.inc(112);Label labelB7 = new Label("G");
        __CLR4_4_1cckaji58p6.R.inc(113);font(labelB7);
        __CLR4_4_1cckaji58p6.R.inc(114);Label labelB8 = new Label("H");
        __CLR4_4_1cckaji58p6.R.inc(115);font(labelB8);
        __CLR4_4_1cckaji58p6.R.inc(116);Label labelB9 = new Label("I");
        __CLR4_4_1cckaji58p6.R.inc(117);font(labelB9);
        __CLR4_4_1cckaji58p6.R.inc(118);Label labelB10 = new Label("J");
        __CLR4_4_1cckaji58p6.R.inc(119);font(labelB10);

        __CLR4_4_1cckaji58p6.R.inc(120);Label labelSz21 = new Label("   1");
        __CLR4_4_1cckaji58p6.R.inc(121);font(labelSz21);
        __CLR4_4_1cckaji58p6.R.inc(122);Label labelSz22 = new Label("2");
        __CLR4_4_1cckaji58p6.R.inc(123);font(labelSz22);
        __CLR4_4_1cckaji58p6.R.inc(124);Label labelSz23 = new Label("3");
        __CLR4_4_1cckaji58p6.R.inc(125);font(labelSz23);
        __CLR4_4_1cckaji58p6.R.inc(126);Label labelSz24 = new Label("4");
        __CLR4_4_1cckaji58p6.R.inc(127);font(labelSz24);
        __CLR4_4_1cckaji58p6.R.inc(128);Label labelSz25 = new Label("5");
        __CLR4_4_1cckaji58p6.R.inc(129);font(labelSz25);
        __CLR4_4_1cckaji58p6.R.inc(130);Label labelSz26 = new Label("6");
        __CLR4_4_1cckaji58p6.R.inc(131);font(labelSz26);
        __CLR4_4_1cckaji58p6.R.inc(132);Label labelSz27 = new Label("7");
        __CLR4_4_1cckaji58p6.R.inc(133);font(labelSz27);
        __CLR4_4_1cckaji58p6.R.inc(134);Label labelSz28 = new Label("8");
        __CLR4_4_1cckaji58p6.R.inc(135);font(labelSz28);
        __CLR4_4_1cckaji58p6.R.inc(136);Label labelSz29 = new Label("9");
        __CLR4_4_1cckaji58p6.R.inc(137);font(labelSz29);
        __CLR4_4_1cckaji58p6.R.inc(138);Label labelSz210 = new Label("10");
        __CLR4_4_1cckaji58p6.R.inc(139);font(labelSz210);

        __CLR4_4_1cckaji58p6.R.inc(140);Label labelB21 = new Label("A");
        __CLR4_4_1cckaji58p6.R.inc(141);font(labelB21);
        __CLR4_4_1cckaji58p6.R.inc(142);Label labelB22 = new Label("B");
        __CLR4_4_1cckaji58p6.R.inc(143);font(labelB22);
        __CLR4_4_1cckaji58p6.R.inc(144);Label labelB23 = new Label("C");
        __CLR4_4_1cckaji58p6.R.inc(145);font(labelB23);
        __CLR4_4_1cckaji58p6.R.inc(146);Label labelB24 = new Label("D");
        __CLR4_4_1cckaji58p6.R.inc(147);font(labelB24);
        __CLR4_4_1cckaji58p6.R.inc(148);Label labelB25 = new Label("E");
        __CLR4_4_1cckaji58p6.R.inc(149);font(labelB25);
        __CLR4_4_1cckaji58p6.R.inc(150);Label labelB26 = new Label("F");
        __CLR4_4_1cckaji58p6.R.inc(151);font(labelB26);
        __CLR4_4_1cckaji58p6.R.inc(152);Label labelB27 = new Label("G");
        __CLR4_4_1cckaji58p6.R.inc(153);font(labelB27);
        __CLR4_4_1cckaji58p6.R.inc(154);Label labelB28 = new Label("H");
        __CLR4_4_1cckaji58p6.R.inc(155);font(labelB28);
        __CLR4_4_1cckaji58p6.R.inc(156);Label labelB29 = new Label("I");
        __CLR4_4_1cckaji58p6.R.inc(157);font(labelB29);
        __CLR4_4_1cckaji58p6.R.inc(158);Label labelB210 = new Label("J");
        __CLR4_4_1cckaji58p6.R.inc(159);font(labelB210);


        __CLR4_4_1cckaji58p6.R.inc(160);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_1cckaji58p6.R.inc(161);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_1cckaji58p6.R.inc(162);root.setCenter(Betu11);
        __CLR4_4_1cckaji58p6.R.inc(163);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);




        __CLR4_4_1cckaji58p6.R.inc(164);root.setCenter(Szam11);

        __CLR4_4_1cckaji58p6.R.inc(165);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_1cckaji58p6.R.inc(166);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_1cckaji58p6.R.inc(167);root.setCenter(Betu1);
        __CLR4_4_1cckaji58p6.R.inc(168);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_1cckaji58p6.R.inc(169);root.setCenter(Szam1);

        __CLR4_4_1cckaji58p6.R.inc(170);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_1cckaji58p6.R.inc(171);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_1cckaji58p6.R.inc(172);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_1cckaji58p6.R.inc(173);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_1cckaji58p6.R.inc(174);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_1cckaji58p6.R.inc(175);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_1cckaji58p6.R.inc(176);root.setCenter(tablak);




        __CLR4_4_1cckaji58p6.R.inc(177);return root;

    }finally{__CLR4_4_1cckaji58p6.R.flushNeeded();}}

    private static void font(Label label){try{__CLR4_4_1cckaji58p6.R.inc(178);

        __CLR4_4_1cckaji58p6.R.inc(179);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_1cckaji58p6.R.inc(180);label.setFont(new Font("Arial", 17));
        __CLR4_4_1cckaji58p6.R.inc(181);label.setStyle("-fx-font-weight: bold;");
    }finally{__CLR4_4_1cckaji58p6.R.flushNeeded();}}



    private static void startGame() {try{__CLR4_4_1cckaji58p6.R.inc(182);
        __CLR4_4_1cckaji58p6.R.inc(183);int nagysag = 5;

        __CLR4_4_1cckaji58p6.R.inc(184);while ((((nagysag > 0)&&(__CLR4_4_1cckaji58p6.R.iget(185)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(186)==0&false))) {{
            __CLR4_4_1cckaji58p6.R.inc(187);int x = random.nextInt(10);
            __CLR4_4_1cckaji58p6.R.inc(188);int y = random.nextInt(10);

            __CLR4_4_1cckaji58p6.R.inc(189);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_1cckaji58p6.R.iget(190)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(191)==0&false))) {{
                __CLR4_4_1cckaji58p6.R.inc(192);nagysag--;
            }
        }}
        }__CLR4_4_1cckaji58p6.R.inc(193);jatekKezdet = true;
    }finally{__CLR4_4_1cckaji58p6.R.flushNeeded();}}



    public static void EllensegLepese() {try{__CLR4_4_1cckaji58p6.R.inc(194);


        __CLR4_4_1cckaji58p6.R.inc(195);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_1cckaji58p6.R.iget(196)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(197)==0&false))) {{
            __CLR4_4_1cckaji58p6.R.inc(198);int x = random.nextInt(10);
            __CLR4_4_1cckaji58p6.R.inc(199);int y = random.nextInt(10);
            __CLR4_4_1cckaji58p6.R.inc(200);String x1 = String.valueOf(x+1);

            __CLR4_4_1cckaji58p6.R.inc(201);String yE = ybetuk[y];

            __CLR4_4_1cckaji58p6.R.inc(202);xyE = x1 + yE;
            __CLR4_4_1cckaji58p6.R.inc(203);jatekoslepese = false;
            __CLR4_4_1cckaji58p6.R.inc(204);lepes++;

            __CLR4_4_1cckaji58p6.R.inc(205);Main.ujtablaadat();


            __CLR4_4_1cckaji58p6.R.inc(206);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_1cckaji58p6.R.inc(207);if ((((cella.wasShot)&&(__CLR4_4_1cckaji58p6.R.iget(208)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(209)==0&false)))
                {__CLR4_4_1cckaji58p6.R.inc(210);continue;

            }__CLR4_4_1cckaji58p6.R.inc(211);ellensegKore = cella.loves();

            __CLR4_4_1cckaji58p6.R.inc(212);if ((((tablaJ.hajok == 0)&&(__CLR4_4_1cckaji58p6.R.iget(213)!=0|true))||(__CLR4_4_1cckaji58p6.R.iget(214)==0&false))) {{
                __CLR4_4_1cckaji58p6.R.inc(215);System.out.println("Vesztettel");
                __CLR4_4_1cckaji58p6.R.inc(216);Nyertel = 1;
                __CLR4_4_1cckaji58p6.R.inc(217);jatekVege = true;
                __CLR4_4_1cckaji58p6.R.inc(218);GameController.popUpAblak();

            }
        }}
    }}finally{__CLR4_4_1cckaji58p6.R.flushNeeded();}}
}