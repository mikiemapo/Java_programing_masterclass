public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared");

        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println(" Greater than second top score and less than 100");
        }

        if ((topScore > 90) || ((secondTopScore <= 90))) {
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println(" This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println(" This is not posed happen");
        }

        String makeOfCar = "Volkswagen";
        // var       operand1 condition we checking     operand2(false) if condition is true    operand 3(true) if cond is false
        boolean isDomestic = makeOfCar =="Volkswagen" ?           false :                           true;

        if (isDomestic) {
            System.out.println("This car is domestic to the country");

        }
        // var       operand1 condition we checking     operand2(true) if condition is true    operand 3(false) if cond is false
        String s = (isDomestic) ?                       "This car is domestic" :                    "This car is not domestic";

        System.out.println(s);

        double myFirstVal = 20.00d;
        double mySecondVal = 80.00d;
        double myTotal = (myFirstVal + mySecondVal) * 100.00d;
        System.out.println("My total =  " +  myTotal);

        double  myRemainder = myTotal % 40.00d;
        System.out.println("remainder = " + myRemainder);
        // var       operand1 condition we checking     operand2(false) if condition is true    operand 3(true) if cond is false
        boolean isNoRemainder = (myRemainder == 0) ?         true :                                  false;
        System.out.println("is no remainder = " + myRemainder);
        if (!isNoRemainder) {
            System.out.println("got some remainder");

        }
        }
    }


