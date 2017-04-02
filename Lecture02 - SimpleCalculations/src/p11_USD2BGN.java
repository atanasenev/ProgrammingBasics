import java.util.Scanner;

/**
 * Created by Nasko on 22.12.2016 г..
 */
public class p11_USD2BGN {
    public static void main(String[] args){
        Scanner popy = new Scanner(System.in);

        double usd = Double.parseDouble(popy.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("%.2f", bgn);
    }

}
