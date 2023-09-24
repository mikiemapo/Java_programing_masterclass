public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) { // check if number is less than 1
            System.out.println("Invalid Value");
        } else {
            int factor = 1; // initialize factor start 1 variable will be used to find factors of
            //initialized to 1 and incrementing it while checking for divisibility, we ensure that we consider all possible factors of the given numberfirsty
            while (factor <= number) { // loop that continues as long as factor is less than or equal to number.
                if (number % factor == 0) {
                    System.out.println(factor);
                }
                factor++;
            }
        }
    }
}
