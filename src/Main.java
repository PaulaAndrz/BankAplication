public class Main {
    public static void main(String[] args) {

        Account user = new Account("Paula", "Janik",63210,120);
        System.out.println(user.getBalance());

        user.withdrawal(15);
        System.out.println(user.getBalance());
    }
}
