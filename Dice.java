import java.util.Random;

public class Dice {
    
    public Dice(){
    }

    public int numofDice(){
        Random rnd = new Random();
        return rnd.nextInt(6) + 1;
    }
    

}

