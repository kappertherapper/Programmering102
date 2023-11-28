package Farmville.storage;

import Farmville.model.Dyr;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Dyr> allDyr = new ArrayList<>();

    public List<Dyr> getAllDyr() {
        return new ArrayList<>(allDyr);
    }

    public void storePerson(Dyr dyr) {
        allDyr.add(dyr);
    }
}
