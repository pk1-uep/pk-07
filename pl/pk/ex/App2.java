package pl.pk.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App2 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("c:/punkty.txt");
        String content = Files.readString(path);
        System.out.println("Zawartość pliku:");
        System.out.println(content);
    }

}
