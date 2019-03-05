package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value==1){
            System.out.println("Value was 1");
        }else if(value ==2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Value was nor 1 or 2.");
                break;
        }

        char alpha = 'A';

        switch (alpha){
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Value was C or D or E");
                break;

            default:
                System.out.println("Value was nor A,B,C,D,E.");
                break;
        }


    }
}
