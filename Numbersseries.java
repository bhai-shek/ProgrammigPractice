public class Numbersseries {
    //count digits
    // static void countdigits(int n){
    //         int count=0;
    //         while(n!=0){
    //             int ans=n%10;
    //             count++;
    //             n=n/10;
    //         }
    //         System.out.println(count);
    // }


    //sum of digits
    // static void sumofdigits(int n){
    //     int sum=0;
    //     while(n!=0){
    //         int ans=n%10;
    //         sum+=ans;
    //         n=n/10;
    //     }
    //     System.out.println(sum);
    // }


    //Reverse a number
    // static void reversenumber(int n){
    //     int rev=0;
    //     while(n!=0){
    //         int ans=n%10;
    //         rev=rev*10 + ans;
    //         n=n/10;
    //     }
    //     System.out.println(rev);
    // }


    //prime check
    // static boolean prime(int n){
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // static void gcd(int a,int b){
    //     while(b!=0){
    //         int oldvalue=b;
    //         b=a%b;
    //         a=oldvalue;
    //     }
    //     System.out.println(a);
    // }

    // static void lcm(int a,int b){
    //     int ans=0;
    //     int 
    //     while(b!=0){
    //         ans=(a+b)/gcd();
    //     }
    // }



    //Armstrong number
    // static void Armstrongnnumber(int n){
    //     int count=0;
    //     int dup=n;
    //     while(n!=0){
    //         //int ans=n%10;
    //         count++;
    //         n=n/10;
    //     }
    //     System.out.println(count);
    //     int ans=0;
    //     while(dup!=0){
    //         int digit=dup%10;
    //         ans=ans+(int) Math.pow(digit,count);
    //         dup=dup/10;
    //     }
    //     System.out.println(ans);
    // }


    //perfect number check
    // static void Perfectnumbercheck(int n){
    //     int sum=0;
    //     for(int i=1;i<n;i++){
    //         if(n%i==0){
    //         sum+=i;
    //         }
    //     }
    //     if(sum==n){
    //         System.out.println("Perfect number");
    //     }else{
    //         System.out.println("Not perfect");
    //     }
        
    // }



    //print all perfectnumbers
//     static void perfectnumberss(int range) {
//     for(int n = 1; n <= range; n++) {
//         int sum = 0;

//         // find divisors of n
//         for(int i = 1; i < n; i++) {
//             if(n % i == 0) {
//                 sum += i;
//             }
//         }

//         // check if perfect
//         if(sum == n) {
//             System.out.println(n + " is a Perfect Number");
//         }
//     }
// }



    //allprimenumbers
    static void primeInRange(int start, int end){
    for(int i = start; i <= end; i++){
        int count = 0;

        for(int j = 2; j < i; j++){
            if(i % j == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println(i + " is Prime number");
        }
    }
}
    public static void main(String[] args) {
        int n=24;
        //Perfectnumbercheck(n);
        //perfectnumbers(100);
        primeInRange(1,100);
        //Armstrongnnumber(n);
        // int a=18,b=12;
        // gcd(a,b);
        // lcm(a,b);
        //countdigits(n);
        //sumofdigits(n);
        //reversenumber(n);
        //System.out.println(prime(n));





        // while(n != 0){
        //     int ans=n%10;
        //     System.out.print(ans);
        //     n=n/10;
        // }
    }
    
}
