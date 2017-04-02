import java.util.Scanner;

/**
 * Created by Atanas on 24/01/2017.
 */
public class p09_Cmsh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String town = s.nextLine().toLowerCase();
        double income = Double.parseDouble(s.nextLine());

        switch (town) {
            case "sofia":
                if (income >= 0 && income <= 500) {
                    System.out.println(income * 0.05);
                } else if (income > 500 && income <= 1000) {
                    System.out.println(income * 0.07);
                } else if (income > 1000 && income <= 10000) {
                    System.out.println(income * 0.08);
                } else if ( income > 10000){
                    System.out.println(income * 0.12);
                } else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if (income >= 0 && income <= 500) {
                    System.out.println(income * 0.055);
                } else if (income > 500 && income <= 1000) {
                    System.out.println(income * 0.08);
                } else if (income > 1000 && income <= 10000) {
                    System.out.println(income * 0.12);
                } else if ( income > 10000){
                    System.out.println(income * 0.145);
                } else {
                    System.out.println("error");
                }
                break;
            case "varna":
                if (income >= 0 && income <= 500) {
                    System.out.println(income * 0.045);
                } else if (income > 500 && income <= 1000) {
                    System.out.println(income * 0.075);
                } else if (income > 1000 && income <= 10000) {
                    System.out.println(income * 0.10);
                } else if ( income > 10000){
                    System.out.println(income * 0.13);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");

        }
    }
}
