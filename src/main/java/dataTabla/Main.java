package dataTabla;

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

public class Main {
    //static Tablazat tablazat = new Tablazat();
    //static Tablazat tablaadatJ = new Tablazat();

   // static ArrayList<jatekosok> jatekosok = new ArrayList<>();
   // static ArrayList<lepesek> lepesek = new ArrayList<>();

    //static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    

    public static void main(String[] args) throws Exception {

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
    }



    public static void ujtablaadat() throws IOException {
        String jatekosLep = Pelda.xyJ;
        String ellensegLep = Pelda.xyE;

        String jatekos = "jatekos";
        String ellenseg = "ellenseg";
        //Tablazat tablaadat = new Tablazat(jatekosLep,ellensegLep);

        if(Pelda.jatekoslepese ) {
            //jatekosok.add(new jatekosok("Jatekos"));
            //lepesek.add(new lepesek(jatekosLep));
            //Tablazat tablaadatJ = new Tablazat(jatekos,jatekosLep);
            //Tablazat tablaadatJ = new Tablazat();

            //tablaadatJ.setJatekos(jatekos);
            //tablaadatJ.setLovesek(jatekosLep);


            //ujkiiras(tablaadatJ);
            Tablazat user = new Tablazat("Tom Smith", "American");
            ujkiiras(user);
            System.out.println("Working");
               Gson gson = new GsonBuilder().create();
                gson.toJson(user, new FileWriter("tablazat.json"));

        }
        else{

            //jatekosok.add(new jatekosok("Ellenseg"));
            //lepesek.add(new lepesek(ellensegLep));

            //Tablazat tablaadatE = new Tablazat(ellenseg,ellensegLep);

            //Gson gson = new GsonBuilder().create();
            //gson.toJson(tablaadatE, new FileWriter("tablazat.json"));

            //gson.toString(1);
        }

    }

    public static void ujkiiras(Tablazat tablazat) throws IOException {

        //FileWriter writer = new FileWriter("tablazat.json");
        //Gson gson = new GsonBuilder().create();
         //gson.toJson(tablazat, writer);
       // System.out.println("Not working");


        try (FileWriter writer = new FileWriter("tablazat.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(tablazat, writer);

        }
    }
    public HashMap<String, String> myMethodName() throws FileNotFoundException
    {
        String path = "tablazat.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        Gson gson = new Gson();
        HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }

    public static void beolvas() throws IOException, ParseException {

        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader("tablazat.json"));

        for (Object o : a)
        {
            JSONObject jatek = (JSONObject) o;

            String name = (String) jatek.get("name");
            System.out.println(name);

            String city = (String) jatek.get("city");
            System.out.println(city);

            String job = (String) jatek.get("job");
            System.out.println(job);

            JSONArray cars = (JSONArray) jatek.get("cars");

            for (Object c : cars)
            {
                System.out.println(c+"");
            }
        }
    }
}
