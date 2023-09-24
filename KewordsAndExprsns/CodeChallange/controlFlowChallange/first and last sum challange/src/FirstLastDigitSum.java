public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int lastDigit = number % 10; // Get the last digit %. This operation gives us the remainder when number is divided by 10.

        // To find the first digit, we need to loop until we reach it
        while (number >= 10) { // loop that continues as long as number is greater than or equal to 10.
            number /= 10; //  repeatedly divide number by 10 to remove the last digit
        }
        int firstDigit = number; // What remains is the first digit

        int sum = firstDigit + lastDigit;
        return sum;
    }
}
