package deef;

import static deef.ThreadColor.Threadc.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println(ANSI_RED +"Hello from myRnunnabe!!");
    }
}
