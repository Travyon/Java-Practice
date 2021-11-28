 /*
        * To change value in an array select the element 
        * via its index and use the assignment operator
        * to set a new value.
        *
        * Ex: 
        * arrayName[index] = newValue;
        */
public class ChangeArrVal {
    public static void main(String[] args){
       char[] letters = {'a', 'b', 'c'};

       //Change element Value at index 0:
       letters[1] = 'c';
       System.out.println(letters[1]); // Prints: c
    }
    
}
