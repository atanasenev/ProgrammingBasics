/**
 * Created by Atanas on 09/02/2017.
 */
public class test_main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.speed = 12;
        dog.strength =10;
        dog.diet = "Omnivore";
        dog.bark();

        System.out.printf("The dog's speed is %d. Its strength is %d and it is an %s\n", dog.speed, dog.strength, dog.diet );
        dog.SetPower("Laser beams");
        System.out.println(dog.GetPower());

    }
}
