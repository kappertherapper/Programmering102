package Farmville.gui;

import Farmville.controller.Controller;
import Farmville.model.Dyr;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Slagteri {
    @FXML
    public CheckBox chbKo;

    @FXML
    public CheckBox chbGris;

    @FXML
    public CheckBox chbAnd;

    @FXML
    private Button btnAddDyr;

    @FXML
    private Label lblDyr;

    @FXML
    private Label lblTitel;

    @FXML
    private ListView<Dyr> lvwDyr;

    @FXML
    private TextField txfName;

    @FXML
    private TextField txfTitle;

    public void initialize() {
        lvwDyr.getItems().addAll(Controller.getAllDyr());
    }

    @FXML
    private void addPersonAction() {
        String name = txfName.getText();
        String title = txfTitle.getText();
        boolean ko = chbKo.isSelected();
        boolean gris = chbGris.isSelected();
        boolean and = chbAnd.isSelected();
        Controller.opretDyr(name, title, ko, gris, and);

        lvwDyr.getItems().setAll(Controller.getAllDyr());
        System.out.println(name + " " + title);
    }
}
