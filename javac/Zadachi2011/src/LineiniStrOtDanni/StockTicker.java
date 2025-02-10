package LineiniStrOtDanni;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StockTicker {
    Map<String,LinkedList<Double>> stockPrices;
    public StockTicker() {
        stockPrices = new HashMap<>();
    }
    public void updatePrice(String akciq, double price) {
        if(!stockPrices.containsKey(akciq)){
            stockPrices.put(akciq,new LinkedList<>());
        }
        stockPrices.get(akciq).add(price);

    }
    public Double getLastPrice(String akciq) {
        LinkedList<Double> prices = stockPrices.get(akciq);
        if(!prices.isEmpty()&&prices !=null){
            return prices.getLast();
        }
        return null;
    }

}
