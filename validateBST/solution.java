/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    
    
    private boolean isValidBST(TreeNode root, long lowerBound, long upperBound){
        
        if(root==null) return true;
        
        if(root.val  > lowerBound && root.val < upperBound) {
            return isValidBST(root.left, lowerBound, root.val) && isValidBST(root.right, root.val, upperBound);
        } else return false;
        
    }
}
