import java.util.Comparator;

/**
 * Created by kraken on 17.01.2016.
 */
public class SortByCourse implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
           if(o1.getCourse()>o2.getCourse()){
               return 1;

           }
           else if (o1.getCourse()==o2.getCourse()){
               return  0;
           }
            else  if(o1.getCourse()<o2.getCourse()){
               return -1;
           }
          return 0;
        }
}
