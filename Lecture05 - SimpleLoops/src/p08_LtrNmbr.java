import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p08_LtrNmbr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int Sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            switch (currentChar) {
                case 'a':
                    Sum += 1;
                    break;
                case 'e':
                    Sum += 2;
                    break;
                case 'i':
                    Sum += 3;
                    break;
                case 'o':
                    Sum += 4;
                    break;
                case 'u':
                    Sum += 5;
                    break;
            }
        }
        System.out.println(Sum);
    }
}
