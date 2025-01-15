//Encapsulation Concept

//Encapsulation is hiding the data members and methods from external classes,making it harder for user to know how classes are implemented.
//Data Protection- it prevents accidental changes to the darta,which helps to ensure the data integrity.
//encapsulation classes are self contained units with clearly defined interfaces,make them easier to use.

class Humans{
    //private int age=10;
    //private  String Name="Anu";

    //in case we did not initialize those with now then we can do this in this way
    private int age;
    private String Name;
    

    //to set the value of that instance variables we can do this like below
    public void setName(String name){
        this.Name = name;
    }
    public void setAge(int a){
        this.age = a;
    }


    //to get the value and to to return it we are using this one.
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setAge(21);
        obj.setName("Anupurba Khan");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
    
}
