public abstract class Event {
    protected String place;
    protected String date;
    protected String startHour;
    protected int numberOFTickets;
    protected double priceOFTickets;

    public Event(String place, String date, String startHour,int numberOfTickets, double priceOfTickets) {
        this.place = place;
        this.date = date;
        this.startHour = startHour;
        this.numberOFTickets = numberOfTickets;
        this.priceOFTickets = priceOfTickets;
    }
    public abstract boolean sellTickets(int num) throws NoMoreTicketsException;

}
