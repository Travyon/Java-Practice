/**
 * 'this' kewyword is used to refernce the current object
 * within any class method or constructor.
 * 
 * The 'this' keyword can be useful in clarifying
 * what value is being referred to if any parameter
 * values use the same name as an instance variable
 * 
 */

class dog {
    //Instance variables
    String noise;
    int eyes = 2;
    
    //Parameter has same name as the instance variable
    public dog(String noise){
        
        //Assign instance variable to parameter value:
        this.noise = noise;
    }


    public static void main(String[] args){

    }
    
}
