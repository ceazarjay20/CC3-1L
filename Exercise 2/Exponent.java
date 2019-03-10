
package exponent;

public class Exponent {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Please Give A Number: ");
        double num = sc.nextInt();
        
        double sq = square(num);
        System.out.println("Square of "+num+" is: "+sq);
        
        double cube = cube(num);
        System.out.println("Cube of "+num+" is: "+cube);
    }
    
    static double square(double num){
        double sq = num*num;
        return sq;
    }
    
    static double cube(double num){
        double cube = num*num*num;
        return cube;
    }
}
