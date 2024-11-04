//Throw Keyword
/*
Used to throw a single exception from a method or block of code. 
The throw keyword is used inside a method.
*/
public class ThrowAndThrowable {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            //if you want in that scenario we want to call Arithmetic exception and instead of ignoring it we want to resolve the erroe then we can do it in this way.
            if(j == 0){
                //If you want to put one message simply you can leave a message...

                throw new ArithmeticException("I dont want to print the value 0");
            }
            
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Its a default value that we set...! " + e);
        }
        System.out.println(j);
    }
}
