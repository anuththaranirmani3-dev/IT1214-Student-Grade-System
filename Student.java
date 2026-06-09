public class Student {
    private String id;
    private String name;
    private double grade;
    
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grade = 0.0;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public String getDetails() {
        return "ID: " + id + " | Name: " + name + " | Grade: " + grade;
    }
}