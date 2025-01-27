package Array;
class  Student {
    //instance variable
    String name;
    int roll_no;
    int marks;
}
public class Array_Of_Objects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name = "Anu";
        s1.roll_no=26;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Ranu";
        s2.roll_no=16;
        s2.marks = 100;

        Student s3=new Student();
        s3.name = "Manu";
        s3.roll_no=6;
        s3.marks = 90;

        Student students[] = new Student[3]; //it is not created the objects,we are creating a array which is basically hold the student references
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }

        System.out.println();
        //using enhanced for loop
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
     
}
