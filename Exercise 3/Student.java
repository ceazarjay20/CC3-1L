package showstudent;

public class Student {

    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
    
        String id;
        double creditHours,points,gpa;
        
        id = getStudentID();
        creditHours = getCreditHours();
        points = getPoints();
        gpa = getGradePointAverage(creditHours,points);
        
        System.out.println("Grade Point Average: "+gpa);
    }
    
    static String getStudentID(){
        
        System.out.print("ID Number: ");
        String id = sc.nextLine();
        
        return id;
    }
    
    static double getCreditHours(){
        
        System.out.print("Number of Credit Hours Earned: ");
        double creditHours = sc.nextDouble();
        
        return creditHours;
    }
    
    static double getPoints(){
        
        System.out.print("Number of Points Earned: ");
        double points = sc.nextDouble();
        
        return points;
    }
    
    static double getGradePointAverage(double creditHours,double points){
        
        double gpa =  points/creditHours;
        
        return gpa;
    }
}