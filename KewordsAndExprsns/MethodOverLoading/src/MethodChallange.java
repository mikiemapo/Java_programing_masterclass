public class MethodChallange {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition( 1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition( 1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition( 500);
        displayHighScorePosition("Percy", highScorePosition);

         highScorePosition = calculateHighScorePosition( 100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition( 25);
        displayHighScorePosition("James", highScorePosition);

    }
// method modifies  return type void,int,etc.   name     parameters use boolean first part datatype then param or argument and name inheritly created the variables

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "  managed to get into position"
                    + highScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if (playerScore >=500 ) {
            return 2;
        }else if (playerScore >= 100) {
            return 3;
        }
            return 4;
        }
    }