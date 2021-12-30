/**
 * In order to give behavior to objects, we need to create
 * non-static methods.
 * 
 * A non-static method is a method that belongs to a class. 
 * 
 * A non-static method can be identified by the method signature
 * not having "static".
 */
class person {
    // Instance variables(attributes/features)
    String name;
    int legs;

    // Non-static method:
    public void identify(){
        System.out.println(name);
    }

    // Constructor that takes a parameter value
    public person(String personName, int legs){
        // Instance variable is assigned to parameter value
        name = personName;
        /**
         * Instance variable and parameter value has the 
         * same name'int legs' , so we use 'this.legs' to 
         * refer to the instance variable then we assign the
         * parmeter value 'legs' to it
         */
        this.legs = legs;
    }


    public static void main(String[] args){
        person myPerson = new person("Travyon");
    }
    
}
