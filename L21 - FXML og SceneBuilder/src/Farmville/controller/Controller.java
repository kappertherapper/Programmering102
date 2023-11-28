package Farmville.controller;

import Farmville.model.Dyr;
import Farmville.storage.Storage;

import java.util.List;

public abstract class Controller {
    private static Storage storage;

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    public static Dyr opretDyr(String name, String title, boolean ko, boolean gris, Boolean and) {
        Dyr dyr = new Dyr(name, title, ko, gris, and);
        storage.storePerson(dyr);
        return dyr;
    }

    public static List<Dyr> getAllDyr() {
        return storage.getAllDyr();
    }
}
