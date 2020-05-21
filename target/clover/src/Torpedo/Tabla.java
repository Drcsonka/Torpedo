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

public class Tabla extends Parent {public static class __CLR4_4_1hnhnkags3s0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590065769419L,8589935092L,768,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private VBox sorok = new VBox();
    private boolean ellenseg = false;

    public int hajok = 5;

    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {try{__CLR4_4_1hnhnkags3s0b.R.inc(635);
        __CLR4_4_1hnhnkags3s0b.R.inc(636);this.ellenseg= ellenseg;
        __CLR4_4_1hnhnkags3s0b.R.inc(637);for (int y = 0; (((y < 10)&&(__CLR4_4_1hnhnkags3s0b.R.iget(638)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(639)==0&false)); y++) {{
            __CLR4_4_1hnhnkags3s0b.R.inc(640);HBox sor = new HBox();
            __CLR4_4_1hnhnkags3s0b.R.inc(641);Label text1 = new Label ("TT");
            __CLR4_4_1hnhnkags3s0b.R.inc(642);for (int x = 0; (((x < 10)&&(__CLR4_4_1hnhnkags3s0b.R.iget(643)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(644)==0&false)); x++) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(645);Cella c = new Cella(x, y, this);
                __CLR4_4_1hnhnkags3s0b.R.inc(646);c.setOnMouseClicked(handler);
                __CLR4_4_1hnhnkags3s0b.R.inc(647);sor.getChildren().add(c);

            }

            }__CLR4_4_1hnhnkags3s0b.R.inc(648);sorok.getChildren().add(sor);
        }

        }__CLR4_4_1hnhnkags3s0b.R.inc(649);getChildren().add(sorok);
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private Tabla tabla;

        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);__CLR4_4_1hnhnkags3s0b.R.inc(651);try{__CLR4_4_1hnhnkags3s0b.R.inc(650);
            __CLR4_4_1hnhnkags3s0b.R.inc(652);this.x = x;
            __CLR4_4_1hnhnkags3s0b.R.inc(653);this.y = y;
            __CLR4_4_1hnhnkags3s0b.R.inc(654);this.tabla = tabla;
            __CLR4_4_1hnhnkags3s0b.R.inc(655);setFill(Color.LIGHTSKYBLUE);
            __CLR4_4_1hnhnkags3s0b.R.inc(656);setStroke(Color.BLACK);

        }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}

        public boolean loves() {try{__CLR4_4_1hnhnkags3s0b.R.inc(657);
            __CLR4_4_1hnhnkags3s0b.R.inc(658);if( (((Pelda.jatekVege == true)&&(__CLR4_4_1hnhnkags3s0b.R.iget(659)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(660)==0&false)))
            {{
                __CLR4_4_1hnhnkags3s0b.R.inc(661);return false;
            }
            }__CLR4_4_1hnhnkags3s0b.R.inc(662);wasShot = true;
            __CLR4_4_1hnhnkags3s0b.R.inc(663);setFill(Color.BLACK);

            __CLR4_4_1hnhnkags3s0b.R.inc(664);if ((((hajo != null)&&(__CLR4_4_1hnhnkags3s0b.R.iget(665)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(666)==0&false))) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(667);hajo.talalat();
                __CLR4_4_1hnhnkags3s0b.R.inc(668);setFill(Color.RED);
                __CLR4_4_1hnhnkags3s0b.R.inc(669);if ((((!hajo.El())&&(__CLR4_4_1hnhnkags3s0b.R.iget(670)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(671)==0&false))) {{
                    __CLR4_4_1hnhnkags3s0b.R.inc(672);tabla.hajok--;
                }
                }__CLR4_4_1hnhnkags3s0b.R.inc(673);return true;
            }

            }__CLR4_4_1hnhnkags3s0b.R.inc(674);return false;
        }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}
    }

