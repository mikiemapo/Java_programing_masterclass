public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers.
        }
        if (number == 0) {
            return 1; // Return 1 for the number 0.
        }

        int count = 0;//This variable will be used to count the digits in the number
        while (number > 0) {
            count++;
            number /= 10;//in each iteration to remove the last digit
        }
        return count;// represents the number of digits in the original number
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        //check if the input number is negative (less than 0).
        boolean isNegative = number < 0;

        if (isNegative) {
            // make number positive by multiplying it by -1.
            number = -number;
        }
// continues as long as number is greater than 0.
        while (number > 0) {
            int lastDigit = number % 10;
            //reverse the digits of number by multiplying reversedNumber by 10 and adding lastDigit to it.
            reversedNumber = reversedNumber * 10 + lastDigit;
            //remove the last digit from number
            number /= 10;
        }
//return reversedNumber. If isNegative was true, we negate reversedNumber before returning it.
        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }
//taking the input number and reversing its digits using the reverse method.we store it in reversedNumber
        int reversedNumber = reverse(number);
        //calculates the count of digits in the original number (number) and stores it in originalDigitCount
        int originalDigitCount = getDigitCount(number);
        //calculates the count of digits in the reversed number (reversedNumber) and stores it in reversedDigitCount.
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }

        // Print additional "Zero" if there are leading zeroes.
        int difference = originalDigitCount - reversedDigitCount;
        for (int i = 0; i < difference; i++) {
            System.out.println("Zero");
        }
    }
}
