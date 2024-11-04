class A{
    public A(){
        System.out.println("Object is created");
    }
    public void show(){
        System.out.println("in A show");
    }
}

public class AnoymasObject {
    public static void main(String[] args) {
       // new A(); //anonymous object
        new A().show(); //its working well for the first time, first it creates an object
        //and then simply called that method show()

        //but when we use this for the second time its again creating a new object and then simply called the show method.

        
    }
}
