package dataTabla;

import javafx.beans.property.SimpleStringProperty;

/**
 * Osztály amely majd a játékost és a lépését adja vissza a táblaadathoz
 */

public class jatekosLepes {
    /**
     * A játékos neve és lépése
     */
        private final SimpleStringProperty jatekosNev;
        private final SimpleStringProperty lepesek;

    /**
     * Létrehozza a játékoslépés osztályt amit az FXML táblába fogunk berakni
     * @param jatekosNev A játékos nevét adja meg
     * @param lepesek A játékos lépését adja meg
     */
    public jatekosLepes(String jatekosNev, String lepesek){
            this.jatekosNev = new SimpleStringProperty(jatekosNev);
            this.lepesek = new SimpleStringProperty(lepesek);
        }

    /**
     * A játékos nevét visszaadó metódus
     */
    public String getJatekosNev(){
            return jatekosNev.get();
        }
    /**
     * A játékos nevét beállító metódus
     */
        public void setJatekosNev(String jatekosNev){
            this.jatekosNev.set(jatekosNev);
        }
    /**
     * A játékos lépését visszaadó metódus
     */
        public String getLepesek(){
            return lepesek.get();
        }
    /**
     * A játékos nevét beállító metódus
     */
        public void setLepesek(String lepesek){

            this.lepesek.set(lepesek);
        }


}
