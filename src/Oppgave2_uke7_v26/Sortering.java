package Oppgave2_uke7_v26;

public class Sortering {


        // INSERTION SORT
        public static void insertionSort(Integer[] a) {
            for (int i = 1; i < a.length; i++) {
                Integer temp = a[i];
                int j = i - 1;
                while (j >= 0 && temp < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = temp;
            }
        }

        // SELECTION SORT
        public static void selectionSort(Integer[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[min]) {
                        min = j;
                    }
                }
                Integer temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        // MERGE SORT
        public static void mergeSort(Integer[] a) {
            mergeSort(a, 0, a.length - 1);
        }

        private static void mergeSort(Integer[] a, int v, int h) {
            if (v >= h) return;
            int m = (v + h) / 2;
            mergeSort(a, v, m);
            mergeSort(a, m + 1, h);
            merge(a, v, m, h);
        }

        private static void merge(Integer[] a, int v, int m, int h) {
            Integer[] temp = new Integer[h - v + 1];
            int i = v, j = m + 1, k = 0;

            while (i <= m && j <= h) {
                if (a[i] <= a[j]) temp[k++] = a[i++];
                else temp[k++] = a[j++];
            }

            while (i <= m) temp[k++] = a[i++];
            while (j <= h) temp[k++] = a[j++];

            System.arraycopy(temp, 0, a, v, temp.length);
        }

        // QUICK SORT (naiv pivot)
        public static void quickSort(Integer[] a) {
            quickSort(a, 0, a.length - 1);
        }

        private static void quickSort(Integer[] a, int v, int h) {
            if (v >= h) return;

            int pivot = a[h];
            int i = v;

            for (int j = v; j < h; j++) {
                if (a[j] <= pivot) {
                    swap(a, i, j);
                    i++;
                }
            }

            swap(a, i, h);

            quickSort(a, v, i - 1);
            quickSort(a, i + 1, h);
        }

        private static void swap(Integer[] a, int i, int j) {
            Integer temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

