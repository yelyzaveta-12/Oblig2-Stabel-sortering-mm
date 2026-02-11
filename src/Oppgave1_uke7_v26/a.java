package Oppgave1_uke7_v26;

public class a {
    public static void main(String[] args) {

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    //insertion sort
    //initial comment to see that connection to rep exist
    //while (j >= 0 && temp.compareTo(a[j]) < 0)

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j]; //shift to the right
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static <T extends Comparable<T>> void insertionSortMed1Element(T[] a) {
        flyttMinsteFremst(a);

        for (int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;

            while (temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    private static <T extends Comparable<T>> void flyttMinsteFremst(T[] a) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(a[min]) < 0) {
                min = i;
            }
        }
        T temp = a[0];
        a[0] = a[min];
        a[min] = temp;
    }


}
