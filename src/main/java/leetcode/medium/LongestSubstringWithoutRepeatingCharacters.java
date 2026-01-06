package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	/*
	 * The idea is use a hash set to track the longest substring 
	 * without repeating characters so far, use a fast pointer j 
	 * to see if character j is in the hash set or not, 
	 * if not, great, add it to the hash set, move j forward and 
	 * update the max length, otherwise, delete from the head by 
	 * using a slow pointer i until we can put character j to the hash set.
	 * */
	public int lengthOfLongestSubstring(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	}
	
	
	//my hacky solution - passed all leetcode tests
	public int lengthOfLongestSubstring2(String s) {
     
		if(s.equals(" ") || s.length() == 1) {
			return 1;
		}
		
		int result = 0;
		char[] string = s.toCharArray();
		int substringStartIndex = 0;

		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < string.length; i++) {
			//track current substring in map
			if(!map.containsKey(string[i])) {
				map.put(string[i], 1);
			} else {
				//current index contains repeated char
				//save length and start looking for longer substring
				//starting from one index after the start index of the last substring
				//(check for a substring from each index)
				if(map.size() > result) {
					result = map.size();
				}
				map = new HashMap<>();
				i = substringStartIndex++;
			}
		}
		
			
		if(map.size() > result) {
			return map.size();
		} else {
			return result;
		}
    }
	
}
