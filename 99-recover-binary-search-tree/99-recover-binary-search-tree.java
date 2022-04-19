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
    
    // Stores the first violated value
    private TreeNode first;
     
    // Stores the value of the latest inorder value
    private TreeNode prev;
    
    // Stores the value next to the first violated value
    private TreeNode middle;
    
    // Stores the second violated value
    private TreeNode last;
    
    private void inorder(TreeNode root) {
        if(root == null) return;
        
        inorder(root.left);
        
        // Violation is hit
        if(prev != null && root.val < prev.val) {
            
        // First violation, mark first and middle
            if(first == null) {
                first = prev;
                middle = root;
            } 
            
            // Second violation
            else {
                last = root;
            }
            
            
        }
        
        prev = root;
        inorder(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        first = middle = last = null;
        
        // inorder stores ascending values only
        prev = new TreeNode(Integer.MIN_VALUE);
        
        inorder(root);
        
        // swapping non adjacent nodes
        if(first != null && last != null) {
            int t = first.val;
            first.val = last.val;
            last.val = t;
        } 
        
        // swapping adjacent nodes
        else if(first != null && middle != null) {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }
}