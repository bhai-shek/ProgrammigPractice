class Main{
    public static void main(String args[]){
        // int start=1;
        // int end=50;
        // int sum=0;
        // for(int i=1;i<=end;i++){
        //     for(int j=1;j<=end;j++){
        //         if(i%j==0){
        //             sum=sum+j;
        //         }
        //     }
        //     if(sum==i){
        //         System.out.print(i +" ,");
        //     }
        // }


        // int n=4;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=6;col++){
        //         if(row==1 || row==n){
        //             System.out.print("* ");
        //         }else{
        //             if(col==1 || col==6){
        //                 System.out.print("* ");
        //             }
        //             else{ 
        //                 System.out.print(" ");

        //             }
        //         }
        //     }
        //     System.out.println("");
        // }





        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         if(row==1 || row==2 || row==n){
        //             System.out.print("* ");
        //         }else{
        //             if(col==1 || col==row){
        //                 System.out.print("* ");
        //             }else{
        //                 for(int spaces=1;spaces<=row-2;spaces++){
        //                 System.out.print(" ");
        //                 }
        //             }
        //         }
        //     }
        //     System.out.println("");
        // }





        // int n=5;
        // for(int row=1;row<=n;row++){

        //     // Leading spaces
        //     for(int space=1;space<=n-row;space++){
        //         System.out.print(" ");
        //     }

        //     // Stars
        //     if(row==1){
        //         // Single star - tip
        //         System.out.print("*");

        //     }else if(row==n){
        //         // Full base
        //         for(int col=1;col<=2*row-1;col++){
        //             if(col%2==1){
        //                 System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             }
        //         }

        //     }else{
        //         // Hollow middle
        //         System.out.print("*");
        //         for(int col=1;col<=2*row-3;col++){
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }

        //     System.out.println("");
        // }


        // int n=4;
        // for(int row=1;row<=4;row++){
        //     for(int space=1;space<=n-row;space++){
        //         System.out.print(" ");
        //     }
        //     for(int col=1;col<=2*row-1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }
        // //part 2
        // for(int row=1;row<=4;row++){
        //     if(row==1) continue;
        //     for( int space=1;space<=row-1;space++){
        //         System.out.print(" ");
        //     }
        //     for(int col=1;col<=2*n-2*row+1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }





        // int n=4;
        // for(int row=1;row<=n;row++){
        //     //part1
        //     for(int col=1;col<=row;col++){
        //         System.out.print("* ");
        //     }
        // //part2
        // for(int space=1;space<=2*(n-row);space++){
        //     System.out.print(" ");
        // }
        // //part3
        // for(int col=1;col<=row;col++){
        //     System.out.print("* ");
        // }      
        // System.out.println("");
        // }    
        
        

        int n=5;for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a=col;
                int b=('A' - 1 );
                int ans=a+b;
                char final_answer=(char)ans;
                System.out.print(final_answer + " ");
            }
            System.out.println("");
        }
            
    }
}