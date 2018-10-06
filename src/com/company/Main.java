package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Student stu1 = new Student("Bennett", 4.565);
        Student stu2 = new Student("Bryce", 4.92);
        Student stu3 = new Student("Phil", 3.64);
        Student stu4 = new Student("Steve", 2.894);
        Student stu5 = new Student("Todd", 4.325);

    Vector<Student> Students = new Vector<>();
        Students.add(stu1);
        Students.add(stu2);
        Students.add(stu3);
        Students.add(stu4);
        Students.add(stu5);
    Vector<Student> topThree = new Vector<>();

        for (int i = 0; i < 3; i++) {
        double highestGPA = 0.0;
        Student highestStudent = null;
    for (int a = 0; a < Students.size(); a++){

        if (Students.get(a).GPA > highestGPA){
        highestGPA = Students.get(a).GPA;
        highestStudent = Students.get(a);

        }
    }Students.remove(highestStudent);
        topThree.add(highestStudent);
         }
        System.out.println("1: " + topThree.get(0).name + ": " + topThree.get(0).GPA);
        System.out.println("2: " + topThree.get(1).name + ": " + topThree.get(1).GPA);
        System.out.println("3: " + topThree.get(2).name + ": " + topThree.get(2).GPA);}


}
