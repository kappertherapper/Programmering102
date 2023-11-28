package time;

import demopersist.Person;

import java.io.*;

public class LoadAndPersistTime {
    public static void main(String[] args) {
        MyTime time;

        String filename = "/Users/kasperjonassen/PRO2/Programmering102/L20 - Arkitektur og Serializable/src/time/Time.ser";
        try (FileInputStream f_in = new FileInputStream(filename);
             ObjectInputStream obj_in = new ObjectInputStream(f_in))
        {
            Object obj = obj_in.readObject();
            time = (MyTime) obj;

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing object");
            System.out.println(ex);
            return;
        }
        System.out.println("Person er hentet: " + time);

        time.increase();
        time.saveTime();

        try (FileOutputStream f_out = new FileOutputStream(filename);
             ObjectOutputStream obj_out = new ObjectOutputStream(f_out))
        {
            obj_out.writeObject(time);
            System.out.println("Person er gemt: " + time);
        } catch (IOException ex) {
            System.out.println("Error serializing object");
            System.out.println(ex);
        }
    }
}
