public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 5000;
        int levelCoomp = 5;
        int bonus = 100;

//        if(score< 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000.");
//        }else if(score< 1000){
//            System.out.println("Your score was less than 5000");
//        } else {
//            System.out.println("This is executed");
//        }
        if (gameOver == true) {
            int finalscore = score + (levelCoomp * bonus);
            finalscore += 1000;
            System.out.println("Your final score was" + finalscore);
        }

//        int savedFinalScore = finalscore; impossible to pull the localvariable
        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCoomp1 = 8;
        int bonus1 = 200;
        // or repushing value in the variable already exist
        if (score1 < 5000 && score1 > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000.");
        } else if (score1 < 1000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("This is executed");
        }

        if (gameOver1 == true) {
            int finalscore1 = score1 + (levelCoomp1 * bonus1);
            System.out.println("Your final score was" + finalscore1);
        }

    }
}
