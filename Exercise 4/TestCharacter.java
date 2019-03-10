package rpg;

import java.util.Random;

public class TestCharacter {
    
    static Random r = new Random();
    static Character character = new Character("",0,0,0);
    static Dice dice = new Dice();
    
    public static void main(String[] args) {        
            
        //Randomized Stats for Character 1
        String char1name = "Jojo";
        int char1maxLife = character.getMaxLife();
        int char1currentLife = character.getCurrentLife();
        
        //Randomized Stats for Character 2
        String char2name = "Hojo";
        int char2maxLife = character.getMaxLife();
        int char2currentLife = character.getCurrentLife();
        
        //Battle Purposes
        int gameOver = 0;
        int roundCount = 0;
        
        do{
                   
            int random = r.nextInt(5);
            roundCount++; 
                System.out.println("Round "+roundCount);
                switch (random) {
                    case 0:
                        int attack = character.attack();
                        char2currentLife = char2currentLife - attack;
                        System.out.println(char1name+" damages "+char2name+" for "+attack);
                        break;
                    case 1:
                        int damage = character.wound();
                        char1currentLife = char1currentLife - damage;
                        System.out.println(char2name+" damages "+char1name+" for "+damage);
                        break;
                    case 2:
                        int heal = character.heal();
                        char1currentLife = char1currentLife + heal;
                        if (char1currentLife > char1maxLife){
                            char1currentLife = char1maxLife;
                        }
                        System.out.println(char1name+" heals. He now has "+char1currentLife+".");
                        break;
                    default:
                        int heal2 = character.heal();
                        char2currentLife = char2currentLife + heal2;
                        if (char2currentLife > char2maxLife){
                            char2currentLife = char2maxLife;
                        }
                        System.out.println(char2name+" heals. He now has "+char2currentLife+".");
                        break;
                }
            
            System.out.println(char1name+" HP: "+char1currentLife+"/"+char1maxLife);
            System.out.println(char2name+" HP: "+char2currentLife+"/"+char2maxLife);
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