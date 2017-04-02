import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nasko on 10.12.2016 г..
 */
public class RecF {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Give me the first int:");
        int a = Integer.parseInt(console.nextLine());

        System.out.print("Give me the second int:");
        int b = Integer.parseInt(console.nextLine());

        System.out.print("Your answer is:");
        System.out.println(a*b);

    }
}
