package Super;

public class Dyr {
    String navn;
    int alder;

    public Dyr(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public void udskrivInformation() {
        System.out.println("Dyret hedder: " + navn + " og er " + alder + " år gammel");
    }
}
