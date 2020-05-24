package Torpedo.dataTabla;

import Torpedo.jatektabla.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Ezzel az osztállyal olvasunk adatokat a .json fájlunkból.
 */
public class readFromJSON {

    /**
     * Létrehozzunk a beolvasLista beolvasListat, amibe majd beolvassuk az adatokat.
     */
    public static JSONArray beolvasLista;
    public static ArrayList<String> lepesek;
    public static ArrayList<String> jatekos;
    public static final Logger logger = LogManager.getLogger(readFromJSON.class);

    /**
     * Ez a beolvas metódusunk, itt fogjuk létrehozni a <Code>reader</Code> -t aminek
     * megadjuk a fájlt, hogy miből olvasson majd.
     * Majd az <Code>obj</Code>-be berakjuk fájl tartalmat,
     * ezt a <Code>beolvasLista</Code>-ba Array-é átalakítva berakjuk.
     * A végén meghívjuk a listánkra a listPartimg() metódust, ami majd felbontja ezt.
     *
     */
    public static void beolvas()
    {
        lepesek = new ArrayList<>();
        jatekos = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("tablazat.json"))
        {

            Object obj = jsonParser.parse(reader);

            beolvasLista = (JSONArray) obj;
            readFromJSON.logger.info("Sikeresen olvastunk a fájlból!");

            beolvasLista.forEach( emp -> listParting( (JSONObject) emp ) );

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * A listParting metódus arra lesz jó, hogy a már beolvasott listánkat, szétszedjük, két darab ArrayListre,
     * a <Code>jatekos</Code>-ba fog kerülni a Játékos adatok, vagyis az, hogy Ellenség vagy Játékos.
     * A <Code>lepesek</Code>-be viszont az játékos lépse.
     * Ez azért van, hogy későbbiekben ezekre az adatokra könnyebben lehessen hivatkozni.
     * @param jatekosLepes ez az arrayunk objectjet kapja meg, és majd ezt bontja szét.
     */
    public static void listParting(JSONObject jatekosLepes)
    {
        JSONObject listaObject = (JSONObject) jatekosLepes.get("Action");

        String jatekosnev = (String) listaObject.get("Jatekos");
        jatekos.add(jatekosnev);

        String jatekoslepes = (String) listaObject.get("lepes");
        lepesek.add(jatekoslepes);

    }

    /**
     * Ez egy Logger metódus lesz amit a táblázat megjelenítésénél iratunk ki.
     */
    public static void kiakarokirni(){
        logger.debug("Az eddigi lépések száma:"+Pelda.lepes);

    }

    /**
     * Törlés metódus ami arra szolgál, hogy amikor resetelem a játékot
     * akkor a tábla adatai is újuljanak.
     */
    public static void torles(){
        lepesek = new ArrayList<>();
        jatekos = new ArrayList<>();
    }


}
