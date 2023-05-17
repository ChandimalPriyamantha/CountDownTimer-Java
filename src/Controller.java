import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = inPut.nextInt();

        CountDownTimer countDownTimer = new CountDownTimer(time);
        countDownTimer.start();


    }

}
