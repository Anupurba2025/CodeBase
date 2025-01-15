class A1{
    void show(){
        System.out.println("its A1 to show");
    }
}
class B1 extends A1{
    void show(){
        System.out.println("its B1 to show");
    }
}
class C1 extends B1{
    void show(){
        System.out.println("its C1 to show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        //Its known as Dynamic method dispatch. A particular method of which class is called, will be decided on runtime environment.
        //This will only work in case of inheritance.
        A1 obj = new A1();
        obj.show();

        obj = new B1();
        obj.show();

        obj = new C1();
        obj.show();
    }
    
}
