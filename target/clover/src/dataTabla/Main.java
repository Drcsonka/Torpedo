/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataTabla;

import Torpedo.Pelda;
import Torpedo.Tabla;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {public static class __CLR4_4_11al1alkaivsm6h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590192899444L,8589935092L,1726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //static Tablazat tablazat = new Tablazat();
    //static Tablazat tablaadatJ = new Tablazat();

   // static ArrayList<jatekosok> jatekosok = new ArrayList<>();
   // static ArrayList<lepesek> lepesek = new ArrayList<>();

    //static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static JSONArray adatok = new JSONArray();

    public static void main(String[] args) throws Exception {try{__CLR4_4_11al1alkaivsm6h.R.inc(1677);

        /*
        int lepesSzamlalo =0;
        if( lepesSzamlalo != Pelda.lepes){
            ujtablaadat();
            lepesSzamlalo++;
        }


        try (FileWriter writer = new FileWriter("tablazat.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(tablazat, writer);;

        }*/
    }finally{__CLR4_4_11al1alkaivsm6h.R.flushNeeded();}}



    public static void ujtablaadat() throws IOException {try{__CLR4_4_11al1alkaivsm6h.R.inc(1678);
        __CLR4_4_11al1alkaivsm6h.R.inc(1679);String jatekosLep = Pelda.xyJ;
        __CLR4_4_11al1alkaivsm6h.R.inc(1680);String ellensegLep = Pelda.xyE;

        __CLR4_4_11al1alkaivsm6h.R.inc(1681);String jatekos = "jatekos";
        __CLR4_4_11al1alkaivsm6h.R.inc(1682);String ellenseg = "ellenseg";
        //Tablazat tablaadat = new Tablazat(jatekosLep,ellensegLep);

        __CLR4_4_11al1alkaivsm6h.R.inc(1683);if((((Pelda.jatekoslepese )&&(__CLR4_4_11al1alkaivsm6h.R.iget(1684)!=0|true))||(__CLR4_4_11al1alkaivsm6h.R.iget(1685)==0&false))) {{
            //jatekosok.add(new jatekosok("Jatekos"));
            //lepesek.add(new lepesek(jatekosLep));
            //Tablazat tablaadatJ = new Tablazat(jatekos,jatekosLep);
            //Tablazat tablaadatJ = new Tablazat();

            //tablaadatJ.setJatekos(jatekos);
            //tablaadatJ.setLovesek(jatekosLep);


            //ujkiiras(tablaadatJ);
            /*
            Tablazat user = new Tablazat("Tom Smith", "American");
            ujkiiras(user);
            System.out.println("Working");
               Gson gson = new GsonBuilder().create();
                gson.toJson(user, new FileWriter("tablazat.json"));
                */

            __CLR4_4_11al1alkaivsm6h.R.inc(1686);JSONObject lepesek = new JSONObject();
            __CLR4_4_11al1alkaivsm6h.R.inc(1687);lepesek.put("Jatekos","jatekos");
            __CLR4_4_11al1alkaivsm6h.R.inc(1688);lepesek.put("lepes",jatekosLep);
            __CLR4_4_11al1alkaivsm6h.R.inc(1689);JSONObject employeeObject = new JSONObject();
            __CLR4_4_11al1alkaivsm6h.R.inc(1690);employeeObject.put("Action", lepesek);

            __CLR4_4_11al1alkaivsm6h.R.inc(1691);adatok.add(employeeObject);

            __CLR4_4_11al1alkaivsm6h.R.inc(1692);ujkiiras();

        }
        }else{{

            //jatekosok.add(new jatekosok("Ellenseg"));
            //lepesek.add(new lepesek(ellensegLep));

            //Tablazat tablaadatE = new Tablazat(ellenseg,ellensegLep);

            //Gson gson = new GsonBuilder().create();
            //gson.toJson(tablaadatE, new FileWriter("tablazat.json"));

            //gson.toString(1);

            __CLR4_4_11al1alkaivsm6h.R.inc(1693);JSONObject lepesek = new JSONObject();
            __CLR4_4_11al1alkaivsm6h.R.inc(1694);lepesek.put("Jatekos","Ellenseg");
            __CLR4_4_11al1alkaivsm6h.R.inc(1695);lepesek.put("lepes",ellensegLep);
            __CLR4_4_11al1alkaivsm6h.R.inc(1696);JSONObject employeeObject = new JSONObject();
            __CLR4_4_11al1alkaivsm6h.R.inc(1697);employeeObject.put("Action", lepesek);

            __CLR4_4_11al1alkaivsm6h.R.inc(1698);adatok.add(employeeObject);
            __CLR4_4_11al1alkaivsm6h.R.inc(1699);ujkiiras();
        }


    }}finally{__CLR4_4_11al1alkaivsm6h.R.flushNeeded();}}

    public static void ujkiiras() throws IOException {try{__CLR4_4_11al1alkaivsm6h.R.inc(1700);

        //FileWriter writer = new FileWriter("tablazat.json");
        //Gson gson = new GsonBuilder().create();
         //gson.toJson(tablazat, writer);
       // System.out.println("Not working");

/*
        try (FileWriter writer = new FileWriter("tablazat.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(tablazat, writer);

        }*/

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_11al1alkaivsm6h.R.inc(1701);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_11al1alkaivsm6h.R.inc(1702);}};FileWriter file = new FileWriter("tablazat.json")) {

            __CLR4_4_11al1alkaivsm6h.R.inc(1703);file.write(adatok.toJSONString());
            __CLR4_4_11al1alkaivsm6h.R.inc(1704);file.flush();

        } catch (IOException e) {
            __CLR4_4_11al1alkaivsm6h.R.inc(1705);e.printStackTrace();
        }
    }finally{__CLR4_4_11al1alkaivsm6h.R.flushNeeded();}}
    public HashMap<String, String> myMethodName() throws FileNotFoundException
    {try{__CLR4_4_11al1alkaivsm6h.R.inc(1706);
        __CLR4_4_11al1alkaivsm6h.R.inc(1707);String path = "tablazat.json";
        __CLR4_4_11al1alkaivsm6h.R.inc(1708);BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        __CLR4_4_11al1alkaivsm6h.R.inc(1709);Gson gson = new Gson();
        __CLR4_4_11al1alkaivsm6h.R.inc(1710);HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        __CLR4_4_11al1alkaivsm6h.R.inc(1711);return json;
    }finally{__CLR4_4_11al1alkaivsm6h.R.flushNeeded();}}

    public static void beolvas() throws IOException, ParseException {try{__CLR4_4_11al1alkaivsm6h.R.inc(1712);

        __CLR4_4_11al1alkaivsm6h.R.inc(1713);JSONParser parser = new JSONParser();
        __CLR4_4_11al1alkaivsm6h.R.inc(1714);JSONArray a = (JSONArray) parser.parse(new FileReader("tablazat.json"));

        __CLR4_4_11al1alkaivsm6h.R.inc(1715);for (Object o : a)
        {{
            __CLR4_4_11al1alkaivsm6h.R.inc(1716);JSONObject jatek = (JSONObject) o;

            __CLR4_4_11al1alkaivsm6h.R.inc(1717);String name = (String) jatek.get("name");
            __CLR4_4_11al1alkaivsm6h.R.inc(1718);System.out.println(name);

            __CLR4_4_11al1alkaivsm6h.R.inc(1719);String city = (String) jatek.get("city");
            __CLR4_4_11al1alkaivsm6h.R.inc(1720);System.out.println(city);

            __CLR4_4_11al1alkaivsm6h.R.inc(1721);String job = (String) jatek.get("job");
            __CLR4_4_11al1alkaivsm6h.R.inc(1722);System.out.println(job);

            __CLR4_4_11al1alkaivsm6h.R.inc(1723);JSONArray cars = (JSONArray) jatek.get("cars");

            __CLR4_4_11al1alkaivsm6h.R.inc(1724);for (Object c : cars)
            {{
                __CLR4_4_11al1alkaivsm6h.R.inc(1725);System.out.println(c+"");
            }
        }}
    }}finally{__CLR4_4_11al1alkaivsm6h.R.flushNeeded();}}
}
