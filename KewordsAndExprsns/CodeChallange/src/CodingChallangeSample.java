public class CodingChallangeSample {



    public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            } else {
                return Math.round(kilometersPerHour / 1.609);
            }
        }

        public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {
                int milesPerHour = (int) Math.round(kilometersPerHour / 1.609);
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }
    }
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}

    public class BarkingDog {
        public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }
    }
    public class LeapYear {
        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                // Check if the year is divisible by 4.
                boolean divisibleBy4 = (year % 4 == 0);

                // Check if the year is divisible by 100.
                boolean divisibleBy100 = (year % 100 == 0);

                // Check if the year is divisible by 400.
                boolean divisibleBy400 = (year % 400 == 0);

                // A leap year is divisible by 4, but not divisible by 100 unless it's also divisible by 400.
                return (divisibleBy4 && !divisibleBy100) || divisibleBy400;
            } else {
                return false;
            }
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply both numbers by 1000 to keep three decimal places and convert to integers.
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);

        // Check if the integer representations of the numbers are equal.
        return intNum1 == intNum2;
    }

    public class EqualSumChecker {
        public static boolean hasEqualSum (int num1, int num2, int num3){
            int sum = num1 + num2;
            if (sum == num3){
                return true;
            }else{
                return false;
            }
        }

    }
    public class TeenNumberChecker {
        public static boolean hasTeen(int num1, int num2, int num3) {
            if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isTeen(int num) {
            if (num >= 13 && num <= 19) {
                return true;
            } else {
                return false;
            }
        }
    }

    public class AreaCalculator {
        public static double area(double radius) {
            if (radius < 0) {
                return -1.0;
            }
            return Math.PI * (radius * radius);
        }

        public static double area(double x, double y) {
            if (x < 0 || y < 0) {
                return -1.0;
            }
            return x * y;
        }
    }



}

