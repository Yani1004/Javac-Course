import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        writeToFile();
    }

    public static void writeToFile() {
        BufferedWriter buffWriter = null;
        FileWriter fileWriter = null;

        try {
            String textToBeWritten = "Some text.. More text";
            File file = new File("D:\\university\\PNPE\\javac\\ZadachiFiles\\ZadachiFIles\\src\\newfile.txt");
            fileWriter = new FileWriter(file.getAbsoluteFile());
            buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(textToBeWritten);
            buffWriter.flush();
            System.out.println("Ready!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffWriter != null) {
                try {
                    buffWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
