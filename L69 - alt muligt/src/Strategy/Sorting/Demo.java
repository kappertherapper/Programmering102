package Strategy.Sorting;

public class Demo {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        //----------------------------------------------------

        System.out.println("List before sorted: ");
        printArray(arr, n);

        Sorter bubble = new Sorter(new bubbleSort());
        bubble.sortArray(arr);

        System.out.println("List sorted with bubble sort: ");
        printArray(arr, n);

        System.out.println();
        //----------------------------------------------------

        int[] arrr = { 64, 34, 25, 12, 22, 11, 90 };
        int nn = arr.length;

        System.out.println("List before sorted: ");
        printArray(arrr, nn);

        Sorter selection = new Sorter(new selection());
        selection.sortArray(arrr);

        System.out.println("List sorted with selection sort: ");
        printArray(arrr, nn);


    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
