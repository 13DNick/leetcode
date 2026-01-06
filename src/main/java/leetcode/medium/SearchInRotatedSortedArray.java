package leetcode.medium;

public class SearchInRotatedSortedArray {
	
	//iterative binary search
	public int search(int[] nums, int target) {
		
		if(nums.length == 1) {
			if(nums[0] == target) 
				return 0;
			else
				return -1;
		}
		
		int low = 0;
		int hi = nums.length-1;
		int mid = low + ((hi - low)/2);
		
		int result = -1;
		
		while(low <= hi) {
			if(nums[mid] == target) return mid;
			
			//low to mid is ascending
			if (nums[low] <= nums[mid]) {
	            //if target is in low to mid, drop right side
				if (target >= nums[low] && target < nums[mid]) {
	                hi = mid - 1;
	            } else {
	            	//drop left side
	                low = mid + 1;
	            }
	        } else {
	        	//mid to hi is ascending
	        	//if target is between mid and hi, drop left side
	            if (target > nums[mid] && target <= nums[hi]) {
	                low = mid + 1;
	            } else {
	            	//drop right side
	                hi = mid - 1;
	            }
	        }
			
			mid = low + ((hi - low)/2);
		}
		return result;
	}
	
}
