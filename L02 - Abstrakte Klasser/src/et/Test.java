package et;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Mechanic sort = new Mechanic("sortfinger", "havnen", "1999", 170);
        Mechanic hvid = new Mechanic("hvidfinger", "havnen", "1996", 170);
        Foreman blå = new Foreman("blåfinger", "havnen", 170, "1980", 69);
        Survoyer gul = new Survoyer("gulfinger", "havnen", "1969", 170,12);
        WorkingBoy lilla = new WorkingBoy("lillafinger", "havnen", 145, 25);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(sort);
        list.add(hvid);
        list.add(blå);
        list.add(gul);
        list.add(lilla);

        for (Employee g : list) {
            System.out.println(g.getName() + ": " + g.weeklySalary());
        }
        System.out.println(totalWeeklySalary(list));
    }

    public static double totalWeeklySalary(ArrayList<Employee> list) {
        double result = 0;
        for (Employee m : list) {
            result += m.weeklySalary();
        }
        return result;
    }
}

