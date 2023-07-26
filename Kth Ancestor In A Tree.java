class Solution
{
    int ans = 0;
    int l =0;
    public boolean helper(Node root, int k, int tar){
        if(root == null) return false;
        if(root.data == tar) return true;
        
        boolean a = helper(root.left, k, tar);
         if(a){
            l--;
            if(l == 0)ans = root.data;
            return true;
        }
        
        boolean b = helper(root.right, k, tar);
        if(b){
            l--;
            if(l == 0)ans = root.data;
            return true;
        }
        return false;
    }
    
    public int kthAncestor(Node root, int k, int node)
    {
        l=k;
        helper(root, k, node);
        return ans==0?-1:ans;
    }
}
