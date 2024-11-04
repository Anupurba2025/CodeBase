public class Demo{
    public static void main(String[] args) {
        System.out.println("hi");
        String name= "Ranu";
        System.out.println("hello " + name);
        System.out.println((name.charAt(1)));
        System.out.println(name.concat("reddy"));

        //Strings are immutable in nature that means onceyou declared you cant change it.
        String name1="Anu";
        name1 = name1 + " Kha"; //it stored in a different location.
        String s1="Navin" ;
        String s2 = "Navin";

        System.out.println(s1 == s2); //its returns true because it share the same data, both are instance of an particular object;
        System.out.println(""+name1); //Anu Kha 

    }
}

