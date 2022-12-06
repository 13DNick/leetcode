package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class PermutationInAString {
	
	public boolean checkInclusion(String s1, String s2) {
        
        //s2 must contain permutation of s1
        if(s2.length() < s1.length()) return false;

        //track chars and counts from s1
        Map<Character, Integer> s1map = new HashMap<>();
        char[] s1arr = s1.toCharArray();
        for(int i = 0; i < s1arr.length; i++){
            if(s1map.containsKey(s1arr[i])){
                s1map.put(s1arr[i], s1map.get(s1arr[i])+1);
            } else {
                s1map.put(s1arr[i], 1);
            }
        }

        //track char count from current window/substring
        Map<Character, Integer> s2map = new HashMap<>();

        //iterate through s2 in substrings of length=s1.length
        //permutation must exist in substring of length=s1.length
        int slow = 0; int fast = s1.length()-1;
        char[] s2arr = s2.toCharArray();
        int i = slow;
        while(i <= fast && fast <= s2arr.length-1){
            if(!s1map.containsKey(s2arr[i])){
                //s1 doesn't contain current char
                //go to next char
                fast++;
                slow++;
                i = slow;
                s2map = new HashMap<>();
            } else {
                //s1 does contain current key
                //track char and count
                if(s2map.containsKey(s2arr[i])){
                    //if char count greater than the count in s1 - go next char
                    if(s1map.get(s2arr[i]) <= s2map.get(s2arr[i])){
                        fast++;
                        slow++;
                        i = slow;
                        s2map = new HashMap<>();
                    } else {
                        s2map.put(s2arr[i], s2map.get(s2arr[i])+1);
                        //iterate through current substring
                        i++;
                    }   
                } else {
                    s2map.put(s2arr[i], 1);
                    //iterate through current substring
                    i++;
                } 
            }
        }

        return s1map.equals(s2map);
    }
}
