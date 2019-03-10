package rpg;

public class Character {

static String n;
static int s,d,i, maxHealth, currentHealth;
    
public Character(String n, int s, int d, int i) {
}

public int attack() {
int attack = Dice.roll((5)+1);
return attack;
}

public int wound() {
int damage = Dice.roll((5)+1);
return damage;
}

public int heal() {
int heal = Dice.roll((5)+1);
return heal;
}

public String getName() {
return "";
}

public int getStrength() {
int strength = Dice.roll((5)+1);
return strength;
}

public int getDexterity() {
int dexterity = Dice.roll((5)+1);
return dexterity;
}

public int getIntelligence() {
int intelligence = Dice.roll((5)+1);
return intelligence;
}

public int getCurrentLife() {
int currentLife = getMaxLife();
return currentLife;
}

public int getMaxLife() {
return 25;
}
}