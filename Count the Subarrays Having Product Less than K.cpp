 {
        int ans=1;
        for(int i=0; i<n;i++){
            int j=i;
            long long mul=a[i];
            while(j<n and mul < k){
                j++;
                ans++;
                mul = mul*a[j];
            }
            j=i+1;
        }
        return ans-1;
    }
};
