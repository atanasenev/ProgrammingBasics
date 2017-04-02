import java.util.Scanner;

/**
 * Created by Atanas on 06/03/2017.
 */
public class p23_Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double monthlyWorkDays = Double.parseDouble(scan.nextLine());
        double revenuePerDay = Double.parseDouble(scan.nextLine());
        double USDtoBGN = Double.parseDouble(scan.nextLine());

        double monthlySalary = monthlyWorkDays * revenuePerDay;
        double yearlySalary = (monthlySalary * 12) + (2.5 * monthlySalary);
        double salaryTax = yearlySalary * 0.25;
        double yearlyRevenue = (yearlySalary - salaryTax) * USDtoBGN;
        double medianDaylyRevenue = yearlyRevenue/365;

        System.out.printf("%.2f", medianDaylyRevenue);

    }
}
