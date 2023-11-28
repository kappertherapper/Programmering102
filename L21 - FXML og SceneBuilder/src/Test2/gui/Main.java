package Test2.gui;

import Test2.controller.Controller;
import javafx.application.Application;
import Test2.storage.Storage;

public class Main {
    public static void main(String[] args) {
        Controller.setStorage(new Storage());
        Application.launch(Gui.class);
    }
}
