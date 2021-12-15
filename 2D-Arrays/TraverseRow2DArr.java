/**
 * Whe traversing through a 2D array, we
 * can iterate using row-major order or column-row
 * order
 * 
 * Row-major order - moves horizontally
 * starting with the first row and 
 * ending with the last
 * 
 * To iterate through a 2D array using row-major
 * order, a nested for loop is needed.
 * 
 * Arrays are indexed starting with 0
 */



public class TraverseRow2DArr {
    public static void main(String[] args){
        char[][] letters = {{'A', 'a'}, 
                            {'B', 'b'}, 
                            {'C', 'c'}};
        //Responsible for looping through rows in array
        for (int i = 0; i < letters.length; i++){
          /**
           * J is less than the number of elements in each 
           * individual array
           * 
           * J loop is going to loop through each individual
           * element inside each individual array
           */
          for (int j = 0; j < letters[i].length; j++){
            //Prints corresponding letters side by side
            System.out.print(letters[i][j]);
          }
          //Prints a new line
          System.out.println();
        }

    }
    
}
