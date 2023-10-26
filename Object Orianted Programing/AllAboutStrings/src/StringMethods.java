public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1985";
        int startingIndex = birthDate.indexOf("1985");
        System.out.println("startingIndex =" + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("-".repeat(20));

        System.out.println("Month = " + birthDate.substring(3,5));
        System.out.println("-".repeat(20));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate =" + newDate);
        System.out.println("-".repeat(20));

        System.out.println("newDate with replaced / to - =" + newDate.replace('/', '-'));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(-1));
        System.out.println("-".repeat(20));


    }
}
