package leetcode.easy;

public class BestTimeToBuyAndSellStock {
	
	//O(n)
	//Dynamic programming
	public int maxProfitOn(int[] prices) {
		int result = 0;
		int buyPriceIndex = 0;
		int sellPriceIndex = 1;
		
		//start from second element in array since
		//you can only sell after you buy
		for(int i = 1; i < prices.length; i++) {

			//find smallest buy price
			if(prices[i] < prices[buyPriceIndex]) {
				buyPriceIndex = i;
				//make sure sell index is not behind buy index
				sellPriceIndex = buyPriceIndex;
			}
			
			//find largest sell price
			if(prices[i] > prices[sellPriceIndex]) {
				sellPriceIndex = i;
			}
			
			//find largest profit
			if(prices[sellPriceIndex] - prices[buyPriceIndex] > result) {
				result = prices[sellPriceIndex] - prices[buyPriceIndex];
			}
		}

		return result;
	}
	
	//brute force version - O(n^2)
	public int maxProfitOn2(int[] prices) {
		int result = 0;
		int profit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			
			for(int n = i+1; n < prices.length; n++) {
				
				profit = prices[n] - prices[i];
				if(profit > result) {
					result = profit;
				}
			}
		}
		
		return result;
	}
	
}
