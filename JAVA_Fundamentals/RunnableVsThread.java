/*
 * class H extends Thread{
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hi");
        }
    }
}
class H1 extends Thread,H{ //we know java does not support multiple inheritance...so here we cant do this
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hello");
        }
    }
}
To resolve the above problem we can simply implements the Runnable class which is also has run() method into itself. 
 */
class Mn implements Runnable{
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hi");
        }
    }
}
class Mo implements Runnable{
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hello");
        }
    }
}
public class RunnableVsThread {
    public static void main(String[] args) {
        
        //obj1 is a Runnable objects.
        //Here we are creating a reference of Runnable and object of a class.
        Runnable obj1 = new Mn(); 
        Runnable obj2 = new Mo();

        //Runnable class only contains run() method but did not habe any thread objects so we need to create a object of thread class.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.run();
        t2.run();
    }
}
