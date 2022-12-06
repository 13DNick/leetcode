package leetcode.medium;

public class MaximumSubArray {
	
	public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	//add each number
        	sum += nums[i];
        	
        	//take as new maximum sum if it's
        	//larger than the old max
        	max = Math.max(max, sum);
        	
        	//reset rolling sum to 0 if latest addition
        	//made it negative
        	if(sum < 0) sum = 0;
        }
        
        return max;
    }
	
}
