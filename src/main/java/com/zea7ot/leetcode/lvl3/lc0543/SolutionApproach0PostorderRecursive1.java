/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Time Complexity:     O(N)
 * Space Complexity:    O(H)
 * 
 * a bottom up approach
 */
package com.zea7ot.leetcode.lvl3.lc0543;

import com.zea7ot.utils.data_structure.tree.TreeNode;

public class SolutionApproach0PostorderRecursive1 {
    private int longest;

    public int diameterOfBinaryTree(TreeNode root) {
        this.longest = 0;
        postorder(root);
        return longest;
    }

    private int postorder(TreeNode node) {
        if (node == null)
            return 0;

        int left = postorder(node.left);
        int right = postorder(node.right);

        longest = Math.max(longest, left + right);

        return Math.max(left, right) + 1;
    }
}