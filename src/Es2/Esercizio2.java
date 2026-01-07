package Es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Inserire un numero");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num){
            case 0 -> System.out.println("Z E R O");
            case 1 -> System.out.println("U N O");
            case 2 -> System.out.println("D U E");
            case 3 -> System.out.println("T R E");
            default -> System.out.println("Errore il numero non è compreso tra 0 e 3");
        }
    }
}
