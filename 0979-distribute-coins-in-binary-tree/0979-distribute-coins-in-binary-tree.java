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
    private int count;
    public int distributeCoins(TreeNode root) {
        count = 0;
        number(root);
        return count;
    }
    public int number(TreeNode root){
        if(root == null)
            return 0;
        
        int leftCoins = number(root.left);
        int rightCoins = number(root.right);
        
        count += Math.abs(leftCoins) + Math.abs(rightCoins);
        return (root.val - 1) + leftCoins + rightCoins;
    }
}