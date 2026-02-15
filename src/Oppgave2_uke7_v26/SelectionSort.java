package Oppgave2_uke7_v26;

public class SelectionSort {

    public static <T extends Comparable<T>> void selectionSort(T[] a) {

        for(int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            T temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }
}
