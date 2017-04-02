import java.util.Scanner;

public class p09_C2F {
    public static void main(String[] args) {

        Scanner chappy = new Scanner(System.in);

        double C = Double.parseDouble(chappy.nextLine());
        double F = (C * 1.8) + 32;

        System.out.printf("%.2f", F);
    }
}
