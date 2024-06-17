package br.ufrn.imd.controller;

import br.ufrn.imd.BatalhaNavalApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TitleScreenController {

    @FXML
    private Button buttonStartGame;

    @FXML
    private Button buttonQuitGame;

    @FXML
    private Label labelTitleScreen;

    @FXML
    protected void onClickGoToGameScreen(ActionEvent event) {
        BatalhaNavalApplication.changeScreen("Game");
    };

    @FXML
    protected void onClickExitGame(ActionEvent event) {
        BatalhaNavalApplication.changeScreen("Exit");
    };
}
