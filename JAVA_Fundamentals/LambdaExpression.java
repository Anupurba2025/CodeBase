//lambda Expression
//Lambda Expression is only applicable for the FunctionalInterface ->a Interface having only one method into it...
interface Abb{
    void show(int i);
}
public class LambdaExpression {
    public static void main(String[] args) {
        //we know that Abb is an interface having one method itself, so when we creates an object of Abb 
        //it automatically intantiate the method show, instead of writing the whole code we can use the lambda expresion for it...
        
        /*Abb obj = () ->{
            System.out.println("in show");
        }; 
        */
        
        //we can simply write this within one line instead of using curley braces...
        /*Abb obj = (int i) -> System.out.println("in show");
        obj.show(100);
        */
        //if we are having only one variable there is no need to use bracket..
        Abb obj = i ->System.out.println("in show");
        obj.show(8);
    }
}
