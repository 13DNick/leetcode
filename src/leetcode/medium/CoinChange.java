package leetcode.medium;

import java.util.Arrays;

public class CoinChange {
		
		//dynamic programming - O(ns) pseudo polynomial
		//n = # of coins, s = amount
		public int coinChange(int[] coins, int amount) {
	        int[] dp=new int[amount+1];
	        Arrays.fill(dp,amount+1);
	        
	        //amount of 0 requires 0 coins
	        dp[0]=0;
	        
	        //solving each amount sub-problem until the target amount
	        for(int i=1;i<=amount;i++) {
	            //at each amount - loop through every coin
	        	for(int c:coins) {
	        		//if current amount is greater than the current coin
	        		if(i>=c) {
	        			//update with previous sub-problem solution
	        			//plus the current additional coin
	        			//ex. amount/i == 11, coin/c = 5, coins = [1, 2, 5]
	        			//dp[i-c] == dp[6] == 2 because 5 + 1 = 6 - 2 coins needed
	        			//therefore, dp[i] = 2 + 1
	                	dp[i]=Math.min(dp[i],dp[i-c]+1);
	                }
	        	}
	        } 
	        //if the value of dp[amount] is greater,
	        //then the coins cannot be added to the amount
	        //return -1, else return the coin count
	        return dp[amount]>amount?-1:dp[amount];
	    }	
}
