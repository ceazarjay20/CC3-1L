
package pizzachoice;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Arrays;

public class PizzaChoice {

    static String[] price = {"$6.99", "$8.99", "$12.50", "$15.00"};
    static String[] size = {"S","M","L","X"};
    static int counter = 0;
    static int tryAgain = 0;
    
    public static void main(String[] args) {
        
        do{
        
        String choice = JOptionPane.showInputDialog(null,"Input Pizza Size (S,M,L,X) :","",JOptionPane.QUESTION_MESSAGE);
        choice = choice.toUpperCase();
                
        List<String> list = Arrays.asList(size);
        if(list.contains(choice)){
            for(counter = 0; counter < size.length; counter++){
                if(choice.equals(size[counter])){
                    JOptionPane.showMessageDialog(null,"Pizza price is :"+price[counter],"",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }else{
        JOptionPane.showMessageDialog(null,"Invalid input","",JOptionPane.ERROR_MESSAGE);
        }
        
        tryAgain = JOptionPane.showConfirmDialog(null,"Would you like to do another purchase?","",JOptionPane.YES_NO_OPTION);
            
        }while(tryAgain == 0);
        
        JOptionPane.showMessageDialog(null,"Have a nice day","",JOptionPane.PLAIN_MESSAGE);
    }
}
