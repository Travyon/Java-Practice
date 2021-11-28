/*
* While loops hinge on a boolean expression
* that must evaluate to true in order for the 
* loop to run.
* 
* Step 1: while loop runs while num is less than 20
* . Num is 0 so the statement is ran
* Step 2: When the statement is ran, num(0) is added to 1 
* Step 3: num is now 1  
* Step 4: 1 is still less than 20 so the statement is ran again
*/



public class whileloop {
    public static void main(String[] args) {
        int num = 0;
        
        //runs until num is no longer less than 20
        while(num < 20){
            num = num + 1;
        }
        System.out.println(num);

    }
    
}
