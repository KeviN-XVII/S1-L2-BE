package Es1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola,se il numero di caratterì è pari uscirà True altrimenti False ");
        String parola = scanner.nextLine();
        if (parola.length() % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Inserisci un Anno,se bisestile ritornerà True altrimenti False ");
        int Anno = Integer.parseInt(scanner.nextLine());
        if (Anno % 4 == 0) {
            System.out.println("true");
        } else if (Anno % 100 == 0 && Anno % 400 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
