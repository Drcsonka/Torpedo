package Torpedo.jatektabla;

import java.util.ArrayList;
import java.util.List;

import Torpedo.dataTabla.readFromJSON;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tabla extends Parent {
    private final VBox sorok = new VBox();
    private final boolean ellenseg;

    public int hajok = 5;

    /**
     * Ez lesz a Táblalétrehozó metódusunk. A tábláink Hbox-okból fognak állni,
     * amiket Cellákat töltünk fel vagyis kis kockákkal, amik majd interaktívak lesznek klikkelésre.
     * A hboxainkat vagyis a sorainkat majd Egy Vbox-ba vagyis egy oszlopba rakjuk bele, így összekötve a sorokat.
     * @param ellenseg Ez fogja számunkra azt jelenteni hogy a tábla az ellenség táblája-e vagy sem.
     * @param handler Ez fogja a klikkelésünket, érzékelni és értelmezni.
     */
    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {
        this.ellenseg= ellenseg;
        for (int y = 0; y < 10; y++) {
            HBox sor = new HBox();
            for (int x = 0; x < 10; x++) {
                Cella c = new Cella(x, y, this);
                c.setOnMouseClicked(handler);
                sor.getChildren().add(c);

            }

            sorok.getChildren().add(sor);
        }

        getChildren().add(sorok);
    }


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private final Tabla tabla;

        /**
         * Ez lesz maga a cellánk, megadunk neki egy x,y értéket hogy majd
         * tudjuk hogy hol helyezkedik el a cella.Majd megadjuk neki hogy melyik táblához tartozik,
         * és végül beállítjuk a háttérszinét a cellának, világoskékre, a körvonalát feketére.
         * @param x Az x koordinátája a táblánknak.
         * @param y Az y koordinátája a táblánkak.
         * @param tabla Melyik táblához tartozik.
         */
        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);
            this.x = x;
            this.y = y;
            this.tabla = tabla;
            setFill(Color.LIGHTSKYBLUE);
            setStroke(Color.BLACK);

        }

        /**
         * Ezt fogjuk meghívni amikor lövünk, az első igazságvizsgálatban
         * megnézzük, hogy a játszmánk véget ért-e már, ha igen akkor hamisat adunk vissza
         * ezzel jelezve hogy már nemtudunk lőni. Ha sikerül lőnünk, akkor feketére állítjuk a cellát,
         * és megmondjuk ennek a cellának, hogy már elvolt találva. Ha viszont abban a cellában
         * hajó is található volt akkor eltaláltnak számítjuk azt a hajót, a cella szinét pirosra állítjuk
         * és ha a hajónak ez volt az utolsó élete, akkor meghaltnak tekintjük.
         * @return itt az értékünk true, ha sikeresen lőttünk, és false ha nem.
         */
        public boolean loves() {
            if(Pelda.jatekVege)
            {
                return false;
            }
            wasShot = true;
            setFill(Color.BLACK);

            if (hajo != null) {
                hajo.talalat();
                setFill(Color.RED);
                if (!hajo.El()) {
                    tabla.hajok--;
                    readFromJSON.logger.info("Egy hajo megsemmisult.");
                }
                return true;
            }

            return false;
        }
    }

    /**
     * Ezt hívjuk majd meg hogy megkapjuk a cella helyét.
     * @param x megadjuk neki a x koordináta értékét.
     * @param y az y koordiánata értékét.
     * @return majd visszaadjuk a sorból a cella értékeit.
     */
    public Cella getCella(int x, int y) {
        return (Cella)((HBox)sorok.getChildren().get(y)).getChildren().get(x);
    }



    private Cella[] getSzomszed(int x, int y) {
        Point2D[] points = new Point2D[] {
                new Point2D(x - 1, y),
                new Point2D(x + 1, y),
                new Point2D(x, y - 1),
                new Point2D(x, y + 1)
        };

        List<Cella> szomszedok = new ArrayList<>();

        for (Point2D p : points) {
            if (letezoElem(p)) {
                szomszedok.add(getCella((int)p.getX(), (int)p.getY()));
            }
        }

        return szomszedok.toArray(new Cella[0]);
    }



    private boolean letezoElem(Point2D point) {
        return letezoElem(point.getX(), point.getY());
    }

    private boolean letezoElem(double x, double y) {
        return x >= 0 && x < 10 && y >= 0 && y < 10;
    }



    private boolean Lerakhato(Hajo hajo, int x, int y) {
        int hossz = hajo.nagysag;

        if (hajo.fuggoleges) {
            for (int i = y; i < y + hossz; i++) {
                if (!letezoElem(x, i))
                    return false;

                Cella cella = getCella(x, i);
                if (cella.hajo != null)
                    return false;

                for (Cella szomszed : getSzomszed(x, i)) {
                    if (!letezoElem(x, i))
                        return false;

                    if (szomszed.hajo != null)
                        return false;
                }
            }
        }
        else {
            for (int i = x; i < x + hossz; i++) {
                if (!letezoElem(i, y))
                    return false;

                Cella cella = getCella(i, y);
                if (cella.hajo != null)
                    return false;

                for (Cella szomszed : getSzomszed(i, y)) {
                    if (!letezoElem(i, y))
                        return false;

                    if (szomszed.hajo != null)
                        return false;
                }
            }
        }

        return true;
    }


    /**
     * Itt fogjuk lerakni a hajót majd a táblára, először is megnézzük, hogy lerakható-e
     * a hajónk arra a pozícióra amit kapott. Majd megadjuk neki hogy milyen nagyságú a hajónk.
     * Majd egy if függvény álltal megnézzük, hogy függőlegesen vagy merőlegesen rakjuk le a hajónkat
     * Miután megtudtuk hogy függőlegesen vagy merőlegesen akarjuk lerakni a hajónkat, egy for ciklust
     * hivunk meg a hajó nagyságára és lerakjuk a hajónkat. A lerakott hajót barna színüre fogjuk színzeni.
     *
     * @param hajo megadjuk a hajót amit éppen le akarunk rakni.
     * @param x a cella x koordinátája ahova a hajót szeretnénk elhelyezni.
     * @param y a cellánk y koordinátája.
     * @return true lesz a visszatérési érték ha leraktuk a hajót, és false ha nemtudjuk.
     */
    public boolean hajoLerakas(Hajo hajo, int x, int y) {
        if (Lerakhato(hajo, x, y)) {
            int length = hajo.nagysag;

            if (hajo.fuggoleges) {
                for (int i = y; i < y + length; i++) {
                    Cella cella = getCella(x, i);
                    cella.hajo = hajo;
                    if (!ellenseg) {
                        cella.setFill(Color.BROWN);
                        cella.setStroke(Color.BLACK);
                    }
                }
            }
            else {
                for (int i = x; i < x + length; i++) {
                    Cella cella = getCella(i, y);
                    cella.hajo = hajo;
                    if (!ellenseg) {
                        cella.setFill(Color.BROWN);
                        cella.setStroke(Color.BLACK);
                    }
                }
            }
            return true;
        }
        return false;
    }
}