package leetcode.medium;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSumBinaryTree {

    public int maxLevelSum(TreeNode root) {

        // base case
        if (root == null) {
            return 0;
        }

        // As we traverse - must track the largest level sum + level number
        int maxLevelSum = root.val;
        int maxLevel = 1;

        int currentLevel = 1;

        // Perform a Level Order Traversal of the binary tree
        // Variant of Breadth First Search
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            // At each level of the tree, go through all child nodes.
            int currentLevelSize = q.size();
            // Track current level sum to compare with the maxLevelSum
            int currentLevelSum = 0;

            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode currentNode = q.poll();

                // add children of current node for next level traversal
                if (currentNode != null && currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode != null && currentNode.right != null) {
                    q.add(currentNode.right);
                }

                // add the value of each child node to the running current level sum
                currentLevelSum += currentNode.val;
            }

            // compare current level sum with previous max sum
            if (currentLevelSum > maxLevelSum) {
                maxLevelSum = currentLevelSum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        }

        return maxLevel;
    }
}
