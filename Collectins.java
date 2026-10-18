import java.util.*;
public class Collectins {
    public static void main(String a[]){
            // List<Integer> nums=new ArrayList<>();
            // nums.add(6);
            // nums.add(5);
            // nums.add(8);
            // nums.add(3);
            // nums.add(4);
            // nums.add(2);
            // System.out.println(nums);
            // System.out.println(nums.get(3));
            // System.out.println(nums.indexOf(8));

        String str="javaprogramming";
        int left=0;
        int max=0;
        HashSet<Character> set=new HashSet<>(0);
        for(int right=0;right<str.length();right++){
                while(set.contains(str.charAt(right))){
                    set.remove(str.charAt(left));
                    left++;
                }
            set.add(str.charAt(right));

            max=Math.max(max,right-left+1);
        }
        System.out.println(set);
    }
}
