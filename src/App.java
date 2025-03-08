public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankaccount = new BankAccount("Piotr", 15);
        BankAccount bankaccount1 = new BankAccount("Krzysztof", 20);
        BankAccount bankaccount2 = new BankAccount("Łukasz", 500);
        bankaccount.checkBalance();
        bankaccount1.checkBalance();
        bankaccount2.checkBalance();
        bankaccount.deposit(50);
        bankaccount1.deposit(100);
        bankaccount2.deposit(2000);
        
    }
}
