package pl.pk.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App2 {

    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() throws IOException {
        Path path = Path.of("imiona.txt");
        List<String> lines = Files.readAllLines(path);

        System.out.println(lines);

        for (String l : lines) {
            System.out.println(l);
        }
    }


}
