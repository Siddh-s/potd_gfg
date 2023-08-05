class Solution{
    public:
    long long findMinDiff(vector<long long> a, long long n, long long m){
    //code
        sort(a.begin(),a.end());
        long long  first=m-1,second=0;
        long long minDiff=INT_MAX;
        while(first<n){
            minDiff=min((a[first]-a[second]),minDiff);
            first++;
            second++;
        }
        return minDiff;
    }   
};
