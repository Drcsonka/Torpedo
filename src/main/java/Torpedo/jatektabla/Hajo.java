package Torpedo.jatektabla;

import javafx.scene.Parent;

public class Hajo extends Parent {
    public int nagysag;
    public boolean fuggoleges;

    private int elet;

    /**
     * Ebben a metódusban fogjuk megadni, hogy miből is áll, vagyis mi is egy hajó.
     * @param nagysag A nagyság az azt fogja jelenteni, hogy milyen hosszu,
     *               és annyi élete is lesz a hajónak amilyen hosszú.
     * @param fuggoleges Ez annyit fog jelenteni számunkra, hogy a
     *                   hajó függőlegesen fog-e elhelyezkedni vagy vízszintesen.
     */
    public Hajo(int nagysag, boolean fuggoleges) {
        this.nagysag = nagysag;
        if (fuggoleges) this.fuggoleges = true;
        else this.fuggoleges = false;
        elet = nagysag;
    }

    /**
     * Ezt a metódust akkor hívjuk meg amikor egy hajó találatot kap,
     * és annak a hajónak csökkentjük az életét eggyel.
     */
    public void talalat() {
        elet--;

    }

    /**
     * Egységteszt teszteléséhez létrehozott metódus.
     * @return visszaadja az ujonnan megkapott életet.
     */
    public int talalatV(){
        elet--;
        return elet;
    }

    /**
     * Itt azt fogjuk megnézni, hogy a meghívott hajó él-e még vagy nem.
     * @return igazat térít vissza ameddig nagyobb a hajó élete mint 0.
     */
    public boolean El() {
        return elet > 0;
    }
}