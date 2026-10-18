import java.util.Scanner;

public class CardChecking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[16];

        System.out.println("Enter a card Number with space number to number:");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0; i<arr.length; i++){

            if(i%2==0){
                arr[i] = arr[i] + arr[i];
            }

            int sum = 0;

            while(arr[i] > 0){
                sum += arr[i] % 10;
                arr[i] = arr[i] / 10;
            }

            arr[i] = sum;
        }


        for(int x: arr){
            System.out.print(x + " ");
        }

        System.out.println();

        for(int i=0; i<arr.length; i++){
            count += arr[i];
        }

        //System.out.println("Total count: " + count);
        if(count%10==0){
            System.out.println("Card Is Correct");
        }
        else{
            System.out.println("Card is Wrong coard");
        }
    }
}