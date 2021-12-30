/**
 * Objects and classes are closely related
 * because classes define attributes and behaviors
 * of an object. 
 * 
 * To create an object:
 * declare a variable in the 'main()' method 
 * with the class name as the data type 
 * 
 * 
 * Ex: Animal dog;
 * 
 * and set the value to a call to the class' constructor
 * 
 * Ex: Animal dog = new Animal();
 */

 /**
  * The class name is used as a data type because objects
  * have reference data types. 
  * 
  * This means that the value of the variable
  * a reference to an object's(instance's) memory address.
  */


class Cat {
    // Class constructor
    public Cat(){
        // Instructions for creating an instance of Cat goes here:
    }

    public static void main(String[] args){
        // Create a Cat object by calling the constructor:
        Cat mere = new Cat();
    }
    
}
