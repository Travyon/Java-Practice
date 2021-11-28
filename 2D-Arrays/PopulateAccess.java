/*
* Two dimensional array stores arrays of the same data type
*
* First bracket should hold the index of the individual array
* that the element exists in.
* Second bracket should specify the index of the element 
* within that individual array.
*/

public class PopulateAccess {
    public static void main(String[] args){
        // Declare and populate 2D Array
        int[][] ages = {{10, 8, 20}, {6, 90, 22}, {2, 52, 23}};
        
        // Within the first array,  access the first element
        System.out.println(ages[0][0]); //Prints: 10
    }
    
}
