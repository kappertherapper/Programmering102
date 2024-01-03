package Super;

public class Hund extends Dyr {
    String race;

    public Hund(String navn, int alder, String race) {
        super(navn, alder);
        this.race = race;
    }

    public void gø() {
        System.out.println("Hunden " + navn + " gøer");
    }
}
