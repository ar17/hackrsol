package algorithms.firecode.level_2.binary_tree_sum_all;

import algorithms.firecode.TreeNode;

public class Solution {
    public int sum(TreeNode root) {
        if (root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }
}
