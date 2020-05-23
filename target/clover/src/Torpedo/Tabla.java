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

public class Tabla extends Parent {public static class __CLR4_4_16363kajoh2o2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590241069679L,8589935092L,351,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final VBox sorok = new VBox();
    private final boolean ellenseg;

    public int hajok = 5;

    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {try{__CLR4_4_16363kajoh2o2.R.inc(219);
        __CLR4_4_16363kajoh2o2.R.inc(220);this.ellenseg= ellenseg;
        __CLR4_4_16363kajoh2o2.R.inc(221);for (int y = 0; (((y < 10)&&(__CLR4_4_16363kajoh2o2.R.iget(222)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(223)==0&false)); y++) {{
            __CLR4_4_16363kajoh2o2.R.inc(224);HBox sor = new HBox();
            __CLR4_4_16363kajoh2o2.R.inc(225);for (int x = 0; (((x < 10)&&(__CLR4_4_16363kajoh2o2.R.iget(226)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(227)==0&false)); x++) {{
                __CLR4_4_16363kajoh2o2.R.inc(228);Cella c = new Cella(x, y, this);
                __CLR4_4_16363kajoh2o2.R.inc(229);c.setOnMouseClicked(handler);
                __CLR4_4_16363kajoh2o2.R.inc(230);sor.getChildren().add(c);

            }

            }__CLR4_4_16363kajoh2o2.R.inc(231);sorok.getChildren().add(sor);
        }

        }__CLR4_4_16363kajoh2o2.R.inc(232);getChildren().add(sorok);
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private final Tabla tabla;

        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);__CLR4_4_16363kajoh2o2.R.inc(234);try{__CLR4_4_16363kajoh2o2.R.inc(233);
            __CLR4_4_16363kajoh2o2.R.inc(235);this.x = x;
            __CLR4_4_16363kajoh2o2.R.inc(236);this.y = y;
            __CLR4_4_16363kajoh2o2.R.inc(237);this.tabla = tabla;
            __CLR4_4_16363kajoh2o2.R.inc(238);setFill(Color.LIGHTSKYBLUE);
            __CLR4_4_16363kajoh2o2.R.inc(239);setStroke(Color.BLACK);

        }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}

        public boolean loves() {try{__CLR4_4_16363kajoh2o2.R.inc(240);
            __CLR4_4_16363kajoh2o2.R.inc(241);if((((Pelda.jatekVege)&&(__CLR4_4_16363kajoh2o2.R.iget(242)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(243)==0&false)))
            {{
                __CLR4_4_16363kajoh2o2.R.inc(244);return false;
            }
            }__CLR4_4_16363kajoh2o2.R.inc(245);wasShot = true;
            __CLR4_4_16363kajoh2o2.R.inc(246);setFill(Color.BLACK);

            __CLR4_4_16363kajoh2o2.R.inc(247);if ((((hajo != null)&&(__CLR4_4_16363kajoh2o2.R.iget(248)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(249)==0&false))) {{
                __CLR4_4_16363kajoh2o2.R.inc(250);hajo.talalat();
                __CLR4_4_16363kajoh2o2.R.inc(251);setFill(Color.RED);
                __CLR4_4_16363kajoh2o2.R.inc(252);if ((((!hajo.El())&&(__CLR4_4_16363kajoh2o2.R.iget(253)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(254)==0&false))) {{
                    __CLR4_4_16363kajoh2o2.R.inc(255);tabla.hajok--;
                }
                }__CLR4_4_16363kajoh2o2.R.inc(256);return true;
            }

            }__CLR4_4_16363kajoh2o2.R.inc(257);return false;
        }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}
    }

    public Cella getCella(int x, int y) {try{__CLR4_4_16363kajoh2o2.R.inc(258);
        __CLR4_4_16363kajoh2o2.R.inc(259);return (Cella)((HBox)sorok.getChildren().get(y)).getChildren().get(x);
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}



    private Cella[] getSzomszed(int x, int y) {try{__CLR4_4_16363kajoh2o2.R.inc(260);
        __CLR4_4_16363kajoh2o2.R.inc(261);Point2D[] points = new Point2D[] {
                new Point2D(x - 1, y),
                new Point2D(x + 1, y),
                new Point2D(x, y - 1),
                new Point2D(x, y + 1)
        };

        __CLR4_4_16363kajoh2o2.R.inc(262);List<Cella> szomszedok = new ArrayList<>();

        __CLR4_4_16363kajoh2o2.R.inc(263);for (Point2D p : points) {{
            __CLR4_4_16363kajoh2o2.R.inc(264);if ((((letezoElem(p))&&(__CLR4_4_16363kajoh2o2.R.iget(265)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(266)==0&false))) {{
                __CLR4_4_16363kajoh2o2.R.inc(267);szomszedok.add(getCella((int)p.getX(), (int)p.getY()));
            }
        }}

        }__CLR4_4_16363kajoh2o2.R.inc(268);return szomszedok.toArray(new Cella[0]);
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}



    private boolean letezoElem(Point2D point) {try{__CLR4_4_16363kajoh2o2.R.inc(269);
        __CLR4_4_16363kajoh2o2.R.inc(270);return letezoElem(point.getX(), point.getY());
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}

    private boolean letezoElem(double x, double y) {try{__CLR4_4_16363kajoh2o2.R.inc(271);
        __CLR4_4_16363kajoh2o2.R.inc(272);return x >= 0 && x < 10 && y >= 0 && y < 10;
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}



    private boolean Lerakhato(Hajo hajo, int x, int y) {try{__CLR4_4_16363kajoh2o2.R.inc(273);
        __CLR4_4_16363kajoh2o2.R.inc(274);int hossz = hajo.nagysag;

        __CLR4_4_16363kajoh2o2.R.inc(275);if ((((hajo.fuggoleges)&&(__CLR4_4_16363kajoh2o2.R.iget(276)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(277)==0&false))) {{
            __CLR4_4_16363kajoh2o2.R.inc(278);for (int i = y; (((i < y + hossz)&&(__CLR4_4_16363kajoh2o2.R.iget(279)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(280)==0&false)); i++) {{
                __CLR4_4_16363kajoh2o2.R.inc(281);if ((((!letezoElem(x, i))&&(__CLR4_4_16363kajoh2o2.R.iget(282)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(283)==0&false)))
                    {__CLR4_4_16363kajoh2o2.R.inc(284);return false;

                }__CLR4_4_16363kajoh2o2.R.inc(285);Cella cella = getCella(x, i);
                __CLR4_4_16363kajoh2o2.R.inc(286);if ((((cella.hajo != null)&&(__CLR4_4_16363kajoh2o2.R.iget(287)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(288)==0&false)))
                    {__CLR4_4_16363kajoh2o2.R.inc(289);return false;

                }__CLR4_4_16363kajoh2o2.R.inc(290);for (Cella szomszed : getSzomszed(x, i)) {{
                    __CLR4_4_16363kajoh2o2.R.inc(291);if ((((!letezoElem(x, i))&&(__CLR4_4_16363kajoh2o2.R.iget(292)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(293)==0&false)))
                        {__CLR4_4_16363kajoh2o2.R.inc(294);return false;

                    }__CLR4_4_16363kajoh2o2.R.inc(295);if ((((szomszed.hajo != null)&&(__CLR4_4_16363kajoh2o2.R.iget(296)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(297)==0&false)))
                        {__CLR4_4_16363kajoh2o2.R.inc(298);return false;
                }}
            }}
        }}
        }else {{
            __CLR4_4_16363kajoh2o2.R.inc(299);for (int i = x; (((i < x + hossz)&&(__CLR4_4_16363kajoh2o2.R.iget(300)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(301)==0&false)); i++) {{
                __CLR4_4_16363kajoh2o2.R.inc(302);if ((((!letezoElem(i, y))&&(__CLR4_4_16363kajoh2o2.R.iget(303)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(304)==0&false)))
                    {__CLR4_4_16363kajoh2o2.R.inc(305);return false;

                }__CLR4_4_16363kajoh2o2.R.inc(306);Cella cella = getCella(i, y);
                __CLR4_4_16363kajoh2o2.R.inc(307);if ((((cella.hajo != null)&&(__CLR4_4_16363kajoh2o2.R.iget(308)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(309)==0&false)))
                    {__CLR4_4_16363kajoh2o2.R.inc(310);return false;

                }__CLR4_4_16363kajoh2o2.R.inc(311);for (Cella szomszed : getSzomszed(i, y)) {{
                    __CLR4_4_16363kajoh2o2.R.inc(312);if ((((!letezoElem(i, y))&&(__CLR4_4_16363kajoh2o2.R.iget(313)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(314)==0&false)))
                        {__CLR4_4_16363kajoh2o2.R.inc(315);return false;

                    }__CLR4_4_16363kajoh2o2.R.inc(316);if ((((szomszed.hajo != null)&&(__CLR4_4_16363kajoh2o2.R.iget(317)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(318)==0&false)))
                        {__CLR4_4_16363kajoh2o2.R.inc(319);return false;
                }}
            }}
        }}

        }__CLR4_4_16363kajoh2o2.R.inc(320);return true;
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}



    public boolean hajoLerakas(Hajo hajo, int x, int y) {try{__CLR4_4_16363kajoh2o2.R.inc(321);
        __CLR4_4_16363kajoh2o2.R.inc(322);if ((((Lerakhato(hajo, x, y))&&(__CLR4_4_16363kajoh2o2.R.iget(323)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(324)==0&false))) {{
            __CLR4_4_16363kajoh2o2.R.inc(325);int length = hajo.nagysag;

            __CLR4_4_16363kajoh2o2.R.inc(326);if ((((hajo.fuggoleges)&&(__CLR4_4_16363kajoh2o2.R.iget(327)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(328)==0&false))) {{
                __CLR4_4_16363kajoh2o2.R.inc(329);for (int i = y; (((i < y + length)&&(__CLR4_4_16363kajoh2o2.R.iget(330)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(331)==0&false)); i++) {{
                    __CLR4_4_16363kajoh2o2.R.inc(332);Cella cella = getCella(x, i);
                    __CLR4_4_16363kajoh2o2.R.inc(333);cella.hajo = hajo;
                    __CLR4_4_16363kajoh2o2.R.inc(334);if ((((!ellenseg)&&(__CLR4_4_16363kajoh2o2.R.iget(335)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(336)==0&false))) {{
                        __CLR4_4_16363kajoh2o2.R.inc(337);cella.setFill(Color.BROWN);
                        __CLR4_4_16363kajoh2o2.R.inc(338);cella.setStroke(Color.BLACK);
                    }
                }}
            }}
            }else {{
                __CLR4_4_16363kajoh2o2.R.inc(339);for (int i = x; (((i < x + length)&&(__CLR4_4_16363kajoh2o2.R.iget(340)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(341)==0&false)); i++) {{
                    __CLR4_4_16363kajoh2o2.R.inc(342);Cella cella = getCella(i, y);
                    __CLR4_4_16363kajoh2o2.R.inc(343);cella.hajo = hajo;
                    __CLR4_4_16363kajoh2o2.R.inc(344);if ((((!ellenseg)&&(__CLR4_4_16363kajoh2o2.R.iget(345)!=0|true))||(__CLR4_4_16363kajoh2o2.R.iget(346)==0&false))) {{
                        __CLR4_4_16363kajoh2o2.R.inc(347);cella.setFill(Color.BROWN);
                        __CLR4_4_16363kajoh2o2.R.inc(348);cella.setStroke(Color.BLACK);
                    }
                }}
            }}

            }__CLR4_4_16363kajoh2o2.R.inc(349);return true;
        }

        }__CLR4_4_16363kajoh2o2.R.inc(350);return false;
    }finally{__CLR4_4_16363kajoh2o2.R.flushNeeded();}}

}