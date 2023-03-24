package javabasics._14WhileLoop;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 99.000;
        double averageReturnFromStockMarketIndexPercentage = 1;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;
        System.out.println("\nExercise 1a");

        while (currentInvestmentValueEuros<=100.000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }

        System.out.println("\nExercise 1b");
        while (yearsPast <= 5 || currentInvestmentValueEuros <= 15.000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10000;
        int maxPoundsToSellPerDay = 1000;
        // Write your while loop here
        while (remainingPoundsToSell > 0){
            daysToSell++;
            if (poundToEuroExchangeRate > 1.15) {
                remainingPoundsToSell = remainingPoundsToSell - maxPoundsToSellPerDay;
            }
            poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        }
        System.out.println("It took " + daysToSell + " days to exit that cursed economy");
    }


    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: for each because it allows to do an action for each variable in the list.
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: for each because it allows to do an action for each variable in the list.
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: For i because we can set the loop and print from 0 to 80, I think we can also use the while setting the condition costumer <= 80
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: while because we don't know how many lines are in the file, so we can set the condition of the while till line 100.
     */



}