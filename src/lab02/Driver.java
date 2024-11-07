package lab02;

import java.util.Scanner;

class Teacher {
    String tName;
    int tAge;
    private int tSalary;

    public Teacher(String name, int age, int salary) {
        tName = name;
        tAge = age;
        tSalary = salary;
    }

    public void showName() {
        System.out.println("Teacher's Name: " + tName);
    }
    public void showAge() {
        System.out.println("Teacher's Age: " + tAge);
    }
    public void getSalary() {
        System.out.println("Teacher's Salary: " + tSalary);
    }
}

class Student {
    String sName;
    int sAge;
    double sCgpa;

    public Student(String name, int age, double cgpa) {
        sName = name;
        sAge = age;
        sCgpa = cgpa;
    }

    public void showName() {
        System.out.println("Student's Name: " + sName);
    }
    public void showAge() {
        System.out.println("Student's Age: " + sAge);
    }
    public void showCgpa() {
        System.out.println("Student's CGPA: " + sCgpa);
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Teacher's Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Enter Teacher's Age: ");
        int teacherAge = sc.nextInt();
        System.out.print("Enter Teacher's Salary: ");
        int teacherSalary = sc.nextInt();
        sc.nextLine();

        Teacher t1 = new Teacher(teacherName, teacherAge, teacherSalary);
        System.out.print("Enter Student's Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Student's Age: ");
        int studentAge = sc.nextInt();
        System.out.print("Enter Student's CGPA: ");
        double studentCgpa = sc.nextDouble();

        Student s1 = new Student(studentName, studentAge, studentCgpa);
        System.out.println("\nTeacher Details:");
        t1.showName();
        t1.showAge();
        t1.getSalary();

        System.out.println("\nStudent Details:");
        s1.showName();
        s1.showAge();
        s1.showCgpa();

        sc.close();
    }
}