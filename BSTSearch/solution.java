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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root==null) return null;
        
        TreeNode ans = new TreeNode(root.val);
        
        if(root.val > val) ans = searchBST(root.left, val);
        else if(root.val < val) ans = searchBST(root.right, val);
        else ans = root;
        
        return ans;
        
    }
}
