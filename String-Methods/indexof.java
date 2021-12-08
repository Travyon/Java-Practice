/**
 * If you want to know the index of the 
 * first occuraence of a character in a 
 * string, use '.indexOf()' method on a 
 * string.
 * 
 * Indices in java start with 0
 */

public class indexof {
    public static void main(String[] args){
        String funny = "supercasualdefragile";
        
        /**
        * Prints 4 because in 'r' is at the 4th
        * index on the first occurence.
        */
        System.out.println(funny.indexOf("r"));

        /**
         * Can get the index of the first ocuurence 
         * of an entire substing.
         * 
         * 'indexOf()' method can also return 
         * where a substring begins (index of
         * the first character in the substring).
         * 
         * 
         * Prints: 5
         */
        System.out.println(funny.indexOf("casu"));

    }
    
}
