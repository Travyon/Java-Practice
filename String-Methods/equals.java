/**
 * Cannot us the primitive equality operator
 * '==' to check strings equality.
 * 
 * Use '.equals()' method instead
 * 
 * Can also use '.equalsIgnoreCase()' , which
 * compares two strings without considering 
 * upper/lower case.
 */


public class equals {
    public static void main(String[] args){
        String name1 = "Tre";
        String name2 = "hey";

        System.out.println(name1.equals("Tre")); //prints: true
        System.out.println(name2.equals("hey")); //prints: true

    }
    
}
