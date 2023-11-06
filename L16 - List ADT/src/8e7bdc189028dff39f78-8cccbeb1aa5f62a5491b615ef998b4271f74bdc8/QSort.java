import java.util.Comparator;

/**
 * Created by kraken on 13.01.2016.
 */
public class QSort<T extends Comparable > {
     Comparable c;

    /**
     * сортування хоара(qsort)
     *
     * @param array массив який треба відсортувати
     * @param first номер першого елемента
     * @param last  номер останнього елемента
     * @param b-    if true sort by decrease
     *              false -increase
     */


    public void Qsort(T[] array,
                      int first,
                      int last, boolean b, Comparator c) {
        int i = first, j = last;
        T choseElem = array[(first + last) / 2];
        do {
            if (b) {
                //decrease
                while (compare(choseElem, array[i],c)) i++;
                while (compare(array[j], choseElem,c)) j--;
            } else {
                //increase
                while (compareR(array[i], choseElem,c)) i++;
                while (compareR(choseElem, array[j],c)) j--;
            }

            if (i <= j) {
                if (i < j) {
                    array[j] = swap(array[i], array[i] = array[j]);
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (j > first)
            Qsort(array, first, j, b, c);
        if (i < last)
            Qsort(array, i, last, b, c);

    }

    private T swap(T... a) {
        return a[0];

    }

    public void BubbleSort(T[] o, Comparator c, boolean b) {
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (!b) {
                    if (compare(o[i], o[j],c)) {
                        T a = o[i];
                        o[i] = o[j];
                        o[j] = a;

                    }
                } else {
                    if (compareR(o[i], o[j],c)) {
                        T a = o[i];
                        o[i] = o[j];
                        o[j] = a;

                    }
                }

            }
        }
    }

    public void sWap(T a, T b) {
        T c = a;
        a = b;
        b = c;
    }

    public void chooseSort(T[] o, Comparator c, boolean b) {
        for (int i = 0; i < o.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < o.length; j++) {
                if (!b) {

                    if (compare(o[j], o[min],c)) {
                        min = j;
                    }
                } else {
                    if (compareR(o[j], o[min],c)) {
                        min = j;
                    }
                }


            }
            T a = o[i];
            o[i] = o[min];
            o[min] = a;

        }

    }

    public    void  combSort(T[] o, boolean b, Comparator c) {

        int gap = o.length;
        boolean swap;
        do {
            swap = false;
            gap = newGap(gap);
            for (int i = 0; i < (o.length - gap); i++) {
                if (b) {

                    if (compare(o[i], o[i + gap],c)) {
                        swap = true;
                        T a = o[i];
                        o[i] = o[i + gap];
                        o[i + gap] = a;
                    }
                } else {
                    if (compareR(o[i], o[i + gap],c)) {
                        swap = true;
                        T a = o[i];
                        o[i] = o[i + gap];
                        o[i + gap] = a;
                    }
                }

            }

        } while (gap > 1 || swap);
    }

    int newGap(int gap) {
        gap = gap * 10 / 13;

        if (gap == 9 || gap == 10)
            gap = 11;
        if (gap < 1)
            return 1;

        return gap;
    }

    void inSort(T[] o, boolean b, Comparator c) {
        int d = 1, k = -1;

        while (++k != o.length)
            if (b)
                for (int j = k; j >= d && compare(o[j - d], o[j],c); j -= d) {
                    o[j - d] = swap(o[j], o[j] = o[j - d]);

                }
            else
                for (int j = k; j >= d && compareR(o[j - d], o[j],c); j -= d) {
                    o[j - d] = swap(o[j], o[j] = o[j - d]);

    }
    }

    void shellsort(T[] o, boolean b, Comparator c) {

        for (int d = o.length / 2; d >= 1; d /= 2)
            for (int i = d; i < o.length; i++)
                if (b)
                    for (int j = i; j >= d && compare(o[j - d], o[j],c); j -= d) {
                        o[j - d] = swap(o[j], o[j] = o[j - d]);

                    }
                else
                    for (int j = i; j >= d && compareR(o[j - d], o[j],c); j -= d) {
                        o[j - d] = swap(o[j], o[j] = o[j - d]);

                    }
    }

    boolean compare(T a,T b,Comparator c){
       if ( c.compare(a,b)==1)return true;
         return false;
    }
    boolean compareR(T a,T b,Comparator c){
        if (c.compare(a,b)==-1)return true ;
        return false;
    }

}

