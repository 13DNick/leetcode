package leetcode.medium;

public class MinimumPenaltyForAShop {
	public int bestClosingTime(String customers) {
        char[] s = customers.toCharArray();
        int[] open = new int[s.length];
        int[] closed = new int[s.length];
        
        for(int i = 0; i < s.length; i++){
            if(s[i] == 'Y'){
                closed[i] = closed[i] + 1;
            } else {
                open[i] = open[i] + 1;
            }
        }
        
        int min = 100;
        
        for(int i = 0; i < open.length; i++){
            if(open[i] < min || closed[i] < min){
                min = Math.min(open[i], closed[i]);
            }
        }
        
        return min;
    }
}
