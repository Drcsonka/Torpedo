package Torpedo;

import java.io.IOException;
import java.util.Optional;
import java.util.Random;

import controller.GameController;
import controller.KisTablaController;
import dataTabla.Main;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import Torpedo.Tabla.Cella;
import main.MyApplication;

public class Pelda  {

    public  static boolean jatekVege = false;
    //public static Parent scene1= new Scene(createContent());
     public static boolean jatekKezdet = false;
     private static Tabla tablaE, tablaJ;
     static int Nyertel = 0;


     private static int hatralevoHajok = 5;
     static Button resetButton = new Button("Reset");
     static Button tablaButton = new Button( "Lepesek");
     static Text menuT = new Text("Menu");
     private static boolean ellensegKore = false;
     static String[] ybetuk = {"A","B","C","D","E","F","G","H","I","J"};
     public static String xyJ;
     public static String xyE;
     public static int lepes= 0;

    private static Label Lepes= new Label("lepes");
    private static Label LepesJ= new Label("lepes");

    public static boolean jatekoslepese = true;


     private static Random random = new Random();
     //private Stage stage31;
     //public SubScene sub = new SubScene(createContent(), 800,850);

/*
    public static SubScene createSubScene(Parent root) {


        SubScene subScene = new SubScene(root, 500, 400);

        return subScene;
    }
*/

/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        scene scene1 = new Scene(createContent());

        scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        this.stage31 = primaryStage;


        resetButton.setOnAction(e -> {
            reset(primaryStage);
        });


    }
*/


