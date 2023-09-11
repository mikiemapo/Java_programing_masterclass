public class MainChallange {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        // execute or calling method as an expression and as an expression only
        int highScore = calculateScore( gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("Your NEXT high score is " +
                // execute or calling method as a statement this comunicate with return type called procedure
                        calculateScore(gameOver, score, levelCompleted, bonus));

    }
        // method  return type void,int,etc.   name     parameters use boolean first part datatype then param or argument and name inheritly created the variables
       public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
           int finalScore = score;
           if (gameOver) {
               finalScore += (levelCompleted * bonus);
               finalScore += 1000;
           }
           return finalScore;

       }
    }

