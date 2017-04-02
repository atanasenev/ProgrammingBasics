import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nasko on 22.12.2016 г..
 */
public class p12_CC {

    public static void main(String[] args)
    {

        Scanner z = new Scanner(System.in);

        System.out.print("How much money do you want to convert: ");
        double a = Double.parseDouble(z.nextLine());
        System.out.print("From which currency/BGN, USD, EUR, GBP/: ");
        String Cin = z.nextLine();
        System.out.print("To which currency/BGN, USD, EUR, GBP/: ");
        String Cout = z.nextLine();

        double bgn2usd = a / 1.79549;
        double bgn2eur = a / 1.95583;
        double bgn2gbp = a / 2.53405;

        double usd2bgn = a * 1.79549;
        double usd2eur = (1.79549 / 1.95583) * a;
        double usd2gbp = (1.79549 / 2.53405) * a;

        double eur2bgn = a * 1.95583;
        double eur2usd = (1.95583 / 1.79549) * a;
        double eur2gbp = (1.95583 / 2.53405) * a;

        double gbp2bgn = a * 2.53405;
        double gbp2eur = (2.53405 / 1.95583) * a;
        double gbp2usd = (2.53405 / 1.79549) * a;


        if(Cin.equals("BGN") && Cout.equals("USD"))
        {
            System.out.printf("%.2f", bgn2usd);
        }
        else if(Cin.equals("BGN") && Cout.equals("EUR"))
        {
            System.out.printf("%.2f", bgn2eur);
        }
        else if(Cin.equals("USD") && Cout.equals("BGN"))
        {
            System.out.printf("%.2f", usd2bgn);
        }
        else if(Cin.equals("EUR") && Cout.equals("BGN"))
        {
            System.out.printf("%.2f", eur2bgn);
        }
        else if(Cin.equals("EUR") && Cout.equals("USD"))
        {
            System.out.printf("%.2f", eur2usd);
        }
        else if(Cin.equals("USD") && Cout.equals("EUR"))
        {
            System.out.printf("%.2f", usd2eur);
        }
        else if(Cin.equals("BGN") && Cout.equals("GBP"))
        {
            System.out.printf("%.2f", bgn2gbp);
        }
        else if(Cin.equals("GBP") && Cout.equals("BGN"))
        {
            System.out.printf("%.2f", gbp2bgn);
        }
        else if(Cin.equals("GBP") && Cout.equals("EUR"))
        {
            System.out.printf("%.2f", gbp2eur);
        }
        else if(Cin.equals("EUR") && Cout.equals("GBP"))
        {
            System.out.printf("%.2f", eur2gbp);
        }
        else if(Cin.equals("USD") && Cout.equals("GBP"))
        {
            System.out.printf("%.2f", usd2gbp);
        }
        else if(Cin.equals("GBP") && Cout.equals("USD"))
        {
            System.out.printf("%.2f", gbp2usd);
        }

    }
}
