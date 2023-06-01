import java.util.Scanner;


public class StockRetUnOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDays = 7; // Number of days in a week
        double[] closingValues = new double[numDays]; // Closing values of the stock
        double bestReturn = 0.0; // Best return
        int buyDay = 0; // Day to buy the stock
        int sellDay = 0; // Day to sell the stock

        // Get the closing values of the stock
        System.out.println("Enter the closing values of the stock for the past 7 days:");
        for (int i = 0; i < numDays; i++) {
            closingValues[i] = input.nextDouble();
        }

        // Find the best return and the corresponding buy/sell days
        for (int i = 0; i < numDays; i++) {
            for (int j = i + 1; j < numDays; j++) {
                double stockReturn = (closingValues[j] - closingValues[i]) / closingValues[i];
                if (stockReturn > bestReturn) {
                    bestReturn = stockReturn;
                    buyDay = i + 1;
                    sellDay = j + 1;
                }
            }
        }
        System.out.printf("The best return is %.2f%%, achieved by buying on day");
        // Print the best return and the corresponding buy/sell days
        }
}
