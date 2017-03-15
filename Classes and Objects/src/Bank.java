/**
 * Created by eeliz_000 on 3/13/2017.
 */
public class Bank {
    public static void main (String[] args) {

        Account acc1 = new Account();

        acc1.setAccountId(1);
        acc1.setCustomerName("Enrico");
        acc1.setEmail("eelizanjr@gmail.com");
        acc1.setPhoneNumber("678-517-4706");
        acc1.setBalance(100.00);

        acc1.deposit(100.00);
        acc1.withdraw(500.00);

        System.out.println(acc1.getProfileInfo());

    }
}
