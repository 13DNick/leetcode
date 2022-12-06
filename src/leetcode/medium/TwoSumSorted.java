package leetcode.medium;

public class TwoSumSorted {
	
	public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
        	if(numbers[left] + numbers[right] > target){
        		//if sum larger decrease right side
                right--;
        	} else if (numbers[left] + numbers[right] < target){
        		//sum smaller decrease left side
                left++;
            } else {
            	//result found
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }
        return result;
    }
}
