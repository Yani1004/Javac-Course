package DependencyInjection;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("FileLogger: " + message + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}