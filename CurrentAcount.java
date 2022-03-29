public class CurrentAcount extends Account {

    public CurrentAcount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Current Account Statement ===");
        super.printInfosCommom();
    }

}
