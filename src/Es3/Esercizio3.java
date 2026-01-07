package Es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String frase = "";

        while (!frase.equals(":q")){
            System.out.println("Inserisci la parola e per chiudere tutto scrivere :q");
            frase = scanner.nextLine();
            if (frase.equals(":q")){
                break;
            }
            for (int i=0;i<frase.length()-1;i++){
                System.out.print(frase.charAt(i)+",");
            }
            System.out.println(frase.charAt(frase.length() - 1));
        }
    }
}
