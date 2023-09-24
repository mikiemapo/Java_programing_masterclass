public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // Return false if either number is not within the range of 10-99.
        }

        int digit1FromNum1 = num1 % 10; // extract the last digits from num1 store in digit1FromNum1
        int digit2FromNum1 = num1 / 10; // extract first digit of num1, which is obtained by integer division /.

        while (num2 > 0) {
            int digit2 = num2 % 10; //extract the last digit of num2 and store it in digit2
            if (digit1FromNum1 == digit2 || digit2FromNum1 == digit2) { //check if digit1FromNum1 (the last digit of num1) is equal to digit2 OR if digit2FromNum1 (the first digit of num1) is equal to digit2
                return true;
            }
            num2 /= 10; //If no shared digit is found in this iteration, we remove the last digit from num2
        }

        return false;
    }
}
