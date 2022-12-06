package leetcode.medium;

public class FindMinimumInRotatedSortedArray {
	
	//iterative binary search
	public int findMin(int[] nums) {
		//for single element array - return that element
		if(nums.length == 1) return nums[0];
		
		int low = 0;
		int hi = nums.length-1;
		int mid = low + ((hi - low)/2);
		
		while(low <= hi) {
			//base case - min found
			if(low == mid || hi == mid) 
				return Math.min(nums[low], nums[hi]);
			
			//mid larger than hi
			//min will always be to the right			
			if(nums[mid] > nums[hi]) {
				low = mid; //remove left side
			} else {
				//mid is smaller than hi				
				//min will always be to the left
				hi = mid; //remove right side
			}
			//find new mid
			mid = low + ((hi - low)/2);
		}
		
		return Math.min(nums[low], nums[hi]);
	}
	
}
