

public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Invalid input
        } else {
            boolean isLeap = isLeapYear(year);

            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return isLeap ? 29 : 28;
                default:
                    return 31;
            }
        }
    }

    public static void main(String[] args) {
        getDaysInMonth(11, 2023);
    }
}
