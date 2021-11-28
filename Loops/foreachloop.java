import java.util.ArrayList;

/**
 * For-each loop: also known as enhanced loops,
 * allows us to directly loop through each item in
 * a list of items
 * Ex: Array or ArrayList
 * and perform some action with each item.
 * 
 * Ex: 
 * If we wanted to traverse(go across) an array of 'String's named
 * 'myArray' , we could use a regular for-loop, but
 * a for-each loop is simpler and more straightforward.
 * 
 */


public class foreachloop {
    public static void main(String[] args){
       ArrayList<String> myArray = new ArrayList<String>();

       myArray.add("Travyon");
       myArray.add("Adriana");
       myArray.add("Deandre");
       myArray.add("Allicia");
       myArray.add("Andre");
       //for each 'name' in 'myArray' print it out
       for(String name: myArray){
           
           //Prints out names
           System.out.println(name);
       }
    }
    
}
