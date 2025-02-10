import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class test {

    private static final String FILE_PATH = "file.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нишка за запис във файла
        Thread writerThread = new Thread(() -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                while (true) {
                    System.out.println("Enter text to write to the file:");
                    String input = scanner.nextLine();  // Четене на вход от конзолата
                    writer.write(input + "\n");
                    writer.flush();  // Изчистване на буфера
                    // Опционално можем да добавим пауза
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Нишка за четене от файла
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
                    System.out.println("File contents:\n" + content);
                    Thread.sleep(5000);  // Спиране на нишката за 5 секунди
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();
        readerThread.start();
    }
}