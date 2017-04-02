import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Atanas on 12/03/2017.
 */
public class p44_SaltPepper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger number = new BigInteger(reader.readLine());

        while (true) {
            String[] input = reader.readLine().split(" ");


            if ("end".equals(input[0])) {
                break;
            }

            String command = input[0];
            int count = Integer.parseInt(input[1]);

            if ("salt".equals(command)) {
                for (int i = 0; i < 64; i += count) {
                    number = number.and(new BigInteger("1").shiftLeft(i).not());
                }
            } else {
                for (int i = 0; i < 64; i += count) {
                    number = number.setBit(i);
                }
            }
        }
        System.out.println(number.toString());
    }
}
