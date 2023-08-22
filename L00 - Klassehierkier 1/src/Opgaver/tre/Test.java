package Opgaver.tre;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Mechanic sort = new Mechanic("sortfinger", "havnen", "1999", 170);
        Mechanic hvid = new Mechanic("hvidfinger", "havnen", "1996", 170);
        Foreman blå = new Foreman("blåfinger", "havnen", "1969", 170, "1980", 43);
        Survoyer gul = new Survoyer("gulfinger", "havnen", "1969", 170,12);

        ArrayList<Mechanic> list = new ArrayList<>();
        list.add(sort);
        list.add(hvid);
        list.add(blå);
        list.add(gul);

        for (Mechanic g : list) {
            System.out.println(g.getName() + ": " + g.weeklySalary());
        }
        System.out.println(totalWeeklySalary(list));
    }

    public static double totalWeeklySalary(ArrayList<Mechanic> list) {
        double result = 0;
        for (Mechanic m : list) {
            result += m.weeklySalary();
        }
        return result;
    }
}

