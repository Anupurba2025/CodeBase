//Inheritance

class SimpleCalculator{
    public int add(int a , int b){
        int result = a + b;
        return  result;
    }
    public int sub(int a, int b){
        int result = a - b;
        return  result;
    }
}

//Single Level Inheritance (Where it simply inherits from simplecalculator)
class AdvanceCalculator extends SimpleCalculator{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

//MUltilevel Inheritance (Where it start inheriting from AdvanceCalculator hich is also inherits from SimpleCalcultor)
class veryAdvCal extends AdvanceCalculator{
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}
public class AdvCalculator {
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        int r1 = sc.add(12,12);
        int r2 = sc.sub(14,12);
        System.out.println(r1 + " " + r2 + " ");

        AdvanceCalculator ac = new AdvanceCalculator();
        int r3 = ac.mul(12,2);
        int r4 = ac.div(12,2);
        System.out.println(r3 + " " + r4 + " ");

        veryAdvCal vc = new veryAdvCal();
        int r5= vc.add(12,6);
        int r6 = vc.mul(14,2);
        double r7 = vc.power(4,2);
        System.out.println(r5 + " " + r6 + " " + r7 + "");
    }
    
}


//java did not support multiple inheritance...