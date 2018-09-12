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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> leaves1 = new ArrayList<Integer>();
        List<Integer> leaves2 = new ArrayList<Integer>();
        
        findLeaves(root1, leaves1);
        findLeaves(root2, leaves2);
        
        return leaves1.equals(leaves2);
        
    }
    
    
    private void findLeaves(TreeNode root, List<Integer> list){
        if(root == null) return;
        
        if(root.left==null && root.right==null) list.add(root.val);
        else {
            findLeaves(root.left, list);
            findLeaves(root.right, list);
        }
    }
    
}
