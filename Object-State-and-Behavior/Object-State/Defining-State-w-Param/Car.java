/**
 * To create dynamic objects, parameters can
 * be added to the class constructor. Instance
 * variables can then be assigned to the parameter
 * values
 */



class Car {
    // Instance fields:
    String noise;
    int numDoors = 4;


    //Constructor takes in one String parameter
    public Car(String carNoise){
        //Assign instance variable(noise) to parameter value(carNoise):
        noise = carNoise;
    }


    public static void main(String[] args){
        // Send argument("vroom") to constructor when creating an object
        Car firstCar = new Car("vroom");
        //Send argument("skkrrrr")to constructor when creating another object
        Car secondCar = new Car("skkrrrr");

        System.out.println(firstCar.noise); //Prints: vroom
        System.out.println(secondCar.noise); //Prints: skkrrrr


    }
    
}
