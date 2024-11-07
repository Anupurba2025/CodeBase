import com.telusko.JUnit.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    void reverseStringTest(){
        ReverseString rvs = new ReverseString();
        String result = rvs.ReverseStringValue("Ranu");

        /*
        In assertEquals the message will only shown if the test cases are failed,
            here if we put msg normally within " ", everytime either test case failes or succeed it evaluates that part, but
                if we are using () -> this lambda function infront of it then if the test case passed then it didn't evaluate that msg part simply ignore it, else it will evaluate and throw...
                */
        assertEquals("unaR",result,"The method should return the reverse of that string input"); //
        assertEquals("unaM",rvs.ReverseStringValue("Manu"),()-> "The method should return the reverse of that string input");
    }

}
