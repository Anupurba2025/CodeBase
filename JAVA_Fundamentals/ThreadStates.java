/*Every time you go and create a new thread that goes into a new state..
 * we have Runnable state
 * Waiting State
 * Running State
 * Dead State
 * 
 * The moment u have start its goes into Runnable state which is waiting for its scheduler..
 * when a thread use run() methpd and goes in CPU, its called Running State.
 * When a thread is in its running mode and goes into waiting State using sleep() method or wait() method.
 * when you are using notify() method then your thread which is in waiting method can goes to Runnable mode directly.
 * when we are using stop() method your thread can goes to Dead status either from Runnable State or from Running State.
*/
public class ThreadStates {
    
}
