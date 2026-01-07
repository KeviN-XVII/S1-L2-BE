package Es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();
        for  (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        }
    }
