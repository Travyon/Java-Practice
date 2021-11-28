/**
 * Continue statement:
 *  'Continue' keyword can be placed inside of a loop
 *  if we want to skip an iteration.
 * 
 * if 'continue' is executed, the current loop iteration will immediately
 * end, and the next iteration will begin (Stops when it gets what it wants
 * then starts the next to look for what else it wants)
 * 
 * Modulo:
 * 3 mod 2 = 1
 * Explanation:
 *  3/2 = 1 
 *  2*1 = 2 : cannot go any further because (2*2 = 4)
 *  2+1 = 3
 *  
 */



public class continuestatement {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};

        /**
         *  1st iteration:
         * '1' is printed then the
         *  continue statement is ran because 
         *  2 mod 2 is equal to 0, which ends 
         *  the first iteration.
         * 
         * 2nd iteration:
         * 3 is printed because 3 mod 2 = 1 and 1 is
         * not equal to 0. The continue statement is 
         * then executed because 4 mod 2 is 0 and 0 is 
         * equal to 0, which ends the second iteration
         * 
         * 3rd iteration:
         * 5 is printed because 5 mod 2 = 1 and 1 is 
         * not equal to 0. The iteration then ends and the loop
         * is then exited.
         * 
        */
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                continue;
            }
            System.out.println(numbers[i]);
        }

    }
    
}
