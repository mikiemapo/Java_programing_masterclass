public class BankAcc {
    private int accountNumber = 0;
    private double accountBalance = 0;
    private String  phoneNumber = "";
    private String customerName = "";
    private String email = "";



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
