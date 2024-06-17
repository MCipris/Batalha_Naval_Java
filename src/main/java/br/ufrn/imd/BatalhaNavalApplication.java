package br.ufrn.imd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BatalhaNavalApplication extends Application {

    private static Image imageIcon;
    private static Stage stage;
    private static Scene titleScreen;
    private static Scene gameScreen;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        FXMLLoader titleFxmlLoader = new FXMLLoader(BatalhaNavalApplication.class.getResource("view/TitleScreen-view.fxml"));
        titleScreen = new Scene(titleFxmlLoader.load(), 640, 480);

        FXMLLoader gameFxmlLoader = new FXMLLoader(BatalhaNavalApplication.class.getResource("view/GameScreen-view.fxml"));
        gameScreen = new Scene(gameFxmlLoader.load(), 680, 480);

        imageIcon = new Image(BatalhaNavalApplication.class.getResource("images/warship-icon.png").toExternalForm());
        stage.setResizable(false);
        stage.getIcons().add(imageIcon);
        stage.setTitle("Batalha Naval");
        stage.setScene(titleScreen);
        stage.show();
    }

    public static void changeScreen(String screen){
        if( screen.equals("Title") ) {
            stage.setScene(titleScreen);
        } else if( screen.equals("Game") ){
            stage.setScene(gameScreen);
        } else if ( screen.equals("Exit") ){
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}