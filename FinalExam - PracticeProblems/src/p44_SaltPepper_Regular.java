import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Atanas on 12/03/2017.
 */
public class p44_SaltPepper_Regular {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.parseLong(reader.readLine());

        while (true) {
            String[] input = reader.readLine().split(" ");

            if ("end".equals(input[0])) {
                break;
            }

            String command = input[0];
            int count = Integer.parseInt(input[1]);

            if ("salt".equals(command)) {
                for (int i = 0; i < 64; i += count) {
                    long mask = ~(1L << i);
                    number &= mask;
                }
            } else {
                for (int i = 0; i < 64; i += count) {
                    long mask = 1L << i;
                    number |= mask;
                }
            }
        }
        System.out.println(number);
    }
}
