package Torpedo;

import java.util.Random;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;


import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import Torpedo.Tabla.Cella;

public class Main extends Application {

    private boolean jatekKezdet = false;
    private Tabla tablaE, tablaJ;

    private int hatralevoHajok = 5;

    Button resetButton = new Button("Reset");

    Label label = new Label("Not clicked");

    //Button button2 = new Button("Teszt1");
    Text menuT = new Text("Menu");

    private boolean ellensegKore = false;

    private Random random = new Random();




    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Torpedo");
        primaryStage.setResizable(false);
        Scene scene1 = new Scene(createContent());
        //scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene1);
        primaryStage.show();

        resetButton.setOnAction(e -> {
            reset(primaryStage, scene1);
        });
    }



    private Parent createContent() {
        BorderPane root = new BorderPane();

        root.setPadding(new Insets(0, 20, 0, 20));
        root.setPrefSize(800, 1000);
        //root.setRight(new Button("Reset"));
        resetButton.setPrefWidth(100);
        resetButton.setPrefHeight(50);
        //resetButton.setLayoutX(250);
        //resetButton.setLayoutY(220);
        //root.setRight(resetButton);

        //button2.setPrefHeight(50);
        //button2.setPrefWidth(100);
        //root.setRight(button2);

        //root.setRight(menu);

        VBox menu = new VBox();
        menu.getChildren().addAll(menuT, resetButton);
        root.setRight(menu);



        root.setLeft(label);

        Image image = new Image("BG2.jpeg");

        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        Background background = new Background(backgroundimage);

        root.setBackground(background);



        tablaE = new Tabla(true, event -> {
            if (!jatekKezdet)
                return;

            Cella cell = (Cella) event.getSource();
            if (cell.wasShot)
                return;

            ellensegKore = !cell.loves();

            if (tablaE.hajok == 0) {
                System.out.println("Nyertel");
                //System.exit(0);
            }

            if (ellensegKore)
                EllensegLepese();
        });

        tablaJ = new Tabla(false, event -> {
            if (jatekKezdet)
                return;

            Cella cell = (Cella) event.getSource();
            if (tablaJ.hajoLerakas(new Hajo(hatralevoHajok, event.getButton() == MouseButton.PRIMARY), cell.x, cell.y)) {
                if (--hatralevoHajok == 0) {
                    startGame();
                }
            }
        });

        VBox vbox = new VBox(50, tablaE, tablaJ);
        vbox.setAlignment(Pos.CENTER);

        root.setCenter(vbox);

        return root;
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



    private void EllensegLepese() {
        while (ellensegKore) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);

            Cella cella = tablaJ.getCella(x, y);
            if (cella.wasShot)
                continue;

            ellensegKore = cella.loves();

            if (tablaJ.hajok == 0) {
                System.out.println("YOU LOSE");
                //System.exit(0);
            }
        }
    }

    private void reset( Stage primaryStage, Scene scene){

            label.setText("Clicked!");

            primaryStage.close();

        jatekKezdet = false;
        hatralevoHajok = 5;
        Scene scene2 = new Scene(createContent());
        primaryStage.setScene(scene2);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}