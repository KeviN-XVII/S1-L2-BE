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
            String risultato = "";
            for (int i=0;i<frase.length()-1;i++){
                risultato= risultato + frase.charAt(i)+",";
            }
            risultato = risultato + frase.charAt(frase.length() - 1);
            System.out.println(risultato);
        }
    }
}
