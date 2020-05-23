/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Ezzel az oszt\u00e1llyal olvasunk adatokat a .json f\u00e1jlunkb\u00f3l.
 */
public class readFromJSON {public static class __CLR4_4_1v1v1kajt6ds2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u0073\u006f\u006e\u006b\u0061\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u006f\u0072\u0070\u0065\u0064\u006f\u005f\u0020\u0063\u006f\u0070\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590248969029L,8589935092L,1131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * L\u00e9trehozzunk a {@Code beolvasLista}beolvasListat, amibe majd beolvassuk az adatokat.
     */
    public static JSONArray beolvasLista;
    public static ArrayList<String> lepesek = new ArrayList<>();
    public static ArrayList<String> jatekos = new ArrayList<>();

    /**
     * Ez a beolvas met\u00f3dusunk, itt fogjuk l\u00e9trehozni a <Code>reader</Code> -t aminek
     * megadjuk a f\u00e1jlt, hogy mib\u0151l olvasson majd.
     * Majd az <Code>obj</Code>-be berakjuk f\u00e1jl tartalmat,
     * ezt a <Code>beolvasLista</Code>-ba Array-\u00e9 \u00e1talak\u00edtva berakjuk.
     * A v\u00e9g\u00e9n megh\u00edvjuk a list\u00e1nkra a listPartimg() met\u00f3dust, ami majd felbontja ezt.
     *
     */
    public static void beolvas()
    {try{__CLR4_4_1v1v1kajt6ds2.R.inc(1117);
        __CLR4_4_1v1v1kajt6ds2.R.inc(1118);JSONParser jsonParser = new JSONParser();

        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1v1v1kajt6ds2.R.inc(1119);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1v1v1kajt6ds2.R.inc(1120);}};FileReader reader = new FileReader("tablazat.json"))
        {

            __CLR4_4_1v1v1kajt6ds2.R.inc(1121);Object obj = jsonParser.parse(reader);

            __CLR4_4_1v1v1kajt6ds2.R.inc(1122);beolvasLista = (JSONArray) obj;

            __CLR4_4_1v1v1kajt6ds2.R.inc(1123);beolvasLista.forEach( emp -> listParting( (JSONObject) emp ) );

        } catch (ParseException | IOException e) {
            __CLR4_4_1v1v1kajt6ds2.R.inc(1124);e.printStackTrace();
        }


    }finally{__CLR4_4_1v1v1kajt6ds2.R.flushNeeded();}}

    /**
     * A listParting met\u00f3dus arra lesz j\u00f3, hogy a m\u00e1r beolvasott list\u00e1nkat, sz\u00e9tszedj\u00fck, k\u00e9t darab ArrayListre,
     * a <Code>jatekos</Code>-ba fog ker\u00fclni a J\u00e1t\u00e9kos adatok, vagyis az, hogy Ellens\u00e9g vagy J\u00e1t\u00e9kos.
     * A <Code>lepesek</Code>-be viszont az j\u00e1t\u00e9kos l\u00e9pse.
     * Ez az\u00e9rt van, hogy k\u00e9s\u0151bbiekben ezekre az adatokra k\u00f6nnyebben lehessen hivatkozni.
     * @param jatekosLepes
     */
    public static void listParting(JSONObject jatekosLepes)
    {try{__CLR4_4_1v1v1kajt6ds2.R.inc(1125);
        //Get employee object within list
        __CLR4_4_1v1v1kajt6ds2.R.inc(1126);JSONObject listaObject = (JSONObject) jatekosLepes.get("Action");

        //Get employee first name
        __CLR4_4_1v1v1kajt6ds2.R.inc(1127);String jatekosnev = (String) listaObject.get("Jatekos");
        __CLR4_4_1v1v1kajt6ds2.R.inc(1128);jatekos.add(jatekosnev);


        //Get employee last name
        __CLR4_4_1v1v1kajt6ds2.R.inc(1129);String jatekoslepes = (String) listaObject.get("lepes");
        __CLR4_4_1v1v1kajt6ds2.R.inc(1130);lepesek.add(jatekoslepes);

    }finally{__CLR4_4_1v1v1kajt6ds2.R.flushNeeded();}}
/*
    public static void kiakarokirni(){
        System.out.println(beolvasLista);
        int sizeer = beolvasLista.size()/2;
        System.out.println(sizeer);

        System.out.println(Pelda.lepes);

    }
    */

}
