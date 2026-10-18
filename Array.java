import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        // int arr[]={10,20,30,40,50};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //         sum+=arr[i];
        // }
        // System.out.println("Sum of array:" + sum);



        // int arr[]={2,3,10,20};
        // int multiply=1;
        // for(int i=0;i<arr.length;i++){
        //     multiply*=arr[i];
        // }
        // System.out.println("Multiply the array of numbers:" + multiply);




        //find maximun value in array
        //int arr[]={4,2,-5,21,15};
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>=max){
        //         max=arr[i];
        //     }
        // }
        // System.out.println("Maximum value in array:"+max);



        //Minimum value in array
        // int min=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=min){ 
        //         min=arr[i];

        //     }
        // }
        // System.out.println("Minimum value is:" + min);





        //2D ARRAY
        // int arr[][]={
        //     {1,2},
        //     {2,3},
        //     {3,4},
        //     {4,5}
        // };
        // int rowlength=arr.length;
        // int collength=arr[0].length;
        // for(int row=0;row<rowlength;row++){
        //     for(int col=0;col<collength;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println("");
        // }


        //If row and column is differnt
        // int arr[][]={
        //     {1,2},
        //     {2,3,4,5},
        //     {3,4,5,6,7},
        //     {4}
        // };
        // int rowlength=arr.length;
        // for(int row=0;row<rowlength;row++){
        //     int collength=arr[row].length;
        //     for(int col=0;col<collength;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println("");
        // }


        // int arr[][]=new int[3][4];
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.println("value of" + i +" " + j + ":");
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //      for(int j=0;j<arr[i].length;j++){
        //          System.out.print(arr[i][j] + " ");
        //      }
        //      System.out.println("");
        // }

        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //      for(int j=0;j<arr[i].length;j++){
        //         sum+=arr[i][j];          
        //      }
        //      System.out.println(sum);
        // }


        // int arr[]={1,2,3,4,5};
        // int n=arr.length;
        // int temp=arr[n-1];
        // for(int i=n-1;i>0;i--){
            
        //     arr[i]=arr[i-1];
            
        // }
        // arr[0]=temp;
        // for(int x:arr){
        //     System.out.print(x +" ");
        // }

        int arr[]={1,2,3,4,5};
        int temparr[]= new int[arr.length];
        int k=2;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){  
            int newpost=(i+k)%n;
            temparr[newpost]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temparr[i];
            System.out.print(temparr[i] + " ");
        }   
    }

}
