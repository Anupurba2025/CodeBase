package Array;

public class Demo {
    public static void main(String s[]){
        int nums[]={2,5,6,8,9,12}; //syntax 1
        int arr[]=new int[5]; //syntax 2  [0,0,0,0,0]
        
        System.out.println(nums[2]); //6
        
        nums[2]=100;
        System.out.println(nums[2]);

        System.out.println(arr[3]); //0
        arr[3]=26; //[0,0,0,26,0]
        System.out.println(arr[3]); //26

        //print all the values of an array
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
