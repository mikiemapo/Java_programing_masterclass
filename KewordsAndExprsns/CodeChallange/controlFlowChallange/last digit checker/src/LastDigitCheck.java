public class LastDigitCheck {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false; // Return false if any number is not within the range of 10-1000.
        }
            //extracts the last digit of each number using the modulo
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;
            //checks if at least two of the last digits are the same if so return true
        return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);// checks if any of the numbers is not within the range of 10-1000
    }
}
