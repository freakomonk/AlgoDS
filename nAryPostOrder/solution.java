/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        
        
        
        List<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        
        postOrderHandler(root, res);
        
        return res;
        
    }
    
    private void postOrderHandler(Node node, List<Integer> list){
        
        if(node==null) return;
        
        if(node.children == null || node.children.isEmpty()){
            
        list.add(node.val);
            
            } else {
        
        for(Node n : node.children){
            postOrderHandler(n, list);
        }
        
        list.add(node.val);
        }
        
    }
}
