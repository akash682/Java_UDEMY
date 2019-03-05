public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver1 = true;
        int score = 800;
        int levelCoomp =5;
        int bonus = 100;

        calculateScore(gameOver1,score,levelCoomp,bonus);

        score = 10000;
        levelCoomp = 8;
        bonus = 200;

        calculateScore(gameOver1,score,levelCoomp,bonus);

    }

    public static int calculateScore(boolean gameOver1, int score, int levelCoomp, int bonus){
        if (gameOver1) {
            int finalscore1 = score + (levelCoomp * bonus);
            System.out.println("Your final score was" + finalscore1);
            return finalscore1;
        }else {
            return -1;
        }
    }
}
