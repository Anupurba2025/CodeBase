
//Enum in java by default extending enum class
enum Laptop {
    Macbook(2000), xps(2200), surface, thinkpad;
    
    private int price;
    //default constructor
    private Laptop(){

    }
    // Constructor for enum
    private Laptop(int price) {
        this.price = price;
    }

    //Getter method to get the price as we set the price into private
    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        
        // Printing enum constant
        System.out.println(lap);  // Output: Macbook
        
        // Printing the price of the selected laptop
        System.out.println(lap +" : "+ lap.getPrice());  // Output: Price: 2000
        
        //To have the price of all kind of laptops..
        for(Laptop lap1 : Laptop.values()){
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
}

