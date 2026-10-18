//import java.net.SocketPermission;
import java.util.Scanner;
public class NumberGuessing {

    public static void main(String a[]){
        int number=(int)(Math.random()*100);
        System.out.println(number);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Guessing number from 1 to 100:" + " " + "And you have Five chances:");
        //System.out.println("You have five Chances:");
        for(int i=0;i<5;i++){
            System.out.println("Now you have a " + (5-i) +" " +"Chances:");
            int guess=sc.nextInt();

            if(guess==number) {
                System.out.println("Your Guessing is correct"); 
                break;
        }
            else if(number>=10 && number<=20) {
                System.out.println("Random number is Between 0 to 20");
            }
            else if(number>=20 && number<=40){
                if(number>=20 && number<=30){
                    System.out.println("Your Number is Between of 20 to 30");
                }else{
                    System.out.println("Your Number id Between 30 to 40");
                }
                //System.out.println("Number is Between 20 to 40");
            }
            else if(number>=40 && number<=60){
                if(number>=40 && number<=50){
                    System.out.println("Your Number is Between of 40 to 50");
                }else{
                    System.out.println("Your Number is Between 50 to 60");
                }
                //System.out.println("Number is Between 40 to 60");
            }
            else if(number>=60 && number<=80){
                if(number>=60 && number<=70){
                    System.out.println("Your Number is Between of 60 to 70");
                }else{
                    System.out.println("Your Number is Between 70 to 80");
                }
                //System.out.println("Number Is Between 60 and 80");
            }
            else if(number>=100 && number<=80){
                if(number>=80 && number<=90){
                    System.out.println("Your Number is Between of 80 to 90");
                }else{
                    System.out.println("Your Number is Between 90 to 100");
                }
                //ystem.out.println("Number is Betwwen 80 to 100");
            }
            else System.out.println("You Guess wrong number:");
        }
        
    }
}
