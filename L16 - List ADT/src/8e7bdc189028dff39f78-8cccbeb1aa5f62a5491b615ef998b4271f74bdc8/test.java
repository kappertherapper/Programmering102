import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by kraken on 20.01.2016.
 */
public class test {
    public static void main(String[] args) {
         new test().init();

    }
    public  void  init(){
        Person[] a=new Person[10];
        Comparator comp= new SortByName();

        setRandNum(a);
        System.out.println(Arrays.toString(a));
        QSort<Person >sort=new QSort<Person>();
        sort.inSort(a,true,comp);

        System.out.println("\nсортировка вставками"+Arrays.toString(a));

        setRandNum(a);
        System.out.println("\n"+Arrays.toString(a));
        sort.BubbleSort(a,comp,true);
        System.out.println("\nпузырьковая"+Arrays.toString(a));

        setRandNum(a);
        System.out.println("\n"+Arrays.toString(a));
        sort.chooseSort(a,comp,true);
        System.out.println("\nвыбором"+Arrays.toString(a));

        setRandNum(a);
        System.out.println("\n"+Arrays.toString(a));
        sort.shellsort(a,true,comp);
        System.out.println("\nШелла"+Arrays.toString(a));

        setRandNum(a);
        System.out.println("\n"+Arrays.toString(a));
        sort.inSort(a,true,comp);
        System.out.println("\nрасческа"+Arrays.toString(a));


    }
    public  void  setRandNum(Person[] a){
        for (int i = 0; i <a.length ; i++) {
            a[i]=new Person(""+(char)(new Random().nextInt(25)+'A'), new Random().nextInt(100));
        }
    }
}
