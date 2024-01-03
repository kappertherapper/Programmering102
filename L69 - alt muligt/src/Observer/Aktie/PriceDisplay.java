package Observer.Aktie;

public class PriceDisplay implements StockObserver {
    @Override
    public void update(Stock stock) {
        System.out.println("The price of the stock is: " + stock.getPrice());
    }
}
