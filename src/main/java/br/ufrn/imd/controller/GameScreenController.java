package br.ufrn.imd.controller;

import br.ufrn.imd.BatalhaNavalApplication;
import br.ufrn.imd.dao.BoatDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GameScreenController {

    private BoatDAO boatsPlayer;

    private BoatDAO boatsMachine;

    @FXML
    private Button buttonStartGame;

    @FXML
    private Button buttonBackMenu;

    @FXML
    private GridPane playerGridPane;

    @FXML
    private GridPane machineGridPane;

    @FXML
    public void onClickGoToTitleScreen(ActionEvent event) {
        BatalhaNavalApplication.changeScreen("Title");
    }

    @FXML
    public void onClickStartGame(ActionEvent event) {

    }

    private void fillGridPane(GridPane grid, String gridType) {
        for(int line = 0; line < playerGridPane.getRowCount(); line++){
            for(int column = 0; column < playerGridPane.getColumnCount(); column++){

            }
        }
    }
}

