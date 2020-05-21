package dataTabla;

import Torpedo.Pelda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static Tablazat tablazat = new Tablazat();
    static ArrayList<jatekosok> jatekosok = new ArrayList<>();
    static ArrayList<lepesek> lepesek = new ArrayList<>();
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



    public static void ujtablaadat(){
        String jatekosLep = Pelda.xyJ;
        String ellensegLep = Pelda.xyE;

        if(Pelda.jatekoslepese ) {
            jatekosok.add(new jatekosok("Jatekos"));
            lepesek.add(new lepesek(jatekosLep));
        }
        else{

            jatekosok.add(new jatekosok("Ellenseg"));
            lepesek.add(new lepesek(ellensegLep));
        }
        tablazat.setJatekos(jatekosok);
        tablazat.setLovesek(lepesek);


    }

    public static void ujkiiras() throws IOException {

        ujtablaadat();
        try (FileWriter writer = new FileWriter("tablazat.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(tablazat, writer);

        }
    }
}
