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
    @FXML private ListView<Ingredient> ingLv;
    @FXML private ListView<Ingredient> availableLv;
    @FXML private Button leftBtn;
    @FXML private Text priceTxt;
    @FXML private Button rightBtn;
    @FXML private Button cancelBtn;



    public Pizza getPizza() {return model;}

    private Ingredient getSelectedIngredient(){
        return ingLv.getSelectionModel().getSelectedItem();
    }

        @FXML private void initialize() {

        priceTxt.textProperty().bind(getPizza().orderPrice().asString("$%.2f"));
        }

        @FXML private void cancelOrder(ActionEvent event) throws Exception {
            stage.close();
        }
    }


