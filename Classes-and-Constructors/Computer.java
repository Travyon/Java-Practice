//Constructor Example 2


public class Computer {
    //Constructor method
    public Computer(){
        System.out.println("I like iMac Computers");

    }
    
    //Main method
    public static void main(String[] args){
        /**
         * Here, we have a Computer object(instance) 'new Computer()'
         * assigned to the variable 'iMac'
         * 
         * Note: 
         * 'iMac' is a computer device
         */

         /**
          * When we create a new instance of the
          * of our class, we 'call' the constructor 
          * 'Computer()'.
          * This means that any code inside the constructor
          * will be executed. 
          */
        Computer iMac = new Computer();


    }
    
}
