public class ArrayClass27 {
    // static boolean  linearSearch(int arr[],int key){
    //    int i=0;
    //    int j=arr.length-1;
    //    while(i<=j){
    //        if(arr[i]==key || arr[j]==key){
    //            return true;
    //        }
    //        i++;
    //        j--;
        
    //    }
    //      return false;



    // static int secondLargest(int arr[]){
    //     int firstlarge=arr[0];
    //     int secondlarge=-1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>firstlarge){
    //             firstlarge=arr[i];
    //         }
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<firstlarge && arr[i]>secondlarge){
    //             secondlarge=arr[i];
    //         }
    //     }
    //     return secondlarge;



    // static int[] positiveNegativesum(int arr[]){
    //     int posum=0;
    //     int negsum=0;
    //     int i=0;
    //     while(i<arr.length){
    //         if(arr[i]>0){
    //             posum+=arr[i];
    //         }else{
    //             negsum+=arr[i];
    //         }
    //         i++;
    //     }
    //     return new int[]{posum,negsum};
    // }
      

        static int unsortedArray(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1]<=arr[i]){
                    return arr[i+1];
                }
            }
            return -1;
        }





    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};


        int arr[]={1,2,3,4,5};
        int ans=unsortedArray(arr);
        System.out.println(ans);





        // int ar[]={2,-3,-1,4,6,-9};
        // int ans[]=positiveNegativesum(ar);
        // System.out.println("Positive sum is :" + ans[0]);
        // System.out.println("Negative sum is :" + ans[1]);




        // int ans=secondLargest(arr);
        // System.out.println(ans);



        // int key=7;
        // boolean result=linearSearch(arr,key);
        // if(result){
        //     System.out.println("Element found");
        // }else{
        //     System.out.println("Element not found");
        // }
        // ArrayClass27 obj=new ArrayClass27();
       
    }
}
