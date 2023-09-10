public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
            // condition
        if (score < 5000 && score > 1000) {
            // code block to execute iof conditions true
            System.out.println(" Your score was less than 5000 but greater than 1000");
            // condition
        } else if (score < 1000){
            // code block to execute iof conditions true
            System.out.println(" Your score was less than 1000 ");
            // condition
        } else {
            // code block to execute iof conditions true
            System.out.println(" Got here ");
        }
    }
}
