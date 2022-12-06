package leetcode.medium;

import java.util.Stack;

public class MaxAreaOfAnIsland {
	public class Cell{
        public int x;
        public int y;

        public Cell(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int maxAreaOfIsland(int[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
       
        //iterate through matrix 
        //if a cell is land and hasn't been visited 
        //perform dfs to find area
        int max = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(isValid(x, y, grid, visited)){
                    int area = this.dfs(x, y, grid, visited);
                    max = Math.max(max, area);
                } else {
                    visited[x][y] = true;
                }
            }
        }

        return max;
    }

    //find max area island
    public int dfs(int x, int y, int[][]grid, boolean[][] visited){
        //directional vectors
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        
        //push starting point of dfs to stack
        Stack<Cell> stack = new Stack<>();
        stack.push(new Cell(x, y));
        int currentArea = 0;

        //for each cell of the island
        while(!stack.isEmpty()){
            Cell c = stack.pop();

            //skip the loop if cell not valid
            if(!isValid(c.x, c.y, grid, visited)){
                continue;
            }
            
            //cell is valid, set as visited and increment area
            visited[c.x][c.y] = true;
            currentArea++;
        
            //traverse to adjacent cells
            for(int i = 0; i < 4; i++){
                int adjx = c.x + dx[i];
                int adjy = c.y + dy[i];
                Cell adjc = new Cell(adjx, adjy);
                stack.push(adjc);              
            }

        }

        return currentArea;
    } 

    public boolean isValid(int x, int y, int[][] grid, boolean[][] visited){
        //check bounds
        if(x < 0 || y < 0 || x > grid.length-1 || y > grid[0].length-1){
            return false;
        }

        //check if it is land
        if(!visited[x][y] && grid[x][y] == 1){
            return true;
        }

        return false;
    }
}
