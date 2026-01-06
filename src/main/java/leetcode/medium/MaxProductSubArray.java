package leetcode.medium;

public class MaxProductSubArray {
	
	//dynamic programming solution - O(n)
	public int maxProduct(int[] nums) {
        //only one element 
		if(nums.length == 1) return nums[0];
       
       int dpMax = nums[0];
       int dpMin = nums[0];
       
       //max product
       int max = nums[0];
       
       for(int i = 1; i < nums.length; i++) {
    	   
    	   //keep track of new segment
    	   //one for negative and one for positive
    	   //because you don't know if next value will be +/-
    	   int ma = dpMax * nums[i];
    	   int mi = dpMin * nums[i];
    	   
    	   //update new negative and positive segment 
    	   //take largest positive segment or start new segment
    	   dpMax = Math.max(nums[i], Math.max(ma, mi));
    	   //take largest negative segment or start new segment
    	   dpMin = Math.min(nums[i], Math.min(ma, mi));
    	   
    	   //rolling product - update with new positive segment if larger
    	   max = Math.max(max, dpMax);
       }
       
       return max;
    }
	
}
