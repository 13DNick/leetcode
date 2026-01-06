package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	
	public boolean wordBreak(String s, List<String> wordDict) {
		if(s.length() == 1) {
			return wordDict.contains(s) ? true : false;
		}
		
		List<String> foundWords = new ArrayList<>();
        char[] array = s.toCharArray();
        
        int i = 0;
        StringBuilder word = new StringBuilder();
        while(i < array.length) {
        	word.append(array[i]);
        	
        	//check for single letter word
        	if(wordDict.contains(word.toString())) {
        		foundWords.add(word.toString());
        		//start from next letter - no overlap allowed
        		i++;
        		//empty word
        		word.setLength(0);        		
        	} else {
        		for(int n = i+1; n < array.length; n++) {
            		word.append(array[n]);
            		
            		//check for word
                	if(wordDict.contains(word.toString())) {
                		foundWords.add(word.toString());
                		//start from next letter - no overlap allowed
                		i = n;
                		//empty word
                		word.setLength(0);
                		
                		if(i == array.length-1) return true;
                		
                		
                	}
            	}
        		i++;
        	}
        }
        
        return false;
        
        
    }
}
