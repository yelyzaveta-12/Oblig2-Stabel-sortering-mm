package Oppgave2_uke7_v26;

public class Main {

        public static void main(String[] args) {

            // ---------- INTEGER TEST ----------
            Integer[] nums = {9,4,7,1,3,8,2};

            System.out.print("Before int: ");
            print(nums);

            InsertionSort.insertionSort(nums);

            System.out.print("After int:  ");
            print(nums);


            // ---------- STRING TEST ----------
            String[] words = {"pear","apple","orange","banana"};

            System.out.print("\nBefore str: ");
            print(words);

            QuickSort.quickSort(words);

            System.out.print("After str:  ");
            print(words);
        }

        private static <T> void print(T[] a) {
            for (T x : a) System.out.print(x + " ");
            System.out.println();
        }


}
