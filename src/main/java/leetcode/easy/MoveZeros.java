package leetcode.easy;


/*
 * Given an integer array nums, move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * In Place
 * */
public class MoveZeros {
	 public void moveZeroes(int[] nums) {
	        
        if(nums.length == 1) return;


        for(int i = 0; i < nums.length-1; i++){
            for(int n = 0; n < nums.length-1; n++){
                if(nums[n] == 0){
                    int temp = nums[n+1];
                    nums[n+1] = nums[n];
                    nums[n] = temp;
                }
            }
        }
    }
}
