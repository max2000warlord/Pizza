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
    
    private Customer getSelectedCustomer(){
    return custLv.getSelectionModel().getSelectedItem();
    
    }
    
    @FXML private void handleServe (ActionEvent event) throws Exception {
    Customer customer = getSelectedCustomer();
    ViewLoader.showStage(customer, "/view/serve.fxml", "Serve Customer", new Stage());
}
    @FXML private void handleAdd (ActionEvent event) throws Exception {
    Customer customer = getSelectedCustomer();
    ViewLoader.showStage(customer, "/view/customer_add.fxml", "Add Customer", new Stage());
}
    @FXML private void viewReport (ActionEvent event) throws Exception {
    Customer customer = getSelectedCustomer();
    ViewLoader.showStage(customer, "/view/report.fxml", "View Report", new Stage());
}
    
}
