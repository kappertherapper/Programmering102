package Farmville.gui;

import Farmville.controller.Controller;
import Farmville.storage.Storage;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        Controller.setStorage(new Storage());
        Application.launch(Gui.class);
    }
}
