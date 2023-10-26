public class Main {
    public static void main(String[] args) {
        // Create an instance of SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();

        // Set values for firstNumber and secondNumber
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        // Call and print the results of various methods
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        // Change values and call more methods
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
