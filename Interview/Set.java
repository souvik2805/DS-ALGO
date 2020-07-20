import java.util.*;

class Vehicle {

    String name;
    String make;
    String color;
    int fuelCapacity;

    Vehicle(String name, String make, String color, int fuelCapacity) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        Vehicle other = (Vehicle)obj;

        if(this.name.equals(other.name) && this.make.equals(other.make) && this.color.equals(other.color) && this.fuelCapacity == other.fuelCapacity) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return (this.name + "-" + this.make + "-" + this.color + "-" + Integer.toString(this.fuelCapacity)).hashCode(); 
    }


}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("WagonR", "Maruti", "Silver", 35);
        Vehicle vehicle2 = new Vehicle("Nano", "Tata", "Purple", 20);
        Vehicle vehicle3 = new Vehicle("Mustang", "Ford", "Black", 60);
        Vehicle vehicle4 = new Vehicle("Ambassador", "HM", "White", 10);
        Vehicle vehicle5 = new Vehicle("Ambassador", "HM", "White", 10);
        

        Set<Vehicle> set = new HashSet<>();

        // System.out.println(vehicle1);

        set.add(vehicle1);
        set.add(vehicle2);
        set.add(vehicle3);
        set.add(vehicle4);
        if(!set.contains(vehicle5)) {
            set.add(vehicle5);
        }

        for(Vehicle v : set) {
            System.out.println(v.name + " " + v.make + " " + v.color + " " + v.fuelCapacity);
        }
    }
}
