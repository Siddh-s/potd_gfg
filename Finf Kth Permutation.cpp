  string kthPermutation(int n, int k)
    {
        // code here
        vector<int> temp(n);
        for(int i=0;i<n;i++)temp[i]=i+1;
        k--;
        while(k--){
            next_permutation(temp.begin(),temp.end());
        }
        string ans="";
        for(auto x:temp){
            ans+=(x+'0');
        }
        return ans;
    }
};
