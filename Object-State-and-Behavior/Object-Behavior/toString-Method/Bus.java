/**
 * The '.toString()' method can be added to a 
 * class in order to create unique output when 
 * printing an object. 
 * 
 * The original '.toString()' method exits within the
 * Object class; however, the '.toString()' method is 
 * often overridden in subclasses to create a unique
 * output for each individual class 
 */

class Bus {
    //  Occurs 1st 
    String noise;
    int wheels = 4;

    //Occurs 3rd
    public String toString(){
        //returns the string to the main method
        return "The bus has " +
        wheels + " wheels and makes the noise " + noise;
    }
    
    // Occurs 2nd
    public Bus(String busNoise){
        //Parameter value 'busNoise' is assigned to the instance 'noise'
        noise = busNoise;
    }

    //Occurs 4th(last)
    public static void main(String[] args){
        //Bus object takes 'vroom' as an argument becuae of the 'busNoise' parameter value in the constructor
        Bus myBus = new Bus("vroom");
        //Print the Bus object using 'myBus'
        System.out.println(myBus);

    }   
}
