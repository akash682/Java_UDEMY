public class Lesson45 {
    public static void main(String[] args) {
        int count = 0;
        while(count !=6){
            System.out.println("Count value is " + count);
            count++;
        }

        count =1;

        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count!= 7);

        int number = 4;
        int finishnumber = 938453;

        while(number<= finishnumber){
            System.out.println(isEvennumber(number));
            number++;
        }

    }

    public static boolean isEvennumber(int number){
        if(number%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
