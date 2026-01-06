package leetcode.common;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeBuilders {
    private TreeBuilders() {}

    public static TreeNode fromLevelOrder(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode cur = q.poll();

            // left
            if (i < arr.length && arr[i] != null) {
                cur.left = new TreeNode(arr[i]);
                q.add(cur.left);
            }
            i++;

            // right
            if (i < arr.length && arr[i] != null) {
                cur.right = new TreeNode(arr[i]);
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }
}
