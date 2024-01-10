package Observer.Auction;

public class Demo {
    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.setAuction("Handsker", 200);

        Auctioneer marcus = new Auctioneer("Marcus");
        Bidder gustav = new Bidder("Gustav", 1000);

        auction.addObserver(gustav);

        gustav.joinAuction(auction);
        marcus.joinAuction(auction);


        auction.notifyObservers();
        auction.placeBid(250, gustav);
        auction.notifyObservers();
    }
}
