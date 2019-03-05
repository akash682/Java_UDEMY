public class Challenge {
    public static void main(String args[]){
        int score = calculateHighscorePosition(1500);
        displayHIghScorePosition("Tom",score);


        score = calculateHighscorePosition(900);
        displayHIghScorePosition("Frank",score);


        score = calculateHighscorePosition(500);
        displayHIghScorePosition("Paul",score);


        score = calculateHighscorePosition(50);
        displayHIghScorePosition("Akash",score);

    }

    public static void displayHIghScorePosition(String name, int pos){
        System.out.println(name + " managed to get into " + pos + " position");
    }

    public static int calculateHighscorePosition(int playscore){
        if(playscore>= 1000){
            return 1;
        }else if(playscore>=500 && playscore<1000){
            return 2;
        }else if (playscore>=100 && playscore<500) {
            return 3;
        }else
            return 4;
    }
}
