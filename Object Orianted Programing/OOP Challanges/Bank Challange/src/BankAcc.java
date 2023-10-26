public class BankAcc {
    private int accountNumber = 0; // field instance variable
    private double accountBalance = 0;
    private String  phoneNumber = "";
    private String customerName = "";
    private String email = "";

    //calling constructor
//    public  BankAcc() { // no args constructor
//        System.out.println("Empty constructor called");
//    }

    //object constructor
    public  BankAcc() { // args constructor chaining calling a constructor within another constructor
        this(56789, 2.50, " ",
                " ", " ");
        System.out.println(" constructor chain called");
    }


    //constructor with args now  more tha 1 constructor is overload
    public BankAcc(int accountNumber, double accountBalance, String phoneNumber,
                   String customerName, String email){
        System.out.println("Account constructor with params called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.phoneNumber =phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAcc(String phoneNumber, String customerName, String email) {
        this(99999, 100.55, phoneNumber,customerName,email);
//        this.phoneNumber = phoneNumber;
//        this.customerName = customerName;
//        this.email = email;
    }

    //GETTERS and SETTERS
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount){
        accountBalance = accountBalance + amount;
        System.out.println("Deposit : " + amount + " Current balance : " + accountBalance);
    }

    public void withdraw(double debit) {
        double currentBalance = accountBalance;
        double debitBalance = accountBalance - debit;
        if (accountBalance < debit) {
            System.out.println("Amount invalid");
            System.out.println("Your Current balance is : " + currentBalance);
        } else {
            System.out.println("Withdrawal : " + debit + " Current balance : " + debitBalance);
        }
    }
    public  void describeAcc(){

        System.out.println("Acc Number : " + accountNumber +" Your account has : " + accountBalance );
        System.out.println("Acc holder name : " + customerName + "contact : " + phoneNumber + " : " + email  );
    }
}
