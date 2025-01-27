package Method_Overloading;
class calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class Demo {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int r1=cal.add(1,2);
        int r2 = cal.add(1,2,3);
        double r3 = cal.add(10.5, 10);
        System.out.println(r1 + "," +r2 + "," + r3 + "");
    }
}
