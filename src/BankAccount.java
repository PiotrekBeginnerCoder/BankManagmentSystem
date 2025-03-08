import java.util.Scanner;

public class BankAccount {
    private static int idCounter = 1; // Globalny licznik ID
    private int idAccount; // Unikalne ID konta
    private double balance; // Saldo konta
    private String ownerAccount; // Właściciel konta

    // Konstruktor: tworzenie nowego konta
    public BankAccount(String ownerAccountUser, double balanceInitialDeposit) {
        this.ownerAccount = ownerAccountUser;
        this.idAccount = idCounter;
        idCounter++;
        this.balance = balanceInitialDeposit;
    }

    // Metoda do sprawdzania salda
    public void checkBalance() {
        System.out.println("Właściciel Konta: " + ownerAccount);
        System.out.println("ID konta: " + idAccount);
        System.out.println("Saldo konta: " + balance + " ZŁ");
    }

    // Metoda do wpłaty pieniędzy na konto
    public void deposit(double amount) {
        if (amount > 0) { 
            this.balance += amount;  
            System.out.println("Wpłacono: " + amount + " zł. Nowe saldo: " + balance + " zł.");
        } else {
            System.out.println(" Nie można wpłacić ujemnej kwoty!");
        }
    }
}
