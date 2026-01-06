package leetcode.medium;

public class DifferenceBetweenOnesAndZeros {
	public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff = new int[grid.length][grid[0].length];
        
        int[] oneRow = new int[grid.length];
        int[] oneColumn = new int [grid[0].length];
        int[] zeroRow = new int[grid.length];
        int[] zeroColumn = new int [grid[0].length];
        
        //calculate all of the row totals
        for(int x = 0; x < grid.length; x++){
            int oneTotal = 0;
            int zeroTotal = 0;
            for(int y = 0; y < grid[x].length; y++){
                if(grid[x][y] == 0){
                    zeroTotal++;
                } else {
                    oneTotal++;
                }
            }
            oneRow[x] = oneTotal;
            zeroRow[x] = zeroTotal;
        }
        
        //calculate all of the column totals
        for(int y = 0; y < grid[0].length; y++){
            int oneTotal = 0;
            int zeroTotal = 0;
            for(int x = 0; x < grid.length; x++){
                if(grid[x][y] == 0){
                    zeroTotal++;
                } else {
                    oneTotal++;
                }
            }
            oneColumn[y] = oneTotal;
            zeroColumn[y] = zeroTotal;
        }
        
        //populate diff matrix
        for(int x = 0; x < diff.length; x++){
            for(int y = 0; y < diff[x].length; y++){
                diff[x][y] = oneRow[x] + oneColumn[y] - zeroRow[x] - zeroColumn[y];
            }
        }
        
        return diff;
    }
}
