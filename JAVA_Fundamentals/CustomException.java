class NavinException extends Exception {
    public NavinException(String message) {
        
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (i == 0) {
                throw new NavinException("I don't want 0"); 
            }
        } 
        catch (NavinException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage()); 
            j = 18 / 1;
            System.out.println("Default output: " + j);
        }
    }
}
