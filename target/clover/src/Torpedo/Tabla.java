/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Torpedo;

import java.util.ArrayList;
import java.util.List;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tabla extends Parent {public static class __CLR4_4_16z6zkaebnw1v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589917221894L,8589935092L,384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private VBox sorok = new VBox();
    private boolean ellenseg = false;

    public int hajok = 5;

    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {try{__CLR4_4_16z6zkaebnw1v.R.inc(251);
        __CLR4_4_16z6zkaebnw1v.R.inc(252);this.ellenseg= ellenseg;
        __CLR4_4_16z6zkaebnw1v.R.inc(253);for (int y = 0; (((y < 10)&&(__CLR4_4_16z6zkaebnw1v.R.iget(254)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(255)==0&false)); y++) {{
            __CLR4_4_16z6zkaebnw1v.R.inc(256);HBox sor = new HBox();
            __CLR4_4_16z6zkaebnw1v.R.inc(257);Label text1 = new Label ("TT");
            __CLR4_4_16z6zkaebnw1v.R.inc(258);for (int x = 0; (((x < 10)&&(__CLR4_4_16z6zkaebnw1v.R.iget(259)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(260)==0&false)); x++) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(261);Cella c = new Cella(x, y, this);
                __CLR4_4_16z6zkaebnw1v.R.inc(262);c.setOnMouseClicked(handler);
                __CLR4_4_16z6zkaebnw1v.R.inc(263);sor.getChildren().add(c);

            }

            }__CLR4_4_16z6zkaebnw1v.R.inc(264);sorok.getChildren().add(sor);
        }

        }__CLR4_4_16z6zkaebnw1v.R.inc(265);getChildren().add(sorok);
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private Tabla tabla;

        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);__CLR4_4_16z6zkaebnw1v.R.inc(267);try{__CLR4_4_16z6zkaebnw1v.R.inc(266);
            __CLR4_4_16z6zkaebnw1v.R.inc(268);this.x = x;
            __CLR4_4_16z6zkaebnw1v.R.inc(269);this.y = y;
            __CLR4_4_16z6zkaebnw1v.R.inc(270);this.tabla = tabla;
            __CLR4_4_16z6zkaebnw1v.R.inc(271);setFill(Color.LIGHTSKYBLUE);
            __CLR4_4_16z6zkaebnw1v.R.inc(272);setStroke(Color.BLACK);

        }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}

        public boolean loves() {try{__CLR4_4_16z6zkaebnw1v.R.inc(273);
            __CLR4_4_16z6zkaebnw1v.R.inc(274);if( (((Main.jatekVege == true)&&(__CLR4_4_16z6zkaebnw1v.R.iget(275)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(276)==0&false)))
            {{
                __CLR4_4_16z6zkaebnw1v.R.inc(277);return false;
            }
            }__CLR4_4_16z6zkaebnw1v.R.inc(278);wasShot = true;
            __CLR4_4_16z6zkaebnw1v.R.inc(279);setFill(Color.BLACK);

            __CLR4_4_16z6zkaebnw1v.R.inc(280);if ((((hajo != null)&&(__CLR4_4_16z6zkaebnw1v.R.iget(281)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(282)==0&false))) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(283);hajo.talalat();
                __CLR4_4_16z6zkaebnw1v.R.inc(284);setFill(Color.RED);
                __CLR4_4_16z6zkaebnw1v.R.inc(285);if ((((!hajo.El())&&(__CLR4_4_16z6zkaebnw1v.R.iget(286)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(287)==0&false))) {{
                    __CLR4_4_16z6zkaebnw1v.R.inc(288);tabla.hajok--;
                }
                }__CLR4_4_16z6zkaebnw1v.R.inc(289);return true;
            }

            }__CLR4_4_16z6zkaebnw1v.R.inc(290);return false;
        }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}
    }

    public Cella getCella(int x, int y) {try{__CLR4_4_16z6zkaebnw1v.R.inc(291);
        __CLR4_4_16z6zkaebnw1v.R.inc(292);return (Cella)((HBox)sorok.getChildren().get(y)).getChildren().get(x);
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}



    private Cella[] getSzomszed(int x, int y) {try{__CLR4_4_16z6zkaebnw1v.R.inc(293);
        __CLR4_4_16z6zkaebnw1v.R.inc(294);Point2D[] points = new Point2D[] {
                new Point2D(x - 1, y),
                new Point2D(x + 1, y),
                new Point2D(x, y - 1),
                new Point2D(x, y + 1)
        };

        __CLR4_4_16z6zkaebnw1v.R.inc(295);List<Cella> szomszedok = new ArrayList<Cella>();

        __CLR4_4_16z6zkaebnw1v.R.inc(296);for (Point2D p : points) {{
            __CLR4_4_16z6zkaebnw1v.R.inc(297);if ((((letezoElem(p))&&(__CLR4_4_16z6zkaebnw1v.R.iget(298)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(299)==0&false))) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(300);szomszedok.add(getCella((int)p.getX(), (int)p.getY()));
            }
        }}

        }__CLR4_4_16z6zkaebnw1v.R.inc(301);return szomszedok.toArray(new Cella[0]);
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}



    private boolean letezoElem(Point2D point) {try{__CLR4_4_16z6zkaebnw1v.R.inc(302);
        __CLR4_4_16z6zkaebnw1v.R.inc(303);return letezoElem(point.getX(), point.getY());
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}

    private boolean letezoElem(double x, double y) {try{__CLR4_4_16z6zkaebnw1v.R.inc(304);
        __CLR4_4_16z6zkaebnw1v.R.inc(305);return x >= 0 && x < 10 && y >= 0 && y < 10;
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}



    private boolean Lerakhato(Hajo hajo, int x, int y) {try{__CLR4_4_16z6zkaebnw1v.R.inc(306);
        __CLR4_4_16z6zkaebnw1v.R.inc(307);int hossz = hajo.nagysag;

        __CLR4_4_16z6zkaebnw1v.R.inc(308);if ((((hajo.fuggoleges)&&(__CLR4_4_16z6zkaebnw1v.R.iget(309)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(310)==0&false))) {{
            __CLR4_4_16z6zkaebnw1v.R.inc(311);for (int i = y; (((i < y + hossz)&&(__CLR4_4_16z6zkaebnw1v.R.iget(312)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(313)==0&false)); i++) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(314);if ((((!letezoElem(x, i))&&(__CLR4_4_16z6zkaebnw1v.R.iget(315)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(316)==0&false)))
                    {__CLR4_4_16z6zkaebnw1v.R.inc(317);return false;

                }__CLR4_4_16z6zkaebnw1v.R.inc(318);Cella cella = getCella(x, i);
                __CLR4_4_16z6zkaebnw1v.R.inc(319);if ((((cella.hajo != null)&&(__CLR4_4_16z6zkaebnw1v.R.iget(320)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(321)==0&false)))
                    {__CLR4_4_16z6zkaebnw1v.R.inc(322);return false;

                }__CLR4_4_16z6zkaebnw1v.R.inc(323);for (Cella szomszed : getSzomszed(x, i)) {{
                    __CLR4_4_16z6zkaebnw1v.R.inc(324);if ((((!letezoElem(x, i))&&(__CLR4_4_16z6zkaebnw1v.R.iget(325)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(326)==0&false)))
                        {__CLR4_4_16z6zkaebnw1v.R.inc(327);return false;

                    }__CLR4_4_16z6zkaebnw1v.R.inc(328);if ((((szomszed.hajo != null)&&(__CLR4_4_16z6zkaebnw1v.R.iget(329)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(330)==0&false)))
                        {__CLR4_4_16z6zkaebnw1v.R.inc(331);return false;
                }}
            }}
        }}
        }else {{
            __CLR4_4_16z6zkaebnw1v.R.inc(332);for (int i = x; (((i < x + hossz)&&(__CLR4_4_16z6zkaebnw1v.R.iget(333)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(334)==0&false)); i++) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(335);if ((((!letezoElem(i, y))&&(__CLR4_4_16z6zkaebnw1v.R.iget(336)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(337)==0&false)))
                    {__CLR4_4_16z6zkaebnw1v.R.inc(338);return false;

                }__CLR4_4_16z6zkaebnw1v.R.inc(339);Cella cella = getCella(i, y);
                __CLR4_4_16z6zkaebnw1v.R.inc(340);if ((((cella.hajo != null)&&(__CLR4_4_16z6zkaebnw1v.R.iget(341)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(342)==0&false)))
                    {__CLR4_4_16z6zkaebnw1v.R.inc(343);return false;

                }__CLR4_4_16z6zkaebnw1v.R.inc(344);for (Cella szomszed : getSzomszed(i, y)) {{
                    __CLR4_4_16z6zkaebnw1v.R.inc(345);if ((((!letezoElem(i, y))&&(__CLR4_4_16z6zkaebnw1v.R.iget(346)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(347)==0&false)))
                        {__CLR4_4_16z6zkaebnw1v.R.inc(348);return false;

                    }__CLR4_4_16z6zkaebnw1v.R.inc(349);if ((((szomszed.hajo != null)&&(__CLR4_4_16z6zkaebnw1v.R.iget(350)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(351)==0&false)))
                        {__CLR4_4_16z6zkaebnw1v.R.inc(352);return false;
                }}
            }}
        }}

        }__CLR4_4_16z6zkaebnw1v.R.inc(353);return true;
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}



    public boolean hajoLerakas(Hajo hajo, int x, int y) {try{__CLR4_4_16z6zkaebnw1v.R.inc(354);
        __CLR4_4_16z6zkaebnw1v.R.inc(355);if ((((Lerakhato(hajo, x, y))&&(__CLR4_4_16z6zkaebnw1v.R.iget(356)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(357)==0&false))) {{
            __CLR4_4_16z6zkaebnw1v.R.inc(358);int length = hajo.nagysag;

            __CLR4_4_16z6zkaebnw1v.R.inc(359);if ((((hajo.fuggoleges)&&(__CLR4_4_16z6zkaebnw1v.R.iget(360)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(361)==0&false))) {{
                __CLR4_4_16z6zkaebnw1v.R.inc(362);for (int i = y; (((i < y + length)&&(__CLR4_4_16z6zkaebnw1v.R.iget(363)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(364)==0&false)); i++) {{
                    __CLR4_4_16z6zkaebnw1v.R.inc(365);Cella cella = getCella(x, i);
                    __CLR4_4_16z6zkaebnw1v.R.inc(366);cella.hajo = hajo;
                    __CLR4_4_16z6zkaebnw1v.R.inc(367);if ((((!ellenseg)&&(__CLR4_4_16z6zkaebnw1v.R.iget(368)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(369)==0&false))) {{
                        __CLR4_4_16z6zkaebnw1v.R.inc(370);cella.setFill(Color.BROWN);
                        __CLR4_4_16z6zkaebnw1v.R.inc(371);cella.setStroke(Color.BLACK);
                    }
                }}
            }}
            }else {{
                __CLR4_4_16z6zkaebnw1v.R.inc(372);for (int i = x; (((i < x + length)&&(__CLR4_4_16z6zkaebnw1v.R.iget(373)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(374)==0&false)); i++) {{
                    __CLR4_4_16z6zkaebnw1v.R.inc(375);Cella cella = getCella(i, y);
                    __CLR4_4_16z6zkaebnw1v.R.inc(376);cella.hajo = hajo;
                    __CLR4_4_16z6zkaebnw1v.R.inc(377);if ((((!ellenseg)&&(__CLR4_4_16z6zkaebnw1v.R.iget(378)!=0|true))||(__CLR4_4_16z6zkaebnw1v.R.iget(379)==0&false))) {{
                        __CLR4_4_16z6zkaebnw1v.R.inc(380);cella.setFill(Color.BROWN);
                        __CLR4_4_16z6zkaebnw1v.R.inc(381);cella.setStroke(Color.BLACK);
                    }
                }}
            }}

            }__CLR4_4_16z6zkaebnw1v.R.inc(382);return true;
        }

        }__CLR4_4_16z6zkaebnw1v.R.inc(383);return false;
    }finally{__CLR4_4_16z6zkaebnw1v.R.flushNeeded();}}


}