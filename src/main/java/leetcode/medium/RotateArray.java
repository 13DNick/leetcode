package leetcode.medium;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        if(k == 0 || k % nums.length == 0) return;
        //find lowest value for k
        k = k % nums.length;

        int[] result = new int[nums.length];
        
        //find pivot point
        int n = (nums.length) - k;
        int z = 0;
        
        //fill array
        for(int i = 0; i < result.length; i++){
        	if(n < result.length){
        		//fill everything after pivot point first
                result[i] = nums[n++];
            } else{
            	//fill the rest
                result[i] = nums[z++];
            }
        }
        
        //nums = result doesn't work
        for(int i = 0; i < nums.length; i++){
            nums[i] = result[i];
        }
    }
}
