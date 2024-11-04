class Mobile{
    static  String name; //if we mark an variable as static variable then we it will be sharable by all the objects.
    int price;
    String brand; //static variable
//message broker->

    //constructor
    public Mobile(){
        brand="";
        price=2000;
        System.out.println("its a constructor");
    }
    
    //static block
    static{
        name="Phone";
        System.out.println("its a static block");
    }

    //non static methods
    public void show(){
        System.out.println(brand + " " + price + " " + name + " ");
    }


    //static methods
    public static void show1(Mobile obj){ 
        System.out.println("its a static method");
        //we cant use a non static variable inside a static method
        System.out.println(obj.brand + " " + obj.price + " " + name + " ");
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.name="Smartphone";
        obj1.brand="samsung";
        obj1.price= 30000;

        obj2.name="Smartphone";
        obj2.brand = "Apple";
        obj2.price=7890;

        obj1.show();
        obj2.show();

        obj1.name="phone";
        obj1.show();
        obj2.show();
        //in that case although i can only change through obj1 but it can be changed for all object, because they are sharing the same variable.smartphone should be changed into phone.

        Mobile.show1(obj1); //we can call a static method using class name.
    }
}
//static keywords means that something we can use as a class member not as an object member.

//if we are using the static method then it can be also called through class name but we can not called non static method through the
//in case of static method you can use only static variables. you are not allowed to use non static variable inside static method.


//why we are suing static in main
// we are using public static void main[] because we know that we did not call a non static method without using its object. only static methods can be called using
//the class names and all. if we do not use static then everytime when you are calling it as we need to use the object of class of main class, overall its a deadlock condition. to avoid that we are using static before main.


//every time when we are creating a object there is two steps..
//1.class load (class will load once by class loader)
//2.objects are instantiated

//whenever we are loading a class always it first call the static methods ... thats why static block displayed first in the output and then it calls constructor and one by one.


//suppose we have a main class like this
/*  
 * public class StaticVariable{
 *      public static void main(s[] args){
 * 
 *      }
 * }
 * 
 * in this scenario we dont create any object of any class, so no class will be loaded and no statoi methods are called.
 */

 /*
  * Now here is the case where if we do not create an object but want to load the classes
  for that we are having a special class named "class" inside a java 

  public class StaticVariable{
 *      public static void main(s[] args){
 *          Class.forName("Mobile"); 
 *      }
 * }
 * 
 * Class.forName is used to load your class. it used the System class Loader to load the class.
  */
 