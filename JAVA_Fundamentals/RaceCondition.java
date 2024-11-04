/* Apart from threads we are having one more concept Mutation.
 * 
 * Threads and Mutatio together is not a good approach...
 * Basically Mutation means its a mutable data...that can be modified or changed.
 * 
 * If we are using Thread with Immutable dat then the threads are safe. 
 */

 class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
 }
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->{
            for(int i =1;i<=10000;i++){
                c.increment();
            }
        };
        Runnable obj2 = () ->{
            for(int i =0; i < 10000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //When we initiate the start methods the count should be 2000 at the end. but actually the below line did not print 20000
        //because, at some point of tim et1 dos some iteration , sometime t2 complete some iteration... so the main simply prints that values...
        System.out.println(c.count); //255

        //To solve the above problem the thing which we can do is, 
        //we tell main to wait for other threads to complete
         t1.join();
         t2.join();

         System.out.println(c.count);//20000

         //After this also in some cases Threads can print some other values... because they have different behaviors and we can not handle thread directly.

         //Now here we can face a problem with threads, like suppose t1 and t2 are two different threads and complete their iterations at the same point of time and also change the counter variable at the same time,
         //so there is two different iteration don eby two different thread but count variable can be increased by only 1. because they commit at the same time.
         //That is the issue with using Thread along with Mutation.


         //How can we solve this problem
         //To solve this problem we can use synchronized at increment() method.. if we are using synchronized then at a time only one method can modify it, it gos in a synchronized manner..
    }
    
}
