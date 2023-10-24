import java.util.*;
class binarysearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("index of the given number is:");
        System.out.print(fun(arr,k,n));
    }
    static int fun(int arr[],int k,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(k>arr[mid]){
                low=mid+1;
            }else if(k<arr[mid]){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}