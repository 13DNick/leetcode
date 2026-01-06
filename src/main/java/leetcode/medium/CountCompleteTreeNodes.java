package leetcode.medium;

public class CountCompleteTreeNodes {
	
	public int countNodesInOrderTraversal(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return countNodesInOrderTraversal(root.left) + countNodesInOrderTraversal(root.right) + 1;
		}
    }
	
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
}
