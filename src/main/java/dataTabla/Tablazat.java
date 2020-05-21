package dataTabla;



import java.util.List;

@lombok.Data


public class Tablazat {


    private List<jatekosok> jatekos;

    //@Column(nullable = false)
    private List<lepesek> lovesek;
}
