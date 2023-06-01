import java.util.Scanner;

public class StockReturns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDays = 7; // Number of days in a week
        double[] closingValues = new double[numDays]; // Closing values of the stock
        double maxProfit = 0.0; // Maximum profit
        int buyDay = 0; // Day to buy the stock
        int sellDay = 0; // Day to sell the stock

        // Get the closing values of the stock
        System.out.println("Enter the closing values of the stock for the past 7 days:");
        for (int i = 0; i < numDays; i++) {
            closingValues[i] = input.nextDouble();
        }

        // Calculate the maximum profit using dynamic programming
        double minPrice = closingValues[0];
        for (int i = 1; i < numDays; i++) {
            double currentPrice = closingValues[i];
            double currentProfit = currentPrice - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                sellDay = i + 1;
            }
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
                buyDay = i + 1;
            }
        }

        // Print the maximum profit and the corresponding buy/sell days
        System.out.printf("The maximum profit is $%.2f, achieved by buying on day %d and selling on day %d.\n", maxProfit, buyDay, sellDay);
    }
}
