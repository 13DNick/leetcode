package leetcode.easy;


/*
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * */
public class SearchInt {
	public int searchInsert(int[] nums, int target) {
		 int low = 0;
		 int hi = nums.length-1;
		 int mid = 0;
		 
		 while(low <= hi) {
			 mid = low + (hi - low)/2;
			 
			 if(nums[mid] == target) {
				 return mid;
			 } else if(nums[mid] > target) {
				 hi = mid-1;
			 }else if(nums[mid] < target) {
				 low = mid+1;
			 }
		 }
		 //terminating condition decides the return value outside the loop
		 return low;
	 }
}
