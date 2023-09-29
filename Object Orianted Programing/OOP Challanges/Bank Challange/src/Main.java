public class Main {
    public static void main(String[] args) {

        BankAcc bankAcc = new BankAcc();
        bankAcc.setEmail("email@email.com");



        BankAcc Mike = new BankAcc();

        Mike.setAccountBalance(50.00);
        Mike.setAccountNumber(12345);
        Mike.setCustomerName("Mike");
        Mike.setEmail("email@email.com");
        Mike.setPhoneNumber("+09876536");

        Mike.deposit(50.00);
        Mike.withdraw(155.50);

        Mike.describeAcc();
    }
}
