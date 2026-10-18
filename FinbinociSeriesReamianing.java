import java.util.*;
public class FinbinociSeriesReamianing {
    public static void main(String a[]){
    HashSet<Integer> set=new HashSet<>();
    int arr[]={0,1,1,2,3,5,8};
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }
    for(int i=0;i<10;i++){
        if(!set.contains(i)){
            System.out.print(i + " ");
        }
    }
}
}
