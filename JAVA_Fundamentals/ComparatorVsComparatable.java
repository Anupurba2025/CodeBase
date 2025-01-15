
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Student class
class StudentClass implements  Comparable<StudentClass>{
    int age;
    String name;

    public StudentClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(StudentClass that) {
        // TODO Auto-generated method stub
        if(this.age>that.age)
                    return 1;
                else
                    return -1;
    }

}


public class ComparatorVsComparatable {
    public static void main(String[] args) {
        
        //Comparator for Integer arraylist nums
        Comparator<Integer> com = new Comparator<Integer>() 
        {
            //collection works with the wrapper classes so instead of using int we need to use Integer.
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else
                    return -1;
            }
        };


        //Comparator for StudentClass object
        Comparator<StudentClass> stu = new Comparator<StudentClass>() {
            public int compare(StudentClass i, StudentClass j){
                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(98);
        nums.add(70);
        nums.add(100);
        nums.add(35);
        nums.add(89);

        Collections.sort(nums); //[35, 70, 89, 98, 99, 100]

        //if we want to sort things on the basis of last digits..
        Collections.sort(nums,com); //[100, 70, 35, 98, 99, 89]
        System.out.println(nums);




        //create an object of student and declare their name and age as well
        List<StudentClass> studs = new ArrayList<>();
        studs.add(new StudentClass(20, "Anu"));
        studs.add(new StudentClass(27, "Anupurba"));
        studs.add(new StudentClass(28, "Abhyam"));
        studs.add(new StudentClass(15, "Aditi"));
        
        System.out.println("Before using Collections.sort()-");
        System.out.println(studs); //[100, 70, 35, 98, 99, 89]
        //[Student [age=18, name=Anu], Student [age=21, name=Anupurba], Student [age=22, name=Abhyam], Student [age=24, name=Aditi]]

        System.out.println("After using Enhanced for loop-");
        for(StudentClass s: studs){
            System.out.println(s);
        }
        System.out.println();

        System.out.println("After using Collections.sort()-");
        Collections.sort(studs,stu);
        System.out.println(studs);

        System.out.println();

        
        /*Task - Create one list of string and then sort them using their length of that strings..

         List<String> str = new ArrayList<String>();
         str.add("Anu");
         str.add("Anupurba");
         str.add("Ranu");
         str.add("Ram");
         str.add("Chhanda");
         str.add("Asit");
         str.add("Aditi");
        */
         
    }
}
//comparator is basically an interface. Through this we can simply pass our logic to sort the things accordingly..
//If we want to give a permission to a particular class to compare with itself then we are using comparable.