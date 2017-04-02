import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p11_Fort {
    static String magic(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // Top

        if (n % 2 == 0) {
            for (int i = 0; i < 1; i++) {
                String tower = "/" + magic("^", n / 2) + "\\";
                String spaceTower = magic("_", 2 * n - (n + 4));
                System.out.println(tower + spaceTower + tower);
            }
        } else if (n % 2 != 0) {
            for (int i = 0; i < 1; i++) {
                String tower = "/" + magic("^", n / 2) + "\\";
                String spaceTower = magic("_", 2 * n - (n + 3));
                System.out.println(tower + spaceTower + tower);
            }
        }

        // Body - 1 Row

        for (int i = 0; i < n - 3; i++) {
            String wall = "|";
            String space = magic(" ", 2 * n - 2);
            System.out.println(wall + space + wall);

        }

        // Last Row

        if (n % 2 == 0) {
            for (int i = 0; i < 1; i++) {
                String wall = "|";
                String space = magic(" ", n / 2 + 1);
                String bottom = magic("_", 2 * n - (n + 4));
                System.out.println(wall + space + bottom + space + wall);

            }
        } else if (n % 2 != 0) {
            for (int i = 0; i < 1; i++) {
                String wall = "|";
                String space = magic(" ", n / 2 + 1);
                String bottom = magic("_", 2 * n - (n + 3));
                System.out.println(wall + space + bottom + space + wall);
            }
        }


        // Bottom

        if (n % 2 == 0) {
            for (int i = 0; i < 1; i++) {
                String tower = "\\" + magic("_", n / 2) + "/";
                String spaceTower = magic(" ", 2 * n - (n + 4));
                System.out.println(tower + spaceTower + tower);
            }
        } else if (n % 2 != 0) {
            for (int i = 0; i < 1; i++) {
                String tower = "\\" + magic("_", n / 2) + "/";
                String spaceTower = magic(" ", 2 * n - (n + 3));
                System.out.println(tower + spaceTower + tower);
            }
        }

    }
}

