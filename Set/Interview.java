import java.util.*;
class Vehicle{
    String name;
    String make;
    String color;
    int fuelCapacity;
    Vehicle(String name, String make, String color, int fuelCapacity){
        this.name = name;
        this.make = make;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
    }


}
class Main{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("WagonR","Maruti","Silver",35);
        Vehicle v2 = new Vehicle("Nano","Tata","Purple",20);
        Vehicle v3 = new Vehicle("Ambassador","HM","White",42);
        Vehicle v4 = new Vehicle("Ambassador","HM","White",42);
        Set<Vehicle> vset = new HashSet<>();
        vset.add(v1);
        vset.add(v2);
        vset.add(v3);
         vset.add(v4);
        for(Vehicle vc: vset){
            System.out.println(vc.name+" "+vc.make+" "+vc.color+" "+vc.fuelCapacity);
        }
    
    }
}


//******************OUTPUT**************************///
Nano Tata Purple 20
Ambassador HM White 42
WagonR Maruti Silver 35
Ambassador HM White 42
//--------------------------------------------------->
As You can See the "Ambassador HM White 42" Coming Two Times although  all the parameter are same. To overcome this problem we have to OverRide the equal method  
