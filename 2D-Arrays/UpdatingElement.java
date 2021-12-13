/*
* To update an element:
* Specify individual array index in first bracket
* Then, Specify individual element index that is being changed in the second bracket
* Set equal to value that it is being changed to
*/




public class UpdatingElement {
    public static void main(String[] args){
        char[][] letters = {{'A', 'a'}, {'B', 'x'}, {'C', 'c'}};

        //Updates value 'c' to 'D'
        letters[2][1] = 'D';
        System.out.println(letters[2][1]); // Prints: D

    }
    
}
