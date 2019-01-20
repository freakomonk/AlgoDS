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
    public void flatten(TreeNode root) {
        
        if(root==null) return;
        
        root = flattenBTree(root);
    
}
    
    private TreeNode flattenBTree(TreeNode root){
        
        if(root==null) return null;
        
        if(root.left==null && root.right==null) return root;
        
        TreeNode rt = root.right;
        TreeNode tmp = root;
        root.right = flattenBTree(root.left);
        root.left =null;
        
        
        while(root.right!=null){
            root = root.right;
        }
        root.right = flattenBTree(rt);

        return tmp;
    }
    

}
