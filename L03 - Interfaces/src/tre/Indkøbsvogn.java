package tre;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Indkøbsvogn {
    public static void main(String[] args) {

        String storename = "Netto";
        String address = "Thomas Koppels gade 5";
        LocalDate date = LocalDate.now();

        Elartikel ForlængerLedning = new Elartikel(35, "Forlængerledning", "3 meter", 2300);
        Elartikel KabelTromle = new Elartikel(870, "Kabeltrome", "25 meter", 4000);
        Spiritus Strykk = new Spiritus(159, "Strykk Not Gin", "70cl", 34);
        Spiritus Minttu = new Spiritus(123, "Minttu Peppermint", "50cl", 35);
        Fødevare Rødkål = new Fødevare(32, "Rømer Rødkål", "750 g", 100);
        Fødevare Sirup = new Fødevare(45, "Biogan Agave Sirup", "370g", 400);

        ArrayList<Vare> varer = new ArrayList<>();
        varer.add(ForlængerLedning);
        varer.add(KabelTromle);
        varer.add(Minttu);
        varer.add(Strykk);
        varer.add(Rødkål);
        varer.add(Sirup);

        double total = calculator(varer);
        double vat = vat(varer);
        double subtotal = total - vat;

        //System.out.println(total);
        //System.out.println(vat);

        receipt(storename, address, date, ForlængerLedning.getName(), ForlængerLedning.getPrice(), KabelTromle.getName(), KabelTromle.getPrice(),
                                            Strykk.getName(), Strykk.getPrice(), Minttu.getName(), Minttu.getPrice(),
                                            Rødkål.getName(), Rødkål.getPrice(), Sirup.getName(), Sirup.getPrice(), subtotal, vat, total);
    }

    public static double calculator(ArrayList<Vare> list) {
        double result = 0;
        for (Vare m : list) {
            result += m.priceWithVAT();
        }
        return result;
    }

    public static double vat(ArrayList<Vare> list) {
        double result = 0;
        for (Vare m : list) {
            result += m.getVAT();
        }
        return result;
    }

    public static void receipt(String storename, String address, LocalDate date, String itemName1, double itemPrice1, String itemName2, double itemPrice2,
                                                                                    String itemName3, double itemPrice3, String itemName4, double itemPrice4,
                                                                                        String itemName5, double itemPrice5, String itemName6, double itemPrice6, double subtotal, double vat, double total) {
            // Print the receipt
            System.out.println("--------------------------");
            System.out.println(storename);
            System.out.println(address);
            System.out.println("Date: "+ date);
            System.out.println("--------------------------");
            System.out.println("Item\t\tPrice");
            System.out.println("--------------------------");
            System.out.println(itemName1 +"\t\tDKK"+itemPrice1);
            System.out.println(itemName2 +"\t\tDKK"+itemPrice2);
            System.out.println(itemName3 +"\t\tDKK"+itemPrice3);
            System.out.println(itemName4 +"\t\tDKK"+itemPrice4);
            System.out.println(itemName5 +"\t\tDKK"+itemPrice5);
            System.out.println(itemName6 +"\t\tDKK"+itemPrice6);
            System.out.println("--------------------------");
            System.out.printf("Subtotal:\tDKK%.2f \n", subtotal);
            System.out.printf("vat:\tDKK%.2f \n", vat);
            System.out.printf("Total:\t\tDKK%.2f \n", total);
            System.out.println("--------------------------");
    }
}



