package leetcode.medium;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
	public boolean closeStrings(String word1, String word2) {
        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();

        int[] freqOne = new int[26];
        int[] freqTwo = new int[26];

        //count letter frequencies
        for(char c: one){
            freqOne[c - 'a']++;
        }

        for(char c: two){
            freqTwo[c - 'a']++;
        }


        //check if strings are made up of the same set of letters
        for(int i = 0; i < 26; i++){
            //if current letter frequency matches
            //skip to next letter
            if(freqOne[i] == freqTwo[i]){
                continue;
            } 

            //if either of them is 0 return false
            //one contains a letter that the other doesn't
            if(freqOne[i] == 0 || freqTwo[i] == 0){
                return false;
            }
        }

        //check if their length is the same
        //and their letter frequencies can be swapped between them
        //then sorting them should yield two equivalent frequency arrays
        Arrays.sort(freqOne);
        Arrays.sort(freqTwo);

        if(Arrays.equals(freqOne, freqTwo)){
            return true;
        }

        return false;
    }
}
