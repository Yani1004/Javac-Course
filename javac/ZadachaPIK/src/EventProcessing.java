import java.io.IOException;

public class EventProcessing {
    public static Concert[] concerts = null;
    public static VolleyBallMatch[] volleyBallMatches = null;
    public static void processTickets(){
        try{
            TicketLoader ticketLoader = new TicketLoader();
            Object[] events = ticketLoader.importDataFromFile();
            int concertsNum = 0;
            int volleyNum = 0;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
