public class main {
    public static void main(String[] args) {
        boolean gameOver=true;
        int levelCOmpleted =5;
        int bonus= 30;
        int score=5000;
//        if (score==4000) {
//            System.out.println("You have scored " + score);
//            System.out.println("This statement is execued");
//            }
//        System.out.print("This is executed if false");

        if (gameOver==true) {
            int finalScore = score + (levelCOmpleted * bonus);
            System.out.println("Your score is: " + finalScore);
        }
        score= 10000;
        levelCOmpleted=8;
        bonus=200;
        if (gameOver){
            int finalScore=score+(levelCOmpleted*bonus);
            System.out.println("Your new Score is: "+ finalScore);
        }





    }
}
