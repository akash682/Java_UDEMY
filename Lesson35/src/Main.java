public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(5000);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }

    //function change
    public static int calculateScore(int score){
        System.out.println("Unnamved Player" + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed Player" + " scored "+ "no points.");
        return 0;
    }

}