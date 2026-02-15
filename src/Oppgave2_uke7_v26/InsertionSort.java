package Oppgave2_uke7_v26;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] a) {

        for(int i = 1; i < a.length; i++){

            T temp = a[i];
            int j = i - 1;
            while(j >= 0 && a[j].compareTo(temp) > 0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

    }
}
