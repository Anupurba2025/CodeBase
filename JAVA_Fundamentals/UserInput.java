//user input using BufferReader and Scanner in java
//println is a method of printStream class, now if we want to call printStream class we want a object of it..
//but there is no need to create an object of it, becatuse its already in build
/*public static final printStream out = null.../**
 * so that is the reason we are using out...
 * this out is created iside the system class that isthe reason why we are using the system.out.println();
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter a number - "); //5
        int num = System.in.read(); //its always return an asci value.
        System.out.println("using System.in.read()");
        System.out.println(num); //53
        //if I enter A then o/p is 65

        System.out.println("using System.in.read(num-48)");
        System.out.println(num-48); //it returns the actual values.
        //Now if we want to add bigger value like 55 it only returns 5 because it can only read one character at a time.to read multiple character we have to use loop.
        //instead of having that headech we are having BufferReader..

        System.out.println("using BufferReader)");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num1  = Integer.parseInt(bf.readLine());
        System.out.println(num1);
        bf.close();

        //instead of using this we can use Scanner
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        
        System.out.println("using Scanner");
        System.out.println(num2);
        sc.close();
    }
}
