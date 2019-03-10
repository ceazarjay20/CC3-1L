
package salary;

/**
 *
 * @author DiRaZ
 */

import java.util.Scanner;

public class Salary {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        System.out.print("Input Hourly Pay Rate: ");
        double hourlyPay = sc.nextDouble();
    
        System.out.print("Input Regular Hours: ");
        double regularHours = sc.nextDouble();
        
        System.out.print("Input Overtime Hours: ");
        double overtimeHours = sc.nextDouble();
    
        double overtimePay = getOvertimePay(regularHours, overtimeHours, hourlyPay);
        System.out.println("Overtime Pay is: "+overtimePay);
    }
    
    static double getOvertimePay(double regularHours, double overtimeHours,double hourlyPay){
    
    double overtimePay = ((((regularHours*hourlyPay)+overtimeHours)*1.5)*hourlyPay);
    
    return overtimePay;
    }
}
