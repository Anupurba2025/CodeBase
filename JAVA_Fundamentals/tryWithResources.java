
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * If you are having a senario where you are not bound to handle the exception 
 * we can use try with finally...that is basically known as try with its resources.
 */
public class tryWithResources {
    public static void main(String[] args) throws IOException {
        int i=0;
        int j =0;
        /*
         * sometime we need to implements that is totally irresprctive of exception
         * so if we do in try block itself , it only works when there is no exception,
         * 
         * if we implement it on catch block then when exception occurs it will surely implemented.
         * 
         * so if we want irrespectve of exception it should be implemented then mustly you print it for both the cases.
         * 
         * so to resolve this procces we introduce the concept of finally..
         * if we want to do some block of codes to be  implemented irrespective of the exception then we can put it under finally block.
         */
        try{
            j = 18/i;
            System.out.println(j);
            //System.out.println("Its need to print irrespective of exception");
        }
        catch(java.lang.Exception e){
            System.out.println("something went wrong");
            //System.out.println("Its need to print irrespective of exception");
        }
        finally{
            System.out.println("Its need to print irrespective of exception");
        }

        //new Example
        int num =0;
        /* 
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            System.out.println("Enter a num-");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } 
        finally{
            br.close();
        }
        }
*/
        //try with resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please Enter a number - ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
