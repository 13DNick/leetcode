package leetcode.easy;

public class FirstBadVersion {
	
	//returns true if n = first bad version
	//else returns false
	public boolean isBadVersion(int n) {
		return true;
	}
	
	//binary search - find first bad version
	public int firstBadVersion(int n) {
        int hi = n;
        int low = 1;
        int mid = 0;
        
        if(n == 1) return isBadVersion(n) ? n : -1;

        while(hi > low) {
        	mid = low + (hi - low)/2;
        	if(isBadVersion(mid)) {
        		//everything above is a bad version
    			hi = mid;       		
        	} else {
        		//everything below and current is not a bad version
        		//return first bad version - not last correct version
                low = mid+1;
            }
        }
        //first bad version
        return low;
    }
}
