import javax.xml.transform.sax.SAXSource;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double result=50 + 2 ;
        System.out.println(result);

        double prevresult = result;
        //substract
        result = result -2 ;
        System.out.println(prevresult + "-1 = " + result);

        //mult
        result = result *2 ;
        System.out.println(prevresult + "*1 = " + result);

        //divide
        result = result /2;
        System.out.println(prevresult + "/1 = " + result);

        //mod
        result = result %3 ;
        System.out.println(prevresult + "/1 = " + result);

        //increment
        result++;
        System.out.println(result);


        //decrement
        result--;
        System.out.println(result);

        //different
        result += 10;
        System.out.println(result);
        result-= 20;
        System.out.println(result);
        result *= 30;
        System.out.println(result);
        result/= 10;
        System.out.println(result);

        boolean isAliean = false;
        if(isAliean == false){
            System.out.println("It is not an alien");
        }else{
            System.out.println("It is alien");
        }

        int topScore = 100;
        if(topScore > 100){
            System.out.println("You got the highest score");
        }else{
            System.out.println("Less than 100");
        }

        int secondTopScore =60;
        if((topScore>secondTopScore) && topScore < 100) {
            System.out.println("Greater than top score and less than 100");
        }
        // && , ||

        if((topScore>90) || (secondTopScore <= 90)){
            System.out.println("One of the these tests is true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is a true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true: false; //isCar is condition
        if(wasCar){
            System.out.println("wasCar is true");
        }


        //Challenge
        double var1 = 20d;
        double var2 = 80d;
        double total = 25*(var1+var2);
        double reme = total % 40;
        if(reme<=20){
            System.out.println("Total was over the limit.");
        }

    }
}
