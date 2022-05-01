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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //base case 1
        if(p == null && q == null) {
            return true;
        } 
        // base case 2
        else if(p == null || q == null) {
            return false;
        }
        // base case 3
        else if(p.val != q.val) {
            return false;
        }
        // recursive call
        else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}