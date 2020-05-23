/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.util.ArrayList;
import java.util.List;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tabla extends Parent {public static class __CLR4_4_1rdrdkajt6drh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590248969029L,8589935092L,1117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final VBox sorok = new VBox();
    private final boolean ellenseg;

    public int hajok = 5;

    /**
     *
     * @param ellenseg
     * @param handler
     */
    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {try{__CLR4_4_1rdrdkajt6drh.R.inc(985);
        __CLR4_4_1rdrdkajt6drh.R.inc(986);this.ellenseg= ellenseg;
        __CLR4_4_1rdrdkajt6drh.R.inc(987);for (int y = 0; (((y < 10)&&(__CLR4_4_1rdrdkajt6drh.R.iget(988)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(989)==0&false)); y++) {{
            __CLR4_4_1rdrdkajt6drh.R.inc(990);HBox sor = new HBox();
            __CLR4_4_1rdrdkajt6drh.R.inc(991);for (int x = 0; (((x < 10)&&(__CLR4_4_1rdrdkajt6drh.R.iget(992)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(993)==0&false)); x++) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(994);Cella c = new Cella(x, y, this);
                __CLR4_4_1rdrdkajt6drh.R.inc(995);c.setOnMouseClicked(handler);
                __CLR4_4_1rdrdkajt6drh.R.inc(996);sor.getChildren().add(c);

            }

            }__CLR4_4_1rdrdkajt6drh.R.inc(997);sorok.getChildren().add(sor);
        }

        }__CLR4_4_1rdrdkajt6drh.R.inc(998);getChildren().add(sorok);
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private final Tabla tabla;

        /**
         *
         * @param x
         * @param y
         * @param tabla
         */
        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);__CLR4_4_1rdrdkajt6drh.R.inc(1000);try{__CLR4_4_1rdrdkajt6drh.R.inc(999);
            __CLR4_4_1rdrdkajt6drh.R.inc(1001);this.x = x;
            __CLR4_4_1rdrdkajt6drh.R.inc(1002);this.y = y;
            __CLR4_4_1rdrdkajt6drh.R.inc(1003);this.tabla = tabla;
            __CLR4_4_1rdrdkajt6drh.R.inc(1004);setFill(Color.LIGHTSKYBLUE);
            __CLR4_4_1rdrdkajt6drh.R.inc(1005);setStroke(Color.BLACK);

        }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}

        /**
         * Valami.
         * @return valami.
         */
        public boolean loves() {try{__CLR4_4_1rdrdkajt6drh.R.inc(1006);
            __CLR4_4_1rdrdkajt6drh.R.inc(1007);if((((Pelda.jatekVege)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1008)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1009)==0&false)))
            {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1010);return false;
            }
            }__CLR4_4_1rdrdkajt6drh.R.inc(1011);wasShot = true;
            __CLR4_4_1rdrdkajt6drh.R.inc(1012);setFill(Color.BLACK);

            __CLR4_4_1rdrdkajt6drh.R.inc(1013);if ((((hajo != null)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1014)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1015)==0&false))) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1016);hajo.talalat();
                __CLR4_4_1rdrdkajt6drh.R.inc(1017);setFill(Color.RED);
                __CLR4_4_1rdrdkajt6drh.R.inc(1018);if ((((!hajo.El())&&(__CLR4_4_1rdrdkajt6drh.R.iget(1019)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1020)==0&false))) {{
                    __CLR4_4_1rdrdkajt6drh.R.inc(1021);tabla.hajok--;
                }
                }__CLR4_4_1rdrdkajt6drh.R.inc(1022);return true;
            }

            }__CLR4_4_1rdrdkajt6drh.R.inc(1023);return false;
        }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}
    }

    /**
     * Valami.
     * @param x valami.
     * @param y valami.
     * @return valami.
     */
    public Cella getCella(int x, int y) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1024);
        __CLR4_4_1rdrdkajt6drh.R.inc(1025);return (Cella)((HBox)sorok.getChildren().get(y)).getChildren().get(x);
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}



    private Cella[] getSzomszed(int x, int y) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1026);
        __CLR4_4_1rdrdkajt6drh.R.inc(1027);Point2D[] points = new Point2D[] {
                new Point2D(x - 1, y),
                new Point2D(x + 1, y),
                new Point2D(x, y - 1),
                new Point2D(x, y + 1)
        };

        __CLR4_4_1rdrdkajt6drh.R.inc(1028);List<Cella> szomszedok = new ArrayList<>();

        __CLR4_4_1rdrdkajt6drh.R.inc(1029);for (Point2D p : points) {{
            __CLR4_4_1rdrdkajt6drh.R.inc(1030);if ((((letezoElem(p))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1031)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1032)==0&false))) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1033);szomszedok.add(getCella((int)p.getX(), (int)p.getY()));
            }
        }}

        }__CLR4_4_1rdrdkajt6drh.R.inc(1034);return szomszedok.toArray(new Cella[0]);
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}



    private boolean letezoElem(Point2D point) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1035);
        __CLR4_4_1rdrdkajt6drh.R.inc(1036);return letezoElem(point.getX(), point.getY());
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}

    private boolean letezoElem(double x, double y) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1037);
        __CLR4_4_1rdrdkajt6drh.R.inc(1038);return x >= 0 && x < 10 && y >= 0 && y < 10;
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}



    private boolean Lerakhato(Hajo hajo, int x, int y) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1039);
        __CLR4_4_1rdrdkajt6drh.R.inc(1040);int hossz = hajo.nagysag;

        __CLR4_4_1rdrdkajt6drh.R.inc(1041);if ((((hajo.fuggoleges)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1042)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1043)==0&false))) {{
            __CLR4_4_1rdrdkajt6drh.R.inc(1044);for (int i = y; (((i < y + hossz)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1045)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1046)==0&false)); i++) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1047);if ((((!letezoElem(x, i))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1048)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1049)==0&false)))
                    {__CLR4_4_1rdrdkajt6drh.R.inc(1050);return false;

                }__CLR4_4_1rdrdkajt6drh.R.inc(1051);Cella cella = getCella(x, i);
                __CLR4_4_1rdrdkajt6drh.R.inc(1052);if ((((cella.hajo != null)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1053)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1054)==0&false)))
                    {__CLR4_4_1rdrdkajt6drh.R.inc(1055);return false;

                }__CLR4_4_1rdrdkajt6drh.R.inc(1056);for (Cella szomszed : getSzomszed(x, i)) {{
                    __CLR4_4_1rdrdkajt6drh.R.inc(1057);if ((((!letezoElem(x, i))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1058)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1059)==0&false)))
                        {__CLR4_4_1rdrdkajt6drh.R.inc(1060);return false;

                    }__CLR4_4_1rdrdkajt6drh.R.inc(1061);if ((((szomszed.hajo != null)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1062)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1063)==0&false)))
                        {__CLR4_4_1rdrdkajt6drh.R.inc(1064);return false;
                }}
            }}
        }}
        }else {{
            __CLR4_4_1rdrdkajt6drh.R.inc(1065);for (int i = x; (((i < x + hossz)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1066)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1067)==0&false)); i++) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1068);if ((((!letezoElem(i, y))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1069)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1070)==0&false)))
                    {__CLR4_4_1rdrdkajt6drh.R.inc(1071);return false;

                }__CLR4_4_1rdrdkajt6drh.R.inc(1072);Cella cella = getCella(i, y);
                __CLR4_4_1rdrdkajt6drh.R.inc(1073);if ((((cella.hajo != null)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1074)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1075)==0&false)))
                    {__CLR4_4_1rdrdkajt6drh.R.inc(1076);return false;

                }__CLR4_4_1rdrdkajt6drh.R.inc(1077);for (Cella szomszed : getSzomszed(i, y)) {{
                    __CLR4_4_1rdrdkajt6drh.R.inc(1078);if ((((!letezoElem(i, y))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1079)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1080)==0&false)))
                        {__CLR4_4_1rdrdkajt6drh.R.inc(1081);return false;

                    }__CLR4_4_1rdrdkajt6drh.R.inc(1082);if ((((szomszed.hajo != null)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1083)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1084)==0&false)))
                        {__CLR4_4_1rdrdkajt6drh.R.inc(1085);return false;
                }}
            }}
        }}

        }__CLR4_4_1rdrdkajt6drh.R.inc(1086);return true;
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}


    /**
     * Valami.
     * @param hajo valami.
     * @param x valami.
     * @param y valami.
     * @return valami.
     */
    public boolean hajoLerakas(Hajo hajo, int x, int y) {try{__CLR4_4_1rdrdkajt6drh.R.inc(1087);
        __CLR4_4_1rdrdkajt6drh.R.inc(1088);if ((((Lerakhato(hajo, x, y))&&(__CLR4_4_1rdrdkajt6drh.R.iget(1089)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1090)==0&false))) {{
            __CLR4_4_1rdrdkajt6drh.R.inc(1091);int length = hajo.nagysag;

            __CLR4_4_1rdrdkajt6drh.R.inc(1092);if ((((hajo.fuggoleges)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1093)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1094)==0&false))) {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1095);for (int i = y; (((i < y + length)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1096)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1097)==0&false)); i++) {{
                    __CLR4_4_1rdrdkajt6drh.R.inc(1098);Cella cella = getCella(x, i);
                    __CLR4_4_1rdrdkajt6drh.R.inc(1099);cella.hajo = hajo;
                    __CLR4_4_1rdrdkajt6drh.R.inc(1100);if ((((!ellenseg)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1101)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1102)==0&false))) {{
                        __CLR4_4_1rdrdkajt6drh.R.inc(1103);cella.setFill(Color.BROWN);
                        __CLR4_4_1rdrdkajt6drh.R.inc(1104);cella.setStroke(Color.BLACK);
                    }
                }}
            }}
            }else {{
                __CLR4_4_1rdrdkajt6drh.R.inc(1105);for (int i = x; (((i < x + length)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1106)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1107)==0&false)); i++) {{
                    __CLR4_4_1rdrdkajt6drh.R.inc(1108);Cella cella = getCella(i, y);
                    __CLR4_4_1rdrdkajt6drh.R.inc(1109);cella.hajo = hajo;
                    __CLR4_4_1rdrdkajt6drh.R.inc(1110);if ((((!ellenseg)&&(__CLR4_4_1rdrdkajt6drh.R.iget(1111)!=0|true))||(__CLR4_4_1rdrdkajt6drh.R.iget(1112)==0&false))) {{
                        __CLR4_4_1rdrdkajt6drh.R.inc(1113);cella.setFill(Color.BROWN);
                        __CLR4_4_1rdrdkajt6drh.R.inc(1114);cella.setStroke(Color.BLACK);
                    }
                }}
            }}

            }__CLR4_4_1rdrdkajt6drh.R.inc(1115);return true;
        }

        }__CLR4_4_1rdrdkajt6drh.R.inc(1116);return false;
    }finally{__CLR4_4_1rdrdkajt6drh.R.flushNeeded();}}

}