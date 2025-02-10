import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String urlRegex = "https?://[^\\s]+\\.com\\b";
            br = new BufferedReader(new FileReader("newfile.txt"));
            Pattern p = Pattern.compile(urlRegex);
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                Matcher m = p.matcher(currentLine);
                while (m.find()) {
                    System.out.println(m.group());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
