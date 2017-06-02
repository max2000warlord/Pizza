package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.collections.*;

public class ServeController extends Controller<Customer> {
  
    @FXML public void initialize() {}
    public Customer getCustomer(){ return model;}
    @FXML private ComboBox<Pizza> popCombo;
    
   private Pizza getSelectedCombo(){
    return popCombo.getSelectionModel().getSelectedItem();
    }
//    
//    @FXML public void createPizza (ActionEvent event) throws Exception {
//    ViewLoader.showStage(pizza, "/view/pizza.fxml", "Submit order", new Stage());
//}
}

    

