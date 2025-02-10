package LineiniStrOtDanni;

public class main9 {
    public static void main(String[] args) {
        StockTicker stock = new StockTicker();
        stock.updatePrice("AAPL", 150.0);
        stock.updatePrice("EUR", 160.0);
        stock.updatePrice("EUR", 170.0);
        stock.updatePrice("USD", 10.0);

        double lastEUr = stock.getLastPrice("EUR");
        System.out.println("EUR last price is : " + lastEUr);
    }
}
