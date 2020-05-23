/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataTabla;

import javafx.beans.property.SimpleStringProperty;

/**
 * Oszt\u00e1ly amely majd a j\u00e1t\u00e9kost \u00e9s a l\u00e9p\u00e9s\u00e9t adja vissza a t\u00e1blaadathoz.
 */

public class jatekosLepes {public static class __CLR4_4_1kzkzkajrdgrr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590245940451L,8589935092L,766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * A j\u00e1t\u00e9kos neve \u00e9s l\u00e9p\u00e9se.
     */
        private final SimpleStringProperty jatekosNev;
        private final SimpleStringProperty lepesek;

    /**
     * L\u00e9trehozza a j\u00e1t\u00e9kosl\u00e9p\u00e9s oszt\u00e1lyt amit az FXML t\u00e1bl\u00e1ba fogunk berakni.
     * @param jatekosNev A j\u00e1t\u00e9kos nev\u00e9t adja meg.
     * @param lepesek A j\u00e1t\u00e9kos l\u00e9p\u00e9s\u00e9t adja meg.
     */
    public jatekosLepes(String jatekosNev, String lepesek){try{__CLR4_4_1kzkzkajrdgrr.R.inc(755);
            __CLR4_4_1kzkzkajrdgrr.R.inc(756);this.jatekosNev = new SimpleStringProperty(jatekosNev);
            __CLR4_4_1kzkzkajrdgrr.R.inc(757);this.lepesek = new SimpleStringProperty(lepesek);
        }finally{__CLR4_4_1kzkzkajrdgrr.R.flushNeeded();}}

    /**
     * A j\u00e1t\u00e9kos nev\u00e9t visszaad\u00f3 met\u00f3dus.
     */
    public String getJatekosNev(){try{__CLR4_4_1kzkzkajrdgrr.R.inc(758);
            __CLR4_4_1kzkzkajrdgrr.R.inc(759);return jatekosNev.get();
        }finally{__CLR4_4_1kzkzkajrdgrr.R.flushNeeded();}}
    /**
     * A j\u00e1t\u00e9kos nev\u00e9t be\u00e1ll\u00edt\u00f3 met\u00f3dus.
     */
        public void setJatekosNev(String jatekosNev){try{__CLR4_4_1kzkzkajrdgrr.R.inc(760);
            __CLR4_4_1kzkzkajrdgrr.R.inc(761);this.jatekosNev.set(jatekosNev);
        }finally{__CLR4_4_1kzkzkajrdgrr.R.flushNeeded();}}
    /**
     * A j\u00e1t\u00e9kos l\u00e9p\u00e9s\u00e9t visszaad\u00f3 met\u00f3dus.
     */
        public String getLepesek(){try{__CLR4_4_1kzkzkajrdgrr.R.inc(762);
            __CLR4_4_1kzkzkajrdgrr.R.inc(763);return lepesek.get();
        }finally{__CLR4_4_1kzkzkajrdgrr.R.flushNeeded();}}
    /**
     * A j\u00e1t\u00e9kos nev\u00e9t be\u00e1ll\u00edt\u00f3 met\u00f3dus.
     */
        public void setLepesek(String lepesek){try{__CLR4_4_1kzkzkajrdgrr.R.inc(764);

            __CLR4_4_1kzkzkajrdgrr.R.inc(765);this.lepesek.set(lepesek);
        }finally{__CLR4_4_1kzkzkajrdgrr.R.flushNeeded();}}


}
