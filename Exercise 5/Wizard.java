package rpg;

public class Wizard extends Character{
    
    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    public int castLightningBolt(){
        int lightningBolt = Dice.roll((5)+1)+getIntelligence();
        return lightningBolt;
    }
    
    public int castHeal(){
        int heal = Dice.roll((5)+1)+getIntelligence();
        return heal;
    }
    
    public int getMaxMagic(){
        return 10;
    }
    
    public int getCurrentMagic(){
        int currentMagic = getMaxMagic();
        return currentMagic;
    }
}
