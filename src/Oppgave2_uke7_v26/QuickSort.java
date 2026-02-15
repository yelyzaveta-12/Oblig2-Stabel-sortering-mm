package Oppgave2_uke7_v26;

public class QuickSort {

    public static <T extends Comparable<? super T>> void quickSort(T[] a) {

        quickSort(a, 0, a.length-1);
    }
    private static <T extends Comparable<? super T>> void quickSort(T[] a, int left, int right) {

        if(left >= right) return;

        int p = partition(a,left,right);
        quickSort(a,left,p-1);
        quickSort(a,p+1,right);
    }
    private static <T extends Comparable<? super T>> int partition(T[] a, int left, int right) {

        T pivot = a[right];
        int i = left;

        for(int j = left; j < right; j++){
            if(a[j].compareTo(pivot) <= 0){

                T temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
            }
        }

        T temp = a[i];
        a[i] = a[right];
        a[right] = temp;

        return i;
    }
}
