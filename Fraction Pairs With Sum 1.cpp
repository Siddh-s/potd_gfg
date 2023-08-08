
class Solution
{
    public:
    int countFractions(int n, int numerator[], int denominator[])
    {
      map< pair<int,int>,int >mpp;
       int ans=0;
       for(int i = 0 ; i < n ;i++){
          int n= numerator[i];
          int d = denominator[i];
          int gcd = __gcd(n,d);
          n=n/gcd;
          d=d/gcd;
          int remaining = d-n;
          //finding  1 - n/d in map 
          if(mpp.find({remaining,d})!=mpp.end())
           {
              //if it is present than add the frequency of it
                ans+=mpp[{remaining,d}];   

         }
           mpp[{n,d}]++;
          
       }
       return ans;

    }
};
