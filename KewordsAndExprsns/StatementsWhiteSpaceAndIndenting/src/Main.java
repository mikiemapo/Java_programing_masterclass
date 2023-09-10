public class Main {
    public static  void main(String[] args) {
        // statement      |
        // keyword int   | expression |
        int myVar = 50;
        // statements
        myVar++;

        myVar--;

        // this a statement
        System.out.println("this is a test");

        // this a statement with white space
        System.out.println("this" +
                "is another"+
                "test");
        // this a statement
        int anotherVar = 50;
        myVar--;
        System.out.println("myVar =" + myVar);

        if (myVar == 0) {
            System.out.println("its now zero");
        }
    }
}
