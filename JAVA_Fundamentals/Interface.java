//INTERFACE
//In interface every particular class itself havingonly public abstract classes only.
//if we declare a class by interface, then by default if we did not mainion the methods as public abstract , still by default its considered as a public default.
//whenever we are implementing the interface classes we need to use implements keyword.
//All the variables inside the interface is alway either final and static.
interface Ad{
    public void show();
    void config(); // by default it takes public abstract as class is an interface.
}
class Bd implements Ad{

    @Override
    public void show() {
        System.out.println("its a new show");
    }

    @Override
    public void config() {
        System.out.println("its a new show");
    }

}
public class Interface {
    public static void main(String[] args) {
        Ad obj;
        obj = new Bd();
        obj.show();
        obj.config();
        
    }
}
