package Torpedo.jatektabla;

import java.util.ArrayList;
import java.util.List;

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
     * valami.
     * @param ellenseg valami.
     * @param handler valami.
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
         * valami.
         * @param x valami.
         * @param y valami.
         * @param tabla valami.
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
         * Valami.
         * @return valami.
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
                }
                return true;
            }

            return false;
        }
    }

    /**
     * Valami.
     * @param x valami.
     * @param y valami.
     * @return valami.
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
     * Valami.
     * @param hajo valami.
     * @param x valami.
     * @param y valami.
     * @return valami.
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