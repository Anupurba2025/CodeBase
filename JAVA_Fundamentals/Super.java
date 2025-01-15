
class Parent extends Object{

    //default Constructor
    public Parent(){
        super();
        System.out.println("Its default constructor");
    }

    //personalized constructor
    public Parent(int n){
        System.out.println("its a personalized Constructor ");
    }
}
class Child extends Parent{
    //default Constructor

    public Child(){
        super(); // it is present in any constructor by default
        System.out.println("Its default constructor");
    }
    public Child(int n){
        super(n); //if we want that it called it super class in which we pass an int argument, simply the personalized constructor, we can use super class in this way.
        System.out.println("its a personalized Constructor ");
    }
}
public class Super {
    public static void main(String[] args) {
        Child obj = new Child();
        //for the above code o/p is
        /*
         * Its default constructor
            Its default constructor
         */

        Child obj1 = new Child(5);
        //output (before using super)
        /*
         *  Its default constructor
            its a personalized Constructor

            After using super
            its a personalized Constructor
            its a personalized Constructor
         */
    
    }
}

//NOTE
//Every class in java will extends the object class even if we dont mention