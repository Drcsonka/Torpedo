package Torpedo;

import java.util.ArrayList;
import java.util.List;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tabla extends Parent {
    private VBox sorok = new VBox();
    private boolean ellenseg = false;

    public int hajok = 5;

    public Tabla(boolean ellenseg, EventHandler<? super MouseEvent> handler) {
        this.ellenseg= ellenseg;
        for (int y = 0; y < 10; y++) {
            HBox sor = new HBox();
            Label text1 = new Label ("TT");
            for (int x = 0; x < 10; x++) {
                Cella c = new Cella(x, y, this);
                c.setOnMouseClicked(handler);
                //c.getChildren().add(text);
                sor.getChildren().add(c);
                //sor.getChildren().add(text1);


/*
                if( x ==1 && y ==1)
                {

                    StackPane stack = new StackPane();
                    Text text = new Text("1");
                    stack.getChildren().addAll(c, text);

                }
*/

            }

            sorok.getChildren().add(sor);
        }

        getChildren().add(sorok);
    }

    /*
    public void Szamozas(int x, int y){

        Text text = new Text("...");

        StackPane stack2 = new StackPane();
        stack2.getChildren().addAll(c, text);
    }*/


    public static class Cella extends Rectangle {
        public int x, y;
        public Hajo hajo = null;
        public boolean wasShot = false;

        private Tabla tabla;

        public Cella(int x, int y, Tabla tabla) {
            super(32, 32);
            this.x = x;
            this.y = y;
            this.tabla = tabla;
            setFill(Color.LIGHTBLUE);
            setStroke(Color.BLACK);

            if( x ==10 || y ==0)
            {

                //setFill(Color.rgb(0, 0, 0, 0));
               // setStroke(Color.rgb(0, 0, 0, 0));

                //StackPane stack = new StackPane();
                //Text text = new Text("HH");




                StackPane stackPane = new StackPane();
                Circle circle = new Circle();
                Label label = new Label("Hi");
                stackPane.getChildren().addAll(circle, label);




/*
            Label label = new Label("HH");
                BorderPane root = new BorderPane();
                label.setVisible(true);

                root.setCenter(label);



 */
                //stack.getChildren().addAll( text, label);



                /*
                StackPane stack = new StackPane();
                Cella c = new Cella(x, y, tabla);
                Text text = new Text("1");
                stack.getChildren().addAll(c, text);
*/
            }

        }

        public boolean loves() {
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

        List<Cella> szomszedok = new ArrayList<Cella>();

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



    public boolean hajoLerakas(Hajo hajo, int x, int y) {
        if (Lerakhato(hajo, x, y)) {
            int length = hajo.nagysag;

            if (hajo.fuggoleges) {
                for (int i = y; i < y + length; i++) {
                    Cella cella = getCella(x, i);
                    cella.hajo = hajo;
                    if (!ellenseg) {
                        cella.setFill(Color.DARKBLUE);
                        cella.setStroke(Color.BLACK);
                    }
                }
            }
            else {
                for (int i = x; i < x + length; i++) {
                    Cella cella = getCella(i, y);
                    cella.hajo = hajo;
                    if (!ellenseg) {
                        cella.setFill(Color.DARKBLUE);
                        cella.setStroke(Color.BLACK);
                    }
                }
            }

            return true;
        }

        return false;
    }


}