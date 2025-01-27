class Calculator{   //class
    public int add(int a,int b){  //methods
        int r=a+b;
        return r;
    }
}
public class Demo{
    public static void main(String[] args){
        int num1=898;
        int num2=6;
        // int result=num1+num2;

        //creating an object of calculator
        Calculator cal = new Calculator();
        int result = cal.add(num1,num2);
        System.out.println(result);
         
    }
}
 
//object oriented programmming 