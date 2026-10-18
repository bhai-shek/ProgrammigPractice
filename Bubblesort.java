import java.util.*;
class Bubblesort{
    public static void main(String args[]){
        int arr[]={7,9,8,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

        // int i=0;
        // int j=arr.length;
        // while(i<j){
        //     if(arr[i]>arr[j]){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         i++;
        //     }
        //     j--;
        // }
        // for(int x:arr){
        //     System.out.print(x +" ");
        // }
    }
}