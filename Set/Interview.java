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
As You can See the "Ambassador HM White 42" Coming Two Times although  all the parameter are same. To overcome this problem we have to OverRide the equal method   and also the 
Hascode method.
******>Contract Between Hascode and Equals********>
If two vehicle  retrurn true then the HashCode Must be same;

Example :
String str = "hellow World";
System.out.println(str.hashCode());
HashCode method Return int and it is used in String , Obj Etc.
    
********NOTE: - In Java when ever we are dealing with Complex Object we have to Override the HaseCode and equals method.
    
    
    
    
    
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

   public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        // Cast the Obj into Vehicle 
        Vehicle other = (Vehicle)obj;

        if(this.name.equals(other.name) && this.make.equals(other.make) && this.color.equals(other.color) && this.fuelCapacity == (other.fuelCapacity)){
         return true;
        }

        return false;
    }

   public int hashCode(){
       return (this.name+"-"+this.make+"-"+this.color+"-"+Integer.toString(this.fuelCapacity)).hashCode();
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
        // System.out.println(vset);
    }
}



// OUTPUT--------------------------->>>
Ambassador HM White 42
WagonR Maruti Silver 35
Nano Tata Purple 20

    
