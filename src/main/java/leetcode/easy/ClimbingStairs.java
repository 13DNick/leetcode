package leetcode.easy;

public class ClimbingStairs {
	
	//Dynamic programming solution
	public int climbStairs(int n) {
		//base cases
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int result = 0;
		int secondLast = 1;
		int last = 2;
		
		//run the sequence --> n = (n-2) + (n-1)
		for(int i = 2; i < n; i++) {
			//calculate new step combination amount
			result = secondLast + last;
			
			//update pointers of previous steps 
			secondLast = last;
			last = result;
		}
		
		return result;
	}
	
}
