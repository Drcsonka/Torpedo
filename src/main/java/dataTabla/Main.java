package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Main {
    static JSONArray adatok = new JSONArray();

    public static void main(String[] args)  {

    }



    public static void ujtablaadat() {
        String jatekosLep = Pelda.xyJ;
        String ellensegLep = Pelda.xyE;


        if(Pelda.jatekoslepese ) {


            JSONObject lepesek = new JSONObject();
            lepesek.put("Jatekos","jatekos");
            lepesek.put("lepes",jatekosLep);
            JSONObject employeeObject = new JSONObject();
            employeeObject.put("Action", lepesek);

            adatok.add(employeeObject);

            ujkiiras();

        }
        else{
            JSONObject lepesek = new JSONObject();
            lepesek.put("Jatekos","Ellenseg");
            lepesek.put("lepes",ellensegLep);
            JSONObject employeeObject = new JSONObject();
            employeeObject.put("Action", lepesek);

            adatok.add(employeeObject);
            ujkiiras();
        }


    }

    public static void ujkiiras()  {

        try (FileWriter file = new FileWriter("tablazat.json")) {

            file.write(adatok.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }

