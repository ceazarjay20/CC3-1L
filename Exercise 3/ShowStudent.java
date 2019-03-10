package showstudent;

public class ShowStudent {

    public static void main(String[] args) {
        
        String id;
        double creditHours,points,gpa;
        
        id = Student.getStudentID();
        creditHours = Student.getCreditHours();
        points = Student.getPoints();
        gpa = Student.getGradePointAverage(creditHours,points);
        
        System.out.println("=====================================");
        System.out.println("ID Number: "+id);
        System.out.println("Credit Hours Earned: "+creditHours);
        System.out.println("Points Earned: "+points);
        System.out.println("Grade Point Average: "+gpa);
        System.out.println("=====================================");
        
    }
}