public class Main {
    public static void main(String[] args) {
        //Polymorphism- process of an object to identify as more than one type

        //Instance of the subclasses
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        //Array
        Vehicle[] racers = {car, bike, boat};

        /*
         car.go();
         bike.go();
         boat.go();
        */

        for (Vehicle x : racers){
            x.go();
        }

    }
}