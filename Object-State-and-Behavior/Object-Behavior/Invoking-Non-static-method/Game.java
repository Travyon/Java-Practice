/**
 * A non-static method can only be invoked by an object of the
 * class in which the method was created. To call a non-static
 * method, state the object's name'myGame' followed by '.', the method
 * name'typeOfGame', and parentheses'()'
*/
class Game {
    
    String name;
    int levels;
    
    public Game(String name, int levels){
        
        this.name = name;
        this.levels = levels;
    }

    public void typeOfGame(){
        
        System.out.println(name);
        System.out.println(levels);
    }

    public static void main(String[] args){
        Game myGame = new Game("Zelda", 5);
        // Call the method on the object
        myGame.typeOfGame(); /**
                             * Prints: Zelda
                             *         5
                             */

    }
    
}
