package javaoop.exercises._3;

public class Student {

    private String name;
    private String surname;
    private int age;
    private double averageGrade;
    private boolean hasBeenRejected;
    private int howManyTimeHasBeenRejected = 1;
    private String beenRejected;


    // name getter and setter
        public String getName () {
            return name;
        }

        public void setName (String name){
               if (name != null && name.length() != 0 ) {
                   this.name = name;
               } else {
                   System.out.println("Invalid name!");
               }
        }

    // surname getter and setter
        public String getSurname () {
            return surname;
        }

        public void setSurname (String surname){
               if ( surname != null && surname.length() != 0){
                   this.surname = surname;
               } else {
                   System.out.println("invalid surname!");
               }
        }

    // age getter and setter
        public int getAge () {
            return age;
        }

        public void setAge ( Integer age){
               if(age <= 0) {
                   System.out.println("invalid age!");
               } else {
                   this.age = age;
               }
        }

    // average getter and setter

        public void setAverage ( double averageGrade) {
            if (averageGrade < 0 ) {
                System.out.println("invalid data at average grade!");
            } else {
                this.averageGrade = averageGrade;
            }
        }

        public double getAverage () {
            if(averageGrade < 55){
                System.out.println("Sorry average grade too low for our standards.");
            } else if (averageGrade >= 55 && averageGrade < 70){
            System.out.println("It's necessary to pass an admission test in order to attend our courses.");
        }
            return averageGrade;
        }

    // hasBeenRejected/beenRejected getter and setter

        public void setHasBeenRejected ( boolean hasBeenRejected){
            this.hasBeenRejected = hasBeenRejected;
            beenRejected = String.valueOf(hasBeenRejected);
        }

        public String getHasBeenRejected () {
            howManyTimeHasBeenRejected = howManyTimeHasBeenRejected + 1;
            return beenRejected.toUpperCase();
        }

    // howManyTimesHasBeenRejected getter

        int getHowManyTimeHasBeenRejected(){
            return this.howManyTimeHasBeenRejected;
        }
    }

