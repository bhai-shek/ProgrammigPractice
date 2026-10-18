import java.util.*;
public class RepeatingCharacters {
    public static void main(String a[]){
        String str="java programming";
        //int left=0;
        //int max=0;
        TreeSet<Character> set=new TreeSet<>();
        for(int right=0;right<str.length();right++){
            if(str.charAt(right) == ' '){
                continue;
            }
            set.add(str.charAt(right));

        }
        System.out.print(set);

    }
}
