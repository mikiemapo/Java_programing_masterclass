public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1; // Return -1 as an error code if either number is less than 10.
        } else {
            // Find the minimum of the two numbers.
            int min = Math.min(first, second);

            // Start from the minimum and work downwards to find the GCD.
            for (int divisor = min; divisor >= 1; divisor--) {
                if (first % divisor == 0 && second % divisor == 0) {
                    return divisor; // Return the GCD as an int if found.
                }
            }
            return 1; // If no common divisor greater than 1 is found, return 1 as an int.
        }
    }
}
