/**
 * To create an empty 2D array:
 * 
 * Specify the data type, the number of
 * arrays the 2D array will have (in the 
 * first bracket), and the number of elements
 * each individual array will have(in the second
 * bracket)
 */


public class Empty2DArr {
    public static void main(String[] args){

        int[][] numbers = new int[2][4];

        numbers[0][0] = 100;
        numbers[0][1] = 23;
        numbers[0][2] = 56;
        numbers[0][3] = 68;
        numbers[1][0] = 1010;
        numbers[1][1] = 90;
        numbers[1][2] = 99;
        numbers[1][3] = 676;

        System.out.println(numbers[0][1]);

        
    }
    
}
