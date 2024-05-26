//Leetcode 671: Second Minimum Node In a Binary Tree
// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        //Best Case
        if (root == null) return -1; // if the tree is empty
        if (root.left == null && root.right == null) return -1; // if there's only the root node

        int left = root.left.val;
        int right = root.right.val;

        //skips the traversal if the root node is same as its left or right child
        if (root.left.val == root.val) left = findSecondMinimumValue(root.left);
        if (root.right.val == root.val) right = findSecondMinimumValue(root.right);

        //search and return the root of the path with the smaller value on the leaf node
        if (left != -1 && right != -1) return Math.min(left,right);
        if (left != -1) return left;
        else return right;
    }
}

// Method 1: DFS -- preorder traversal custom towards this problem

//time complexity: O(N)
//space complexity: O(N)

// Think case by case traversal
