package Torpedo;

import java.util.Random;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;


import javafx.scene.shape.Rectangle;
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

    Label label = new Label("HH");

    Button button2 = new Button("Teszt1");
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



    public Parent createContent() {
        BorderPane root = new BorderPane();

        root.setPadding(new Insets(0, 60, 0, 150));
        root.setPrefSize(800, 850);
        //root.setRight(new Button("Reset"));
        resetButton.setPrefWidth(150);
        resetButton.setPrefHeight(50);
        //resetButton.setLayoutX(250);
        //resetButton.setLayoutY(220);
        //root.setRight(resetButton);

        button2.setPrefHeight(50);
        button2.setPrefWidth(100);
        //root.setRight(button2);

        //root.setRight(menu);


        // Top margo
        /*
        Insets insets = new Insets(10);
        Node topNode = new Label("");
        root.setTop(topNode);
        BorderPane.setMargin(topNode, insets);
*/


        VBox menu = new VBox( 20,menuT, resetButton, button2);
        //menu.getChildren().addAll(menuT, resetButton, button2);
        menu.setAlignment(Pos.TOP_CENTER);
        root.setRight(menu);

        //VBox vbox2 = new VBox(50, tablaE, tablaJ);
        //vbox2.setAlignment(Pos.CENTER);

        //root.setCenter(vbox2);






        //root.setLeft(label);


        //Hatter


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
/*

        int[] tomb = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        HBox szamok = new HBox(10, "1", "2");
        szamok.setAlignment(Pos.CENTER);

        root.setCenter(szamok);







         Rectangle circle = new Rectangle();
         Text text = new Text ("1");
         StackPane stack = new StackPane();
        stack.getChildren().addAll(circle, text);

        stack.setLayoutX(30);
        stack.setLayoutY(30);




*/


/*
        for(int y = 0; y < 11; y++) {
            for (int x = 0; x < 11; x++) {
                //if( x ==1 && y ==1)
                //{

                //}
            }
    }*/



/*
StackPane stack = new StackPane;

int a = 1;
        Text text = new Text("...");
        StackPane stack = new StackPane();
        stack.getChildren().addAll(agent, text);





                stack = new StackPane();
                Rectangle rec = new Rectangle(30,30);
                rec.setFill(javafx.scene.paint.Color.WHITE);
                rec.setStyle("-fx-arc-height: 10; -fx-arc-width: 10;");
                Label label = new Label("2");
                stack.getChildren().addAll(rec, label);
            HBox teszt = new HBox(5,stack);
            root.setLeft(teszt);
            //}
*/






        // Tablak kozepen

        Label label1 = new Label("1");

        Label label2 = new Label("2");
        Label label3 = new Label("3");
        Label label4 = new Label("4");
        Label label5 = new Label("5");
        Label label6 = new Label("6");
        Label label7 = new Label("7");
        Label label8 = new Label("8");
        Label label9 = new Label("9");
        Label label10 = new Label("10");

        HBox it = new HBox(27, label1, label2,label3, label4,label5,label6,label7,label8,label9,label10);
        it.setAlignment(Pos.CENTER);
        root.setCenter(it);
        HBox it2 = new HBox(25, label1, label2,label3, label4,label5,label6,label7,label8,label9,label10);
        it2.setAlignment(Pos.CENTER);
        root.setCenter(it2);

        VBox vbox = new VBox(3, it2, tablaE,  tablaJ);
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

            //label.setText("Clicked!");

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