class Plane {
    String name;
    int numWings;

    public Plane(String name, int numWings){
        this.name = name;
        this.numWings = numWings;
    }

    public void planeType(){
        System.out.println(name);
        System.out.println(numWings);
    }

    /**
     * If an object is placed inside of a
     * print statement, the output shows
     * the data type of the object(class
     * name) followed by the memory address
     * of the object:
     */
    public static void main(String[] args){
        Plane myPlane = new Plane("Delta", 2);
        System.out.println(myPlane); // Prints: Plane@3cd1a2f1
    }
}
