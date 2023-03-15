package javabasics._12ArraysList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        numbers.add(54);
        numbers.add(65);
        numbers.add(2);
        numbers.add(45);
        numbers.add(32);
        numbers.add(88);
        numbers.add(12);
        numbers.add(97);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        String[] menuItems = new String[]{"Margherita","Pepperoni","Marinara","Kebab","Fries","Soda"};
        double[] menuPrices = new double[]{6.00,8.5,5.5,12.00,3.5,4.00};

        System.out.println("The price of " + menuItems[0] + " is:" + menuPrices[0]);
        System.out.println("The price of " + menuItems[1] + " is:" + menuPrices[1]);
        System.out.println("The price of " + menuItems[2] + " is:" + menuPrices[2]);
        System.out.println("The price of " + menuItems[3] + " is:" + menuPrices[3]);
        System.out.println("The price of " + menuItems[4] + " is:" + menuPrices[4]);
        System.out.println("The price of " + menuItems[5] + " is:" + menuPrices[5]);

    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here

        //Slow method :(
        /*int sum = items[0] + items[1] + items[2] + items[3] + items[4] + items[5] + items[6] + items[7] + items[8] + items[9];
        System.out.println(sum);*/

        //Smart method learnt from javascript :)
        int sum = 0;
        for(int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        System.out.println("The sum of the array indexes is:" + sum);
    }
}
