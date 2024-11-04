/*THREADS IN JAVA

 * A thread in Java is the path a program takes while executing, and is an essential feature of the Java platform: 
Definition: A thread is the path a program takes while executing. 
Purpose: Threads enable concurrent execution, dividing tasks for improved performance. 
Example: Threads are critical for handling operations like I/O and network communication efficiently. 
How it works: Every application in the JVM has at least one thread, even if you don't call it explicitly. The main thread is provided by the JVM at the start of the program's execution. The main thread has the ability to create additional threads. 
Priority: Each thread has a priority, and higher priority threads are executed before lower priority threads. 
Resources: Threads share the process's resources, including memory and open files. 
Creating threads: Creating a new thread requires fewer resources than creating a new process. 
 */
class H extends Thread{
    //public void show()
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hi");
            //its throw a interrupted exception.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
    }
}
class H1 extends Thread{
    //public void show()
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("hello");
        }
    }
}
 public class Threads {
    public static void main(String[] args) {
       /* H h = new H();
        H1 h1 = new H1();
        h.show();
        h1.show();*/
        //here things are called from main class itself and executing each line one by one..
        //if we want to work them simultaneously we need to use the concepts of multiple thread itself.
        //we cant execute the multiple threads in terms of normal objects.

        //Now how can we convert the normal objects into the threads.
        //we can simply extend the class to Thread class.

        H obj = new H();
        H1 obj1 = new H1();

        obj1.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj1.start();

    /*
     * Behind the scene when wqe go to start ,its method belongs to Thread class. its will create a new thread for you. but it will call a run methods.
     * so instead of using show we have to use run();
     * in every thread you are having a run() method.
     */
    }
}

//Thread Priority
/*
 * The maximum priority is 10, and min is 0...default priority 5...
 * using priority you can only suggest what scheduler can do.
 */