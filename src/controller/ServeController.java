package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.beans.binding.*;
import javafx.beans.property.*;
import javafx.collections.*;

public class ServeController extends Controller<Customer> {

    public Customer getCustomer() {return model;}
    @FXML private ComboBox<Pizza> popCombo;
    @FXML private ListView<Pizza> pizzaLv;
    @FXML private Button cancelOrder;
    @FXML private Text priceTxt;

    @FXML public void initialize() {
    }
    
    private Pizza getSelectedCombo() {return pizzaLv.getSelectionModel().getSelectedItem();}


    @FXML private void createPizza(ActionEvent event) throws Exception {
        Pizza pizza = getSelectedCombo();
        ViewLoader.showStage(pizza, "/view/pizza.fxml", "Create Pizza", new Stage());
    }




    @FXML private void selectPopPizza(ActionEvent event) throws Exception {
        getCustomer().submitOrder();
}
    @FXML private void cancelOrder(ActionEvent event) throws Exception {
        stage.close();
}
}
