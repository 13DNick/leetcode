package leetcode.easy;

public class MergeTwoBinaryTrees {
	
	public class TreeNode {
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
	
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //no merge required if both nodes null
        if(root1 == null && root2 == null) return null;
        
        //if either is null then take the other
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        //create new node
        TreeNode node = new TreeNode(root1.val + root2.val);
        
        //build new tree by recurring into the param trees
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);
        
        return node;
    }
	
}
