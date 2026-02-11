package Oppgave1_uke7_v26;

public class a {
    public static void main(String[] args) {

        //insertion sort
        //initial comment to see that connection to rep exist
        //while (j >= 0 && temp.compareTo(a[j]) < 0)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] array) {

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
}
