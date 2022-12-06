package leetcode.medium;

public class ContainerWithMostWater {
	
	//Dynamic programming - O(n)
	public int maxArea(int[] height) {
		
		//base case
		if(height.length < 2) return 0;
		
		int leftHeight = height[0]; int rightHeight = height[height.length-1];
		int leftIndex = 0; int rightIndex = height.length - 1;
		
		//calculate initial area
		int area = Math.min(leftHeight, rightHeight) * (rightIndex - leftIndex);
		
		//work outside in from both ends of the array
		//because width is important for area
		//always move the smaller side
		while(leftIndex < rightIndex) {
			
			if(leftHeight > rightHeight) {								
				//right is smaller
				rightIndex--;
				rightHeight = height[rightIndex];
			} else if(rightHeight > leftHeight) {			
				//left is smaller
				leftIndex++;
				leftHeight = height[leftIndex];
			} else {
				//both equal - move both													
				rightIndex--;
				rightHeight = height[rightIndex];
				leftIndex++;
				leftHeight = height[leftIndex];
			}
			
			//only update the area if the new area is larger
			area = Math.max(area, Math.min(leftHeight, rightHeight) * (rightIndex - leftIndex));
		}
		return area;
	}
}
