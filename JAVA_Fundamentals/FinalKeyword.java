//final keyword can be used in case of variable, method and classes.

//final variable - when we want a constant variables, and want that there value should not change anymore then we can fix it as final.
//whenever we want to stop method overriding we can simply use the final keyword infront of it.
class Calc{
    public final void show(){
        System.out.println("BY Anu");
    }
    public int add(int a, int b){
        return a + b;
    }
}
class AdvCalc extends Calc{
    //
    // public void show(){

    // }
}
public class FinalKeyword {
    public static void main(String[] args) {
        
    }  
}
