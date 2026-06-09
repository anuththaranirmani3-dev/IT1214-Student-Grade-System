import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students;
    
    public GradeManager() {
        students = new ArrayList<>();
    }
    
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }
    
    public void updateGrade(String id, double grade) {
        for(Student s : students) {
            if(s.getId().equals(id)) {
                s.setGrade(grade);
                System.out.println("Grade updated for " + s.getName());
                return;
            }
        }
        System.out.println("Student ID not found!");
    }
    
    public void displayAll() {
        if(students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("\n--- Student Grade List ---");
        for(Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}