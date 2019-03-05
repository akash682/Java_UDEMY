public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(534353,5435343);
        getDurationString(20943);
    }

    public static void getDurationString (int minutes, int seconds){
        if(minutes>=0 && (seconds>=0)){
                int hour = minutes/60 + seconds/3600;
                int minute = minutes%60 + (seconds%3600)/60;
                int second = (seconds%3600)%60;
            System.out.println(hour + "h" + minute + "m" + second +"s");
        }else{
            System.out.println("Invalid value");
        }
    }

    public static void getDurationString (int seconds){
        if((seconds>=0)){
            int minute = seconds/60;
            int second = seconds%60;
            getDurationString(minute, second);
        }else{
            System.out.println("Invalid value");
        }
    }
}
