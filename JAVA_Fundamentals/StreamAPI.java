
/*STREAM 
 * Stream is an interface, it provides you multiple methods like filter(),reduce(), sorted()...
 */

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        
        /*List<Integer> nums = new ArrayList<>();
        Instead of manually type the values we can use the Arrays.asList(4,5,7,2) */

        List<Integer> nums = Arrays.asList(4,5,2,3,1,33,100);
        /* 
        int sum = 0;
        for(int n : nums){
            if(n % 2 == 0){
                sum = sum + (n*2);
            }
        }*/

        /*NORMAL FOR LOOP
         * for(int i = 0; i<nums.length;i++){
         *      System.out.println(i); 
         * }
         * 
         * ENHANCED FOR LOOP
         *  for(int n : nums){
         *      System.out.println(nn;
         * }
         * 
         * INSTEAD OF USING THAT WE CAN SIMPLY USE THE FOReACH LOOP 
         */

         nums.forEach(n -> System.out.println(n));
         //lETS UNDERSTAND WHAT THIS FOREACH IS AND HOW ITS WORKING INSIDE...
        
         //Stream<Integer> s1 = nums.stream(); //it returns the object of Stream
         //s1.forEach(n -> System.out.println(n));
         /*
         s1.forEach(n -> System.out.println(n));
         The above line working well at the compile time and compiled successfully but in run time it show error...Because we can use object of Stream only once not more than that.
         Then why we are using the Stream
         Stream provides us a lots of methods...to use it..
         All the values of arraylist is simply added to s1...and the bauty is whatever changes that you made in s1, it did not affect the nums. */

        /*Stream<Integer> s1 = nums.stream();
         Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
         Stream<Integer> s3 = s2.map(n->n*2);
         int result = s3.reduce(0, (c,e)-> c+e);
         System.out.println("The final result is - " + result);

         NOW SIMPLY WE CAN DO THIS WHOLE THING IN A SINGLE LINE
         */
        int result = nums.stream().filter(n -> n % 2 == 0).map(n-> n*2).reduce(0,(c,e)->c+e);
        System.out.println(result);
        
    }
}

/*foreach() method is basically introduce in java version 1.8. it takes an object of a consumer...
 * Now Consumer is an functional interface with only one method itself that is public void accept()...That means it supports the concept of lambda expression.
*/
