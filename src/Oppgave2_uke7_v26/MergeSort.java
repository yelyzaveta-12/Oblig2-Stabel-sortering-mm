package Oppgave2_uke7_v26;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSort(T[] a) {

        if(a.length<=1)
            return;

        int mid = a.length/2;

        T[] left = java.util.Arrays.copyOfRange(a, 0, mid);
        T[] right = java.util.Arrays.copyOfRange(a, mid, a.length);

        mergeSort(left);
        mergeSort(right);

        merge(a,left,right);

    }

    public static <T extends Comparable<T>> void merge(T[] a, T[] left, T[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if(left[i].compareTo(right[j]) <= 0) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
