class Student {
    static int count = 0;
    int id;
    Student() {
        count = count + 1; 
        id = count;    
    }
    void display() {
        System.out.println("Student ID: " + id);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        for (int i = 0; i < 100; i++) {
            students[i] = new Student(); 
        }
        for (int i = 0; i < 100; i++) {
            students[i].display();      
        }
    }
}
