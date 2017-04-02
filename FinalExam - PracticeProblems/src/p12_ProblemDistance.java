import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p12_ProblemDistance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kilometersPerHour = Double.parseDouble(scan.nextLine());
        double minutesTravelled1 = Double.parseDouble(scan.nextLine());
        double minutesTravelled2 = Double.parseDouble(scan.nextLine());
        double minutestravelled3 = Double.parseDouble(scan.nextLine());


        double distance1 = kilometersPerHour * (minutesTravelled1 / 60);
        kilometersPerHour = kilometersPerHour + (kilometersPerHour * 0.1);
        double distance2 = kilometersPerHour * (minutesTravelled2 / 60);
        kilometersPerHour = kilometersPerHour - (kilometersPerHour*0.05);
        double distance3 = kilometersPerHour * (minutestravelled3 / 60);

        System.out.printf("%.2f", (distance1+distance2+distance3));
    }
}
