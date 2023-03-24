package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.*;

public class Course {
    String courseName;
    int maxStudents;
    double qualityRatingOutOf10;
    int minStudents;
    String professorName;

    ArrayList<Student> students = new ArrayList<Student>();

    public double average(){
        double sum = 0;

        for(int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).age;
        }
        double average = sum / students.size();
        System.out.println("the average age is " + average);
        return average;
    }
}