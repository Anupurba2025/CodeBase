
//constructor is a special time of method, it has a same name as the class name.
//in case of constructor we only need to specify the access modifier. it did not return anything.
//Every time you can create an object it calls the constructor first.
class Human {
    private int age;
    private String name;  

    public Human() { //constructor
        age = 12;
        name = "Anu"; 
    }
    public Human(int a,String n){
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;  
    }
}

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human(21,"Anu");
        Human obj1 = new Human(22,"Abhyam");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}

