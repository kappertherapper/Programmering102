package Observer.Auction;

import java.util.ArrayList;

public class Auction implements Subject {
    private String name;
    private double bid;
    private Bidder highestBidder;
    private double startPrice;
    private boolean status = true; // true = activ, false = ended

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this, null);
        }
    }

    public void setAuction(String name, double startPrice) {
        this.observers = observers;
        this.name = name;
        this.bid = bid;
        this.startPrice = startPrice;
        this.status = status;
    }

    public void placeBid(double bidAmount, Bidder bidder) {
        if (bidAmount > bid && !status) {
            bid = bidAmount;
            highestBidder = bidder;
            notifyObservers();
            System.out.println("New bid is: " + bidAmount + " on " + name + " of " + bidder.getName());
        } else {
            System.out.println("Bid denied: " + bidAmount + " on " + name);
        }
    }

    public double getBid() {
        return bid;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }
}
