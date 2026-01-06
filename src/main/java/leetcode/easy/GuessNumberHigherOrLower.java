package leetcode.easy;

public class GuessNumberHigherOrLower {
	
	private int pick;
	
	public GuessNumberHigherOrLower(int x) {
		
		this.pick = x;
	}
	
	public int guess(int x) {
		int result = 0;
		
		if(x < pick) result = 1;
		if(x == pick) result = 0;
		if(x > pick) result = -1;
		
		return result;
	}
	
	//iterative binary search
	public int guessNumber(int n) {
        
		int highest = n;
		int lowest = 1;
		
		int pick = n/2;
		int guessResult = guess(pick);
		
		while(guessResult != 0) {
			//guess is higher
			if(guessResult == -1) {
				highest = pick-1;
				//hi+low/2 causes int overflow with large ints
				pick = lowest + (highest - lowest) / 2; 
				guessResult = guess(pick);
			}
			
			//guess is lower
			else if(guessResult == 1) {
				lowest = pick+1;
				pick = lowest + (highest - lowest) / 2; 
				guessResult = guess(pick);
			}
		}
		
		return pick;
    }
	
}
