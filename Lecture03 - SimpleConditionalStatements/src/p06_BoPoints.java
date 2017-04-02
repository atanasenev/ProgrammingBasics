import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p06_BoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double points = Double.parseDouble(scanner.nextLine());
        double points100;
        double points500;
        double points1000;

        if (points <= 100) {
            points100 = points + 5;

            if (points % 2 == 0) {
                System.out.println(5 + 1);
                System.out.println(points100 + 1);
            } else if (points % 10 == 5) {
                System.out.println(5 + 2);
                System.out.println(points100 + 2);
            } else {
                System.out.println(5);
                System.out.println(points100);
            }
        } else if (points > 100 && points <= 1000) {
            points500 = 0.2 * points + points;
            if (points % 2 == 0) {
                System.out.println(0.2 * points + 1);
                System.out.println(points500 + 1);
            } else if (points % 10 == 5) {
                System.out.println(0.2 * points + 2);
                System.out.println(points500 + 2);
            } else {
                System.out.println(0.2 * points);
                System.out.println(points500);
            }
        } else if (points > 1000){
            points1000 = points * 0.1 + points;
            if (points % 2 == 0) {
                System.out.println(0.1 * points + 1);
                System.out.println(points1000 + 1);
            } else if (points % 10 == 5) {
                System.out.println(0.1 * points + 2);
                System.out.println(points1000 + 2);
            } else {
                System.out.println(0.1 * points);
                System.out.println(points1000);
            }

        }
    }}