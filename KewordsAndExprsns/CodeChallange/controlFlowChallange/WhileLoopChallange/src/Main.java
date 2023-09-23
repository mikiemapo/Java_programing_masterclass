public class Main {
    public static void main(String[] args) {


        int numRange = 5;
        int endNum = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (numRange <= endNum) {
            numRange++;
            if (!isEvenNumber(numRange)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + numRange);
            evenCount++;
            if(evenCount >= 5){
                break;
            }
        }

        System.out.println("total odd numbers found = "+ oddCount);
        System.out.println("total even numbers found = "+ evenCount);
    }
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
