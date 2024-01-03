package Encapsulation;

public class BankAccount {
    private double accountBalanace;
    private String accountNumber;

    public BankAccount(double accountBalanace, String accountNumber) {
        if (accountBalanace > 0) {
            this.accountBalanace = accountBalanace;
        }
        this.accountNumber = accountNumber;
    }

    public double getAccountBalanace() {
        return accountBalanace;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalanace(double accountBalanace) {
        if (accountBalanace <= 0) {
            throw new IllegalArgumentException("Balance cant lower then 0");
        } else {
            this.accountBalanace = accountBalanace;
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount cant be 0 or lower");
        } else {
            this.accountBalanace += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount cant be 0 or lower");
        } else {
            this.accountBalanace -= amount;
        }
    }

    public void seceuredString() {
        String accountNumber = getAccountNumber();
        System.out.println("Account number is: ");
        System.out.println("**** **** **** " + accountNumber.substring(12,16));
        System.out.println("Account Balanance is: ");
        System.out.println(getAccountBalanace());
    }
}
