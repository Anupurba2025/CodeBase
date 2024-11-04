//Exception in Java
//Types of Error we can have
/*
 * We can have 3 type of errors
 * 1.Compile Time Error (Syntactical error is a type of compile time error)
 * 2.Runtime Error
 * 3.Logical Error
 * 
 * Logical error -> Everything is running well..with no compile time issue or with no runtime issue..
 * But we are not giving the expected outputs...
 * sometime we call it as bugs...
 * 
 * To identify the Logical Errors we need to check for the inputs and outputs, go for testing, may we able to find the error.
 * 
 * Runtime Error
 * When we are having the runtime errors the execution of the code is simply stops...
 * for example we are having some files in our system and our code works wellm somehow that file is deleted and the code stops working.. i that scenario the code search for that file and its did not find it it throws runtime error...
 * For the Runtime Error we are  having exception, so we need Exception Handling.
 * 
 * 
 * to handle with the exception we can go through with the try catch block.
 * 
 *
 */

public class Exception {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        try {
            j = 18 / i;  // This will throw an ArithmeticException (division by zero)
        } 
        catch (ArithmeticException e) {
            System.out.println("Something went wrong: Division by zero! " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bind.."+ e);
        }
        catch(java.lang.Exception e){
            System.out.println(" " + e);
        }
        System.out.println(j);
    } 
}

//Exception Hierchy in java
/*
 * Object -> Throwable -> 
 * Throwable is further divided in two parts...
 *   - error
 *   - Exception
 * error can be divided into further parts mainly in Threaddeath and IOError
 *   - Threaddeath
 *   - IOError
 *   - virtual Machine Error
 *   - OutofMemory
 * Exception can be further devided into
 *    - Runtime Exception
 *    - SQL Exception
 *    - IO EXception
 * 
 * In Runtime Exception we have
 *  - Arithmetic Exception
 *  - ArrayOutOfIndex Exception
 *  - NullPointer Exception
 * 
 * NOTE - all the runtime exception can be a unchecked exception, like we are having a choice either we want to handle it or not.
 * NOTE - All the SQLException, IOException is a checked Exception.You are forcing to handle it.
 * Throwable is the parent class of exception and error.
 */
