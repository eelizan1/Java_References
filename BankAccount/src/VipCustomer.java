/*
* VipCustomer
*
* IT SHOULD HAVE 3 FIELDS - NAME, CREDIT LIMIT, AND EMAIL ADDRESS
* CREATE 3 CONSTRUCTORS
*
* 1ST CONSTRUCTOR EMPTY SHOULD CALL THE CONSTRUCTOR WITH 3 PARAMETERS WITH DEFAULT VALUES
* 2ND CONSTRUCTOR SHOULD PASS ON THE 2 VALUES IT RECEIVES AND ADD A DEFAULT VALUE FOR THE 3RD
* 3RD CONSTRUCTOR SHOULD SAVE ALL FIELDS
*
* CREATE GETTERS ONLY FOR THIS USING CODE GENERATION OF INTELLIJ AS SETTERS WONT BE NEEDED
* TEST AND CONFIRM IT WORKS
*
* */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("DefaultName", 1000.00, "Default Email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown Email");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
