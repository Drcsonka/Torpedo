/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

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

public class Pelda  {public static class __CLR4_4_1ljljkai6q7e1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590150796651L,8589935092L,1025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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


    public static Parent createContent() {try{__CLR4_4_1ljljkai6q7e1.R.inc(775);
        __CLR4_4_1ljljkai6q7e1.R.inc(776);BorderPane root = new BorderPane();


        __CLR4_4_1ljljkai6q7e1.R.inc(777);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_1ljljkai6q7e1.R.inc(778);root.setPrefSize(800, 850);
        __CLR4_4_1ljljkai6q7e1.R.inc(779);resetButton.setPrefWidth(150);
        __CLR4_4_1ljljkai6q7e1.R.inc(780);resetButton.setPrefHeight(50);
        __CLR4_4_1ljljkai6q7e1.R.inc(781);tablaButton.setPrefWidth(150);
        __CLR4_4_1ljljkai6q7e1.R.inc(782);tablaButton.setPrefHeight(50);

        __CLR4_4_1ljljkai6q7e1.R.inc(783);Lepes.setPrefHeight(50);
        __CLR4_4_1ljljkai6q7e1.R.inc(784);Lepes.setPrefWidth(150);
        __CLR4_4_1ljljkai6q7e1.R.inc(785);LepesJ.setPrefHeight(50);
        __CLR4_4_1ljljkai6q7e1.R.inc(786);LepesJ.setPrefWidth(150);

        // Top margo

        __CLR4_4_1ljljkai6q7e1.R.inc(787);Insets insets = new Insets(10);
        __CLR4_4_1ljljkai6q7e1.R.inc(788);Node topNode = new Label("");
        __CLR4_4_1ljljkai6q7e1.R.inc(789);root.setTop(topNode);
        __CLR4_4_1ljljkai6q7e1.R.inc(790);BorderPane.setMargin(topNode, insets);

        __CLR4_4_1ljljkai6q7e1.R.inc(791);resetButton.setOnAction(e -> {
                    __CLR4_4_1ljljkai6q7e1.R.inc(792);reset(MyApplication.stage31);
        });


        __CLR4_4_1ljljkai6q7e1.R.inc(793);tablaButton.setOnAction(e -> {
            __CLR4_4_1ljljkai6q7e1.R.inc(794);try {
                __CLR4_4_1ljljkai6q7e1.R.inc(795);KisTablaController.tablazat( e );
            } catch (IOException ex) {
                __CLR4_4_1ljljkai6q7e1.R.inc(796);ex.printStackTrace();
            }
        });


        __CLR4_4_1ljljkai6q7e1.R.inc(797);VBox menu = new VBox( 20,menuT, resetButton, tablaButton, Lepes, LepesJ);
        __CLR4_4_1ljljkai6q7e1.R.inc(798);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_1ljljkai6q7e1.R.inc(799);root.setRight(menu);



        //Hatter
        __CLR4_4_1ljljkai6q7e1.R.inc(800);Image image = new Image("BG2.jpeg");

        __CLR4_4_1ljljkai6q7e1.R.inc(801);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_1ljljkai6q7e1.R.inc(802);Background background = new Background(backgroundimage);

        __CLR4_4_1ljljkai6q7e1.R.inc(803);root.setBackground(background);





        __CLR4_4_1ljljkai6q7e1.R.inc(804);tablaE = new Tabla(true, event -> {
            __CLR4_4_1ljljkai6q7e1.R.inc(805);if ((((!jatekKezdet)&&(__CLR4_4_1ljljkai6q7e1.R.iget(806)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(807)==0&false)))
                {__CLR4_4_1ljljkai6q7e1.R.inc(808);return;

            }__CLR4_4_1ljljkai6q7e1.R.inc(809);Cella cell = (Cella) event.getSource();
            __CLR4_4_1ljljkai6q7e1.R.inc(810);if ((((cell.wasShot)&&(__CLR4_4_1ljljkai6q7e1.R.iget(811)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(812)==0&false)))
                {__CLR4_4_1ljljkai6q7e1.R.inc(813);return;

            }__CLR4_4_1ljljkai6q7e1.R.inc(814);String xJ = String.valueOf(cell.x+1);
            __CLR4_4_1ljljkai6q7e1.R.inc(815);String y22 = String.valueOf(cell.y+1);
            __CLR4_4_1ljljkai6q7e1.R.inc(816);String yJ = ybetuk[cell.y];
            __CLR4_4_1ljljkai6q7e1.R.inc(817);xyJ = xJ+yJ;
            __CLR4_4_1ljljkai6q7e1.R.inc(818);jatekoslepese = true;
            __CLR4_4_1ljljkai6q7e1.R.inc(819);lepes++;
            __CLR4_4_1ljljkai6q7e1.R.inc(820);try {
                __CLR4_4_1ljljkai6q7e1.R.inc(821);Main.ujkiiras();
            } catch (IOException e) {
                __CLR4_4_1ljljkai6q7e1.R.inc(822);e.printStackTrace();
            }

            __CLR4_4_1ljljkai6q7e1.R.inc(823);LepesJ.setText(xyJ);

            __CLR4_4_1ljljkai6q7e1.R.inc(824);ellensegKore = !cell.loves();


            __CLR4_4_1ljljkai6q7e1.R.inc(825);if ((((tablaE.hajok == 4)&&(__CLR4_4_1ljljkai6q7e1.R.iget(826)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(827)==0&false))) {{
                __CLR4_4_1ljljkai6q7e1.R.inc(828);System.out.println("Nyertel");
                __CLR4_4_1ljljkai6q7e1.R.inc(829);jatekVege = true;
                __CLR4_4_1ljljkai6q7e1.R.inc(830);Nyertel = 2;
                __CLR4_4_1ljljkai6q7e1.R.inc(831);popUpAblak();


            }

            }__CLR4_4_1ljljkai6q7e1.R.inc(832);if ((((ellensegKore)&&(__CLR4_4_1ljljkai6q7e1.R.iget(833)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(834)==0&false)))
                {__CLR4_4_1ljljkai6q7e1.R.inc(835);EllensegLepese();
        }});

        __CLR4_4_1ljljkai6q7e1.R.inc(836);tablaJ = new Tabla(false, event -> {
            __CLR4_4_1ljljkai6q7e1.R.inc(837);if ((((jatekKezdet)&&(__CLR4_4_1ljljkai6q7e1.R.iget(838)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(839)==0&false)))
                {__CLR4_4_1ljljkai6q7e1.R.inc(840);return;

            }__CLR4_4_1ljljkai6q7e1.R.inc(841);Cella cell = (Cella) event.getSource();
            __CLR4_4_1ljljkai6q7e1.R.inc(842);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_1ljljkai6q7e1.R.iget(843)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(844)==0&false))) {{
                __CLR4_4_1ljljkai6q7e1.R.inc(845);if ((((--hatralevoHajok == 0)&&(__CLR4_4_1ljljkai6q7e1.R.iget(846)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(847)==0&false))) {{
                    __CLR4_4_1ljljkai6q7e1.R.inc(848);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_1ljljkai6q7e1.R.inc(849);Label labelSz1 = new Label("   1");
        __CLR4_4_1ljljkai6q7e1.R.inc(850);font(labelSz1);
        __CLR4_4_1ljljkai6q7e1.R.inc(851);Label labelSz2 = new Label("2");
        __CLR4_4_1ljljkai6q7e1.R.inc(852);font(labelSz2);
        __CLR4_4_1ljljkai6q7e1.R.inc(853);Label labelSz3 = new Label("3");
        __CLR4_4_1ljljkai6q7e1.R.inc(854);font(labelSz3);
        __CLR4_4_1ljljkai6q7e1.R.inc(855);Label labelSz4 = new Label("4");
        __CLR4_4_1ljljkai6q7e1.R.inc(856);font(labelSz4);
        __CLR4_4_1ljljkai6q7e1.R.inc(857);Label labelSz5 = new Label("5");
        __CLR4_4_1ljljkai6q7e1.R.inc(858);font(labelSz5);
        __CLR4_4_1ljljkai6q7e1.R.inc(859);Label labelSz6 = new Label("6");
        __CLR4_4_1ljljkai6q7e1.R.inc(860);font(labelSz6);
        __CLR4_4_1ljljkai6q7e1.R.inc(861);Label labelSz7 = new Label("7");
        __CLR4_4_1ljljkai6q7e1.R.inc(862);font(labelSz7);
        __CLR4_4_1ljljkai6q7e1.R.inc(863);Label labelSz8 = new Label("8");
        __CLR4_4_1ljljkai6q7e1.R.inc(864);font(labelSz8);
        __CLR4_4_1ljljkai6q7e1.R.inc(865);Label labelSz9 = new Label("9");
        __CLR4_4_1ljljkai6q7e1.R.inc(866);font(labelSz9);
        __CLR4_4_1ljljkai6q7e1.R.inc(867);Label labelSz10 = new Label("10");
        __CLR4_4_1ljljkai6q7e1.R.inc(868);font(labelSz10);

        __CLR4_4_1ljljkai6q7e1.R.inc(869);Label labelB1 = new Label("A");
        __CLR4_4_1ljljkai6q7e1.R.inc(870);font(labelB1);
        __CLR4_4_1ljljkai6q7e1.R.inc(871);Label labelB2 = new Label("B");
        __CLR4_4_1ljljkai6q7e1.R.inc(872);font(labelB2);
        __CLR4_4_1ljljkai6q7e1.R.inc(873);Label labelB3 = new Label("C");
        __CLR4_4_1ljljkai6q7e1.R.inc(874);font(labelB3);
        __CLR4_4_1ljljkai6q7e1.R.inc(875);Label labelB4 = new Label("D");
        __CLR4_4_1ljljkai6q7e1.R.inc(876);font(labelB4);
        __CLR4_4_1ljljkai6q7e1.R.inc(877);Label labelB5 = new Label("E");
        __CLR4_4_1ljljkai6q7e1.R.inc(878);font(labelB5);
        __CLR4_4_1ljljkai6q7e1.R.inc(879);Label labelB6 = new Label("F");
        __CLR4_4_1ljljkai6q7e1.R.inc(880);font(labelB6);
        __CLR4_4_1ljljkai6q7e1.R.inc(881);Label labelB7 = new Label("G");
        __CLR4_4_1ljljkai6q7e1.R.inc(882);font(labelB7);
        __CLR4_4_1ljljkai6q7e1.R.inc(883);Label labelB8 = new Label("H");
        __CLR4_4_1ljljkai6q7e1.R.inc(884);font(labelB8);
        __CLR4_4_1ljljkai6q7e1.R.inc(885);Label labelB9 = new Label("I");
        __CLR4_4_1ljljkai6q7e1.R.inc(886);font(labelB9);
        __CLR4_4_1ljljkai6q7e1.R.inc(887);Label labelB10 = new Label("J");
        __CLR4_4_1ljljkai6q7e1.R.inc(888);font(labelB10);

        __CLR4_4_1ljljkai6q7e1.R.inc(889);Label labelSz21 = new Label("   1");
        __CLR4_4_1ljljkai6q7e1.R.inc(890);font(labelSz21);
        __CLR4_4_1ljljkai6q7e1.R.inc(891);Label labelSz22 = new Label("2");
        __CLR4_4_1ljljkai6q7e1.R.inc(892);font(labelSz22);
        __CLR4_4_1ljljkai6q7e1.R.inc(893);Label labelSz23 = new Label("3");
        __CLR4_4_1ljljkai6q7e1.R.inc(894);font(labelSz23);
        __CLR4_4_1ljljkai6q7e1.R.inc(895);Label labelSz24 = new Label("4");
        __CLR4_4_1ljljkai6q7e1.R.inc(896);font(labelSz24);
        __CLR4_4_1ljljkai6q7e1.R.inc(897);Label labelSz25 = new Label("5");
        __CLR4_4_1ljljkai6q7e1.R.inc(898);font(labelSz25);
        __CLR4_4_1ljljkai6q7e1.R.inc(899);Label labelSz26 = new Label("6");
        __CLR4_4_1ljljkai6q7e1.R.inc(900);font(labelSz26);
        __CLR4_4_1ljljkai6q7e1.R.inc(901);Label labelSz27 = new Label("7");
        __CLR4_4_1ljljkai6q7e1.R.inc(902);font(labelSz27);
        __CLR4_4_1ljljkai6q7e1.R.inc(903);Label labelSz28 = new Label("8");
        __CLR4_4_1ljljkai6q7e1.R.inc(904);font(labelSz28);
        __CLR4_4_1ljljkai6q7e1.R.inc(905);Label labelSz29 = new Label("9");
        __CLR4_4_1ljljkai6q7e1.R.inc(906);font(labelSz29);
        __CLR4_4_1ljljkai6q7e1.R.inc(907);Label labelSz210 = new Label("10");
        __CLR4_4_1ljljkai6q7e1.R.inc(908);font(labelSz210);

        __CLR4_4_1ljljkai6q7e1.R.inc(909);Label labelB21 = new Label("A");
        __CLR4_4_1ljljkai6q7e1.R.inc(910);font(labelB21);
        __CLR4_4_1ljljkai6q7e1.R.inc(911);Label labelB22 = new Label("B");
        __CLR4_4_1ljljkai6q7e1.R.inc(912);font(labelB22);
        __CLR4_4_1ljljkai6q7e1.R.inc(913);Label labelB23 = new Label("C");
        __CLR4_4_1ljljkai6q7e1.R.inc(914);font(labelB23);
        __CLR4_4_1ljljkai6q7e1.R.inc(915);Label labelB24 = new Label("D");
        __CLR4_4_1ljljkai6q7e1.R.inc(916);font(labelB24);
        __CLR4_4_1ljljkai6q7e1.R.inc(917);Label labelB25 = new Label("E");
        __CLR4_4_1ljljkai6q7e1.R.inc(918);font(labelB25);
        __CLR4_4_1ljljkai6q7e1.R.inc(919);Label labelB26 = new Label("F");
        __CLR4_4_1ljljkai6q7e1.R.inc(920);font(labelB26);
        __CLR4_4_1ljljkai6q7e1.R.inc(921);Label labelB27 = new Label("G");
        __CLR4_4_1ljljkai6q7e1.R.inc(922);font(labelB27);
        __CLR4_4_1ljljkai6q7e1.R.inc(923);Label labelB28 = new Label("H");
        __CLR4_4_1ljljkai6q7e1.R.inc(924);font(labelB28);
        __CLR4_4_1ljljkai6q7e1.R.inc(925);Label labelB29 = new Label("I");
        __CLR4_4_1ljljkai6q7e1.R.inc(926);font(labelB29);
        __CLR4_4_1ljljkai6q7e1.R.inc(927);Label labelB210 = new Label("J");
        __CLR4_4_1ljljkai6q7e1.R.inc(928);font(labelB210);


        __CLR4_4_1ljljkai6q7e1.R.inc(929);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_1ljljkai6q7e1.R.inc(930);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_1ljljkai6q7e1.R.inc(931);root.setCenter(Betu11);
        __CLR4_4_1ljljkai6q7e1.R.inc(932);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);




        __CLR4_4_1ljljkai6q7e1.R.inc(933);root.setCenter(Szam11);

        __CLR4_4_1ljljkai6q7e1.R.inc(934);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_1ljljkai6q7e1.R.inc(935);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_1ljljkai6q7e1.R.inc(936);root.setCenter(Betu1);
        __CLR4_4_1ljljkai6q7e1.R.inc(937);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_1ljljkai6q7e1.R.inc(938);root.setCenter(Szam1);

        __CLR4_4_1ljljkai6q7e1.R.inc(939);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_1ljljkai6q7e1.R.inc(940);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_1ljljkai6q7e1.R.inc(941);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_1ljljkai6q7e1.R.inc(942);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_1ljljkai6q7e1.R.inc(943);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_1ljljkai6q7e1.R.inc(944);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_1ljljkai6q7e1.R.inc(945);root.setCenter(tablak);




        __CLR4_4_1ljljkai6q7e1.R.inc(946);return root;

    }finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}

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

    private static Label font(Label label){try{__CLR4_4_1ljljkai6q7e1.R.inc(947);

        __CLR4_4_1ljljkai6q7e1.R.inc(948);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_1ljljkai6q7e1.R.inc(949);label.setFont(new Font("Arial", 17));
        __CLR4_4_1ljljkai6q7e1.R.inc(950);label.setStyle("-fx-font-weight: bold;");
        __CLR4_4_1ljljkai6q7e1.R.inc(951);return label;
    }finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}



    private static void startGame() {try{__CLR4_4_1ljljkai6q7e1.R.inc(952);
        __CLR4_4_1ljljkai6q7e1.R.inc(953);int nagysag = 5;

        __CLR4_4_1ljljkai6q7e1.R.inc(954);while ((((nagysag > 0)&&(__CLR4_4_1ljljkai6q7e1.R.iget(955)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(956)==0&false))) {{
            __CLR4_4_1ljljkai6q7e1.R.inc(957);int x = random.nextInt(10);
            __CLR4_4_1ljljkai6q7e1.R.inc(958);int y = random.nextInt(10);

            __CLR4_4_1ljljkai6q7e1.R.inc(959);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_1ljljkai6q7e1.R.iget(960)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(961)==0&false))) {{
                __CLR4_4_1ljljkai6q7e1.R.inc(962);nagysag--;
            }
        }}
        }__CLR4_4_1ljljkai6q7e1.R.inc(963);jatekKezdet = true;
    }finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}



    public static void EllensegLepese() {try{__CLR4_4_1ljljkai6q7e1.R.inc(964);


        __CLR4_4_1ljljkai6q7e1.R.inc(965);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_1ljljkai6q7e1.R.iget(966)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(967)==0&false))) {{
            __CLR4_4_1ljljkai6q7e1.R.inc(968);int x = random.nextInt(10);
            __CLR4_4_1ljljkai6q7e1.R.inc(969);int y = random.nextInt(10);
            __CLR4_4_1ljljkai6q7e1.R.inc(970);String x1 = String.valueOf(x+1);
            __CLR4_4_1ljljkai6q7e1.R.inc(971);String y21 = String.valueOf(y+1);

            __CLR4_4_1ljljkai6q7e1.R.inc(972);String yE = ybetuk[y];
            __CLR4_4_1ljljkai6q7e1.R.inc(973);String xE = x1;

            __CLR4_4_1ljljkai6q7e1.R.inc(974);xyE = xE + yE;
            __CLR4_4_1ljljkai6q7e1.R.inc(975);jatekoslepese = false;

            __CLR4_4_1ljljkai6q7e1.R.inc(976);Lepes.setText(xyE);


            __CLR4_4_1ljljkai6q7e1.R.inc(977);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_1ljljkai6q7e1.R.inc(978);if ((((cella.wasShot)&&(__CLR4_4_1ljljkai6q7e1.R.iget(979)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(980)==0&false)))
                {__CLR4_4_1ljljkai6q7e1.R.inc(981);continue;

            }__CLR4_4_1ljljkai6q7e1.R.inc(982);ellensegKore = cella.loves();

            __CLR4_4_1ljljkai6q7e1.R.inc(983);if ((((tablaJ.hajok == 0)&&(__CLR4_4_1ljljkai6q7e1.R.iget(984)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(985)==0&false))) {{
                __CLR4_4_1ljljkai6q7e1.R.inc(986);System.out.println("Vesztettel");
                __CLR4_4_1ljljkai6q7e1.R.inc(987);Nyertel = 1;
                __CLR4_4_1ljljkai6q7e1.R.inc(988);jatekVege = true;
                __CLR4_4_1ljljkai6q7e1.R.inc(989);popUpAblak();

            }
        }}
    }}finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}

    public static void popUpAblak(){try{__CLR4_4_1ljljkai6q7e1.R.inc(990);


        __CLR4_4_1ljljkai6q7e1.R.inc(991);if((((Nyertel == 1)&&(__CLR4_4_1ljljkai6q7e1.R.iget(992)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(993)==0&false)))
        {{
            __CLR4_4_1ljljkai6q7e1.R.inc(994);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1ljljkai6q7e1.R.inc(995);alert.setTitle("Vesztettel");
            __CLR4_4_1ljljkai6q7e1.R.inc(996);alert.setHeaderText(null);
            __CLR4_4_1ljljkai6q7e1.R.inc(997);alert.setGraphic(null);
            __CLR4_4_1ljljkai6q7e1.R.inc(998);alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            __CLR4_4_1ljljkai6q7e1.R.inc(999);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1ljljkai6q7e1.R.inc(1000);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1ljljkai6q7e1.R.iget(1001)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(1002)==0&false)))
            {{
                __CLR4_4_1ljljkai6q7e1.R.inc(1003);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}
        }else {__CLR4_4_1ljljkai6q7e1.R.inc(1004);if((((Nyertel == 2)&&(__CLR4_4_1ljljkai6q7e1.R.iget(1005)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(1006)==0&false)))
        {{
            __CLR4_4_1ljljkai6q7e1.R.inc(1007);Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            __CLR4_4_1ljljkai6q7e1.R.inc(1008);alert.setTitle("Nyertel");
            __CLR4_4_1ljljkai6q7e1.R.inc(1009);alert.setHeaderText(null);
            __CLR4_4_1ljljkai6q7e1.R.inc(1010);alert.setGraphic(null);
            __CLR4_4_1ljljkai6q7e1.R.inc(1011);alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            __CLR4_4_1ljljkai6q7e1.R.inc(1012);Optional<ButtonType> result = alert.showAndWait();
            __CLR4_4_1ljljkai6q7e1.R.inc(1013);if ((((result.get() == ButtonType.OK)&&(__CLR4_4_1ljljkai6q7e1.R.iget(1014)!=0|true))||(__CLR4_4_1ljljkai6q7e1.R.iget(1015)==0&false)))
            {{
                __CLR4_4_1ljljkai6q7e1.R.inc(1016);reset(MyApplication.stage31);
            } }else
            {{

            }
        }}


    }}}finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}
    //public Scene scene1 = new Scene(createContent());

    private static void reset(Stage primaryStage){try{__CLR4_4_1ljljkai6q7e1.R.inc(1017);

        __CLR4_4_1ljljkai6q7e1.R.inc(1018);primaryStage.close();
        __CLR4_4_1ljljkai6q7e1.R.inc(1019);jatekKezdet = false;
        __CLR4_4_1ljljkai6q7e1.R.inc(1020);hatralevoHajok = 5;
        __CLR4_4_1ljljkai6q7e1.R.inc(1021);Scene scene2 = new Scene(createContent());
        __CLR4_4_1ljljkai6q7e1.R.inc(1022);primaryStage.setScene(scene2);
        __CLR4_4_1ljljkai6q7e1.R.inc(1023);primaryStage.show();
        __CLR4_4_1ljljkai6q7e1.R.inc(1024);jatekVege = false;

    }finally{__CLR4_4_1ljljkai6q7e1.R.flushNeeded();}}


}