package controller;
import Torpedo.Hajo;
import Torpedo.Pelda;
import Torpedo.Tabla.Cella;
import Torpedo.Tabla;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class GameController {

    @FXML
    private Button resetButton;

    @FXML
    private Pane gameGrid;

    @FXML
    private VBox Vboxx;

    private Tabla tablaE, tablaJ;
    private boolean jatekKezdet;
    private boolean ellensegKore;
    private static boolean jatekVege;
    private Random random = new Random();
    private int hatralevoHajok = 5;
    private Pelda peldaa;


    int Nyertel;


    private void kezdoState() {


        tablaE = new Tabla(true, event -> {
            if (!jatekKezdet)
                return;

            Tabla.Cella cell = (Tabla.Cella) event.getSource();
            if (cell.wasShot)
                return;

            ellensegKore = !cell.loves();

            if (tablaE.hajok == 4) {
                System.out.println("Nyertel");
                jatekVege = true;
                Nyertel = 2;
                //popUpAblak();


            }

            if (ellensegKore)
                EllensegLepese();
        });

        tablaJ = new Tabla(false, event -> {
            if (jatekKezdet)
                return;

            Tabla.Cella cell = (Tabla.Cella) event.getSource();
            if (tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y)) {
                if (--hatralevoHajok == 0) {
                    startGame();
                }
            }
        });

        gameGrid.getChildren().addAll(tablaE,tablaJ);

        Vboxx = new VBox(50, tablaE, tablaJ);
        //vbox.setAlignment(Pos.CENTER);
        //gameGrid.setLayoutX(100);
        //gameGrid.setLayoutY(300);

    }

    @FXML
    public void initialize() {

        Rectangle rectangle = new Rectangle(300, 200, 20, 20);
        kezdoState();
    }


    private void EllensegLepese() {


        while (ellensegKore && !jatekVege) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);

            Tabla.Cella cella = tablaJ.getCella(x, y);
            if (cella.wasShot)
                continue;

            ellensegKore = cella.loves();

            if (tablaJ.hajok == 0) {
                System.out.println("Vesztettel");
                Nyertel = 1;
                jatekVege = true;
                //popUpAblak();


                //System.exit(0);
            }
        }
    }

    private void startGame() {
        int nagysag = 5;

        while (nagysag > 0) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);

            if (tablaE.hajoLerakas(new Hajo(nagysag, Math.random() < 0.5), x, y)) {
                nagysag--;
            }
        }
        jatekKezdet = true;
    }
}
