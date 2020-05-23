/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFromJSON {public static class __CLR4_4_1cecekajoh2q4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590241069679L,8589935092L,465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static JSONArray employeeList;
    public static ArrayList<String> lepesek = new ArrayList<>();
    public static ArrayList<String> jatekos = new ArrayList<>();
    public static void beolvas()
    {try{__CLR4_4_1cecekajoh2q4.R.inc(446);
        //JSON parser object to parse read file
        __CLR4_4_1cecekajoh2q4.R.inc(447);JSONParser jsonParser = new JSONParser();

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1cecekajoh2q4.R.inc(448);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1cecekajoh2q4.R.inc(449);}};FileReader reader = new FileReader("tablazat.json"))
        {

            __CLR4_4_1cecekajoh2q4.R.inc(450);Object obj = jsonParser.parse(reader);

            __CLR4_4_1cecekajoh2q4.R.inc(451);employeeList = (JSONArray) obj;

            __CLR4_4_1cecekajoh2q4.R.inc(452);employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (ParseException | IOException e) {
            __CLR4_4_1cecekajoh2q4.R.inc(453);e.printStackTrace();
        }


    }finally{__CLR4_4_1cecekajoh2q4.R.flushNeeded();}}
    public static void parseEmployeeObject(JSONObject employee)
    {try{__CLR4_4_1cecekajoh2q4.R.inc(454);
        //Get employee object within list
        __CLR4_4_1cecekajoh2q4.R.inc(455);JSONObject employeeObject = (JSONObject) employee.get("Action");

        //Get employee first name
        __CLR4_4_1cecekajoh2q4.R.inc(456);String firstName = (String) employeeObject.get("Jatekos");
        __CLR4_4_1cecekajoh2q4.R.inc(457);jatekos.add(firstName);


        //Get employee last name
        __CLR4_4_1cecekajoh2q4.R.inc(458);String lastName = (String) employeeObject.get("lepes");
        __CLR4_4_1cecekajoh2q4.R.inc(459);lepesek.add(lastName);

    }finally{__CLR4_4_1cecekajoh2q4.R.flushNeeded();}}

    public static void kiakarokirni(){try{__CLR4_4_1cecekajoh2q4.R.inc(460);
        __CLR4_4_1cecekajoh2q4.R.inc(461);System.out.println(employeeList);
        __CLR4_4_1cecekajoh2q4.R.inc(462);int sizeer = employeeList.size()/2;
        __CLR4_4_1cecekajoh2q4.R.inc(463);System.out.println(sizeer);

        __CLR4_4_1cecekajoh2q4.R.inc(464);System.out.println(Pelda.lepes);



    }finally{__CLR4_4_1cecekajoh2q4.R.flushNeeded();}}

}