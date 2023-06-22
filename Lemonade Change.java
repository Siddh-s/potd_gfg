  static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int a=0,b=0;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                a++;
            }
            else if(bills[i]==10){
                if(a==0)return false;
                a--;
                b++;
            }
            else{
                if(b!=0 && a!=0){
                    b--;
                    a--;
                }
                else if(a>=3)a-=3;
                else return false;
            }
        }
        return true;
    }
