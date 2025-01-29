package Array;
//multidimensional array is basically array of array...
//
public class Multi_Dimentional_Array {
    public static void main(String[] args) {
        int i,j;
        int nums[][]=new int[3][4]; //it represents that a multidimensional array contains 3 individual array into it and each individual array consists of 4 elements.
        
        //for assigning a new random values to the multidimentional arrayy
        //Math.random() -> it uses to generate random double(it return double value) values
        
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*10); //here we do typecasting to convert the double values into the integer values.
            }
        }


        //this is for printing the multidimensional arrays   
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(" " + nums[i][j]); //here i represent the each row and j represent the each column   
            }
        System.out.println();
        }
    
        System.out.println();
    //instead of using normal for loop we can simply using the enhanced for loop

        for(int n[]:nums) ///in case of multidimensional array it simply choose each array(row) from a set of an array
        {
            for(int m : n) //it simply taking out each element of an particular array
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

