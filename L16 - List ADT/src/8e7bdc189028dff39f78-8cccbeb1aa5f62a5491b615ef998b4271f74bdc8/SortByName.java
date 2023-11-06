import java.util.Comparator;

/**
 * Created by kraken on 17.01.2016.
 */
public class SortByName implements Comparator<Person>{
    @Override

    public int compare(Person o1, Person o2) {
       if (o1.getName().charAt(0)>o2.getName().charAt(0))return 1;
         return -1;
    }

}
