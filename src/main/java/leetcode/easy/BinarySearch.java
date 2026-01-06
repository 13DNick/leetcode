package leetcode.easy;

public class BinarySearch {
	public int search(int[] nums, int target) {
        int hi = nums.length-1;
        int low = 0;
        int mid = 0;

        while(hi >= low){
            mid = low + (hi - low)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                low = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
