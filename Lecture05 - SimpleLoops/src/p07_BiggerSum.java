import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p07_BiggerSum {

    public static int sumNum(int n){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a =Integer.parseInt(s.nextLine());
            sum += a;
        }
        return sum;


    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());

        int res1 = sumNum(n);
        int res2 = sumNum(n);

        if(res1 == res2){
            System.out.println("Yes, sum = " + res1);
        } else{
            System.out.println("No, diff = " + (Math.max(res1, res2) - Math.min(res1, res2)));
        }
    }
}
