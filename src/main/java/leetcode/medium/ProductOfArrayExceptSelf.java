package leetcode.medium;

public class ProductOfArrayExceptSelf {
	
	//proper dynamic programming solution - O(n)
	public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            res[i] = left;
        }
        
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            res[i] *= right;
        }
        return res;
    }
	
	
	//my hacky solution - passed all leetcode tests O(n)
	public int[] productExceptSelf2(int[] nums) {
		int[] result = new int[nums.length];
		boolean[] zeros = new boolean[nums.length];
		boolean hasZero = false;
		boolean hasMultipleZeros = false;
		int totalProduct = 1;
		
		//find the total product of entire array
		for(int i = 0; i < nums.length; i++) {
			//record and skip the indices containing 0
			if(nums[i] == 0) {
				if(hasZero == false) {
					hasZero = true;					
				} else {
					hasMultipleZeros = true;
				}
				zeros[i] = true;
			} else {
				totalProduct *= nums[i];				
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			//if original array contains no 0, then compute as normal
			if(hasZero == false) {
				result[i] = (int) (totalProduct * Math.pow(nums[i], -1.0));				
			} else {
				//more than one zero - all result indices will be 0
				if(hasMultipleZeros == true) {
					result[i] = 0;
				} else {
					//only compute the index that contains 0
					if(zeros[i] == true) {
						result[i] = totalProduct;					
					} else {
						result[i] = 0;
					}					
				}
			}
		}
		
		return result;
	}
	
}
