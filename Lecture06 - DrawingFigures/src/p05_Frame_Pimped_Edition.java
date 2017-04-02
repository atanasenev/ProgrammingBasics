import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p05_Frame_Pimped_Edition {
    public static void firstRow(int input) {
        System.out.print("+ ");
        for (int i = 0; i < input - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }

    public static void secondRow(int input) {
        for (int i = 0; i < input - 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < input - 2; j++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        firstRow(n);
        secondRow(n);
        firstRow(n);


    }
}