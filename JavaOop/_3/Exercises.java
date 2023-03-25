package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();

        student.setName("");
        student.setSurname("Brambilla");
        student.setAge(0);
        student.setAverage(34);
        student.setHasBeenRejected(true);

        System.out.println("Name =" + student.getName());
        System.out.println("Surname =" + student.getSurname());
        System.out.println("Age =" + student.getAge());
        System.out.println("Average grade =" + student.getAverage());
        System.out.println("Has been rejected =" + student.getHasBeenRejected());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student2 = new Student();

        student2.setName("Jenny");
        student2.setSurname("Loony");
        student2.setAge(56);
        student2.setAverage(22);
        student2.setHasBeenRejected(true);

        //Write your code here
        System.out.println("Has been rejected =" + student2.getHasBeenRejected());
        System.out.println("How many times? " + student2.getHowManyTimeHasBeenRejected());
        //non sapevo in quale ambito mi serviva un counter, e non sono sicura di aver capito come si usa...
    }

}
