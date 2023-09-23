public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of 1234 is "+ sumDigits (1234));
        System.out.println("The sum of 234 is "+ sumDigits (-125));
        System.out.println("The sum of 1234 is "+ sumDigits (4));
        System.out.println("The sum of 1234 is "+ sumDigits (32123));
    }
    public static int sumDigits(int number){

        if (number < 0) { //if number is less than 0 return -1
            return -1;
        }

        int sum = 0;

        while (number > 9) { // keep looping number is greater than 9 we will add the numbers in reverse and drop each last digit per iteration
            sum += (number % 10); //get most right digit
            number = number / 10;// drop most right digit
    }
        sum += number; // add up the numbers per loop cycle
        return sum;
}

}


