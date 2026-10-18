public class ArrayClass29{

//     static int[] sortZeroAndOne(int arr[]) {
//     int i = 0;
//     int j = arr.length - 1;

//     while (i < j) {

//         if (arr[i] == 0) {
//             i++;
//         }
//         else if (arr[j] == 1) {
//             j--;
//         }
//         else {
//             //int temp = arr[i];
//             arr[i] = 0;
//             arr[j] = 1;
//         }
//     }

//     return arr;
// }




    //static int missingElement(int arr[]){
        // int arraysum=0;
        // int n=arr.length+1;
        // int expectedSum=n*(n+1)/2;
        // for(int i=0;i<arr.length;i++){
        //     arraysum+=arr[i];
        // }
        // return expectedSum-arraysum;

//         int xorSum = 0;
//     int n = arr.length;

//     for (int x : arr) {
//         xorSum ^= x;
//     }

//     for (int i = 0; i <= n; i++) {   // <= instead of <
//         xorSum ^= i;
//     }

//     return xorSum;
// }


        static int uniqueElement(int arr[]){
            int xouSum=0;
            for(int x:arr){
                xouSum^=x;
            }
            return xouSum;
        }



    
    public static void main(String a[]){


        int arr[]={2,3,4,5,3,4,5};
        System.out.println(uniqueElement(arr));

        // int arr[]={0,1,0,1,0,1,0,1};
        // int result[]=sortZeroAndOne(arr);
        // for(int i=0;i<result.length;i++){
        //     System.out.print(result[i] + " ");
        // }

    }
}