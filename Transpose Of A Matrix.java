    public void transpose(int n,int a[][])
    {
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
