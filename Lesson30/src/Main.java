public class Main {
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
        int position;
        if(playscore>= 1000){
            position = 1;
        }else if(playscore>=500 /*&& playscore<1000*/){
            position = 2;
        }else if (playscore>=100 /*&& playscore<500*/) {
            position = 3;
        }else
            position = 4;

        return  position;
    }
}
