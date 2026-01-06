package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {
	
	//Dynamic programming - O(n)
	//hashmap containsKey() is constant time
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], false);
			}
		}
		return false;
	}
	
	//O(n^2) because contains() is O(n) itself
	public boolean containsDuplicate2(int[] nums) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(list.contains(nums[i])) {
				return true;
			} else {
				list.add(nums[i]);
			}
		}
		return false;
	}
	
}
