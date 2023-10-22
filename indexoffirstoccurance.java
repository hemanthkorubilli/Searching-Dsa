import java.util.*;
class indexoffirstocc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mid=0;
        int low=0;
        int high=n-1;
        System.out.print(fun(arr,k,low,mid,high));
    }
        static int fun(int arr[],int k,int low,int mid,int high){
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                if(arr[mid]==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }else{
                    high=mid-1;
                }
            }

        }
        return -1;
    }
}
