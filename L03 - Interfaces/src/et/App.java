package et;

public class App {
    public static void main(String[] args) {
        Beer tuborg = new Beer();
        tuborg.AlcoholProcent = 4;
    }

    /**
     * Finder gennemsnit
     */
    public static double average(Measurable[] objects) {
        double sum = 0;
        double average = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        average = sum / objects.length;
        return average;
    }

    /**
     * Finder max
     */
    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure())
                max = obj;
        }
        return max;
    }


    /**
     * sort fredag middag
     * finder max af både chilli og beer
     */
    public static Measurable[] blackFridayMeal( Measurable[] chilies, Measurable[] beers) {
        return new Measurable[] {max(chilies), max(beers)};
    }
}
