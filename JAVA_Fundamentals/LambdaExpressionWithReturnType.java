interface Acc{
    int add(int num1, int num2);
}
public class LambdaExpressionWithReturnType {
    public static void main(String[] args) {
        /* 
        Acc obj = new Acc() {
            public int add(int num1,int num2){
                return num1+num2;
            }
        };
        int result = obj.add(5,5 );
        System.out.println(result);
        */

        //Lamda Expression
        //Before num1+num2 there is no need to maintion the type return because whatever you are writing after that arrow its by default a return type...
        Acc obj = (int num1, int num2)->num1 + num2;
        int result = obj.add(4, 96);
        System.out.println(result);
    }
}
