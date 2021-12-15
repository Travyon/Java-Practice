
public class nestedLoop {
    public static void main(String[] args){
        /**
         * Everytime we iterate the 'i' loop by 1
         * we complete a full loop(walk through)(iteration) of 'j' loop
         */

        for(int i = 1; i < 3; i++ ){
            for(int j = 1; j < 4; j++){
                System.out.println("i= " + i + ", j= " + j);

            }
        }
    }

    
}
