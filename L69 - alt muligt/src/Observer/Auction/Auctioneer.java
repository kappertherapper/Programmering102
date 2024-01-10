package Observer.Auction;

import java.util.Random;

public class Auctioneer implements Observer {
    String name;
    Random rdnmBids = new Random();
    int randomNumber = 1 + rdnmBids.nextInt(15);
    Auction auction;

    public Auctioneer(String name) {
        this.name = name;
    }

    public void joinAuction(Auction auction) {
        this.auction = auction;
        auction.addObserver(this);
        System.out.println(name + " is auctioneer for " + auction.getName());
    }

    public void update(Subject subject, Object arg) {
        if (randomNumber != 7) {
            System.out.println("Current bid is: " + auction.getBid());
        } else if (randomNumber == 7) {
            System.out.println("3... 2..... 1... the auction is over and final price is: " + auction.getBid());
            auction.setStatus(false);
        }
    }
}
