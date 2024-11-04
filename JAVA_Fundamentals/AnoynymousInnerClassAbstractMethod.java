//if we have multiple abstract class then it also can be implemented in anonymous inner class. 
abstract class Ac{
    public abstract void show();
    public abstract void config();
}
/*class B extends Ac{
    public void show(){
        System.out.println("in B show");
    }
}
Instead of writing this class B we can simply
*/
public class AnoynymousInnerClassAbstractMethod {
    public static void main(String[] args) {
        //we know that we did not create an object for an abstract class..
        //Here actually we did not create an object of Ac, we are creatin an object of anonymous inner class.
        Ac obj = new Ac(){
            public void show(){
                System.out.println("its in a new show..");
            }
            public void config(){
                System.out.println("its a config class..");
            }
        };
        obj.show(); //its in a new show..
        obj.config(); //its a config class..
    }
}
