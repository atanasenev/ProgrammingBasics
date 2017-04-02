import javax.sound.midi.Soundbank;
import java.io.Console;
import java.util.Scanner;

/**
 * Created by Atanas on 28/02/2017.
 */
public class p07_SleepyTom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int restDays = Integer.parseInt(scan.nextLine());
        int workDays = 365 - restDays;

        int playTimeWithTom = (restDays * 127) + (workDays * 63);
        int time = Math.abs(30000 - playTimeWithTom);
        int h = time / 60;
        int m = time % 60;


        if (playTimeWithTom > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", h, m);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", h, m);
        }

    }
}
