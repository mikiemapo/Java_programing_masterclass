

public class Main {
    public static class SumOddRange {
        public static boolean isOdd(int number) {
            if (number > 0 && number % 2 != 0) {
                // The number is positive and odd
                return true;
            } else {
                // The number is not positive or not odd
                return false;
            }
        }

        public static int sumOdd(int start, int end) {
            if (start > 0 && end >= start) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
                return sum;
            } else {
                // Invalid input, return -1
                return -1;
            }
        }
    }

    public static void main(String[] args) {

    }
}
