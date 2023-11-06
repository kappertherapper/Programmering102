import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;



/**
 * Created by kraken on 18.01.2016.
 */
public class MyList<T extends Comparable> implements Iterable,Comparable {
    /**
     * counter of elem in array
     */
    int filled = 0;

    int iterator = 0;

    public Object[] getArrayList() {
        return arrayList;
    }

    T[] arrayList;

    /**
     * create list of i size
     *
     *
     */


    @SafeVarargs
    static <E> E[] newArray(int length, E... array)
    {
        return Arrays.copyOf(array, length);
    }
    QSort<T> sort= new QSort<T>();
    public MyList(int i) {
        arrayList =newArray(i);
        filled = i;
    }

    /**
     * create list == arrays of objects
     *
     * @param o
     */
    public MyList(T[] o) {
        arrayList = Arrays.copyOf(o, Math.max(o.length, 10));
        filled = o.length;
    }

    public MyList() {
        arrayList = newArray(10);;
    }

    /**
     * return true size of list
     *
     * @return
     */
    public int length() {
        return filled;
    }

    /**
     * add elem to list if has free size
     * or create new and copy all old elem to new array with bigger size
     *
     * @param o
     */
    public void add(T o) {
        if (arrayList.length == filled) {
            T[] newArray = newArray(arrayList.length + arrayList.length / 2);

            for (int j = 0; j < filled; j++) {
                newArray[j] = arrayList[j];
            }

            newArray[filled] = o;
            filled++;
            arrayList = newArray;
        } else {
            arrayList[filled] = o;
            filled++;
        }
    }

    public Object get(int i) {
        if (i < filled && i >= 0) {
            return arrayList[i];
        } else return null;

    }

    /**
     * remove obj
     * create new arr and and to it all elem without o
     *
     * @param o
     */
    public void remove(T o) {
        int i = indexOf(o);
        if (i != -1) {
           T[] newArray = newArray(--filled);
            for (int j = 0, k = 0; k <= filled; ) {
                if (i != k) {
                    newArray[j] = arrayList[k];
                    j++;
                    k++;
                } else {
                    k++;
                }
            }
            arrayList = newArray;
        }


    }

    /**
     * first index of obj o
     *
     * @param o
     * @return index of obj
     */
    public int indexOf(T o) {
        for (int i = 0; i < filled; i++) {
            if (arrayList[i].equals(o)) {
                return i;
            }


        }
        return -1;

    }

    /**
     * comparator - how to sort elem
     * you should extend class MyComparator
     *
     * @param c- comparator
     * @param b  - how to sort true=inc  0 1 2 3
     *           false =decrement 3 2 1 0
     */
    public void Qsort(Comparator c, boolean b) {
      sort.Qsort(arrayList,0,filled-1,b,c);
    }

    public  void  BubbleSort(Comparator c,boolean b){
       sort.BubbleSort(arrayList,c,b);

    }
    public  void inSort(Comparator c,boolean b){
          sort.inSort(arrayList,b,c);
    }
    public  void shellSort(Comparator c,boolean b){
        sort.shellsort(arrayList,b,c);
    }
    public  void combSort(Comparator c,boolean b){
        sort.combSort(arrayList,b,c);
    }
    public  void  chooseSort(Comparator c,boolean b){
        sort.chooseSort(arrayList,c,b);
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                if (iterator == filled) return false;
                return true;
            }

            @Override
            public Object next() {
                if (hasNext()) return arrayList[iterator++];
                return null;

            }
        };

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
