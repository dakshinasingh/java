package methods;
class trip{
    int carno,milage,make,KMrun;
    String model;
   
    trip(int n,int year,int mil,int km)
    {
        carno=n;
        make=year;
        KMrun=km;
        milage=mil;
    }
    trip(int n, int year, int mil, int km, String mod){
        this(n, year, mil, km);
        model = mod;
    }
    double fuelConsumed()
    {
        double f = KMrun/milage;
        return f;
    }
    double runningCost(int fuelprice){
        double cost = fuelConsumed()*fuelprice;
        return cost;   
    }
}
    public class cartrip{
        public static void main(String args[]){
        trip obj1 = new trip(2345, 1998, 40, 200, "Ford anglia");
        System.out.println("fuel consumed by 1st car: "+obj1.fuelConsumed());
        System.out.println("running cost of 1st car: "+obj1.runningCost(70));
        trip obj2 = new trip(1347, 2005, 60, 330, "Maruti 800");
        System.out.println("fuel consumed by 2nd car: "+obj2.fuelConsumed());
        System.out.println("running cost of 2nd car: "+obj2.runningCost(40));
        trip obj3 = new trip(5435, 2012, 50, 400, "Swift");
        System.out.println("fuel consumed by 3rd car: "+obj3.fuelConsumed());
        System.out.println("running cost of 3rd car: "+obj3.runningCost(30));
    }
}
/*    
output:
fuel consumed by 1st car: 5.0
running cost of 1st car: 350.0
fuel consumed by 2nd car: 5.0
running cost of 2nd car: 200.0
fuel consumed by 3rd car: 8.0
running cost of 3rd car: 240.0
*/
