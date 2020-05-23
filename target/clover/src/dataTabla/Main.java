/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Main {public static class __CLR4_4_1bcbckaji58ri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590230440115L,8589935092L,435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static JSONArray adatok = new JSONArray();

    public static void main(String[] args)  {try{__CLR4_4_1bcbckaji58ri.R.inc(408);

    }finally{__CLR4_4_1bcbckaji58ri.R.flushNeeded();}}



    public static void ujtablaadat() {try{__CLR4_4_1bcbckaji58ri.R.inc(409);
        __CLR4_4_1bcbckaji58ri.R.inc(410);String jatekosLep = Pelda.xyJ;
        __CLR4_4_1bcbckaji58ri.R.inc(411);String ellensegLep = Pelda.xyE;


        __CLR4_4_1bcbckaji58ri.R.inc(412);if((((Pelda.jatekoslepese )&&(__CLR4_4_1bcbckaji58ri.R.iget(413)!=0|true))||(__CLR4_4_1bcbckaji58ri.R.iget(414)==0&false))) {{


            __CLR4_4_1bcbckaji58ri.R.inc(415);JSONObject lepesek = new JSONObject();
            __CLR4_4_1bcbckaji58ri.R.inc(416);lepesek.put("Jatekos","jatekos");
            __CLR4_4_1bcbckaji58ri.R.inc(417);lepesek.put("lepes",jatekosLep);
            __CLR4_4_1bcbckaji58ri.R.inc(418);JSONObject employeeObject = new JSONObject();
            __CLR4_4_1bcbckaji58ri.R.inc(419);employeeObject.put("Action", lepesek);

            __CLR4_4_1bcbckaji58ri.R.inc(420);adatok.add(employeeObject);

            __CLR4_4_1bcbckaji58ri.R.inc(421);ujkiiras();

        }
        }else{{
            __CLR4_4_1bcbckaji58ri.R.inc(422);JSONObject lepesek = new JSONObject();
            __CLR4_4_1bcbckaji58ri.R.inc(423);lepesek.put("Jatekos","Ellenseg");
            __CLR4_4_1bcbckaji58ri.R.inc(424);lepesek.put("lepes",ellensegLep);
            __CLR4_4_1bcbckaji58ri.R.inc(425);JSONObject employeeObject = new JSONObject();
            __CLR4_4_1bcbckaji58ri.R.inc(426);employeeObject.put("Action", lepesek);

            __CLR4_4_1bcbckaji58ri.R.inc(427);adatok.add(employeeObject);
            __CLR4_4_1bcbckaji58ri.R.inc(428);ujkiiras();
        }


    }}finally{__CLR4_4_1bcbckaji58ri.R.flushNeeded();}}

    public static void ujkiiras()  {try{__CLR4_4_1bcbckaji58ri.R.inc(429);

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1bcbckaji58ri.R.inc(430);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1bcbckaji58ri.R.inc(431);}};FileWriter file = new FileWriter("tablazat.json")) {

            __CLR4_4_1bcbckaji58ri.R.inc(432);file.write(adatok.toJSONString());
            __CLR4_4_1bcbckaji58ri.R.inc(433);file.flush();

        } catch (IOException e) {
            __CLR4_4_1bcbckaji58ri.R.inc(434);e.printStackTrace();
        }
    }finally{__CLR4_4_1bcbckaji58ri.R.flushNeeded();}}


    }

