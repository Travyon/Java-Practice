/*
* Very similar to a while loop.
* 
* The only difference is that a 
* do-while loop will always execute once before 
* evaluating the conditon.
*/


public class dowhile {
    public static void main(String[] args){
        /*
        * If code was simply a while loop, it would never 
        * run since 2 does not equal 5.
        * However, since this is a do-while loop, it will run once,
        * then look at the condition and not run again.
        */
        do{
            System.out.println("2 is not equal to 5");
        }
        while(2 == 5);

    }
    
}
