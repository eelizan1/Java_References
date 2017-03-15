/**
 * Created by eeliz_000 on 3/13/2017.
 */
public class Account {
    private int accountId;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

//    setters
    public void setAccountId (int id) {
        this.accountId = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public double deposit(double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        if ((this.balance - amount) <= 0) {
            System.out.println("Insufficient Funds - Withdraw declined");
            return this.balance;
        } else {
            return this.balance -= amount;
        }
    }

    public String getProfileInfo() {
        String balance = Double.toString(this.getBalance());
        String profile = ("ID: " + getAccountId() + " " +
                "Name: " + getCustomerName() + " " +
                "Email: " + getEmail() + " " +
                "Phone: " + getPhoneNumber()
        );

        return "Balance: " + balance + " " + profile;
    }
}
