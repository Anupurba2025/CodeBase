//An enum, or enumeration, is a data type that consists of a set of named values or constants.
//enum is a class...we can create constructor, own variables and methods but we can not extends enum with any other classes..

enum Status{
    //everything is an constant separated by a cooma, and having a value starting from 0;
    //success - 0, Failure-1, Running-2...
    Success, Failure, Running, Pending;
}
public class Enum {
    public static void main(String[] args) {
        Status s = Status.Success;
        //enum class by default extends the Enum class...
        System.out.println(s.getClass().getSuperclass()); //class java.lang.Enum

        System.out.println(s); //Success
        System.out.println(s.ordinal()); //0, s store success, s.ordinal(); helps to find out its position.
        
        //if we want all the status at the single point of time then we can use
        //Status.values();
        //it returns all the status in the form of an array..
        Status[] s2 = Status.values();
        System.out.println(s2[0]); //Success
        
        //we are using enhanced for loop to print all the status.
        for(Status s1 : s2){
            System.out.println(s1);
        }

        //enum if-else statement
        Status st = Status.Running;
        if(st == Status.Success){
            System.out.println("All good, it is a Success");
        }
        else if(st == Status.Failure){
            System.out.println("Its a Failure,please try agin..!");
        }
        else if(st == Status.Pending){
            System.err.println("Please Wait...");
        }
        else{
            System.out.println("Its running..!");
        }
        
        
        //enum switch case
        switch (st) {
            case Success:
                System.out.println("All good, it is a Success");
                break;
            case Failure:
                System.out.println("Its a Failure,please try agin..!");
                break;
            case Pending:
                System.err.println("Please Wait...");
                break;
            default:
                System.out.println("Its running..!");
                break;
        }
    }
}
