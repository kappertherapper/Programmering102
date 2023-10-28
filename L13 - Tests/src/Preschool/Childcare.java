package Preschool;

import java.util.ArrayList;

public class Childcare {


    /*
     * Returns the total payment for a family minus discount
     * Pre: small >= 0, big >= 0
     * (small is the number of preschool children (1000 kr)
     * and big is the number of children attending school (2000 kr))
     */
    public int totalPayment(int small, int big) {
        ArrayList<Integer> børn = new ArrayList<>();
        int antalBørn = 0;
        børn.add(small);
        børn.add(big);

        for (int i = 0; i < børn.size(); i++) {
            antalBørn++;
        }

        int sfa = 2000;
        int daycare = 1000;

        if (antalBørn == 1) {
            if (big == 1) {
                return sfa;
            } else {
                return daycare;
            }
        } else if (antalBørn == 2 || antalBørn == 3) {
            if (big == 2 || big == 3) {

            }
            double minCharge = Math.min(daycare, sfa);
            return (int) (sfa + (0.75 * minCharge));
        } else {
            double totalCharges = 0;
            for (int i = 1; i <= antalBørn; i++) {
                if (i <= 3) {
                    totalCharges += daycare + sfa;
                } else {
                    totalCharges += 0.5 * (daycare + sfa);
                }
            }
            return (int) totalCharges;
        }
    }
}
