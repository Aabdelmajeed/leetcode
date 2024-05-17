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
    public int removedCounter = 0;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        while(true){
            removedCounter = 0;
            removeLeaf(root , target);
            if(root.val == target && root.right == null && root.left==null)return null;
            if(removedCounter == 0){
                break;
            }
        }
        return root;
    }
    
    public void removeLeaf(TreeNode root , int target){
        
        if(root == null)
            return ;
        if(root.left != null && root.left.val == target){
            if(root.left.right == null && root.left.left == null){
                root.left = null;
                removedCounter++;
            }else{
                removeLeaf(root.left , target);
            }
        }
        if(root.right != null && root.right.val == target){
            if(root.right.right == null && root.right.left == null){
               removedCounter++;
                root.right = null;
            }else{
                removeLeaf(root.left , target);
            }
        }
       removeLeaf(root.right , target);
       removeLeaf(root.left , target);

        return;
    }
}