class Bitwize {
    public static void main(String[] args) {
        // int a = 16; // 0101 in binary
        // int b = 3; // 0011 in binary

        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println("a is " + a);
        // System.out.println("B is" + b);


        int arr[] = {2,3,5,4,5,3,4};

        int result = 0;
        int count=0;

        for(int num : arr){
            result ^= num;
            count++;
        }
        System.out.println("Count is " + count);
        System.out.println(result);



        // // Bitwise AND
        // int andResult = a & b; // 0001 in binary, which is 1
        // System.out.println("Bitwise AND: " + andResult);

        // // Bitwise OR
        // int orResult = a | b; // 0111 in binary, which is 7
        // System.out.println("Bitwise OR: " + orResult);

        // // Bitwise XOR
        // int xorResult = a ^ b; // 0110 in binary, which is 6
        // System.out.println("Bitwise XOR: " + xorResult);

        // // Bitwise NOT
        // int notResult = ~a; // Inverts bits of a
        // System.out.println("Bitwise NOT: " + notResult);


    //    int count=0;
    //    int c=0;
    //    while(a!=0){
    //           if((a&1)==1){
    //               count++;
    //           }
    //           a=a>>1;
    //           c++;
    //           System.out.println("B is " + c );
    //    }
    //    System.out.print(count);
    //    if(count%2==1){
    //        System.out.println("Even");


        // if((a&(a-1))==0){
        //     System.out.println("Power of 2");
        // }else{
        //     System.out.print("Not Power of 2");
        // }
    }
}