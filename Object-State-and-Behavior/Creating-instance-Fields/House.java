/**
 * To create an instance field, intialize variables inside the 
 * class container
 */

class House {
   //Object(instance) fields
   String door = "slam!";
   int lights = 20;

   public House(){
      //Instructions for creating an instance of House goes here:
      
   }


    public static void main(String[] args){
        House myHouse = new House();
        /**
         * To access an object's instance field, append(attach) the dot
         * operator followed by the instance field's name to the name of the object
         */

         // Access instance variable 'door' of an object 'house';
        System.out.println(myHouse.door); // Prints: slam!
    }
    
}
