import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager gm = new GradeManager();
        int choice;
        
        do {
            System.out.println("\n===== Student Grade Management System =====");
            System.out.println("1. Add New Student");
            System.out.println("2. Add/Update Grade");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            
            switch(choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    Student s = new Student(id, name);
                    gm.addStudent(s);
                    break;
                    
                case 2:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();
                    gm.updateGrade(sid, grade);
                    break;
                    
                case 3:
                    gm.displayAll();
                    break;
                    
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 4);
        
        sc.close();
    }
}