/**
 * Created by Atanas on 11/02/2017.
 */
public class p01_Rectangle10x10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(repeatString("*", 10));
        }
    }

    static String repeatString(String stringToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
           text = text + stringToRepeat;
        }
        return text;
    }
}
