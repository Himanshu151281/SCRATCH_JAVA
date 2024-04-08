package school;

public class Info {
    public static void main(String[] args) {
        Student student = Student.generateRandomStudent();
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

