package leetcode.easy;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        //no negative integer is a palindrome
		if(x < 0) return false;
		
		String s = Integer.toString(x);
		int l = s.length();
        
		//a single digit is a palindrome
		if(l == 1) return true;
        
		//deal with even length word
		if(l % 2 == 0) {
			//split in half and compare two sides
			String firstHalf = s.substring(0, l/2);
			//reverse the string
			String secondHalf = new StringBuilder(s.substring(l/2, l)).reverse().toString();
			
			return firstHalf.equals(secondHalf);
		} else {
			//deal with odd length word
			//split in half around the 
			//middle character and compare
			String firstHalf = s.substring(0, l/2);
			String secondHalf = s.substring((l/2)+1, l);
			return firstHalf.equals(secondHalf);
		}
    }
}
