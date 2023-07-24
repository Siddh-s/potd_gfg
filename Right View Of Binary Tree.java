 int taken=0;
    void help(Node node,int cur,ArrayList<Integer> ans){
        if(node==null)return;
        if(taken<cur){
            ans.add(node.data);
            taken++;
        }
        cur++;
        help(node.right,cur,ans);
        help(node.left,cur,ans);
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
        int cur=1;
        help(node,cur,ans);
        return ans;
    }
