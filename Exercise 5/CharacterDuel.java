package rpg;

import java.util.Random;

public class CharacterDuel {
    
    static Random r = new Random();
    static Wizard character1 = new Wizard("",0,0,0);
    static Thief character2 = new Thief("",0,0,0);
    static Dice dice = new Dice();
    
    public static void main(String[] args) {        
            
        //Randomized Stats for Character 1
        String char1name = "Wizard Jojo";
        int char1maxLife = character1.getMaxLife();
        int char1currentLife = character1.getCurrentLife();
        int char1maxMagic = character1.getMaxMagic();
        int char1currentMagic = character1.getCurrentMagic();
        
        //Randomized Stats for Character 2
        String char2name = "Thief Hojo";
        int char2maxLife = character2.getMaxLife();
        int char2currentLife = character2.getCurrentLife();
        int char2maxMagic = character2.getMaxMagic();
        int char2currentMagic = character2.getCurrentMagic();
        
        //Battle Purposes
        int gameOver = 0;
        int roundCount = 0;
        
        do{
                   
            int random = r.nextInt(6);
            roundCount++; 
                System.out.println("Round "+roundCount);
                switch (random) {
                    case 0:
                        int attack = character1.attack();
                        char2currentLife = char2currentLife - attack;
                        System.out.println(char1name+" damages "+char2name+" for "+attack);
                        break;
                    case 1:
                        int damage = character2.attack();
                        char1currentLife = char1currentLife - damage;
                        System.out.println(char2name+" damages "+char1name+" for "+damage);
                        break;
                    case 2:
                        int heal = character1.castHeal();
                        char1currentLife = char1currentLife + heal;
                        if (char1currentLife > char1maxLife){
                            char1currentLife = char1maxLife;
                        }
                        System.out.println(char1name+" heals. He now has "+char1currentLife+".");
                        break;
                    case 3:
                        int heal2 = character2.castHeal();
                        char2currentLife = char2currentLife + heal2;
                        if (char2currentLife > char2maxLife){
                            char2currentLife = char2maxLife;
                        }
                        System.out.println(char2name+" heals. He now has "+char2currentLife+".");
                        break;
                    case 4:
                        int cast1 = character1.castLightningBolt();
                        char2currentLife = char2currentLife - cast1;
                        System.out.println(char1name+" casts lightning bolt on "+char2name+". It deals damage for "+cast1);
                        break;
                    case 5:
                        int cast2 = character2.castQuickStrike();
                        char2currentLife = char2currentLife - cast2;
                        System.out.println(char1name+" casts quick strike on "+char2name+". It deals damage for "+cast2);
                        break;
                }
            
            System.out.println(char1name+" HP: "+char1currentLife+"/"+char1maxLife+" | MP: "+char1currentMagic+"/"+char1maxMagic);
            System.out.println(char2name+" HP: "+char2currentLife+"/"+char2maxLife+" | MP: "+char2currentMagic+"/"+char2maxMagic);
            System.out.println("========================================");
            
            if(char1currentLife <= 0 ){
                System.out.println("Game Over.");
                System.out.println(char2name+" Wins.");
                gameOver = 1;
            }else if(char2currentLife <= 0){
                System.out.println("Game Over.");
                System.out.println(char1name+" Wins.");
                gameOver = 1;
            }           
    }while(gameOver != 1);
        
    }
}