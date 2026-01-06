package leetcode.easy;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] result =  new int[2];
		
		//loop through all values
		for(int i = 0; i < nums.length; i++) {
			
			//set/reset first value 
			result[0] = i;
			
			//loop through the rest of the values
			//after currently set first value
			for(int n = i+1; n < nums.length; n++) {
				//return if second value found
				//such that first + second == target
				if(nums[i] + nums[n] == target) {
					result[1] = n;
					return result;
				}
			}
		}
		
		return result;
	}
	
}
