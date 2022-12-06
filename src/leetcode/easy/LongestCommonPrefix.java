package leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        StringBuilder longest = new StringBuilder();
        
        //sort strings alphabetically
        Arrays.sort(strs);
    
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        int shortest = Math.min(first.length, last.length);
        
        //if first and last string have common prefixing characters
        //then all of the strings between them contain them as well
        //due to alphabetical sorting
        for(int i = 0; i < shortest; i++){
            if(first[i] == last[i]){
                longest.append(first[i]);
            } else {
                return longest.toString();
            }
        }

        return longest.toString();
    }
}
