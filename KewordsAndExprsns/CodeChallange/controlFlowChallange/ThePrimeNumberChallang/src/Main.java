public class Main {
    public static void main(String[] args) {
        //                         call method       if its true put empty string"" but if false slip in NOT
        System.out.println("0 IS " + (isPrime(0) ? "" : "NOT") + " a prime number");
       int count = 0;

       for (int i = 10; i <= 50; i++){
           if (isPrime(i)){
               System.out.println(" number " + i + " is a prime number" );
               count++;
               if(count == 3){
                   System.out.println("Found 3 exiting for loop");
                   break;
               }
           }
       }
    }




    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2 ) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
