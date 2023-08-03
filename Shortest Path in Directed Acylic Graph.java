class pair{
    int first,second;
    pair(int a,int b){
        first=a;
        second=b;
    }
}
class Solution {
  	void dfs(int node,boolean vis[],ArrayList<Integer> topo,ArrayList<pair> adj[]){
	    vis[node]=true;
	    for(pair x:adj[node]){
	        if(vis[x.first]==false){
	            dfs(x.first,vis,topo,adj);
	        }
	    }
	    topo.add(node);
	}
	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		boolean vis[] = new boolean[N];
		Arrays.fill(vis,false);
	    ArrayList<Integer> topo = new ArrayList<>();
	    ArrayList<pair> adj[]=new ArrayList[N];
	    for(int i=0;i<N;i++) {
			adj[i]=new ArrayList<>();
		}
	    for(int i=0;i<M;i++){
	        adj[edges[i][0]].add(new pair(edges[i][1],edges[i][2]));
	    }
	    for(int i=0;i<N;i++){
	        if(vis[i]==false){
	            dfs(i,vis,topo,adj);
	        }
	    }
	    Collections.reverse(topo);
	    int dis[] = new int[N];
	    Arrays.fill(dis,Integer.MAX_VALUE);
	    dis[0]=0;
	    for(int i=0;i<N;i++){
	        if(dis[topo.get(i)]!=Integer.MAX_VALUE){
	            for(pair x:adj[topo.get(i)]){
	                if(dis[topo.get(i)]+x.second<dis[x.first]){
	                    dis[x.first]=dis[topo.get(i)]+x.second;
	                }
	            }
	        }
	    }
	    for(int i=0;i<N;i++){
	        if(dis[i]==Integer.MAX_VALUE)dis[i]=-1;
	    }
	    return dis;
	}
