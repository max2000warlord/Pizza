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

    @FXML private ListView<Customer> custLv;
    @FXML private Button serveCust;
    @FXML private Button addCust;
    @FXML private Button viewReport;

    @FXML public void initialize() {
        custLv.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSubject, newSubject) -> serveCust.setDisable(newSubject == null));


    }

    public final Pizzeria getPizzeria() {return model;}
    
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
