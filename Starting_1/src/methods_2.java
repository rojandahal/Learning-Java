public class methods_2 {
    public static void main(String[] args) {
        int score = 800;
        int bonus = 30;
        int levelCompleted = 5;
        boolean gameOver = true;

        System.out.print("Your first score is:\n ");
        int res=calculate(score, bonus, levelCompleted, gameOver);
        System.out.print("Your Score after adding some extra:" + res + "\n");
        System.out.print("Your second score is:\n ");
        res=calculate(10000, 50, 2, false);
        System.out.print("Your Score after adding some extra:" + res + "\n");
    }

    public static int calculate(int score, int bonus, int levelCompleted, boolean gameOver) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
            return -1;
    }
}
