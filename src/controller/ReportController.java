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
import javafx.beans.binding.*;

public class ReportController extends Controller<Pizza> {

public Pizza getPizza() {return model;}

@FXML private void initialize() {}
@FXML private Button closeWindow;
@FXML private TableView reportTable;

}
