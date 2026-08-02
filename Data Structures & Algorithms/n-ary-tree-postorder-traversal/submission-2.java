/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        dfs(root,res);
        return res;
    }
    private void dfs(Node n,List<Integer> res)
    {
        if(n==null)
        {
            return;
        }
        for(int i=0;i<n.children.size();i++)
        {
            dfs(n.children.get(i),res);
        }
        res.add(n.val);

    }
}