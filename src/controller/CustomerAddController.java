package controller;

import au.edu.uts.ap.javafx.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import model.*;
import javafx.collections.*;

public class CustomerAddController extends Controller<Customer> {
    @FXML private TextField phoneTf;
    @FXML private TextField nameTf;

    public Customer getCustomer() {return model;}

}
