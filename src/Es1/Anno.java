package Es1;

import java.util.Scanner;

public class Anno {
    public static boolean annoBisestile(int anno){
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un Anno,se bisestile ritornerà True altrimenti False ");
        System.out.println(annoBisestile(scanner.nextInt()));
    }
}
