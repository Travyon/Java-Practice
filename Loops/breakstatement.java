/**
 * Break keyword: 
 * Used to exit, or break a loop.
 * Once break is executed, the loop will stop
 * iterating.
 * 
 * Step 1: for loop checks to see if the number is less than 100
 * Step 2: if the boolean statement is true then it runs
 * the statement inside brackets.
 * Step 3: the statement prints out a number
 * Step 4: the statement checks if that number is equal to 50.
 * Step 5: if the number is equal to 50, 'break' (exit) the loop; if not,
 * then the number is incremented by 1 and repeats the steps.
 * Ex:
 */


public class breakstatement {
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            System.out.println(i);
            if(i == 50){
                break;
            }
        }
    }
    
    
}
