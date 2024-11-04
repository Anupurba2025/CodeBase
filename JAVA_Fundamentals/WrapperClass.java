//For every premitive data type we are having class itself which extends the Object class.
//For int -> Integer
//for char ->Character
//For double ->Double.
public class WrapperClass {
    public static void main(String[] args) {
        int num = 10; //num is preemitive datatype.
        Integer num1 = new Integer(num); // boxing
        //simply we create an object of Integer class and put the preemitive datatype num into an object or a wrapper clas . This is known as boxing.
        System.out.println(num1);

        Integer num2 = num; //autoboxing
        //in autoboxing there is no need to write new Integer(num) manually, its done automatically.
        System.out.println(num2);

        int num3 = num1.intValue(); //unboxing
        //unboxing - we are getting the value from object type and put it into the preemitive type.
        //here num1 is an object reference variable and num3 is an preemitive variable.
        //To get the integer value we are using num1.intValue() and store it into the num3.
        System.out.println(num3);

        int num4 = num1;
        System.out.println(num4); //autounboxing

        //autounboxing = In this there is no need to do num1.intValue(); this manually, it can be done automatically.
        
        String str = "12";
        int num5 = Integer.parseInt(str);
        System.out.println(num5*2);
        //Integer is a wrapper class which gives you several methods, parseInt is one of them..
        //parseInt basically helps to convert a string to integer value.
    }
}
