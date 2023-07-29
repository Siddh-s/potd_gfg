
    static int total=0,sum=0,curr=0;
    static void help(Node root){
        if(root==null)return;
        total++;
        help(root.left);
        help(root.right);
    }
    static void help2(Node root,int first,int second){
        if(root==null)return;
        help2(root.left,first,second);
        curr++;
        if(curr==first)sum+=root.data;
        if(curr==second)sum+=root.data;
        help2(root.right,first,second);
    }
    public static float findMedian(Node root)
    {
        // code here.
        total=0;
        sum=0;
        curr=0;
        help(root);
        int first,second;
        if(total%2==1){
            first=(total/2)+1;
            second=first;
        }
        else{
            first=total/2;
            second=first+1;
        }
        help2(root,first,second);
        return (float)sum/2;
    }
