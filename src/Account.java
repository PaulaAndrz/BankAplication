public class Account {

    private String name;
    private String surname;
    private int balance;
    private int ID;

    public Account(String name, String surmane, int balance, int ID) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int cash) {
        this.balance = balance - cash;

    }

}
