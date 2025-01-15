class Ab{
    public void show(){
        System.out.println("in A show");
    }
}
/*class Ba extends Ab{
    public void show(){
        System.out.println("in a new show...");
    }
}
Suppose there is a case where we can extend its parent class and simply override the show method, and in use case scenario it can only be use onced...
in that case we can use the anoynymous class.
*/
public class AnoynymousInnerClass {
    public static void main(String[] args) {
        //Anoynymous class...
        Ab obj = new Ab(){
            public void show(){
                System.out.println("in a new show...");
            }
        };
        obj.show(); //in a new show...
    }
    
}
