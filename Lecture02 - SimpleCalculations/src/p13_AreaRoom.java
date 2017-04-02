import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Atanas on 12/01/2017.
 */
public class p13_AreaRoom {

    public static void main(String[] args){

        Scanner A = new Scanner(System.in);

        double h = Double.parseDouble(A.nextLine());
        double w = Double.parseDouble(A.nextLine());

        if (h >= 3 && w>=h && w <=100){
            double hs = h/1.2;
            double ws = (w-1)/0.7;

            double snum = (Math.floor(hs)*Math.floor(ws)) - 3;

            System.out.println((int)snum);
        }


    }
}
