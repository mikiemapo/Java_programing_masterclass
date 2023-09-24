public class SecondsAndMinuets {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); //first test
        System.out.println(getDurationString(-65, 45)); // second test
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        //validation
        if(seconds < 0){
            return  "invalid data for seconds (" + seconds + "), must be positive";
        }
        return  getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0) {
            return "invalid data for seconds";
        }
        if  (seconds <= 0 || seconds >= 59) {
            return "invalid data for minutes (" + minutes + "), must be positive ";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "S ";

    }

    public class MinutesToYearsDaysCalculator {
        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long years = minutes / (60 * 24 * 365);
                long remainingMinutes = minutes % (60 * 24 * 365);
                long days = remainingMinutes / (60 * 24);

                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }

        public class NumberChecker {
            public static void printEqual(int num1, int num2, int num3) {
                if (num1 < 0 || num2 < 0 || num3 < 0) {
                    System.out.println("Invalid Value");
                } else if (num1 == num2 && num2 == num3) {
                    System.out.println("All numbers are equal");
                } else if (num1 != num2 && num2 != num3 && num1 != num3) {
                    System.out.println("All numbers are different");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            }
        }

        public class PlayingCat {
            // write your code here
            public static boolean isCatPlaying(boolean summer, int temperature) {
                if (summer) {
                    return temperature >= 25 && temperature <= 45;
                } else {
                    return temperature >= 25 && temperature <= 35;
                }
            }
        }

    }

}

