import java.util.*;
//import java.net.SocketPermission;
//import java.util.BufferReader;
//import java.util.InputStreamReader;
public class MasterLogic {
        // public static String NumberisPositiveNegative(int n){
        //     if(n>0 || n==0){
        //         return "Positive";
        //     }
        //     else{
        //         return "Negative";
        //     }
        // }

        // public static String EvenorOdd(int n){
        //     return (n&1)==0 ? "Even" : "odd";
        // }


        // public static String Divisiblebyfive(int n){
        //     if(n%5==0){
        //         return "Divisble five";
        //     }else{
        //         return "Not Divisble";
        //     }
        // }
        // public static String VowelorConsonat(char a){
        //         String ab="AEIOUaeiou";
        //         for(int i=1;i<=ab.length();i++){
        //             char ch=charAt(i);
        //             if(a==ab){
                        
        //             }
        //         }
        // }

    // private static char charAt(int i) {
    //         // TODO Auto-generated method stub
    //         throw new UnsupportedOperationException("Unimplemented method 'charAt'");
    //     }

    public static void main(String a[]) throws Exception{

        String str="aabbbbcc";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            
        }



        // String str="java programming java sql";
        // int count=1;
        // HashSet<String> set=new HashSet<>();
        // for(int i=1;i<str.length()-1;i++){
        //     char ch=str.charAt(i);
        //     if(ch==" "){
        //         count++;
        //     }
        // }
        // System.out.print(count);


        // String str="java";
        // String str2="";
        // for(int i=str.length()-1;i>=0;i--){
        //     str2=str2+str.charAt(i);
        // }
        // System.out.print(str2);

        // String str="a3b4c5";
        // for(char ch:str.toCharArray()){
        //     if(ch.equlas((Character.isDigit(ch)))){

        //     }
        // }
        




        // int arr[]={6,8,2,4,5,9};
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //     int temp=arr[i];
        //     arr[i]=arr[i+1];
        //     arr[i+1]=temp;
        //     }
        // }
        // for(int x:arr){
        //     System.out.print(x + " ");
        // }



        // int arr[]={5,6,7,8,15,17};
        // int left=0;
        // int right=arr.length-1;
        // int target=15;
        // while(left<=right){
        //     int mid=(left+right)/2;
        //     if(arr[mid]==target){
        //         System.out.println("value find at:" + mid);
        //         break;
        //     }
        //     else if(arr[mid]<target){
        //         left=mid+1;
        //     }
        //     else{
        //         right=mid-1;
        //     }
            
        // }
        //System.out.println("Element not Found");

        //  HashMap<Integer,Integer> map=new HashMap<>();

        // map.put(9,90);
        // //map.put(6,50);
        // map.put(4,200);
        // //map.put(2,300);
        // ArrayList<Integer> ab=new ArrayList<>();
        // HashMap<Integer,Integer> res=new HashMap<>();

        // for(Integer key : map.keySet()){

        //     res.put(key*key, map.get(key));

        // }
        // int sqrt=3450;
        // int key=81;
        // int num=res.get(key);
        // int firsttile=sqrt/num;
        // ab.add(firsttile);

        // int sum=firsttile*num;
        // int ans=sqrt-num;
        // int key2=16;
        // int secondtile=ans/res.get(key2);
        // int num2=secondtile*16;
        // int maincheck=num2+sum;
        // ab.add(secondtile);


        // if(maincheck==sqrt)
        //     System.out.print("True");
           
        // else System.out.println("false");




        // //System.out.println(result);
        




        
       // System.out.println("Enter a Number:");
        //InputStreamReader in=new java.io.InputStreamReader(System.in);
        //BufferedReader bf=new BufferedReader(in);
        //int num=Integer.parseInt(bf.readLine());
        //System.out.println(Divisiblebyfive(num));
        //System.out.println(EvenorOdd(num));
        //System.out.println(NumberisPositiveNegative(num));

        // int arr[]={1,2,3,4,5,8};
        // int left=0;
        // int right=(arr.length)-1;

        // while(left<right){
        //     int temp=arr[right];
        //     arr[right]=arr[left];
        //     arr[left]=temp;

        //     left++;
        //     right--;
        // }

        // for(int x:arr){
        //     System.out.print(x + " ");
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==arr[i]){
        //         continue;
        //     }
        //     int product=0;
        //     product=arr[i]*arr[i+1];
        //     arr[i]=product;
        // }
        // for(int x:arr){
        //     System.out.print(x + " ");
        // }

        // int first=Integer.MIN_VALUE;
        // int secondMax=Integer.MIN_VALUE;
        // // for(int i=0;i<arr.length;i++){
        // //         if(arr[i]>first){
        // //             secondMax=first;
        // //             first=arr[i];
        // //         }else if(arr[i]>secondMax && arr[i]!=first){
        // //             secondMax=arr[i];
        // //         }
        // // }

        // for(int x:arr){
        //     if(x>first){
        //         secondMax=first;
        //         first=x;
        //     }else if(x>secondMax && x!=first){
        //         secondMax=x;
        //     }
        // }

        // System.out.print(secondMax);
    }
}
