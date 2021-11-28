/*
* To Declare an Empty Array:
* dataType[] emptyArrayName = new dataType[number of elements in array];
*
* An Empty Array must be declared with the number of elements it will contain.
* To populate an empty array, set the index of an element to a value
*/


public class EmptyArray {
    
    public static void main(String[] args){
       //Empty array with a size of 6
       int[] nums = new int[6];

       //Populating an empty array
       nums[0] = 23;
       nums[1] = 59;
       nums[2] = 78;
       nums[3] = 56;
       nums[4] = 99;
       nums[5] = 21;

       System.out.println(nums[2]);
    }
    
}
