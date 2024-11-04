/*
 * COLLECTION INTERFACE
 * 
 * It comes under java.util.collection package.
 * 
 * We cant create an object for the collection because its an interface.
 * Now to resolve this problem we can simply use anonymous class but collection interface has so many classes into it. so we have to implement the all..
 * Api means some library or some feature whjich we can simply use...there should not any implemented.
 * 
 * List, Queue, Set can implements the collection..
 * 
 * for List we have ArrayList, LinkedList
 * 
 * in queue we have Dequeue
 * 
 * for set we have HasSet, LinkedHashSet
 * 
 * 
 * LIST :
 * in case of list it can support Duplicate values..
 */
import java.util.ArrayList;
import java.util.List;
public class CollectionInterface {
   public static void main(String[] args) {
    //Collection<Integer> nums = new ArrayList<Integer>();
    /*if we are using  Collection<Integer>
    * we dont have access to its index value.
     * if we are talking about arraylist , its a class which implements List, and List have a method get...
     * so instead of using collection we can use List there
     */

     List<Integer> nums = new ArrayList<Integer>();
    
    nums.add(6);
    nums.add(7);
    nums.add(8);
    nums.add(66);
    nums.add(77);
    nums.add(6);

    System.out.println(nums); //[6, 7, 8, 66, 77]

    System.out.println("At index 2 we have" + nums.get(2));

    /* 
    for(int n : nums){
        System.out.println(n);
    }
        Here it shows error...
        Collection API works with objects, it did not deals with type int, float, double..
        So in the enhanced for loop we can't  put the object into n because n is int variable.

        to resolve this problem we are using generics, we can put the type of variable we gonna store
        collection<Integer> nums = new ArrayList<Integer>();
    */

    for(int n : nums){
        System.out.println(n);
    }
   }
    
}
