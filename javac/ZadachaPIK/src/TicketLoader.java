import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketLoader implements Importable {

    public int readLines() {
        int lines = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dailyTickets.txt"))) {
            while (bufferedReader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public Object[] importDataFromFile() throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dailyTickets.txt"))) {

            int numLines = readLines();
            String[] tickets = new String[numLines];
            String line;
            int row = 0;


            String regex = "(1|2)\\*([^*]+)\\*([^*]+)\\*(.*?)\\*(\\d{2}\\.\\d{2}\\.\\d{4})\\*(\\d{2}:\\d{2})\\*(\\d+)\\*(\\d+)\\*";
            Pattern p = Pattern.compile(regex);


            while ((line = bufferedReader.readLine()) != null) {
                tickets[row++] = line;
            }

            Event[] arrayOfEvents = new Event[numLines];
            int currentRow = 0;


            for (int i = 0; i < numLines; i++) {
                Matcher m = p.matcher(tickets[i]);
                if (m.matches()) {
                    String[] data = new String[m.groupCount()];
                    for (int j = 1; j <= m.groupCount(); j++) {
                        data[j - 1] = m.group(j);
                    }

                    if (data[0].equals("1")) {
                        Concert c = new Concert(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), Double.parseDouble(data[5]));
                        arrayOfEvents[currentRow++] = c;
                    } else if (data[0].equals("2")) {
                        VolleyBallMatch v = new VolleyBallMatch(data[0], data[1], data[2], data[3], data[4], Integer.parseInt(data[5]), Double.parseDouble(data[6]));
                        arrayOfEvents[currentRow++] = v;
                    } else {
                        throw new UnrecognisedRowException("Not a valid row at line " + (i + 1));
                    }
                } else {

                    throw new UnrecognisedRowException("Invalid row format at line " + (i + 1));
                }
            }

            return arrayOfEvents;
        } catch (IOException | UnrecognisedRowException e) {
            e.printStackTrace();
        }
        return new Object[0];
    }
}
