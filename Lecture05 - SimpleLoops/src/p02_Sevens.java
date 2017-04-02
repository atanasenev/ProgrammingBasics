/**
 * Created by Atanas on 04/02/2017.
 */
public class p02_Sevens {
    static void DevisibleBySeven(){
        for (int i = 1; i <= 1000 ; i++) {
            if(i % 10 == 7){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        DevisibleBySeven();
    }
}
