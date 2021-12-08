/**
 * The '.concat()' method attaches 
 * two strings together.
 * 
 * '.concat' does not actually change a 
 *  string object.
 * If '.concat' is used on 'name'(value)
 * without reassigning its value, it won't change
 */

public class concat {
    public static void main(String[] args){
        String name = "Tra";
        
        /**
         * 1. reassign name's value
         * 2. name(value) calls the concat method
         * 3. the string that is being attached
         * is put in as an argument.
         * 4. print the string variable.
         */
        name = name.concat("vyon");
        System.out.println(name);


    }
    
}
