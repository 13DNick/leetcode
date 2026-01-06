package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {
	public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();

        //count occurences
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        //change occurences to a set
        //occurences are unique if set == values
        Set<Integer> set = new HashSet<>(map.values());
        if(set.size() == map.values().size()){
            return true;
        }

        return false;

    }
}
