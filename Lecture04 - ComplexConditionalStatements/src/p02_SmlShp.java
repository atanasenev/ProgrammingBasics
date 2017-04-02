import java.util.Scanner;

/**
 * Created by Atanas on 23/01/2017.
 */
public class p02_SmlShp {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        String product = p.nextLine().toLowerCase();
        String town = p.nextLine().toLowerCase();
        double q = Double.parseDouble(p.nextLine().toLowerCase());

        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(q * 0.50);
            } else if (product.equals("water")) {
                System.out.println(q * 0.80);
            } else if (product.equals("beer")) {
                System.out.println(q * 1.20);
            } else if (product.equals("sweets")) {
                System.out.println(q * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(q * 1.60);
            }

        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(q * 0.40);
            } else if (product.equals("water")) {
                System.out.println(q * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(q * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(q * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(q * 1.50);
            }

        } else {
            if (product.equals("coffee")) {
                System.out.println(q * 0.45);
            } else if (product.equals("water")) {
                System.out.println(q * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(q * 1.10);
            } else if (product.equals("sweets")) {
                System.out.println(q * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(q * 1.55);
            }
        }
    }
}
