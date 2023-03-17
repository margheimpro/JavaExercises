package javabasics._15FunctionsMethods;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.println(printConversion30CelsiusToFahrenheit());
    }
    // Put this into a function
    static String printConversion30CelsiusToFahrenheit(){
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // Call your function
            System.out.println(changeFormat(name));
        }
    }
        static String changeFormat(String namesToModify){
            if(namesToModify.matches(".*\\d.*")){
                return "invalid";
            }
            return namesToModify.toUpperCase().trim();
        }

        
    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        printMyLunch();
    }
        static void printMyLunch() {
            double myLunchPrice = 5.99;
            String lunchType = "sandwich";
            String description = "Nice big sandwich";
            int weightInGrams = 500;
            String lunch = "My lunch cost " + myLunchPrice + " I had a " + lunchType + ", it was: "
                    + description + " and it wighted " + weightInGrams + "gr";
            System.out.println(lunch);
        }
}

