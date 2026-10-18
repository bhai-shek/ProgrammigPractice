// import java.util.*;
// import java.io.*;

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int sum=0;
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//              sum=a+(i-1)*2;
//              System.out.print("Sum is" + sum);
//         }
//         in.close();
//     }
// }



public class StringsBasics {

    static int StringLength(String str) {  // ✅ "static int" — both keywords required
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Abhishek";
        System.out.println(StringLength(s));  // Output: 8
    }
}