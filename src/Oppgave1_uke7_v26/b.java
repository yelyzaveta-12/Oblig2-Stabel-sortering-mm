package Oppgave1_uke7_v26;

public class b {

    public static <T extends Comparable<T>> void insertionSort2Elementer(T[] a) {

        for (int i = 1; i < a.length - 1; i += 2) {

            T minste = a[i];
            T storste = a[i + 1];

            if (minste.compareTo(storste) > 0) {
                T temp = minste;
                minste = storste;
                storste = temp;
            }

            int j = i - 1;

            while (j >= 0 && storste.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = storste;

            while (j >= 0 && minste.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = minste;
        }

        if (a.length % 2 == 0) {
            HelpMethod(a, a.length - 1);
        }
    }

    private static <T extends Comparable<T>> void HelpMethod(T[] a, int i) {
        T temp = a[i];
        int j = i - 1;
        while (j >= 0 && temp.compareTo(a[j]) < 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = temp;
    }

}
