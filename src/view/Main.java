package view;

import controller.CarRental;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

    private static CarRental carRental = CarRental.getInstance();
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("landing.fxml"));
        primaryStage.setTitle("Rental Cars");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }

}

