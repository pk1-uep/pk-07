package pl.pk.ex;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Wprowadź liczbę całkowitą: ");
        String line = s.nextLine();

        int num = Integer.parseInt(line);
        System.out.println("Wprowadzona liczba: " + num);

        System.out.println("Koniec");
    }

}
