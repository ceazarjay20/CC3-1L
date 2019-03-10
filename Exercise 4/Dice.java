package rpg;

import java.util.Random;

public class Dice {
    
    private static Random r = new Random();
    
    public static int roll(int alt) {
//    int diceRoll = r.nextInt((6-1)+1)+1;
    int roll = r.nextInt(alt);
    return roll;
}
}