    public Cella getCella(int x, int y) {try{__CLR4_4_1hnhnkags3s0b.R.inc(675);
        __CLR4_4_1hnhnkags3s0b.R.inc(676);return (Cella)((HBox)sorok.getChildren().get(y)).getChildren().get(x);
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}



    private Cella[] getSzomszed(int x, int y) {try{__CLR4_4_1hnhnkags3s0b.R.inc(677);
        __CLR4_4_1hnhnkags3s0b.R.inc(678);Point2D[] points = new Point2D[] {
                new Point2D(x - 1, y),
                new Point2D(x + 1, y),
                new Point2D(x, y - 1),
                new Point2D(x, y + 1)
        };

        __CLR4_4_1hnhnkags3s0b.R.inc(679);List<Cella> szomszedok = new ArrayList<Cella>();

        __CLR4_4_1hnhnkags3s0b.R.inc(680);for (Point2D p : points) {{
            __CLR4_4_1hnhnkags3s0b.R.inc(681);if ((((letezoElem(p))&&(__CLR4_4_1hnhnkags3s0b.R.iget(682)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(683)==0&false))) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(684);szomszedok.add(getCella((int)p.getX(), (int)p.getY()));
            }
        }}

        }__CLR4_4_1hnhnkags3s0b.R.inc(685);return szomszedok.toArray(new Cella[0]);
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}



    private boolean letezoElem(Point2D point) {try{__CLR4_4_1hnhnkags3s0b.R.inc(686);
        __CLR4_4_1hnhnkags3s0b.R.inc(687);return letezoElem(point.getX(), point.getY());
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}

    private boolean letezoElem(double x, double y) {try{__CLR4_4_1hnhnkags3s0b.R.inc(688);
        __CLR4_4_1hnhnkags3s0b.R.inc(689);return x >= 0 && x < 10 && y >= 0 && y < 10;
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}



    private boolean Lerakhato(Hajo hajo, int x, int y) {try{__CLR4_4_1hnhnkags3s0b.R.inc(690);
        __CLR4_4_1hnhnkags3s0b.R.inc(691);int hossz = hajo.nagysag;

        __CLR4_4_1hnhnkags3s0b.R.inc(692);if ((((hajo.fuggoleges)&&(__CLR4_4_1hnhnkags3s0b.R.iget(693)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(694)==0&false))) {{
            __CLR4_4_1hnhnkags3s0b.R.inc(695);for (int i = y; (((i < y + hossz)&&(__CLR4_4_1hnhnkags3s0b.R.iget(696)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(697)==0&false)); i++) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(698);if ((((!letezoElem(x, i))&&(__CLR4_4_1hnhnkags3s0b.R.iget(699)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(700)==0&false)))
                    {__CLR4_4_1hnhnkags3s0b.R.inc(701);return false;

                }__CLR4_4_1hnhnkags3s0b.R.inc(702);Cella cella = getCella(x, i);
                __CLR4_4_1hnhnkags3s0b.R.inc(703);if ((((cella.hajo != null)&&(__CLR4_4_1hnhnkags3s0b.R.iget(704)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(705)==0&false)))
                    {__CLR4_4_1hnhnkags3s0b.R.inc(706);return false;

                }__CLR4_4_1hnhnkags3s0b.R.inc(707);for (Cella szomszed : getSzomszed(x, i)) {{
                    __CLR4_4_1hnhnkags3s0b.R.inc(708);if ((((!letezoElem(x, i))&&(__CLR4_4_1hnhnkags3s0b.R.iget(709)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(710)==0&false)))
                        {__CLR4_4_1hnhnkags3s0b.R.inc(711);return false;

                    }__CLR4_4_1hnhnkags3s0b.R.inc(712);if ((((szomszed.hajo != null)&&(__CLR4_4_1hnhnkags3s0b.R.iget(713)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(714)==0&false)))
                        {__CLR4_4_1hnhnkags3s0b.R.inc(715);return false;
                }}
            }}
        }}
        }else {{
            __CLR4_4_1hnhnkags3s0b.R.inc(716);for (int i = x; (((i < x + hossz)&&(__CLR4_4_1hnhnkags3s0b.R.iget(717)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(718)==0&false)); i++) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(719);if ((((!letezoElem(i, y))&&(__CLR4_4_1hnhnkags3s0b.R.iget(720)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(721)==0&false)))
                    {__CLR4_4_1hnhnkags3s0b.R.inc(722);return false;

                }__CLR4_4_1hnhnkags3s0b.R.inc(723);Cella cella = getCella(i, y);
                __CLR4_4_1hnhnkags3s0b.R.inc(724);if ((((cella.hajo != null)&&(__CLR4_4_1hnhnkags3s0b.R.iget(725)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(726)==0&false)))
                    {__CLR4_4_1hnhnkags3s0b.R.inc(727);return false;

                }__CLR4_4_1hnhnkags3s0b.R.inc(728);for (Cella szomszed : getSzomszed(i, y)) {{
                    __CLR4_4_1hnhnkags3s0b.R.inc(729);if ((((!letezoElem(i, y))&&(__CLR4_4_1hnhnkags3s0b.R.iget(730)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(731)==0&false)))
                        {__CLR4_4_1hnhnkags3s0b.R.inc(732);return false;

                    }__CLR4_4_1hnhnkags3s0b.R.inc(733);if ((((szomszed.hajo != null)&&(__CLR4_4_1hnhnkags3s0b.R.iget(734)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(735)==0&false)))
                        {__CLR4_4_1hnhnkags3s0b.R.inc(736);return false;
                }}
            }}
        }}

        }__CLR4_4_1hnhnkags3s0b.R.inc(737);return true;
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}



    public boolean hajoLerakas(Hajo hajo, int x, int y) {try{__CLR4_4_1hnhnkags3s0b.R.inc(738);
        __CLR4_4_1hnhnkags3s0b.R.inc(739);if ((((Lerakhato(hajo, x, y))&&(__CLR4_4_1hnhnkags3s0b.R.iget(740)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(741)==0&false))) {{
            __CLR4_4_1hnhnkags3s0b.R.inc(742);int length = hajo.nagysag;

            __CLR4_4_1hnhnkags3s0b.R.inc(743);if ((((hajo.fuggoleges)&&(__CLR4_4_1hnhnkags3s0b.R.iget(744)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(745)==0&false))) {{
                __CLR4_4_1hnhnkags3s0b.R.inc(746);for (int i = y; (((i < y + length)&&(__CLR4_4_1hnhnkags3s0b.R.iget(747)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(748)==0&false)); i++) {{
                    __CLR4_4_1hnhnkags3s0b.R.inc(749);Cella cella = getCella(x, i);
                    __CLR4_4_1hnhnkags3s0b.R.inc(750);cella.hajo = hajo;
                    __CLR4_4_1hnhnkags3s0b.R.inc(751);if ((((!ellenseg)&&(__CLR4_4_1hnhnkags3s0b.R.iget(752)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(753)==0&false))) {{
                        __CLR4_4_1hnhnkags3s0b.R.inc(754);cella.setFill(Color.BROWN);
                        __CLR4_4_1hnhnkags3s0b.R.inc(755);cella.setStroke(Color.BLACK);
                    }
                }}
            }}
            }else {{
                __CLR4_4_1hnhnkags3s0b.R.inc(756);for (int i = x; (((i < x + length)&&(__CLR4_4_1hnhnkags3s0b.R.iget(757)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(758)==0&false)); i++) {{
                    __CLR4_4_1hnhnkags3s0b.R.inc(759);Cella cella = getCella(i, y);
                    __CLR4_4_1hnhnkags3s0b.R.inc(760);cella.hajo = hajo;
                    __CLR4_4_1hnhnkags3s0b.R.inc(761);if ((((!ellenseg)&&(__CLR4_4_1hnhnkags3s0b.R.iget(762)!=0|true))||(__CLR4_4_1hnhnkags3s0b.R.iget(763)==0&false))) {{
                        __CLR4_4_1hnhnkags3s0b.R.inc(764);cella.setFill(Color.BROWN);
                        __CLR4_4_1hnhnkags3s0b.R.inc(765);cella.setStroke(Color.BLACK);
                    }
                }}
            }}

            }__CLR4_4_1hnhnkags3s0b.R.inc(766);return true;
        }

        }__CLR4_4_1hnhnkags3s0b.R.inc(767);return false;
    }finally{__CLR4_4_1hnhnkags3s0b.R.flushNeeded();}}


}