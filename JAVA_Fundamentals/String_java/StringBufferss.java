public class StringBufferss {
    //String Buffer is basically mutable in nature so after declaration we can also change it.
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //it shows 16, means it occupies 16 continious location.

        StringBuffer sb1 = new StringBuffer("Navin");
        System.out.println(sb1.capacity()); //it shows 21

        // *** The question is why its 21***
        //its 16 + 5 (5 is no of character present in Navin)
        //basically stringbuffer is immutable in nature so we can change the predefined string at any time we want, so in general it allocate 16 contigious free space such that when we
        //redefine that string, it can has sufficient ammount of contigious memory space.. it basically reduces the overall need of reallocation due to the shortage of memory units.

        System.out.println(sb1.length());//5
        sb1.append(" Reddy");
        System.out.println(sb1); //Navin Reddy
        System.out.println(sb1.capacity());//21
        System.out.println(sb1.length()); //10

        sb1.deleteCharAt(2);
        System.out.println(sb1); //Nain Reddy

        sb1.insert(0, "Hi ");
        System.out.println(sb1); //Hi Nain Reddy
        
        // String str = sb; [it gives you error because we cannot change stringBuffer into the String itself.]

    }
}
