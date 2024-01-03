package Super.Bank;

public class Konto {
    private int kontoNr;
    private double saldo;
    private String ejer;

    public Konto(int kontoNr, double saldo, String ejer) {
        this.kontoNr = kontoNr;
        this.saldo = saldo;
        this.ejer = ejer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void udskrivSaldo() {
        System.out.println(saldo);
    }
}
