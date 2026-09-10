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
    private int result;
    
    private int sum(TreeNode root, int[] count) {
        if (root == null) {
            return 0;
        }
        
        count[0]++;
        
        int leftSum = sum(root.left, count);
        int rightSum = sum(root.right, count);
        
        return leftSum + rightSum + root.val;
    }
    
    private void solve(TreeNode root) {
        if (root == null) {
            return;
        }
        
        int[] count = {0};
        int totalSum = sum(root, count);
        
        if (totalSum / count[0] == root.val) {
            result++;
        }
        
        solve(root.left);
        solve(root.right);
    }
    
    public int averageOfSubtree(TreeNode root) {
        result = 0;
        solve(root);
        return result;
    }
}