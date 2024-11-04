//This interface can only have one abstract method into it and to specify this we can use a annotation
//upto java7 its okay, from java they ensure everything is not verbous -> everything should not tightly declared..
interface Abc {
    void show(); 
}
public class FunctionalInterface {
    public static void main(String[] args) {
        /*Abc obj = new Abc() {
            public void show(){
                System.out.println("it to show");
            }
        };*/
        Abc obj =()-> System.out.println("in show method");
        obj.show();
    }
}
