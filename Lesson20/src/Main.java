import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + "and this is more.";
        System.out.println(myString);
        myString = myString + "\u00A9 2015";
        System.out.println(myString);

        String numberString = "250.222";
        numberString = numberString + "39.222";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println(lastString);

        double doublenum =120.4874;
        lastString = lastString + doublenum;
        System.out.println(lastString);
    }
}
