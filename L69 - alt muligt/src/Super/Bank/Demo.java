package Super.Bank;

public class Demo {
    public static void main(String[] args) {
        // Opret en almindelig Konto-instans
        Konto konto = new Konto(1, 1000.0, "Alice");
        System.out.println("Kontoinformation:");
        konto.udskrivSaldo();
        System.out.println();

        // Opret en Opsparingskonto-instans
        Opsparingskonto opsparingskonto = new Opsparingskonto(2, 5000.0, "Bob", 0.03);
        System.out.println("Opsparingskonto-information:");
        opsparingskonto.udskrivSaldo();
        opsparingskonto.beregnRente();
        opsparingskonto.udskrivSaldo();
    }
}
