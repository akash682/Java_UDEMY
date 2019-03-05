public class SumOddRange {
    public static boolean isOdd(int number){
        if(number>0){
        }else{
            return false;
        }

        if(number%2==0){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= end && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
