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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null) return null;
        
        TreeNode lefTree = invertTree(root.left);
        TreeNode righTree = invertTree(root.right);
        root.left=righTree;
        root.right=lefTree;
        
        return root;
        
    }
}
