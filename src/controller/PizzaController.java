package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.collections.*;


public class PizzaController extends Controller<Pizza> {

@FXML private Button leftBtn;
@FXML private Button rightBtn;
@FXML private Button cancelBtn;

public Pizza getPizza() {return model;}

    @FXML private void initialize() {}

    @FXML private void cancelOrder(ActionEvent event) throws Exception {
        stage.close();
    }
}


