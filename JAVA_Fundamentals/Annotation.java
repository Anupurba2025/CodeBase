//Annotation
//Annotation simply means suppliment to the compiler or the runtime.
//we call it as metadata..we supply some extra information to the compiler or at the runtime..
class M{
    public void showTheData(){
        System.out.println("its M to show");
    }
}
class N extends M{
    @Override //Annotation
    public void showTheData(){
        System.out.println("Its N to show");
    }
}
public class Annotation {
    public static void main(String[] args) {
        N obj = new N();
        obj.showTheData();
    }
}
