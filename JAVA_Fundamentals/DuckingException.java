//Ducking Exception - we are using throws keyword.
//throws keyword
class Am{
    public void show() throws ClassNotFoundException{
        //suppose the exception is not handeled by show method itself.
        
        /*
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class");
        }*/
    }
}
public class DuckingException {
    static {
        System.out.println("class loaded");
    }
    //its not a good practice to handle an exception by main method itself because then we trigger jvm to handle that particular exception, and there is  a scenario where jvm simply stops your execution.
    public static void main(String[] args) {
        Am obj = new Am();
        //we have to handle exception here from where the class Am is actually called.
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
        }
    }
}
