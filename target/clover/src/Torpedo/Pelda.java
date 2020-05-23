/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.io.IOException;
import java.util.Random;

import controller.GameController;
import Torpedo.dataTabla.writeToJSON;

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

public class Pelda  {public static class __CLR4_4_1lmlmkajt6dpr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590248969029L,8589935092L,985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    /**
     * valami.
     * @return valami.
     */
    public static Parent createContent() {try{__CLR4_4_1lmlmkajt6dpr.R.inc(778);
        __CLR4_4_1lmlmkajt6dpr.R.inc(779);BorderPane root = new BorderPane();


        __CLR4_4_1lmlmkajt6dpr.R.inc(780);root.setPadding(new Insets(0, 60, 0, 150));
        __CLR4_4_1lmlmkajt6dpr.R.inc(781);root.setPrefSize(800, 850);
        __CLR4_4_1lmlmkajt6dpr.R.inc(782);resetButton.setPrefWidth(150);
        __CLR4_4_1lmlmkajt6dpr.R.inc(783);resetButton.setPrefHeight(50);
        __CLR4_4_1lmlmkajt6dpr.R.inc(784);tablaButton.setPrefWidth(150);
        __CLR4_4_1lmlmkajt6dpr.R.inc(785);tablaButton.setPrefHeight(50);
        __CLR4_4_1lmlmkajt6dpr.R.inc(786);exitButton.setPrefWidth(150);
        __CLR4_4_1lmlmkajt6dpr.R.inc(787);exitButton.setPrefHeight(50);

        // Top margo

        __CLR4_4_1lmlmkajt6dpr.R.inc(788);Insets insets = new Insets(10);
        __CLR4_4_1lmlmkajt6dpr.R.inc(789);Node topNode = new Label("");
        __CLR4_4_1lmlmkajt6dpr.R.inc(790);root.setTop(topNode);
        __CLR4_4_1lmlmkajt6dpr.R.inc(791);BorderPane.setMargin(topNode, insets);

        __CLR4_4_1lmlmkajt6dpr.R.inc(792);resetButton.setOnAction(e -> GameController.reset(MyApplication.stage31));

        __CLR4_4_1lmlmkajt6dpr.R.inc(793);exitButton.setOnAction(e -> System.exit(0));

        __CLR4_4_1lmlmkajt6dpr.R.inc(794);tablaButton.setOnAction(e -> {
            __CLR4_4_1lmlmkajt6dpr.R.inc(795);try {
                __CLR4_4_1lmlmkajt6dpr.R.inc(796);GameController.tablazat( e );
            } catch (IOException ex) {
                __CLR4_4_1lmlmkajt6dpr.R.inc(797);ex.printStackTrace();
            }
        });


        __CLR4_4_1lmlmkajt6dpr.R.inc(798);VBox menu = new VBox( 20,menuT, resetButton, tablaButton, exitButton);
        __CLR4_4_1lmlmkajt6dpr.R.inc(799);menu.setAlignment(Pos.TOP_CENTER);
        __CLR4_4_1lmlmkajt6dpr.R.inc(800);root.setRight(menu);



        //Hatter
        __CLR4_4_1lmlmkajt6dpr.R.inc(801);Image image = new Image("BG2.jpeg");

        __CLR4_4_1lmlmkajt6dpr.R.inc(802);BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        __CLR4_4_1lmlmkajt6dpr.R.inc(803);Background background = new Background(backgroundimage);

        __CLR4_4_1lmlmkajt6dpr.R.inc(804);root.setBackground(background);





        __CLR4_4_1lmlmkajt6dpr.R.inc(805);tablaE = new Tabla(true, event -> {
            __CLR4_4_1lmlmkajt6dpr.R.inc(806);if ((((!jatekKezdet)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(807)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(808)==0&false)))
                {__CLR4_4_1lmlmkajt6dpr.R.inc(809);return;

            }__CLR4_4_1lmlmkajt6dpr.R.inc(810);Cella cell = (Cella) event.getSource();
            __CLR4_4_1lmlmkajt6dpr.R.inc(811);if ((((cell.wasShot)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(812)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(813)==0&false)))
                {__CLR4_4_1lmlmkajt6dpr.R.inc(814);return;

            }__CLR4_4_1lmlmkajt6dpr.R.inc(815);String xJ = String.valueOf(cell.x+1);
            __CLR4_4_1lmlmkajt6dpr.R.inc(816);String yJ = ybetuk[cell.y];
            __CLR4_4_1lmlmkajt6dpr.R.inc(817);xyJ = xJ+yJ;
            __CLR4_4_1lmlmkajt6dpr.R.inc(818);jatekoslepese = true;
            __CLR4_4_1lmlmkajt6dpr.R.inc(819);lepes++;
            __CLR4_4_1lmlmkajt6dpr.R.inc(820);writeToJSON.ujtablaadat();


            __CLR4_4_1lmlmkajt6dpr.R.inc(821);ellensegKore = !cell.loves();


            __CLR4_4_1lmlmkajt6dpr.R.inc(822);if ((((tablaE.hajok == 4)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(823)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(824)==0&false))) {{
                __CLR4_4_1lmlmkajt6dpr.R.inc(825);System.out.println("Nyertel");
                __CLR4_4_1lmlmkajt6dpr.R.inc(826);jatekVege = true;
                __CLR4_4_1lmlmkajt6dpr.R.inc(827);Nyertel = 2;
                __CLR4_4_1lmlmkajt6dpr.R.inc(828);GameController.popUpAblak();


            }

            }__CLR4_4_1lmlmkajt6dpr.R.inc(829);if ((((ellensegKore)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(830)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(831)==0&false)))
                {__CLR4_4_1lmlmkajt6dpr.R.inc(832);EllensegLepese();
        }});

        __CLR4_4_1lmlmkajt6dpr.R.inc(833);tablaJ = new Tabla(false, event -> {
            __CLR4_4_1lmlmkajt6dpr.R.inc(834);if ((((jatekKezdet)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(835)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(836)==0&false)))
                {__CLR4_4_1lmlmkajt6dpr.R.inc(837);return;

            }__CLR4_4_1lmlmkajt6dpr.R.inc(838);Cella cell = (Cella) event.getSource();
            __CLR4_4_1lmlmkajt6dpr.R.inc(839);if ((((tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y))&&(__CLR4_4_1lmlmkajt6dpr.R.iget(840)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(841)==0&false))) {{
                __CLR4_4_1lmlmkajt6dpr.R.inc(842);if ((((--hatralevoHajok == 0)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(843)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(844)==0&false))) {{
                    __CLR4_4_1lmlmkajt6dpr.R.inc(845);startGame();
                }
            }}
        }});





        // Tablak kozepen + felirat
        __CLR4_4_1lmlmkajt6dpr.R.inc(846);Label labelSz1 = new Label("   1");
        __CLR4_4_1lmlmkajt6dpr.R.inc(847);font(labelSz1);
        __CLR4_4_1lmlmkajt6dpr.R.inc(848);Label labelSz2 = new Label("2");
        __CLR4_4_1lmlmkajt6dpr.R.inc(849);font(labelSz2);
        __CLR4_4_1lmlmkajt6dpr.R.inc(850);Label labelSz3 = new Label("3");
        __CLR4_4_1lmlmkajt6dpr.R.inc(851);font(labelSz3);
        __CLR4_4_1lmlmkajt6dpr.R.inc(852);Label labelSz4 = new Label("4");
        __CLR4_4_1lmlmkajt6dpr.R.inc(853);font(labelSz4);
        __CLR4_4_1lmlmkajt6dpr.R.inc(854);Label labelSz5 = new Label("5");
        __CLR4_4_1lmlmkajt6dpr.R.inc(855);font(labelSz5);
        __CLR4_4_1lmlmkajt6dpr.R.inc(856);Label labelSz6 = new Label("6");
        __CLR4_4_1lmlmkajt6dpr.R.inc(857);font(labelSz6);
        __CLR4_4_1lmlmkajt6dpr.R.inc(858);Label labelSz7 = new Label("7");
        __CLR4_4_1lmlmkajt6dpr.R.inc(859);font(labelSz7);
        __CLR4_4_1lmlmkajt6dpr.R.inc(860);Label labelSz8 = new Label("8");
        __CLR4_4_1lmlmkajt6dpr.R.inc(861);font(labelSz8);
        __CLR4_4_1lmlmkajt6dpr.R.inc(862);Label labelSz9 = new Label("9");
        __CLR4_4_1lmlmkajt6dpr.R.inc(863);font(labelSz9);
        __CLR4_4_1lmlmkajt6dpr.R.inc(864);Label labelSz10 = new Label("10");
        __CLR4_4_1lmlmkajt6dpr.R.inc(865);font(labelSz10);

        __CLR4_4_1lmlmkajt6dpr.R.inc(866);Label labelB1 = new Label("A");
        __CLR4_4_1lmlmkajt6dpr.R.inc(867);font(labelB1);
        __CLR4_4_1lmlmkajt6dpr.R.inc(868);Label labelB2 = new Label("B");
        __CLR4_4_1lmlmkajt6dpr.R.inc(869);font(labelB2);
        __CLR4_4_1lmlmkajt6dpr.R.inc(870);Label labelB3 = new Label("C");
        __CLR4_4_1lmlmkajt6dpr.R.inc(871);font(labelB3);
        __CLR4_4_1lmlmkajt6dpr.R.inc(872);Label labelB4 = new Label("D");
        __CLR4_4_1lmlmkajt6dpr.R.inc(873);font(labelB4);
        __CLR4_4_1lmlmkajt6dpr.R.inc(874);Label labelB5 = new Label("E");
        __CLR4_4_1lmlmkajt6dpr.R.inc(875);font(labelB5);
        __CLR4_4_1lmlmkajt6dpr.R.inc(876);Label labelB6 = new Label("F");
        __CLR4_4_1lmlmkajt6dpr.R.inc(877);font(labelB6);
        __CLR4_4_1lmlmkajt6dpr.R.inc(878);Label labelB7 = new Label("G");
        __CLR4_4_1lmlmkajt6dpr.R.inc(879);font(labelB7);
        __CLR4_4_1lmlmkajt6dpr.R.inc(880);Label labelB8 = new Label("H");
        __CLR4_4_1lmlmkajt6dpr.R.inc(881);font(labelB8);
        __CLR4_4_1lmlmkajt6dpr.R.inc(882);Label labelB9 = new Label("I");
        __CLR4_4_1lmlmkajt6dpr.R.inc(883);font(labelB9);
        __CLR4_4_1lmlmkajt6dpr.R.inc(884);Label labelB10 = new Label("J");
        __CLR4_4_1lmlmkajt6dpr.R.inc(885);font(labelB10);

        __CLR4_4_1lmlmkajt6dpr.R.inc(886);Label labelSz21 = new Label("   1");
        __CLR4_4_1lmlmkajt6dpr.R.inc(887);font(labelSz21);
        __CLR4_4_1lmlmkajt6dpr.R.inc(888);Label labelSz22 = new Label("2");
        __CLR4_4_1lmlmkajt6dpr.R.inc(889);font(labelSz22);
        __CLR4_4_1lmlmkajt6dpr.R.inc(890);Label labelSz23 = new Label("3");
        __CLR4_4_1lmlmkajt6dpr.R.inc(891);font(labelSz23);
        __CLR4_4_1lmlmkajt6dpr.R.inc(892);Label labelSz24 = new Label("4");
        __CLR4_4_1lmlmkajt6dpr.R.inc(893);font(labelSz24);
        __CLR4_4_1lmlmkajt6dpr.R.inc(894);Label labelSz25 = new Label("5");
        __CLR4_4_1lmlmkajt6dpr.R.inc(895);font(labelSz25);
        __CLR4_4_1lmlmkajt6dpr.R.inc(896);Label labelSz26 = new Label("6");
        __CLR4_4_1lmlmkajt6dpr.R.inc(897);font(labelSz26);
        __CLR4_4_1lmlmkajt6dpr.R.inc(898);Label labelSz27 = new Label("7");
        __CLR4_4_1lmlmkajt6dpr.R.inc(899);font(labelSz27);
        __CLR4_4_1lmlmkajt6dpr.R.inc(900);Label labelSz28 = new Label("8");
        __CLR4_4_1lmlmkajt6dpr.R.inc(901);font(labelSz28);
        __CLR4_4_1lmlmkajt6dpr.R.inc(902);Label labelSz29 = new Label("9");
        __CLR4_4_1lmlmkajt6dpr.R.inc(903);font(labelSz29);
        __CLR4_4_1lmlmkajt6dpr.R.inc(904);Label labelSz210 = new Label("10");
        __CLR4_4_1lmlmkajt6dpr.R.inc(905);font(labelSz210);

        __CLR4_4_1lmlmkajt6dpr.R.inc(906);Label labelB21 = new Label("A");
        __CLR4_4_1lmlmkajt6dpr.R.inc(907);font(labelB21);
        __CLR4_4_1lmlmkajt6dpr.R.inc(908);Label labelB22 = new Label("B");
        __CLR4_4_1lmlmkajt6dpr.R.inc(909);font(labelB22);
        __CLR4_4_1lmlmkajt6dpr.R.inc(910);Label labelB23 = new Label("C");
        __CLR4_4_1lmlmkajt6dpr.R.inc(911);font(labelB23);
        __CLR4_4_1lmlmkajt6dpr.R.inc(912);Label labelB24 = new Label("D");
        __CLR4_4_1lmlmkajt6dpr.R.inc(913);font(labelB24);
        __CLR4_4_1lmlmkajt6dpr.R.inc(914);Label labelB25 = new Label("E");
        __CLR4_4_1lmlmkajt6dpr.R.inc(915);font(labelB25);
        __CLR4_4_1lmlmkajt6dpr.R.inc(916);Label labelB26 = new Label("F");
        __CLR4_4_1lmlmkajt6dpr.R.inc(917);font(labelB26);
        __CLR4_4_1lmlmkajt6dpr.R.inc(918);Label labelB27 = new Label("G");
        __CLR4_4_1lmlmkajt6dpr.R.inc(919);font(labelB27);
        __CLR4_4_1lmlmkajt6dpr.R.inc(920);Label labelB28 = new Label("H");
        __CLR4_4_1lmlmkajt6dpr.R.inc(921);font(labelB28);
        __CLR4_4_1lmlmkajt6dpr.R.inc(922);Label labelB29 = new Label("I");
        __CLR4_4_1lmlmkajt6dpr.R.inc(923);font(labelB29);
        __CLR4_4_1lmlmkajt6dpr.R.inc(924);Label labelB210 = new Label("J");
        __CLR4_4_1lmlmkajt6dpr.R.inc(925);font(labelB210);


        __CLR4_4_1lmlmkajt6dpr.R.inc(926);VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        __CLR4_4_1lmlmkajt6dpr.R.inc(927);Betu11.setAlignment(Pos.CENTER);
        __CLR4_4_1lmlmkajt6dpr.R.inc(928);root.setCenter(Betu11);
        __CLR4_4_1lmlmkajt6dpr.R.inc(929);HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);




        __CLR4_4_1lmlmkajt6dpr.R.inc(930);root.setCenter(Szam11);

        __CLR4_4_1lmlmkajt6dpr.R.inc(931);VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        __CLR4_4_1lmlmkajt6dpr.R.inc(932);Betu1.setAlignment(Pos.CENTER);
        __CLR4_4_1lmlmkajt6dpr.R.inc(933);root.setCenter(Betu1);
        __CLR4_4_1lmlmkajt6dpr.R.inc(934);HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

        __CLR4_4_1lmlmkajt6dpr.R.inc(935);root.setCenter(Szam1);

        __CLR4_4_1lmlmkajt6dpr.R.inc(936);HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        __CLR4_4_1lmlmkajt6dpr.R.inc(937);VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        __CLR4_4_1lmlmkajt6dpr.R.inc(938);HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        __CLR4_4_1lmlmkajt6dpr.R.inc(939);VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        __CLR4_4_1lmlmkajt6dpr.R.inc(940);VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        __CLR4_4_1lmlmkajt6dpr.R.inc(941);tablak.setAlignment(Pos.CENTER);


        __CLR4_4_1lmlmkajt6dpr.R.inc(942);root.setCenter(tablak);




        __CLR4_4_1lmlmkajt6dpr.R.inc(943);return root;

    }finally{__CLR4_4_1lmlmkajt6dpr.R.flushNeeded();}}

    private static void font(Label label){try{__CLR4_4_1lmlmkajt6dpr.R.inc(944);

        __CLR4_4_1lmlmkajt6dpr.R.inc(945);label.setTextFill(Color.web("#FFFFFF"));
        __CLR4_4_1lmlmkajt6dpr.R.inc(946);label.setFont(new Font("Arial", 17));
        __CLR4_4_1lmlmkajt6dpr.R.inc(947);label.setStyle("-fx-font-weight: bold;");
    }finally{__CLR4_4_1lmlmkajt6dpr.R.flushNeeded();}}



    private static void startGame() {try{__CLR4_4_1lmlmkajt6dpr.R.inc(948);
        __CLR4_4_1lmlmkajt6dpr.R.inc(949);int nagysag = 5;

        __CLR4_4_1lmlmkajt6dpr.R.inc(950);while ((((nagysag > 0)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(951)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(952)==0&false))) {{
            __CLR4_4_1lmlmkajt6dpr.R.inc(953);int x = random.nextInt(10);
            __CLR4_4_1lmlmkajt6dpr.R.inc(954);int y = random.nextInt(10);

            __CLR4_4_1lmlmkajt6dpr.R.inc(955);if ((((tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y))&&(__CLR4_4_1lmlmkajt6dpr.R.iget(956)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(957)==0&false))) {{
                __CLR4_4_1lmlmkajt6dpr.R.inc(958);nagysag--;
            }
        }}
        }__CLR4_4_1lmlmkajt6dpr.R.inc(959);jatekKezdet = true;
    }finally{__CLR4_4_1lmlmkajt6dpr.R.flushNeeded();}}


    /**
     * valami.
     */
    public static void EllensegLepese() {try{__CLR4_4_1lmlmkajt6dpr.R.inc(960);


        __CLR4_4_1lmlmkajt6dpr.R.inc(961);while ((((ellensegKore && !jatekVege)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(962)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(963)==0&false))) {{
            __CLR4_4_1lmlmkajt6dpr.R.inc(964);int x = random.nextInt(10);
            __CLR4_4_1lmlmkajt6dpr.R.inc(965);int y = random.nextInt(10);
            __CLR4_4_1lmlmkajt6dpr.R.inc(966);String x1 = String.valueOf(x+1);

            __CLR4_4_1lmlmkajt6dpr.R.inc(967);String yE = ybetuk[y];

            __CLR4_4_1lmlmkajt6dpr.R.inc(968);xyE = x1 + yE;
            __CLR4_4_1lmlmkajt6dpr.R.inc(969);jatekoslepese = false;
            __CLR4_4_1lmlmkajt6dpr.R.inc(970);lepes++;

            __CLR4_4_1lmlmkajt6dpr.R.inc(971);writeToJSON.ujtablaadat();


            __CLR4_4_1lmlmkajt6dpr.R.inc(972);Cella cella = tablaJ.getCella(x, y);
            __CLR4_4_1lmlmkajt6dpr.R.inc(973);if ((((cella.wasShot)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(974)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(975)==0&false)))
                {__CLR4_4_1lmlmkajt6dpr.R.inc(976);continue;

            }__CLR4_4_1lmlmkajt6dpr.R.inc(977);ellensegKore = cella.loves();

            __CLR4_4_1lmlmkajt6dpr.R.inc(978);if ((((tablaJ.hajok == 0)&&(__CLR4_4_1lmlmkajt6dpr.R.iget(979)!=0|true))||(__CLR4_4_1lmlmkajt6dpr.R.iget(980)==0&false))) {{
                __CLR4_4_1lmlmkajt6dpr.R.inc(981);System.out.println("Vesztettel");
                __CLR4_4_1lmlmkajt6dpr.R.inc(982);Nyertel = 1;
                __CLR4_4_1lmlmkajt6dpr.R.inc(983);jatekVege = true;
                __CLR4_4_1lmlmkajt6dpr.R.inc(984);GameController.popUpAblak();

            }
        }}
    }}finally{__CLR4_4_1lmlmkajt6dpr.R.flushNeeded();}}
}