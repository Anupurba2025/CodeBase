package com.telusko.JUnit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void arrayTest(){
        ArrayClass arr = new ArrayClass();
        int []unsorted ={4,6,8,2};
        int []expected = {2,4,6,8};

        assertArrayEquals(expected,arr.ArrayClass(unsorted));

        /* Instead of using assertArrayEquals if we take assertEquals then it fails in test case because,
            in assertEquals it didn't check with the arrays itself, it check with the instance variables..
            that means in heap memory there are some instance variable it compares in between them...
         */
    }

    @Test
    public void arrayExceptionTest() {

        /*
        try{
            ArrayClass arr = new ArrayClass();
            //int []unsortedArray = {1,4,6,3};
            int []unsortedArray = null;
            int []sortedArray = arr.ArrayClass(unsortedArray);
            for(int element : sortedArray){
                System.out.print(element);
            }
            fail(); //failing the testcase explicitly if exception is not generated.
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

    Rather than doing all those things where there is a chance to occur exception we can simply use
    assertThrows(expectedType, executable);
     */

        ArrayClass arr = new ArrayClass();
        int[] unsortedArray = null;
        assertThrows(NullPointerException.class,()->arr.ArrayClass(unsortedArray));

        /*
        When we are invoking the method if it will not generate any exception then the test case failed,and if
        it generates the exception then only the test case will passed...

        suppose in unsortedArray i,m passing the data e.g {1,7,3,9} , then the method will sort it and return the sorted array so in that case
        this test case will simply fails...
         */

    }
    //To test the Performance of the Unit
    @Test
    void testPerformance(){
        ArrayClass arr = new ArrayClass();
        int []unsorted = {1,3,8,5,6,9,2};
        assertTimeout(Duration.ofMillis(100),()->arr.ArrayClass(unsorted));
    }
}
