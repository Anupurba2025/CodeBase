class Humans{
    private String name;
    private int age;

    public void setAge(int age){
        age = age;
    }
    public void setName(String name){
        name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return  name;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setAge(21);
        obj.setName("Anu");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
