public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number will compare the reversed number with the original number later.
        int reverse = 0;//This will store the reversed version

        while (number != 0) { //continues as long as number is not equal to 0.
            int lastDigit = number % 10; // Get and store the last digit
            reverse = reverse * 10 + lastDigit; // Build and store the reverse number * 10 = eg 12*10 = 120
            number /= 10; // Remove the last digit from the original number continue the process with the remaining digits.
        }

        // Compare the original number with the reverse to check if it's a palindrome
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        int num = 122; // You can change this to test different numbers
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
