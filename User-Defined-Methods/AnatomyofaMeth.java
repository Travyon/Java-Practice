
public class AnatomyofaMeth {
    public static void main(String[] args){
        exampleMethod();
    }
 
    /**
     * A 'public' method can be accessed by any part of a program,
     * including  other classes.
     * 
     * A 'static' method can be called throughout a program without
     * creating an object of the class.
     * 
     * A void method does not return a value.
     * 
     * The below declaration contains empty parentheses; therefore,
     * this method takes no parameters.
     * 
     * All code placed within the brackets '{}' is considered the method
     * body.
     */
    public static void exampleMethod(){
        System.out.println("Hello Method!");
    }
    
}
