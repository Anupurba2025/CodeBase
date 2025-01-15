//Innerclass - a Class inside a Class.
//For the innerclass we can only use static keuword. its not applicable for the outer classes.
class F{
    public void show(){
        System.out.println("In show");
    }
    class G{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        F obj = new F();
        obj.show();
        //obj.config(); -> it gives you error because onfig() method is comes under class D.

        F.G obj1 = obj.new G();
        //F.G because we need to specify G class belongs under the class F.
        //obj.new G() -> because its comes under class F , when we call any method under F we simply do obj.show(), similarly to call a class under it we call it as obj.new G();
        obj1.config();
    }
}
