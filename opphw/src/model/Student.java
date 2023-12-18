
package model;
import java.util.Arrays;

public class Student {
    String name;
    int age;
    int[] marks;
    char grade;

    // Constructor
    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateGrade(); // Calculate grade when a new student is created
    }

    // Getter and Setter methods
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

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculateGrade(); // Recalculate grade when marks are updated
    }

    public char getGrade() {
        return grade;
    }

    // Calculate grade based on average marks
    public void calculateGrade() {
        int totalMarks = Arrays.stream(marks).sum();
        int averageMarks = totalMarks / marks.length;

        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Custom function to display results
    public void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + getResult());
        System.out.println();
    }

    // Calculate percentage based on average marks
    public double calculatePercentage() {
        int totalMarks = Arrays.stream(marks).sum();
        return (double) totalMarks / marks.length;
    }

    // Determine pass/fail based on grade
    public String getResult() {
        return (grade == 'F') ? "Fail" : "Pass";
    }

}
