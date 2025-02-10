public class VolleyBallMatch extends Event {
    protected String firstTeam;
    protected String secondTeam;
    public VolleyBallMatch(String firstTeam,String secondTeam,String place,String date, String startHour,int numberOFTickets, double priceOFTicket){
        super(place, date, startHour, numberOFTickets,priceOFTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }
    @Override
    public boolean sellTickets(int num) throws NoMoreTicketsException {
        if(num>this.numberOFTickets||this.numberOFTickets==0){
            throw new NoMoreTicketsException(this.firstTeam+"-"+this.secondTeam);
        }else{
            this.numberOFTickets-=num;
            return true;
        }

    }
}
