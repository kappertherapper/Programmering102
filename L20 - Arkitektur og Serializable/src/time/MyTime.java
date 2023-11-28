package time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {

    private int time = 0;
    private List<String> times = new ArrayList<>();

    public MyTime(int time) {
        this.time = time;
    }

    public int increase() {
        return time++;
    }

    public int reset() {
        return time = 0;
    }

    public int getTime() {
        return time;
    }

    public void saveTime() {
        times.add("" + time);
    }

    @Override
    public String toString() {
        return " " + time;
    }
}
