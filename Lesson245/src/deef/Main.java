package deef;

public class Main {

    public static void main(String[] args) {
        Countdown ct1 = new Countdown();

        CdThread t1 = new CdThread(ct1);
        t1.setName("Thread 1");
        CdThread t2 = new CdThread(ct1);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown{

    private int i;

    public void doCountdown(){
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
                break;
        }

        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ":i =" + i);
            }
        }
    }
}

class CdThread extends Thread{
    private Countdown threadCountdown;

    public CdThread (Countdown countdown){
        threadCountdown = countdown;
    }

    public void run(){
        threadCountdown.doCountdown();
    }
}
