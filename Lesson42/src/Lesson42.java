public class Lesson42 {
    public static void main(String[] args) {
        for(int i=0; i<7; i++){
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f", calculateInterest(10000.0,i)));
        }

        for(int i=8; i>1; i--){
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f", calculateInterest(10000.0,i)));
        }

        int count = 0;
        for(int i = 10; i<100; i++){
            if(isPrime(i)){
                count++;
                System.out.print(i + ",");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
