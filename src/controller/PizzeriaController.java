package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.collections.*;

public class PizzeriaController extends Controller<Pizzeria> {

    @FXML public void initialize() {
    }

    public final Pizzeria getPizzeria() {return model;}
    
    @FXML private ListView<Customer> custLv;
    
    private Customer getSelectedProduct(){
    return custLv.getSelectionModel().getSelectedItem();
    
    }
}
