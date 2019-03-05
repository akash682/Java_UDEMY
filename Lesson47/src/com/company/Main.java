package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       sumDigits(125343);
    }

    public static void sumDigits(int number){
        int soad = 0;
        int sum = 0;
        while(number>0) {
            soad = number%10;
            sum += soad;

            number/=10;
        }
        System.out.println(sum);
    }
}
