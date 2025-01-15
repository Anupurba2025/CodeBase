
//In the top of collection we have one more interface that is Iterable..
//
import java.util.*;
public class SetJava {
    public static void main(String[] args) {
        //instead of writing Set<Integer> nums we can also write 
        //collection<Integer>, as set extends collection
        Set<Integer> nums = new HashSet<Integer>();

        //In case of set we didn't put any duplicate values...and also it takes sorted values.
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(66);
        nums.add(77);

        System.out.println("Its using Set");
        for(int n: nums){
            System.out.println(n);
        } 

        //If we want sorted order of values then we can use TreeSet
        Set<Integer> num1 = new TreeSet<Integer>();
        num1.add(6);
        num1.add(7);
        num1.add(8);
        num1.add(66);
        num1.add(77);

        System.out.println("Using TreeSet-");
        for(int n: num1){
            System.out.println(n);
        } 
    }

}

