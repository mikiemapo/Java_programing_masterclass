public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int sum = 0; // This variable will store the sum of even digits.

        while (number > 0) { // This loop will process each digit of the number.
            int digit = number % 10; // This operation gives us the last digit of the number.
            if (digit % 2 == 0) { // Check if the digit is even
                sum += digit; // Add the even digit to the sum
            }
            number /= 10; // Remove the last digit and we're left with the remaining digits for the next iteration
        }
        //In each iteration, we process the last digit, check if it's even, add it to the sum if it is, and then remove it.

        return sum;
    }
}
