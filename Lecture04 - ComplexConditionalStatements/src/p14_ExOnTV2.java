import java.util.Scanner;

/**
 * Created by Atanas on 29/01/2017.
 */
public class p14_ExOnTV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hStrt = Integer.parseInt(scan.nextLine());
        int mStrt = Integer.parseInt(scan.nextLine());
        int hArvl = Integer.parseInt(scan.nextLine());
        int mArvl = Integer.parseInt(scan.nextLine());

        int time = ((hStrt * 60) + mStrt) - ((hArvl * 60) + mArvl);
        int hTotal = Math.abs(time / 60);
        int mTotal = Math.abs(time % 60);

        boolean ontime = time == 0 || ((hStrt >= hArvl) && (time <= 30) && (time > 0));
        boolean early = ((hStrt >= hArvl) && (time > 30) && (time > 0));

        if (ontime) {
            if (time == 0){
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.println(mTotal + " minutes before the start");
            }
        } else if (early) {
            System.out.println("Early");
            if (hTotal == 0){
                System.out.println(mTotal + " minutes before the start");
            } else {
                if (mTotal > 9){
                    System.out.println(hTotal + ":" + mTotal + " hours before the start");
                } else {
                    System.out.println(hTotal + ":0" + mTotal + " hours before the start");
                }
            }
        } else {
            System.out.println("Late");
            if (hTotal == 0){
                System.out.println(mTotal + " minutes after the start");
            } else {
                if (mTotal > 9){
                    System.out.println(hTotal + ":" + mTotal + " hours after the start");
                } else {
                    System.out.println(hTotal + ":0" + mTotal + " hours after the start");
                }
            }
        }

    }
}
