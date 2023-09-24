public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Return false if the number is less than 1.
        } else {
            int sumOfDivisors = 0; //store the sum of proper divisors.

            //iterate through potential divisors from 1 up to number - 1 (since proper divisors exclude the numbe
            for (int divisor = 1; divisor < number; divisor++) {//
                if (number % divisor == 0) {
                    // adds the value of divisor to it, and then assigns the result back to sumOfDivisors
                    sumOfDivisors += divisor;
                }
            }

            // Check if the sum of divisors is equal to the number.
            return sumOfDivisors == number;
        }
    }
}
