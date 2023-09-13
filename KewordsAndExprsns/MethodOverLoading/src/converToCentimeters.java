public class converToCentimeters {
    public static void main(String[] args) {
        System.out.println("5ft, 8inc = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68inc = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int inches) {
            return inches * 2.54;
    }


    public static double convertToCentimeters(int feet, int inch) {
        //convert feet and inch to just inch return cm
            int feetToInches = feet * 12;
            int totalInches = feetToInches + inch;
            return convertToCentimeters(totalInches);
    }
}
