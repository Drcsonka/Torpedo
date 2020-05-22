package dataTabla;



import java.util.List;

@lombok.Data


public class Tablazat {

    private String jatekos;
    private String lovesek;


    public  Tablazat(String jatekos, String lovesek){
        this.jatekos = jatekos;
        this.lovesek = lovesek;
    }




}
