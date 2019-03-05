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
        if(topScore>secondTopScore && topScore < 100) {
            System.out.println("Greater than top score and less than 100");
        }
        // && , ||

    }
}
