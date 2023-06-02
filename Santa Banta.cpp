void DFS(int node,bool vis[],vector<vector<int>>& g,int& size)
{
    size++;
    vis[node]=true;
    for(auto it:g[node])
    {
        if(vis[it]) continue;
        DFS(it,vis,g,size);
    }
}
vector<int> prime;
void precompute(){
    vector<bool> isprime(1000001,1);
    isprime[0]=isprime[1]=0;
    for(int i=2;i<=1000000;i++)
    {
        if(isprime[i])
        {
            prime.push_back(i);
            isprime[i]=true;
            for(int j=2*i;j<1000000;j+=i)
            {
                isprime[j]=false;
            }
        }
    }
}
