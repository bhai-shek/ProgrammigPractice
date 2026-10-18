public class StringsBasics {

    // //count length without length method
    //     static int stringLength(String str){
    //         int count=0;
    //         for(char ch:str){
    //             count++;
    //         }
    //        System.out.println(count);
    //     }



    // //Count vowels
    // void countvowels(String str){
    //     int count=0;
    //     for(char ch:str.toCharArray()){
    //         System.out.println(str);
    //     }
    // }


    //Reverse plaidrome
    // static void Palindrome(String str) {
    // int n = str.length();

    // // Step 1 - Early exit check
    // if(str.charAt(0) != str.charAt(n-1)) {
    //     System.out.println("Not Palindrome");
    // }
    // else {
    //     // Step 2 - Full reversal check
    //     String str1 = "";
    //     for(int i = str.length()-1; i >= 0; i--) {
    //         char ch = str.charAt(i);
    //         str1 += ch;
    //     }
    //     // ✅ use .equals() and add else
    //     if(str.equals(str1)) {
    //         System.out.println("Palindrome");
    //     } else {
    //         System.out.println("Not Palindrome"); // ✅ missing in your code
    //     }
    // }

    // }


    //count constants
    // static void constants(String str){
    //     int count=0;
    //     for(char ch:str.toCharArray()){
    //         if("aeiouAEIOU".indexOf(ch) !=-1){
    //             count+=0;
    //         }
    //         else{
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }


    //upper case conversation without method
    // static void uppercase(String str){
    //     String result="";
    //     for(char ch:str.toCharArray()){
    //         if(ch>='a' && ch<='z'){
    //             //upper conversation
    //             char upper=(char)(ch-32);
    //             result+=upper;
    //         }
    //         else{
    //             result+=ch;
    //         }
    //     }
    //     System.out.println(result);
    // }




//     static void frequency(String str) {
//     boolean[] visited = new boolean[str.length()];

//     for (int i = 0; i < str.length(); i++) {
//         // skip already counted character
//         if (visited[i] == true) {
//             continue;
//         }

//         int count = 1;
//         char ch = str.charAt(i);

//         for (int j = i + 1; j < str.length(); j++) {
//             if (ch == str.charAt(j)) {
//                 count++;
//                 visited[j] = true; // mark as counted
//             }
//         }
//         System.out.println(ch + " = " + count);
//     }
// }




        //check if string only digits
        // static void digitsonlystring(String str){
        //     boolean isdigit=true;
        //     for(char ch:str.toCharArray()){
        //         if(ch >= '0' && ch<= '9'){

        //         }
        //         else{
        //             isdigit=false;
        //             break;
        //         }
        //     }
        //         if(isdigit){
        //             System.out.println("string only numbers");
        //         }
        //         else{
        //             System.out.println("Not numbers");
        //         }
        // }


        //words count in a secentences
        static void wordcount(String str){
            int count=1;
            for(char ch:str.toCharArray()){
                if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        String str="abhishek is a goodboy";
        String s="1234";
        //Palindrome(str);
        //constants(str);
        //uppercase(str);
        //frequency(str);
        //digitsonlystring(str);
        wordcount(str);
        
        // String str="abhishek";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
            
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='i' || ch=='o' || ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);


        //reverse a string
        // String str="abhishek";
        // String str1="";
        // for(int i=str.length()-1;i>=0;i--){
        //     char ch=str.charAt(i);
        //     str1+=ch;
        // }
        // System.out.println(str1);

        // String str="Abhishek";
        // System.out.println(str);
        // System.out.println(str.length());
        // System.out.println(str.charAt(3));

        // //create a string using new keyword it is very useful
        // String firstname=new String("Karisanapu");
        // System.out.println("Length to find:" + " " + firstname.length());
        // //Accesing elemnts
        // System.out.println("Accesing the first Element" +" "+ firstname.charAt(0));

        // //To accesing all elemnts
        //  for(int i=0;i<firstname.length();i++){
        //      System.out.println(firstname.charAt(i));
        //  }

        


        

    }
}
