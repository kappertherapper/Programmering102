package Processer;

public class Fred extends Thread {
    private int fredArray[];
    private int max;

    public Fred(int[] fredArray) {
        super();
        this.fredArray = fredArray;
    }

    public void run() {
        max = fredArray[0];
        for (int i = 1; i < fredArray.length; i++) {
            if (fredArray[i] > max) {
                max = fredArray[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}
