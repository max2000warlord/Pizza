package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.collections.*;

public class CustomerAddController extends Controller<Pizzeria> {
    @FXML public void initialize() {

    }

    @FXML private TextField phoneTf;
    @FXML private TextField nameTf;
    public final Pizzeria getPizzeria() { return model; }

    private String getPhone() { return phoneTf.getText(); }
    private void setPhone(String type) { phoneTf.setText(type); }
    private String getName() { return nameTf.getText(); }
    private void setName(String type) { nameTf.setText(type); }

    @FXML private void handleCancel() {
        stage.close();
    }

    @FXML private void handleAdd(ActionEvent event) throws Exception {
        getPizzeria().addCustomer(getPhone(), getName());
        stage.close();

    }




}
