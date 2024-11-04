//Upcasting and Downcasting.
class A11{
    public void show1(){
        System.out.println("its A11");
    }
}
class B11 extends A11{
    public void show2(){
        System.out.println("its B11");
    }
}
public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        //dynamic dispatching
        //A11 obj = new B11();

        //upcasting - here basically we are creating a object og class B11 and refer it to its parant class A11.
        //So we are going up basically. we are upcasting it towards its parent class.
        A11 obj = (A11) new B11();
        obj.show1();
        //obj.show2();//although its refering to obj B11 but its type of A11, and A11 dont have any idea about B11.
        
        //Downcasting
        //So basically here whenever we are ssigning the type is of b11.
        //obj is the parent object and now we are downcasting it to its child class.
        B11 obj1 = (B11) obj;
        obj1.show2();
    }
}
