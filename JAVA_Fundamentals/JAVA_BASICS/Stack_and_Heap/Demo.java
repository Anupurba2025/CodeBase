package Stack_and_Heap;
class calculator{
    int num = 10; //instance variable
    //instance variable are those which are declared inside the class but outside the method
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}
public class Demo {
    public static void main(String[] args) {
        int data=1000;
        calculator obj1 = new calculator();
        calculator obj2 = new calculator();

        int result = obj1.add(100,200);
        System.out.println(result); //300

        obj1.num = 20;
        System.out.println(obj1.num); //20
        System.out.println(obj2.num); //10
    }
}
