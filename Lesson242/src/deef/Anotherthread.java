package deef;

import static deef.ThreadColor.Threadc.ANSI_BLUE;

public class Anotherthread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from the another thread!");
    }
}
