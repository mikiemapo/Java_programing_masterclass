public class Main {
    // method overload is method with same name declared with only different parameters this makes the overload method unique the type and return type can be the same
// method modifies  return type void,int,etc.   name     parameters use boolean first part datatype then param or argument and name inheritly created the variables
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));


    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player" + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Anonymous " + score);
        return score * 1000;
    }

    public static int calculateScore() {

        System.out.println("no Player scored no points ");
        return 0;
    }

}

