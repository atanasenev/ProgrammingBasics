/**
 * Created by Atanas on 09/02/2017.
 */
public class Animal {
    int speed;
    int strength;
    String diet;
    private String secretPower;

    public String GetPower(){ // Getter
        return secretPower;
    }

    public void SetPower(String a){
        this.secretPower = a;
    }
    void bark(){
        System.out.println("Woofady Wooof Woof, dude");
    }
}
