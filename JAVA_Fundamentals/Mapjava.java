/*MAP
 * Its not an implementation or it does not extending the collection interface but its a concept of collections.
 * Through map we can easily achieve the key value pair concepts..
 * map itself an interface..
 */
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class Mapjava {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        //Instead of having add method we are having put method
        /*awhy we are using the put method
         * when we are using add method it simply means you can add a new element
         * but if we are using put then it simply means you can add a new element if it not exists but if it already exists then simply replace it
         */
        students.put("navin",78);
        students.put("Anu",100);
        students.put("Abhyam",100);
        students.put("navin",90); //it did not take another object itself it simply update the value for key named "navin"

        System.out.println(students); //{navin=90, Anu=100, Abhyam=100}
        System.out.println(students.get("Abhyam")); //100

        //we can say that to create a map keys are working as set here, and values are working as List here...

        //Through this we can achieve all the keySets
        System.out.println(students.keySet()); //[navin, Anu, Abhyam]

        //if we want to fetch every key one by one
        for(String name : students.keySet()){
            System.out.println(name + ":" + students.get(name));
            /* output
                navin:90
                Anu:100
                Abhyam:100
             */
        }

        //Apart from this we are also having HashTable
        Map<String, Integer> student = new Hashtable<>();
        student.put("navin",78);
        student.put("Anu",100);
        student.put("Abhyam",100);
        student.put("navin",90);

        System.out.println(student.keySet());

        //HashMap and Hashtable have a similar type of work.. 
        //If we want to do things in a synchronized manner then we can use Hashtable , otherwise we can do this with HashMap...

    }
    
}
