package deef;

import static deef.ThreadColor.Threadc.ANSI_BLUE;

public class Anotherthread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from !" + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up.");
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
