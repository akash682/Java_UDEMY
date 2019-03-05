package deef;

import static deef.ThreadColor.Threadc.ANSI_GREEN;
import static deef.ThreadColor.Threadc.ANSI_PURPLE;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread ATT = new Anotherthread();
        ATT.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread.");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
