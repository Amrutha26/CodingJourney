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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        // security check
        if(s == null) {
            return false;
        }
        
        // checking if the subroot is present
        else if(isSameTree(s,t)) {
            return true;
            
         // if it is not present, check if the subroot is present in left or right of the parent tree   
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
    
    public boolean isSameTree(TreeNode s, TreeNode t) {
        
        // if anyy one of the tree is null, then return the &&
        if(s == null || t == null) {
            return s == null && t == null;
        }
        
        // if the values are equal, then check if the left and right children are also same as that of the subroot
        else if(s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;
        }
    }
}