package Outfit;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Clothing clothing = new Clothing();


        //T-shirts
        Tshirt mac = new Tshirt("Mac miller", "Heavy weight", "White", 95, false, 1);
        Tshirt HGDG = new Tshirt("Her Går Det Godt", "Heavy weight", "White", 97, false, 2);

        ArrayList<Tshirt> tshirts = new ArrayList<>();
        tshirts.add(mac);
        tshirts.add(HGDG);

        //--------------------------------------------------------------------------------------------------------------

        //Shirts
        Shirt ronningGreyHoodie = new Shirt("Ronning", "Hoodie", "Grey", 90, false, 2);
        Shirt ronningNavyHoodie = new Shirt("Ronning", "Hoodie", "Navy", 85, false, 2);
        Shirt ronningGreenHoodie = new Shirt("Ronning", "Hoodie", "Green", 95, false, 1);
        Shirt ronningGreyCrew = new Shirt("Ronning", "Crewneck", "Grey", 85, false, 3);

        ArrayList<Shirt> shirts = new ArrayList<>();
        shirts.add(ronningGreyHoodie);
        shirts.add(ronningNavyHoodie);
        shirts.add(ronningGreenHoodie);
        shirts.add(ronningGreyCrew);

        //--------------------------------------------------------------------------------------------------------------

        //Pant
        Pant nike = new Pant("Nike", "Sporting pant", "Dark grey", 90, false, 3);

        ArrayList<Pant> pants = new ArrayList<>();
        pants.add(nike);

        //--------------------------------------------------------------------------------------------------------------

        //Sneakers
        Sneaker nb990v4 = new Sneaker("New Balanace", "990v4", "Olive", 100, false, 0, "U990GT4");
        Sneaker nb990v3 = new Sneaker("New Balanace", "990v3", "Grey", 95, false, 1, "M990GY3");

        ArrayList<Sneaker> sneakers = new ArrayList<>();
        sneakers.add(nb990v4);
        sneakers.add(nb990v3);

        //--------------------------------------------------------------------------------------------------------------

        //Random generator
        Random rndmTshirt = new Random();
        Tshirt rndmTtshi = tshirts.get(rndmTshirt.nextInt(tshirts.size()));

        Random rndmShirt = new Random();
        Shirt rndmShir = shirts.get(rndmShirt.nextInt(shirts.size()));

        Random rndmPant = new Random();
        Pant rndmPan = pants.get(rndmPant.nextInt(pants.size()));

        Random rndmSneaker = new Random();
        Sneaker rndmsneak = sneakers.get(rndmSneaker.nextInt(sneakers.size()));

        //--------------------------------------------------------------------------------------------------------------

        //Outfits
        //clothing.outfit(mac, ronning, nike,nb990v4);
        clothing.outfit(rndmTtshi, rndmShir, rndmPan, rndmsneak);

        System.out.println();

    }
}
