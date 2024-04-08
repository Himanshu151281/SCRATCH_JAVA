package school;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to generate random student data
    public static Student generateRandomStudent() {
        Random random = new Random();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        int age = 18 + random.nextInt(5); // Random age between 18 and 22
        return new Student(name, age);
    }
}
