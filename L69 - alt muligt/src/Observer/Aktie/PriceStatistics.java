package Observer.Aktie;

import java.util.HashMap;
import java.util.Map;

public class PriceStatistics implements StockObserver {
    private Map<String, PriceData> statisticsMap;

    public PriceStatistics() {
        statisticsMap = new HashMap<>();
    }

    @Override
    public void update(Stock stock) {
        PriceData data = statisticsMap.computeIfAbsent(stock.getName(), k -> new PriceData());

        data.updatePrice(stock.getPrice());
        displayStatistics(stock.getName(), data);
    }

    private void displayStatistics(String stockName, PriceData data) {
        System.out.println("Statistics for " + stockName + ":");
        System.out.println("Average Price: " + data.getAveragePrice());
        System.out.println("High Price: " + data.getHighPrice());
        System.out.println("Low Price: " + data.getLowPrice());
        System.out.println();
    }

    private static class PriceData {
        private double highPrice = Double.MIN_VALUE;
        private double lowPrice = Double.MAX_VALUE;
        private double totalSum = 0;
        private int count = 0;

        void updatePrice(double price) {
            highPrice = Math.max(highPrice, price);
            lowPrice = Math.min(lowPrice, price);
            totalSum += price;
            count++;
        }

        double getAveragePrice() {
            return count == 0 ? 0 : totalSum / count;
        }

        double getHighPrice() {
            return highPrice;
        }

        double getLowPrice() {
            return lowPrice;
        }
    }
}
