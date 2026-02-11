package Oppgave1_uke7_v26;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import static Oppgave1_uke7_v26.InsertionSort.insertionSortToOmGangen;

public class TestInsertionTid {
        public static void main(String[] args) {

            int n = 60000;   // juster til det tar > 5 sek
            int antal = 5;

            Random tilfeldig = new Random(1);
            Integer[][] a = new Integer[antal][n];

            for (int i = 0; i < antal; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = tilfeldig.nextInt();
                }
            }

            Instant start = Instant.now();

            for (int i = 0; i < antal; i++) {
                // Bytt mellom disse:
                // vanligInsertionSort(a[i]);
                // insertionSortMedSentinel(a[i]);
                insertionSortToOmGangen(a[i]);
            }

            Instant slutt = Instant.now();

            long tid = Duration.between(start, slutt).toMillis();
            System.out.println("Gjennomsnitt: " + (tid / antal) + " ms");
        }
    }

