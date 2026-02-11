package Oppgave2_uke7_v26;
import java.util.Random;

public class FinnRandom {
    public static void main(String[] args) {

        Random tilfeldig = new Random();
        int n = 32000;
        int antal = 10;
        Integer[][] a = new Integer[antal][n];
// set inn tilfeldige heiltal i alle rekker
        for (int i = 0; i < antal; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = tilfeldig.nextInt();
            }
        }
// start tidsmåling
        for (int i = 0; i < antal; i++){
            //sorter(a[i]); // a[i] blir ein eindimensjonal tabell
        }
// slutt tidsmåling
// Beregn gjennomsnittet av måingene
    }
}
