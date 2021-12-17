/**
 * In order to create an object(instance of a class),
 * we need a constructor.
 * The constructor is defined within the class.
 * The constructor also shares the same name as the class.
 * 
 * To create an object(instance of a class), call(invoke or put into action)
 * the constructor inside the 'main()' method.
 * 
 */



public class Construct {
    //Constructor method:
    public Construct(){
        //Directions for creating a 'Construct' instance go here    
    }
    public static void main(String[] args){
        /**
         * Here, we assign a 'Construct' object(instance)
         * 'new Construct()' to the variable 'construct' ,
         * which invokes the constructor.
         * 
         * The variable 'construct' is a reference data
         * type, meaning that the value of our variable
         * 'construct' is referring to our object's(instance's)
         * 'Construct'  memory address.
         * 
         * During its declaration, the class name 'Construct' 
         * is used as the variable's 'construct' type.
         * 
         * Here, the type is 'Construct'
         * 
         * After the assignment operator '=' , we invoke the 
         * constructor method: Contruct() , and use the keyword
         * 'new' to insidcate that we are creating an object(instance)
         */

        //Will see the memory address if we output 'construct'
        Construct construct = new Construct();
        System.out.println(construct);
    }
    
}
