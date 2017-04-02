import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p04_SumN {
    public static void main(String[] args) {
    SumNum();
    }
    static void SumNum(){
        Scanner s = new Scanner(System.in);
        // input number of ints to sum
        int n = Integer.parseInt(s.nextLine());
        int b = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s.nextLine());
            b = b + a;
        }
        System.out.println(b);
    }
}
