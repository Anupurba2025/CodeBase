package Array.Jagged_and_3D_Array;

//jagged array -> a jagged array is also a multidimensional array in which the number of rows (a buckeet of array contains how many individual array) is fixed
//but each individual array contains how many elements is not fixed.each individual array can contains random number of elements as per their requirements.
//int nums[][] = new int[5][];
public class Demo {
    public static void main(String[] args) {
        int nums[][] = new int[4][];

        nums[0]=new int[3];
        nums[1]=new int[2];
        nums[2] = new int[1];
        nums[3] = new int[6];

        int c,d;
        //assigning the values using simple for loop
        for(c=0;c<nums.length;c++){
            for(d=0;d<nums[c].length;d++){
                nums[c][d]=(int)(Math.random()*10);
            }
        }

        //printing the values
        for(c=0;c<nums.length;c++){
            for(d=0;d<nums[c].length;d++){
                System.out.print(nums[c][d] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //assigning the values using enhanced for loop
        for(int n[]: nums){
            for(int i=0;i<n.length;i++){
                n[i] = (int)(Math.random()*10);
            }
        }

        //printing the array
        for(int n[]:nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("3-D array");
        //creating a 3-D array
        //3-D array means a bucket of arrray contains individual bucket of array and into it it contains individual array elements
        int arr[][][]=new int[3][4][6];

        //assigning a value to the array
        int p,q,r;
        for(p=0;p<3;p++){
            for(q=0;q<4;q++){
                for(r=0;r<6;r++){
                    arr[p][q][r]=(int)(Math.random()*10);
                }
            }
            //printing the array
            for(p=0;p<3;p++){
                for(q=0;q<4;q++){
                    for(r=0;r<6;r++){
                        System.out.print(arr[p][q][r] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
