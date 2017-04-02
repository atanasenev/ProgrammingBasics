import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;

        System.out.print("Square = " + area);


    }
}
