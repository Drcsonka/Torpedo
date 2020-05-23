package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

/**
 * Ebben a classban fogunk Json fileba írni.
 * az elején már létre is hozzuk az <Code>adatok</Code>-at  amik JSONArray típusú lesz,
 * és ebbe fognak bekerülni majd a.
 */
public class writeToJSON {
    static JSONArray adatok = new JSONArray();

    /**
     * Az ujtablaadat() metódusunk az egyik játékos által leadott lövés koordinátáit,
     * és a játékos adatát vagyis, a játékosunk vagy az ellenség lőtt-e.
     * Majd ezeket átveszi a Torpedo.Példa class-ból és berakja egy JSONObjectumba, amit majd hozzáad
     * az előbb definiált <Code>adatok</Code>-ba.
     * Az if-else azért van hogy megvizsgáljuk, hogy a játékos vagy az Ellenség lőtt-e
     */
    public static void ujtablaadat() {
        String jatekosLep = Pelda.xyJ;
        String ellensegLep = Pelda.xyE;


        if(Pelda.jatekoslepese ) {


            JSONObject lepesek = new JSONObject();
            lepesek.put("Jatekos","Jatekos");
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

    /**
     *Ezt a metódust az új táblaadatok után hívjom meg.
     * Itt létrehozunk egy FileWriter-t ami a "tablazat.json"-re fog mutatni, mivel
     * ebbe a fájlba akarunk majd írni.
     * Majd a write-al az <Code>adatok</Code> Arrayunket beletoltjuk a fájlba.
     */
    public static void ujkiiras()  {

        try (FileWriter file = new FileWriter("tablazat.json")) {

            file.write(adatok.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }

