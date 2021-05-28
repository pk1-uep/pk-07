package pl.pk.ex;

import java.util.Scanner;

public class App1A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Wprowadź liczbę całkowitą: ");
        String line = s.nextLine();

        try {
            int num = Integer.parseInt(line);
            System.out.println("Wprowadzona liczba: " + num);
        }
        catch (NumberFormatException ex) {
            System.out.println("Wprowadzony tekst nie jest liczbą!");
        }

        System.out.println("Koniec");
    }

}
