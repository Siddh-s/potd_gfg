class Solution {
    int count(int[] arr, int n, int x) {
        int first=firstOcc(arr,n,x);
        if(first==-1) return 0;
        
        int second=secondOcc(arr,n,x);
        return second-first+1;
    }
    private int firstOcc(int[] arr,int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                if(mid-1>=0 && arr[mid-1]==x){
                    low=0;
                    high=mid-1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    private int secondOcc(int[] arr,int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                if(mid+1<n && arr[mid+1]==x){
                    low=mid+1;
                    high=n-1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
