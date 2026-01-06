package leetcode.easy;

public class ReverseWordsInAStringIII {
	public String reverseWords(String s) {
        
        //split by spaces
        String[] sarray = s.split("\\s+");

        //reverse array with double pointers
        int low = 0; int hi = sarray.length-1;
        while(hi > low){
            String temp = sarray[low];
            sarray[low] = sarray[hi];
            sarray[hi] = temp;
            low++; 
            hi--;
        }

        //word order is reversed
        //build string with spaces
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < sarray.length; i++){
            if(i == sarray.length-1){
                temp.append(sarray[i]);
            } else {
                temp.append(sarray[i]);
                temp.append(" ");
            }
        }

        //reverse each word in string
        char[] cword = temp.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = cword.length-1; i >= 0; i--){
            result.append(cword[i]);
        }

        return result.toString();
    }
}
