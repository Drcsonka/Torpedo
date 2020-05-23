package dataTabla;

import Torpedo.Pelda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFromJSON {

    public static JSONArray employeeList;
    public static ArrayList<String> lepesek = new ArrayList<>();
    public static ArrayList<String> jatekos = new ArrayList<>();
    public static void beolvas()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("tablazat.json"))
        {

            Object obj = jsonParser.parse(reader);

            employeeList = (JSONArray) obj;

            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }


    }
    public static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("Action");

        //Get employee first name
        String firstName = (String) employeeObject.get("Jatekos");
        jatekos.add(firstName);


        //Get employee last name
        String lastName = (String) employeeObject.get("lepes");
        lepesek.add(lastName);

    }

    public static void kiakarokirni(){
        System.out.println(employeeList);
        int sizeer = employeeList.size()/2;
        System.out.println(sizeer);

        System.out.println(Pelda.lepes);



    }

}
