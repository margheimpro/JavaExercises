package javaoop.exercises._2;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        System.out.println("\nConstructing");
        this.name = name;
        this.age = age;
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("Constructed");
    }

    Student(int age) {
        System.out.println("\nConstructing");
        this.age = age;
        System.out.println("age = " + age);
        System.out.println("Constructed");
    }

    Student(String name) {
        System.out.println("\nConstructing");
        this.name = name;
        System.out.println("name = " + name);
        System.out.println("Constructed");
    }

    Student(){
        System.out.println("\nConstructing");
        System.out.println("Constructed");
    }

}
