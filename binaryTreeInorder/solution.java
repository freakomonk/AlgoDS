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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        if(root==null) return list;
        
        
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        TreeNode cur = root;
        
        while(cur!=null || !s.empty()){
            
                while(cur!=null){
                    s.push(cur);
                    cur = cur.left;
                }
            
            cur = s.pop();
            list.add(cur.val);
            
            cur = cur.right;
            
        }
        
        return list;
        
    }
}
