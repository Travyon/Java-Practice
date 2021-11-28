/*
* A for loop is used to for from 0 
* to one less than the length of the array.
* The loop control variable 'i' is used to access
* the element at the current index.
*/


public class TraverseArray {
    public static void main(String[] args){
        int[] creditScores = {700,800,750,850};
        for(int i = 0; i < creditScores.length; i++){
            System.out.println(creditScores[i]);
        }
        //for each number in the creditscores array, print it out
        for(int num: creditScores){
            System.out.println(num);
        }
    }
    
}
