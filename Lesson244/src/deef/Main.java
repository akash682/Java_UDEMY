package deef;

import static deef.ThreadColor.Threadc.ANSI_GREEN;
import static deef.ThreadColor.Threadc.ANSI_PURPLE;
import static deef.ThreadColor.Threadc.ANSI_RED;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread ATT = new Anotherthread();
        ATT.setName("==ANOTHER NAME==");
        ATT.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread.");
            }
        }.start();

        Thread myRun = new Thread(new MyRunnable() {
            @Override
            public void run(){
                System.out.println(ANSI_RED + "Hello aaaaaaa!");
                try{
                    ATT.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out  so I'm running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRun.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
