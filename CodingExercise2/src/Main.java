public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfday) {
        boolean wake;
        if (barking == true) {
            if (0<= hourOfday && hourOfday < 8 || 22 < hourOfday && hourOfday <= 24) {
                wake = true;
            } else {
                wake = false;
            }
            return wake;
        }else{
            return false;
        }
    }
}
