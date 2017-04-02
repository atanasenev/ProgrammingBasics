import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p07_NumberInRange_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give me an int[1...100]: ");
        int n = Integer.parseInt(scan.nextLine());

        while(n<=0 || n>100){
            System.out.println("Wrong!!!");
            System.out.print("Give me an int[1...100]: ");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.println("IIIIIIt's: " + n);


    }
}

