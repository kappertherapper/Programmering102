package Observer.Aktie;

import java.util.ArrayList;
import java.util.List;

public class StockTicker implements StockSubject {
    private List<StockObserver> stonks = new ArrayList<>();
    private Stock stock;


    public StockTicker() {
        this.stonks = stonks;
    }

    public void setStockPrice(double price) {
        stock.setPrice(price);
        notifyObservers();
    }

    @Override
    public void registerObserver(StockObserver o) {
        stonks.add(o);
    }

    @Override
    public void removeObserver(StockObserver o) {
        stonks.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver o : stonks) {
            o.update(stock);
        }
    }
}
