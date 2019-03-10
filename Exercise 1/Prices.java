package prices;

public class Prices {

    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    static double[] arr = new double[5];
    static int counter = 0;
    static double sum = 0;
    static double ave = 0;
    
    public static void main(String[] args) {
        Prices.getPrice().sum().lesser().average().higher();
    }
    
    public static Prices getPrice(){
        
        for(counter = 0; counter < arr.length; counter++){
            System.out.print("Enter Price No. "+(counter+1)+": ");
            arr[counter] = sc.nextDouble();
        }
        return null;
    }
    
    public static Prices sum(){
        sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        
        System.out.println("Sum: "+sum);
        return null;
    }
    
    public static Prices lesser(){
        System.out.println("Prices Lesser than $5.00: ");
        for(counter = 0; counter < arr.length; counter++){
            if(arr[counter] < 5.00){
                System.out.print("$"+arr[counter]+" , ");
            }
        }
        System.out.println("");
        
        return null;
    }
    
    public static Prices average(){
        double limit = arr.length;
        ave = sum/limit;
        System.out.println("Average: "+ave);
    
    return null;
    }
    
    public static Prices higher(){
        System.out.println("Prices Higher than the average: ");
        for(counter = 0; counter < arr.length; counter++){
            if(arr[counter] > ave){
                System.out.print ("$"+arr[counter]+" , ");
            }
        }
        System.out.println("");
    return null;
    }
}