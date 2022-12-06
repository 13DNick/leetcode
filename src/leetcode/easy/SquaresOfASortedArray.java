package leetcode.easy;

import java.util.PriorityQueue;

/*
 * Given an integer array nums sorted in non-decreasing order
 * return an array of the squares of each number sorted in non-decreasing order.
 * */
public class SquaresOfASortedArray {
	public int[] sortedSquares2(int[] nums) {
		int[] result = new int[nums.length];
		PriorityQueue<Integer> q = new PriorityQueue<>(); 
		
		//square array
		for(int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
			q.add(nums[i]);
		}
		
		for(int i = 0; i < result.length; i++) {
			result[i] = q.remove();
		}
		
		return result;
	}
	
	//O(n^2)
	public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
		
        //square array
		for(int i = 0; i < nums.length; i++) {
			result[i] = nums[i] * nums[i];
		}
        
		//sort
        int i = 0;
		while(i < result.length-1){
            int n = 0;
            while(n < result.length-1){
                if(result[n] > result[n+1]){
                    int temp = result[n+1];
                    result[n+1] = result[n];
                    result[n] = temp;
                }
                n++;
            }            
            i++;           
        }        
		return result;
    }
}
