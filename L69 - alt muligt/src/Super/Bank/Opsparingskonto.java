package Super.Bank;

import Super.Bank.Konto;

public class Opsparingskonto extends Konto {
    private double renteSats;

    public Opsparingskonto(int kontoNr, double saldo, String ejer, double renteSats) {
        super(kontoNr, saldo, ejer);
        this.renteSats = renteSats;
    }



    public void beregnRente() {
        double renteBeløb = renteSats * getSaldo();
        setSaldo(getSaldo() + renteBeløb);
        System.out.println("Rente på " + renteBeløb + " er tilføjet til saldoen.");
    }
}
