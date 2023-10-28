import java.util.*;
class bubblesort{
    public static void main(String args[]){
        int[] arr={4,5,3,6,7,2,9};
        fun(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void fun(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}