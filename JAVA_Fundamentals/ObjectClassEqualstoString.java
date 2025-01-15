//Object class equals toString hashcode in java

class Laptop{
    String model;
    int price;

    //lets initialize toString method by us
    public String toString(){
        return model + " : " + price;
    }

    //lets create an equals class[its accept only one object]
    /*public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price==that.price){
            return true;
        }
        else{
            return false;
        }
    }*/

    //its better not to generate equals by ourselve..
    //Right click -> Go to Source Action -> Generate equals and hash code->select all -> ok

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


}
public class ObjectClassEqualstoString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "LenovoYoga";
        obj.price = 1000;
        System.out.println(obj.toString()); //Laptop@2f92e0f4

        //so basically when we print obj it will call 
        //System.out.println(obj.toString()); automatically even if we do not declare toString(),
        //toString method returns return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //hashcode - it tries to create a single string of all data that we have.
        
        //if we do not initialize toString method in Laptop class then its o/p is like
        //Laptop@2f92e0f4

        //after declaring toString method in Laptop class its showing o/p like this-
        //LenovoYoga : 1000

        //lets check for equals method...
        Laptop obj1 = new Laptop();
        obj1.model = "LenovoYoga";
        obj1.price = 1000;
        System.out.println(obj1.toString());
        
        boolean result = obj == obj1; //false
        System.out.println(result); 
        //actually it returns false because equals method is actually coming from the object class..
        //and its basically do the comparasion by two classes hexadecimal number.

        boolean result1 = obj.equals( obj1);
        System.out.println(result1);  //true[after initializing it into the Laptop class itself.]

    }
}
