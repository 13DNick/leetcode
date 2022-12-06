package leetcode.easy;

import java.util.Stack;

public class FloodFill {
	 	static class Coord{
	        private int x; 
	        private int y;

	        public Coord(int x, int y){
	            this.x = x;
	            this.y = y;
	        }
	    }

	    public boolean isValid(boolean[][] visited, int row, int col, int color, int[][] image){
	        
	        //check for out of bounds
	        if(row < 0 || col < 0 || row > image.length-1 || col > image[0].length-1) {
	            return false;
	        }

	        //check if already visited
	        if(visited[row][col]) {
	            return false;
	        }

	        //check if color is matching
	        if(image[row][col] != color) {
	            return false;
	        }

	        return true;
	    }

	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        
	        //direction vectors
	        int[] dRow = {0, 1, 0, -1};
	        int[] dCol = {-1, 0, 1, 0};

	        //initialize starting node
	        int row = sr;
	        int col = sc;
	        int initialColor = image[row][col];

	        //track visited nodes - prevent infinite loop
	        boolean[][] visited = new boolean[image.length][image[0].length];

	        //stack to simulate recursive call
	        //initialize with starting node
	        Stack<Coord> stack = new Stack<Coord>();
	        stack.push(new Coord(row, col));

	        while(!stack.empty()){
	            //pop the top node
	            Coord coord = stack.pop();
	            row = coord.x;
	            col = coord.y;

	            //check whether node is valid to visit
	            if(!isValid(visited, row, col, initialColor, image)){
	                continue;
	            }

	            //set node to visited
	            visited[row][col] = true;

	            //change node color
	            image[row][col] = color;

	            //push all the adjacent cells
	            //using the directional vectors
	            for(int i = 0; i < 4; i++){
	                int adjx = row + dRow[i];
	                int adjy = col + dCol[i];
	                stack.push(new Coord(adjx, adjy));
	            }
	        }

	        return image;
	    }
}
