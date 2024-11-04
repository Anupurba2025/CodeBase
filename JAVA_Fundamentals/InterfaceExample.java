//A particular class can be implenting several interface classes at a same time.
interface Computer1{
    void code();
}
interface X{
    void lead();
}
class Laptop1 implements  Computer1,X{
    public void code(){
        System.out.println("Code,Compile, Run..!");
    }
    public void lead(){
        System.out.println("You have one lead..!");
    }
}
class Desktop1 implements  Computer1{
    public void code(){
        System.out.println("Code,compile and run more faster...!");
    }
}
class Devoloper{
    public void devApp(Computer1 obj){
        obj.code();
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Computer1 obj = new Desktop1();
        Computer1 obj1 = new Laptop1();
        Devoloper Anu = new Devoloper();
        Anu.devApp(obj);
        Anu.devApp(obj1);
        X x = new Laptop1();
        x.lead();

    }
}
