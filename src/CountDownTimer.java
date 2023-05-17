import java.util.Scanner;

public class CountDownTimer extends Thread {


   private int time;

    public CountDownTimer(int time) {
        this.time = time;

    }

    @Override
    public void run() {



        for(; time >= 0; time--){
            System.out.println( time+"s");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
