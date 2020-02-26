public class method_challange {

    public static void main(String[] args) {
        int res;
        res = calculateHighscorePosition(1000);
        displayHighScorePosition("Hari", res);

        res = calculateHighscorePosition(900);
        displayHighScorePosition("Shyam", res);

        res = calculateHighscorePosition(400);
        displayHighScorePosition("Krishna", res);

        res = calculateHighscorePosition(50);
        displayHighScorePosition("Joshi", res);
    }

    public static void displayHighScorePosition(String name, int pos) {
        System.out.println(name + " managed to get in position "
                + pos + " on the high score table");
    }

    public static int calculateHighscorePosition(int score) {
//        if(score>=1000)
//            return 1;
//        else if (score>=500)
//            return 2;
//        else if (score >=100)
//            return 3;
//        return 4;
        int position = 4;
        if (score >= 1000)
            position = 1;
        else if (score >= 500)
            position = 2;
        else if (score >= 100);
            position = 3;
        return position;
    }

}
