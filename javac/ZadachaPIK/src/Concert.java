public class Concert extends Event{
    protected String starName;
    public Concert(String starName,String place,String date, String startHour,int numberOFTickets, double priceOFTicket){
        super(place, date, startHour, numberOFTickets,priceOFTicket);
        this.starName = starName;
    }
    @Override
    public boolean sellTickets(int num) throws NoMoreTicketsException {
        if(num>this.numberOFTickets||this.numberOFTickets==0){
            throw new NoMoreTicketsException(this.starName);
        }else{
            this.numberOFTickets-=num;
            return true;
        }

    }
}
