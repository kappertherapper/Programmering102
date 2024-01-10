package Observer.Auction;

public class Bidder implements Observer {
    private String name;
    private double maximumBid;
    private Auction auction;

    public Bidder(String name, double maximumBid) {
        this.name = name;
        this.maximumBid = maximumBid;
    }

    public void bid(double bidAmount) {
        if (bidAmount <= maximumBid && bidAmount > auction.getBid()) {
            auction.placeBid(bidAmount, this);
        } else {
            System.out.println(name + " can't bid " + bidAmount + " (Max bid: " + maximumBid + ")");
        }
    }

    public void joinAuction(Auction auction) {
        this.auction = auction;
        auction.addObserver(this);
        System.out.println(name + " joined auction for " + auction.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof Auction) {
            Auction auction = (Auction) subject;
            System.out.println("Updated received of " + name + " for auktionen af " + auction.getName());
        }
    }
}
