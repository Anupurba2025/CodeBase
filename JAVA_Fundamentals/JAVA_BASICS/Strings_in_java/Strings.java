package Strings_in_java;

//String is basically a bunch of character...which always in double quotes " "..
//String is a class itself thats why it started with a capital letter.

public class Strings {
    public static void main(String[] args) {
        String name = "Navin"; //although it did not throw any error,still the right format is
        String name1 = new String("Anu");
        System.out.println(name1);
        System.out.println("hello " + name1);
        System.out.println(name1.concat(" Khan"));
        System.out.println(name1.charAt(2));

    }
}
