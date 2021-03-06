package algorithms.firecode.level_2.binary_tree_size;

import algorithms.firecode.TreeNode;

public class Solution {
    public int size(TreeNode root) {
        if (root == null) return 0;
        return (size(root.left) + 1 + size(root.right));
    }
}