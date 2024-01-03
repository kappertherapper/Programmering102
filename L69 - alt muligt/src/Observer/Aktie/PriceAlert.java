package Observer.Aktie;

public class PriceAlert implements StockObserver {
    private double alertPrice;

    public PriceAlert(double alertPrice) {
        this.alertPrice = alertPrice;
    }

    @Override
    public void update(Stock stock) {
        if (stock.getPrice() >= alertPrice) {
            System.out.println("Price has raised over the price alert");
        } else if (stock.getPrice() <= alertPrice) {
            System.out.println("Price has lowed under the price alert");
        }
    }
}
