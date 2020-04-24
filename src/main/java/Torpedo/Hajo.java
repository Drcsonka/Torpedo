package Torpedo;

import javafx.scene.Parent;

public class Hajo extends Parent {
    public int nagysag;
    public boolean fuggoleges = true;

    private int elet;

    public Hajo(int nagysag, boolean fuggoleges) {
        this.nagysag = nagysag;
        this.fuggoleges = fuggoleges;
        elet = nagysag;
    }

    public void talalat() {
        elet--;
    }

    public boolean El() {
        return elet > 0;
    }
}