package rpg;

public class Thief extends Character{
    
    public Thief(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    public int castQuickStrike(){
        int heavyStrike = Dice.roll((5)+1)+getDexterity();
        return heavyStrike;
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
