package demopersist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistPerson {

    public static void main(String[] args) {
        Person p = new Person("Jane Jensen");
        p.addGrade(12);
        p.addGrade(10);
        p.addGrade(7);
        p.addGrade(10);

        String filename = "src/demopersist/Person.ser";
        try(FileOutputStream f_out = new FileOutputStream(filename);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {
            obj_out.writeObject(p);
            System.out.println("Person er gemt:" + p);
        } catch (IOException ex) {
            System.out.println("Error serializing object");
            System.out.println(ex);
        }
    }
}
