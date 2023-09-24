public class whileMain {
    public static void main(String[] args) {

        int number = 0;
        while (number < 15) { // check condition
            number++;// number = 10
            if (number <= 5) {// check condition
                System.out.println("Skipping number " + number);
                continue;
            }
            System.out.println("number = " + number);// execute block number
            if (number >= 10) {// check condition
                System.out.println("Breaking at " + number);// execute code block
                break;// break when 10
            }
        }
    }
}