package Oppgave1_uke7_v26;

public class InsertionSort {


    public static <T extends Comparable<T>> void vanligInsertionSort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;

            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }
    }


    public static <T extends Comparable<T>> void insertionSortMedSentinel(T[] a) {
        flyttMinsteFremst(a);  // sentinel

        for (int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;

            // trenger ikke j >= 0 lenger!
            while (temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }
    }


    //a Insertion sort med «minste først» (sentinel-trikset)
    //Her slipper vi testen j >= 0 i while-løkken.
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

    //b Insertion sort med to elementer om gangen
    //Her setter vi inn minste og største.
    public static <T extends Comparable<T>> void insertionSortToOmGangen(T[] a) {

        for (int i = 1; i < a.length - 1; i += 2) {

            T minste = a[i];
            T storste = a[i + 1];

            if (minste.compareTo(storste) > 0) {
                T temp = minste;
                minste = storste;
                storste = temp;
            }

            int j = i - 1;

            // Flytt to plasser når mulig
            while (j >= 0 && storste.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = storste;

            // Sett inn minste vanlig
            while (j >= 0 && minste.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = minste;
        }

        // Hvis oddetall elementer igjen
        if (a.length % 2 == 0) {
            vanligInnsetting(a, a.length - 1);
        }
    }

    private static <T extends Comparable<T>> void vanligInnsetting(T[] a, int i) {
        T temp = a[i];
        int j = i - 1;
        while (j >= 0 && temp.compareTo(a[j]) < 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = temp;
    }



}
