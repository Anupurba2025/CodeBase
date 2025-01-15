//Method Overridding
//in case of method overriding it always have a same methods with same name and as well as with same parameters too.
class cal{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class AdvCal extends cal{
     public int add(int n1,int n2){ //it simply override the add method of cal class
         return n1+n2+1;
     }
}
public class MethodOverridding {
    public static void main(String[] args) {
        AdvCal obj1 = new AdvCal();
        int result = obj1.add(4, 5);
        System.out.println(result + ""); //10 -> 4+5+1
    }
}
