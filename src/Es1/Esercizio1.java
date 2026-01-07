package Es1;

import java.util.Scanner;

public class Esercizio1 {
    public static boolean stringPariDispari (String text) {
                if (text.length() % 2 == 0){
                    return true;
                }
                else {
                    return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola,se il numero di caratterì è pari uscirà True altrimenti False ");
        String parola = scanner.nextLine();

        System.out.println(stringPariDispari(parola));
    }
}
