package pl.pk.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App2A {

    public static void main(String[] args) {
        Path path = Path.of("c:/punkty.txt");

        String content = null;
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Nie znaleziono pliku");
        }

        System.out.println("Zawartość pliku:");
        System.out.println(content);
    }

}
