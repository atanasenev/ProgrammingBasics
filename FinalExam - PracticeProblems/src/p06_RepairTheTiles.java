import java.util.Scanner;

/**
 * Created by Atanas on 28/02/2017.
 */
public class p06_RepairTheTiles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //	N – дължината на страна от площадката в интервала [1...100]
        //	W – широчината на една плочка в интервала [0.1...10.00]
        //	L – дължината на една плочка в интервала [0.1...10.00]
        //	М – широчината на пейката в интервала [0...10]
        //	О – дължината на пейката в интервала [0...10]
        double N = Double.parseDouble(scan.nextLine());
        double W = Double.parseDouble(scan.nextLine());
        double L = Double.parseDouble(scan.nextLine());
        double M = Double.parseDouble(scan.nextLine());
        double O = Double.parseDouble(scan.nextLine());

        double plotArea = ((N * N) - (M * O));
        double tileArea = W * L;
        double neededTiles = plotArea / tileArea;
        double installationTime = neededTiles * 0.2;

        System.out.printf("%.12f\n", neededTiles);
        System.out.printf("%.12f", installationTime);



    }
}
