public class Arguments {

    public static void exampleMethod(String greeting, String name){
        System.out.println(greeting + " " + name);
    }
    public static void main(String[] args){
        /**
         * Arguments are the pieces of data that get passed int a method.
         * 
         * When calling a method, place the arguments(What you're going to give to the method) 
         * inside the parenthese of the method call.
         * 
         * The arguments must be the same data type a the parameters and appear in
         * chornological order.
         */

         exampleMethod( "My name is", "Travyon");
         exampleMethod("I want to work at", "Apple");
         exampleMethod("Thanks", "Apple");


    }
    
}
