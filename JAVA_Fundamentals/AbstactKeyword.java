//Abstact keyword
//When you declare some method as as abstact, then that method should belongs to abstract class only.
//An abstract class can have both abstract methods and implemented methods too.
//If a class extends an abstract class then mustly the child class should override the abstract methods.
//we can not create an object of abstract class.
//we can only create an object of an concrete class not for an abstract class.
//if we extends a subclass then for surely we can inplement all thge abstract method into it. or else it was also declared as a abstract class. and extended by any other class.
abstract class Car //abstract class.
{
    public abstract  void drive();
    public void playMusic(){
        System.out.println("Playing a Music");
    }
}
class ToyotaCar extends Car //concrete class
{
    public void drive(){
        System.out.println("Car is driving");
    }
}
public class AbstactKeyword {
    public static void main(String[] args) {
        ToyotaCar obj = new ToyotaCar();
        obj.drive();
        obj.playMusic();
    }
    
}
