public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = 5000;

        if(score>= 5000){
            System.out.println("Your score was >= 5000.");
        }else if(score < 1000 && score >= 500){
            System.out.println("Your score was less than 1000 but >= 500");
        }else{
            System.out.println("Your score was less than 500");
        }
    }
}
