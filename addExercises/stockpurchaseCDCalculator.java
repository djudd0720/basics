package addExercises;

public class stockpurchaseCDCalculator {
	public static void main(String[] args) {
		// $25,000 in savings
		//and want to invest all your money to buy a stock, and the remaining money in a CD
		//account. The stock price is $989 per share. How many shares of this stock can you
		//buy, and how much money will be left for the CD account?
		// Define the variables
		
		int savingsAmt = 25000;
		int stockPrice = 989;
		int totalStockPurchase = savingsAmt/stockPrice;
		int moneySpent = stockPrice * totalStockPurchase;
		int moneyleftover = savingsAmt - moneySpent;
				
				
		// Perform calculations and Print the result
		
		System.out.println("Buy " + totalStockPurchase + " shares of stock");
		System.out.println("Invest $" + moneyleftover + " in CD account");

	}
}
