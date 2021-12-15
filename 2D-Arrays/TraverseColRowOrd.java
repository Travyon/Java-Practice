/**
 * Column-major order - a traversal path
 * which moves vertically down each column
 * starting at the first column and ending with
 * the last 
 * [rows][columns]
 * 
 * 
 */


public class TraverseColRowOrd {
    public static void main(String[] args){
        char[][] letters = {{'A', 'a'}, 
                            {'B', 'b'},
                            {'C', 'c'}};
        /**
        * The 'i' loop (outerloop) is less than the
        * number of elements in each individual array
        * 
        * For everytimme the 'i' loop iterates by 1, the
        * 'j' loop does a full iteration.
        */                   
        for(int i = 0; i < letters[0].length; i++){
            /**
             * The 'j' loop (innerloop) is less than the
             * number of rows inside the array.
             * 
             * J loop will iterate (walk) through each row
             */
            for(int j = 0; j < letters.length; j++){
                System.out.print(letters[j][i]);
            }
            System.out.println();
        }



    }
    
}
