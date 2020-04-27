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


/*

        Image image = new Image("BG2.jpeg");

        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(800, 1000, false, false, false, false));

        Background background = new Background(backgroundimage);

        root.setBackground(background);

*/




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

        Label label1 = new Label("    1");
        Label label2 = new Label("2");
        Label label3 = new Label("3");
        Label label4 = new Label("4");
        Label label5 = new Label("5");
        Label label6 = new Label("6");
        Label label7 = new Label("7");
        Label label8 = new Label("8");
        Label label9 = new Label("9");
        Label label10 = new Label("10");

        Label labelS1 = new Label("A");
        Label labelS2 = new Label("B");
        Label labelS3 = new Label("C");
        Label labelS4 = new Label("D");
        Label labelS5 = new Label("E");
        Label labelS6 = new Label("F");
        Label labelS7 = new Label("G");
        Label labelS8 = new Label("H");
        Label labelS9 = new Label("I");
        Label labelS10 = new Label("J");

        Label label11 = new Label("    1");
        Label label22 = new Label("2");
        Label label33 = new Label("3");
        Label label44 = new Label("4");
        Label label55 = new Label("5");
        Label label66 = new Label("6");
        Label label77 = new Label("7");
        Label label88 = new Label("8");
        Label label99 = new Label("9");
        Label label101 = new Label("10");

        Label labelS11 = new Label("A");
        Label labelS22 = new Label("B");
        Label labelS33 = new Label("C");
        Label labelS44 = new Label("D");
        Label labelS55 = new Label("E");
        Label labelS66 = new Label("F");
        Label labelS77 = new Label("G");
        Label labelS88 = new Label("H");
        Label labelS99 = new Label("I");
        Label labelS101 = new Label("J");



        VBox Betu11 = new VBox(16, labelS1, labelS2,labelS3, labelS4,labelS5,labelS6,labelS7,labelS8,labelS9,labelS10);
        Betu11.setAlignment(Pos.CENTER);
        root.setCenter(Betu11);
        HBox Szam11 = new HBox(25.5, label1, label2,label3, label4,label5,label6,label7,label8,label9,label10);

        root.setCenter(Szam11);

        VBox Betu1 = new VBox(16, labelS11, labelS22,labelS33, labelS44,labelS55,labelS66,labelS77,labelS88,labelS99,labelS101);
        Betu1.setAlignment(Pos.CENTER);
        root.setCenter(Betu1);
        HBox Szam1 = new HBox(25.5, label11, label22,label33, label44,label55,label66,label77,label88,label99,label101);

        root.setCenter(Szam1);

        HBox masodikTablaTabla = new HBox(8, tablaJ, Betu1);
        VBox masodikTabla = new VBox(6, Szam1,masodikTablaTabla);

        HBox elsoTablaTabla = new HBox(8, tablaE, Betu11);
        VBox elsoTabla = new VBox(6, Szam11,elsoTablaTabla);

        VBox tablak = new VBox(50, elsoTabla, masodikTabla);
        tablak.setAlignment(Pos.CENTER);


        root.setCenter(tablak);


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