package time;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistTime implements Serializable {
    public static void main(String[] args) {
        MyTime time = new MyTime(1);

        time.increase();
        time.increase();

        System.out.println("Time = " + time.getTime());


        String filename = "/Users/kasperjonassen/PRO2/Programmering102/L20 - Arkitektur og Serializable/src/time/Time.ser";
        try (FileOutputStream f_out = new FileOutputStream(filename);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {
            obj_out.writeObject(time);
            System.out.println("Time er gemt:" + time);
        } catch (IOException ex) {
            System.out.println("Error serializing object");
            System.out.println(ex);
        }
    }
}
