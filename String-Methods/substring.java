/**
 * Substring - when we only 
 * want part of a string.
 * 
 * '.substring()' takes 
 * care of that.
 * 
 * A substring begins with a character at the specified
 * index and extends to the end of the string.
 */



public class substring {
    public static void main(String[] args){
        String sentence = "I am learning Java so I can work at apple";
        String newSentence = "I am going to work at Apple, Google, or Microsoft";

        /**
         * Output is what begins at index  index '5' and ends at
         * the end of 'sentence'.
         */

        System.out.println(sentence.substring(5));

        /**
         * Ouputs a substring from the middle of a string
         * 
         * Output is 'work at apple' because I typed index '14 and 27'
         * as arguments in the 'substring()' method. This prints
         * what starts at index '14' and ends at index '27'.
         */

         System.out.println(newSentence.substring(14, 27));

    }
    
}
