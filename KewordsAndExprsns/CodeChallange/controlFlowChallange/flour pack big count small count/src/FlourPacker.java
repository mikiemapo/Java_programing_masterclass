public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Check if any of the parameters is negative
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Calculate the total kilos available from big and small bags
        int bigKilos = bigCount * 5; // Each big bag contains 5 kilos
        int totalKilos = bigKilos + smallCount;

        // Check if the total kilos is greater than or equal to the goal
        // and if there are enough small bags to make up the remaining kilos
        return totalKilos >= goal && smallCount >= (goal % 5);
    }
}
