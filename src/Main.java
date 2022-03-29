package src;

public class Main {

    public static void main(String[] args) {
        Client yuri = new Client();
        yuri.setName("Yuri");

        Account ca = new CurrentAcount(yuri);
        Account savings = new SavingsAccount(yuri);

        ca.deposit(100);
        ca.transfer(100, savings);
        savings.deposit(100);
        savings.transfer(25.50, ca);

        ca.printExtract();
        savings.printExtract();

    }

}
