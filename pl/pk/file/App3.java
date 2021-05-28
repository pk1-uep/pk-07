package pl.pk.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App3 {

    public static void main(String[] args) throws IOException {
        write();
    }

    private static void write() throws IOException {
        String file = "imiona2.txt";
        FileWriter fileWriter = new FileWriter(file);

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Jan");
        printWriter.println("Elżbieta");
        printWriter.println("Maria");
        printWriter.close();
    }

}