//new Foo().nonStaticMethod();
//public Scene scene1 = new Scene(createContent());


    public static Parent createContent() {
        BorderPane root = new BorderPane();


        root.setPadding(new Insets(0, 60, 0, 150));
        root.setPrefSize(800, 850);
        resetButton.setPrefWidth(150);
        resetButton.setPrefHeight(50);
        tablaButton.setPrefWidth(150);
        tablaButton.setPrefHeight(50);

        Lepes.setPrefHeight(50);
        Lepes.setPrefWidth(150);
        LepesJ.setPrefHeight(50);
        LepesJ.setPrefWidth(150);

        // Top margo

        Insets insets = new Insets(10);
        Node topNode = new Label("");
        root.setTop(topNode);
        BorderPane.setMargin(topNode, insets);

        resetButton.setOnAction(e -> {
                    reset(MyApplication.stage31);
        });


        tablaButton.setOnAction(e -> {
            try {
                KisTablaController.tablazat( e );
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });


        VBox menu = new VBox( 20,menuT, resetButton, tablaButton, Lepes, LepesJ);
        menu.setAlignment(Pos.TOP_CENTER);
        root.setRight(menu);



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

            String xJ = String.valueOf(cell.x+1);
            String y22 = String.valueOf(cell.y+1);
            String yJ = ybetuk[cell.y];
            xyJ = xJ+yJ;
            jatekoslepese = true;
            lepes++;
            try {
                Main.ujkiiras();
            } catch (IOException e) {
                e.printStackTrace();
            }

            LepesJ.setText(xyJ);

            ellensegKore = !cell.loves();


            if (tablaE.hajok == 4) {
                System.out.println("Nyertel");
                jatekVege = true;
                Nyertel = 2;
                popUpAblak();


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





        // Tablak kozepen + felirat
        Label labelSz1 = new Label("   1");
        font(labelSz1);
        Label labelSz2 = new Label("2");
        font(labelSz2);
        Label labelSz3 = new Label("3");
        font(labelSz3);
        Label labelSz4 = new Label("4");
        font(labelSz4);
        Label labelSz5 = new Label("5");
        font(labelSz5);
        Label labelSz6 = new Label("6");
        font(labelSz6);
        Label labelSz7 = new Label("7");
        font(labelSz7);
        Label labelSz8 = new Label("8");
        font(labelSz8);
        Label labelSz9 = new Label("9");
        font(labelSz9);
        Label labelSz10 = new Label("10");
        font(labelSz10);

        Label labelB1 = new Label("A");
        font(labelB1);
        Label labelB2 = new Label("B");
        font(labelB2);
        Label labelB3 = new Label("C");
        font(labelB3);
        Label labelB4 = new Label("D");
        font(labelB4);
        Label labelB5 = new Label("E");
        font(labelB5);
        Label labelB6 = new Label("F");
        font(labelB6);
        Label labelB7 = new Label("G");
        font(labelB7);
        Label labelB8 = new Label("H");
        font(labelB8);
        Label labelB9 = new Label("I");
        font(labelB9);
        Label labelB10 = new Label("J");
        font(labelB10);

        Label labelSz21 = new Label("   1");
        font(labelSz21);
        Label labelSz22 = new Label("2");
        font(labelSz22);
        Label labelSz23 = new Label("3");
        font(labelSz23);
        Label labelSz24 = new Label("4");
        font(labelSz24);
        Label labelSz25 = new Label("5");
        font(labelSz25);
        Label labelSz26 = new Label("6");
        font(labelSz26);
        Label labelSz27 = new Label("7");
        font(labelSz27);
        Label labelSz28 = new Label("8");
        font(labelSz28);
        Label labelSz29 = new Label("9");
        font(labelSz29);
        Label labelSz210 = new Label("10");
        font(labelSz210);

        Label labelB21 = new Label("A");
        font(labelB21);
        Label labelB22 = new Label("B");
        font(labelB22);
        Label labelB23 = new Label("C");
        font(labelB23);
        Label labelB24 = new Label("D");
        font(labelB24);
        Label labelB25 = new Label("E");
        font(labelB25);
        Label labelB26 = new Label("F");
        font(labelB26);
        Label labelB27 = new Label("G");
        font(labelB27);
        Label labelB28 = new Label("H");
        font(labelB28);
        Label labelB29 = new Label("I");
        font(labelB29);
        Label labelB210 = new Label("J");
        font(labelB210);


        VBox Betu11 = new VBox(13, labelB1, labelB2,labelB3, labelB4,labelB5,labelB6,labelB7,labelB8,labelB9,labelB10);
        Betu11.setAlignment(Pos.CENTER);
        root.setCenter(Betu11);
        HBox Szam11 = new HBox(22, labelSz1, labelSz2,labelSz3, labelSz4,labelSz5,labelSz6,labelSz7,labelSz8,labelSz9,labelSz210);




        root.setCenter(Szam11);

        VBox Betu1 = new VBox(13, labelB21, labelB22,labelB23, labelB24,labelB25,labelB26,labelB27,labelB28,labelB29,labelB210);
        Betu1.setAlignment(Pos.CENTER);
        root.setCenter(Betu1);
        HBox Szam1 = new HBox(22, labelSz21, labelSz22,labelSz23, labelSz24,labelSz25,labelSz26,labelSz27,labelSz28,labelSz29,labelSz10);

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

/*
    public void print(WritableImage writableImage, Stage primaryStage) {
        ImageView imageView =new ImageView(writableImage);
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.LANDSCAPE, Printer.MarginType.DEFAULT);
        double scaleX = pageLayout.getPrintableWidth() / imageView.getBoundsInParent().getWidth();
        double scaleY = pageLayout.getPrintableHeight() / imageView.getBoundsInParent().getHeight();
        imageView.getTransforms().add(new Scale(scaleX, scaleY));

        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            boolean successPrintDialog = job.showPrintDialog(primaryStage.getOwner());
            if(successPrintDialog){
                boolean success = job.printPage(pageLayout,imageView);
                if (success) {
                    job.endJob();
                }
            }
        }
    }

    */

    private static Label font(Label label){

        label.setTextFill(Color.web("#FFFFFF"));
        label.setFont(new Font("Arial", 17));
        label.setStyle("-fx-font-weight: bold;");
        return label;
    }



    private static void startGame() {
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



    public static void EllensegLepese() {


        while (ellensegKore && !jatekVege) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            String x1 = String.valueOf(x+1);
            String y21 = String.valueOf(y+1);

            String yE = ybetuk[y];
            String xE = x1;

            xyE = xE + yE;
            jatekoslepese = false;

            Lepes.setText(xyE);


            Cella cella = tablaJ.getCella(x, y);
            if (cella.wasShot)
                continue;

            ellensegKore = cella.loves();

            if (tablaJ.hajok == 0) {
                System.out.println("Vesztettel");
                Nyertel = 1;
                jatekVege = true;
                popUpAblak();

            }
        }
    }

    public static void popUpAblak(){


        if(Nyertel == 1)
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Vesztettel");
            alert.setHeaderText(null);
            alert.setGraphic(null);
            alert.setContentText("Vesztettel, szeretnel uj jatekot kezdeni?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK)
            {
                reset(MyApplication.stage31);
            } else
            {

            }
        }
        else if(Nyertel == 2)
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Nyertel");
            alert.setHeaderText(null);
            alert.setGraphic(null);
            alert.setContentText("Gratulalok Nyertel! Szeretnel uj jatekot kezdeni?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK)
            {
                reset(MyApplication.stage31);
            } else
            {

            }
        }


    }
    //public Scene scene1 = new Scene(createContent());

    private static void reset(Stage primaryStage){

        primaryStage.close();
        jatekKezdet = false;
        hatralevoHajok = 5;
        Scene scene2 = new Scene(createContent());
        primaryStage.setScene(scene2);
        primaryStage.show();
        jatekVege = false;

    }


}