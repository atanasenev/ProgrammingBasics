import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p34_PokemonBatttles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int personAPokemonNumber = Integer.parseInt(scan.nextLine());
        int personBPokemonNumber = Integer.parseInt(scan.nextLine());
        int maxNumberOfBattles = Integer.parseInt(scan.nextLine());
        int foughtBattles = 0;


        for (int i = 1; i <= personAPokemonNumber ; i++) {
            for (int j = 1; j <= personBPokemonNumber; j++) {
                if(foughtBattles == maxNumberOfBattles){
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                foughtBattles++;
            }
        }
    }
}
