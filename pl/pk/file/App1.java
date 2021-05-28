package pl.pk.file;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App1 {

    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            System.out.println("Błąd przy probie odczytu pliku!");
            e.printStackTrace();
        }

        try {
            write();
        } catch (IOException e) {
            System.out.println("Błąd przy probie zapisu pliku!");
            e.printStackTrace();
        }
    }

    private static void write() throws IOException {
        String text =
                "Młodości! ty nad poziomy\n" +
                "Wylatuj, a okiem słońca\n" +
                "Ludzkości całe ogromy\n" +
                "Przeniknij z końca do końca!";

        Path path = Path.of("oda.txt");
        Files.writeString(path, text);
    }

    private static void read() throws IOException {
        Path path = Path.of("imiona.txt");
        String content = Files.readString(path);
        System.out.println(content);
    }

}
