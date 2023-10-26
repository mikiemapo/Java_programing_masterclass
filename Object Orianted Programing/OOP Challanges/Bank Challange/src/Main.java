public class Main {
    public static void main(String[] args) {


        BankAcc Mike = new BankAcc();// default constructor no args
//        BankAcc Mike = new BankAcc(12345,  5000.00,
//                "+09876536", "Mike",
//                "email@email.com") ;
        System.out.println(Mike.getAccountNumber());
        System.out.println(Mike.getAccountBalance());

//        Mike.setAccountBalance(50.00);
//        Mike.setAccountNumber(12345);
//        Mike.setCustomerName("Mike");
//        Mike.setEmail("email@email.com");
//        Mike.setPhoneNumber("+09876536");

        Mike.deposit(50.00);
        Mike.withdraw(155.50);

        Mike.describeAcc();

        BankAcc timsAccount = new BankAcc("12345" , "Tim",
                "tim@email.com");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber()
                + "; name " + timsAccount.getCustomerName());
    }
}
