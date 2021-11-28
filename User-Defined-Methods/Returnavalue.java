/**
 * To return a value from a function:
 * 
 * Change method declaration to include the data type of the return 
 * value.
 * 
 * The return type is placed before the method name.
 * 
 * To return a vlue, use the 'return' keyword followed by the return 
 * value inside the method body:
 * 
 */



public class Returnavalue {

    public static int findProduct(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args){

        /**
         * int 'product' variable takes 'findProduct' method
         *  with arguments '3 and 4'
         * 
         * The two numbers will be multiplied because of the 
         * 'findProduct' method returning two values being
         * multiplied.
         * 
         * The 'product' variable is then printed using the 
         * print statement.
         */
        int product = findProduct(3, 4);
        System.out.println(product);

    }
    
}
