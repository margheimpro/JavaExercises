package javabasics._16DateAdvancedPrimitives;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in Dubai and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!

        myBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;
        System.out.println(myBankBalanceEuro);

    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age: short, someone may someday arrive at 128 years because life expectancy is getting longer so byte doesn't apply
     *    but the smallest after byte is short, and nobody can arrive to 32,769...
     *    2b: The age of a baby in months: byte after 18 month you usually start to count years not months. You'll never arrive to 128.
     *    2c: Money in a hedgefund in euros. long, hedge fund can be very big funds.
     *    2d: Price of a good in euros on amazon.com: float because prices stop at 2 decimal places
     *    2e: The exact weight of an apple measured by scientific equipment: double because very specific and precise weight have more than 7 decimal places
     *    2f: The number of kilometers from any 2 places in the world short: the maximum distance is from China to Mexico and is 15,409 km,
     *    so short is enough for any distance.
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOnthfMo * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {

        System.out.println("\nExercise 3a: Tell me everything about today: ");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is " + currentDate);
        System.out.println("it's the day number " + currentDate.getDayOfMonth() + " of the month and it's " + currentDate.getDayOfWeek());
        System.out.println("We are in the day number " + currentDate.getDayOfYear() + " of the year");
        System.out.println("and it's " + currentDate.getMonth() + ", which is the month number " + currentDate.getMonthValue() + " of the year");

        System.out.println("\nExercise 3b: Which war started first?: ");

        LocalDate worldWarOne = LocalDate.of(1914, Month.JUNE, 28);
        LocalDate vietnamWar = LocalDate.of(1975, Month.APRIL, 30);

        System.out.println( "World war 1 started before Vietnam war: " + worldWarOne.isAfter(vietnamWar));
        System.out.println( "World war 1 started before Vietnam war: " + worldWarOne.isBefore(vietnamWar));







    }

}
