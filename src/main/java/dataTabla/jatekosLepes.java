package dataTabla;

import javafx.beans.property.SimpleStringProperty;

public class jatekosLepes {
        private SimpleStringProperty jatekosNev;
        private SimpleStringProperty lepesek;

        public jatekosLepes(String jatekosNev, String lepesek){
            this.jatekosNev = new SimpleStringProperty(jatekosNev);
            this.lepesek = new SimpleStringProperty(lepesek);
        }

        public String getJatekosNev(){
            return jatekosNev.get();
        }
        public void setJatekosNev(String jatekosNev){
            this.jatekosNev.set(jatekosNev);
        }

        public String getLepesek(){
            return lepesek.get();
        }

        public void setLepesek(String lepesek){

            this.lepesek.set(lepesek);
        }


}
