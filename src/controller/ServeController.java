package controller;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.binding.*;
import javafx.beans.property.*;
import java.io.*;
import java.text.*;
import java.lang.*;
import model.*;
import au.edu.uts.ap.javafx.*;

public class ServeController extends Controller<Customer> {

    public Customer getCustomer() {return model;}
    @FXML private ComboBox<Pizza> popCombo;
    @FXML private ListView<Pizza> pizzaLv;
    @FXML private Button cancelOrder;
    @FXML private Button selectBtn;
    @FXML private Text priceTxt;
    @FXML private Button submitOrder;

    @FXML public void initialize() {
        popCombo.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSubject, newSubject) -> selectBtn.setDisable(newSubject == null));
        pizzaLv.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldSubject, newSubject) -> submitOrder.setDisable(newSubject == null));
        priceTxt.textProperty().bind(getCustomer().orderPrice().asString("$%.2f"));
    }
    
    private Pizza getSelectedCombo() {return pizzaLv.getSelectionModel().getSelectedItem();}

    @FXML private void addToOrder() {
    }


    @FXML private void createPizza(ActionEvent event) throws Exception {
        Pizza pizza = getSelectedCombo();
        ViewLoader.showStage(getCustomer().createPizza(), "/view/pizza.fxml", "Create Pizza", new Stage());
    }


    @FXML private void selectPopPizza(ActionEvent event) throws Exception {
        getCustomer().submitOrder();
}
    @FXML private void cancelOrder(ActionEvent event) throws Exception {
        stage.close();
}

    private void setAmount(double value) {
        priceTxt.setText(new DecimalFormat("###,##0.00").format(value));
    }



}
