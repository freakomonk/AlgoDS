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
    public List<Double> averageOfLevels(TreeNode root) {
        
        //variable to store nodes in each level
        ArrayList<ArrayList<Integer>> levels = new ArrayList<ArrayList<Integer>>();
        
        levelTraversal(root,0,levels);
        
        //variable to store solution
        List<Double> solution = new ArrayList<Double>();
        
        for(int i = 0;i<levels.size();i++)
        {
            List<Integer> list = levels.get(i);
            
            double sum = 0;
            
            for(int j=0;j<list.size();j++)
                sum+=list.get(j);
            
            solution.add((double)sum/list.size());
        }
        
        return solution;
        
    }
    
    public void levelTraversal(TreeNode current,int level,ArrayList<ArrayList<Integer>> levels)
    {
        //Base case: if root is null
        if(current == null)
            return;
        
        //Case 1: level has been already traversed
        if(level<levels.size())
        {
            ArrayList<Integer> list = levels.get(level);
            list.add(current.val);
            levels.set(level,list);
            
        }
        //Case 2: level has not been traversed
        else
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(current.val);
            levels.add(list);
        }
        
        //recurse on left subtree
        levelTraversal(current.left,level+1,levels);
        
        //recurse on right subtree
        levelTraversal(current.right,level+1,levels);
    }
}
