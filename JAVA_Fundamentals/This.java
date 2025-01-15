

class P{
    //defult constructor
    public P(){
        System.out.println("its a default constructor of class p");
    }
    public P(int n){
        System.out.println("its a personalized Constructor of class p");
    }
}
class C extends P{
    public C(){
        super();
        System.out.println("its a default constructor of class c");
    }
    public C(int n){
        this();
        System.out.println("its a personalized Constructor of class c");
    }

}
public class This{
    public static void main(String[] args) {
        C obj = new C(5);
        /*
         * its a default constructor of class p
            its a default constructor of class c
            its a personalized Constructor of class c
         */
    }
}

//this() keyword is helps to call all the constructor of its own class.