    void dfs(int i, ArrayList<Integer> ans, boolean vis[],ArrayList<ArrayList<Integer>> adj){
        ans.add(i);
        vis[i]=true;
        for(int it: adj.get(i)){
            if(vis[it]==false){
                dfs(it,ans,vis,adj);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(vis[i]==false)dfs(i,ans,vis,adj);
        }
        return ans;
    }
