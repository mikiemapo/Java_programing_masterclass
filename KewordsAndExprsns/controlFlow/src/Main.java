public class Main {
    public static void main(String[] args) {
        printWeekDay(2);
        System.out.println(printDayOfWeek(5));
        natoPhonetic();
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 3;

//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was 3 a 4 or a 5");
//                System.out.println("Actually was a  " + switchValue);
//                break;
//            default :
//                System.out.println("Was not 1 o r 2");

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3 a 4 or a 5");
                System.out.println("Actually was a  " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }


    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEB", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }

    public static char natoPhonetic() {
        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'E':
                System.out.println("Ease");
            default:
                System.out.println("Letter" + charValue + "not in switch");
        }
        return charValue;
    }

    public static String printDayOfWeek(int day) {
        String dayNum = switch (day) {
            case 0 -> ("Sunday");
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");
            default -> ("Invalid Day");
        };
        System.out.println(day + dayNum);
        return dayNum;
    }
    public static void printWeekDay(int day){

        if (day == 0){
            System.out.println("Monday");
        }else if (day == 1){
            System.out.println("Tuesday");
        }else if (day == 2){
            System.out.println("Wednesday");
        }else{
            System.out.println("Invalid day");
        }

    }
}
