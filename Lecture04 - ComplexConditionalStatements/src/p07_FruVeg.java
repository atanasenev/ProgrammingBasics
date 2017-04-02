import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p07_FruVeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String fruit = s.nextLine().toLowerCase();
        String day = s.nextLine().toLowerCase();
        double q = Double.parseDouble(s.nextLine());

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                day.equals("thursday") || day.equals("friday")) {
            if (fruit.equals("banana")) {
                System.out.println(q * 2.50);
            } else if (fruit.equals("apple")) {
                System.out.println(q * 1.20);
            } else if (fruit.equals("orange")) {
                System.out.println(q * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(q * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(q * 2.70);
            } else if (fruit.equals("pineapple")) {
                System.out.println(q * 5.50);
            } else if (fruit.equals("grapes")) {
                System.out.println(q * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(q * 2.70);
            } else if (fruit.equals("apple")) {
                System.out.println(q * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(q * 0.90);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(q * 1.60);
            } else if (fruit.equals("kiwi")) {
                System.out.println(q * 3.00);
            } else if (fruit.equals("pineapple")) {
                System.out.println(q * 5.60);
            } else if (fruit.equals("grapes")) {
                System.out.println(q * 4.20);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}