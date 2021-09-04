package inheritance;

public class vehicle {
    int vno;
    String vtype;
    int seatingCapacity;
     public vehicle(int n,String t,int s)
    {
        vno=n;
        vtype=t;
        seatingCapacity=s;
    }
    
    @Override
        public String toString() {
        return ("\nVehicle no. "+vno+ "\nVehicle type "+vtype+"\nSeating Capacity"+seatingCapacity);
        }
}
class tour extends vehicle{
    int tourid,km,tolltax;
    String source,destination;
    public tour(int n,String t,int s,int id,int k,int tax,String src,String des)
    {
        super(n,t,s);
        tourid=id;
        km=k;
        tolltax=tax;
        source=src;
        destination=des;
    }
    static int tourcharge(int km,int tolltax)
    {
        return (km*tolltax);
    }
     @Override
        public String toString() {
        return (super.toString()+"\ntour Id= "+tourid+"\nDistance= "+km+"\nToll tax="+tolltax+"\nSource= "+source+"\nDestination= "+destination+"\nTour Charge= "+tourcharge(km,tolltax));
        }
}
class test{
    public static void main(String args[])
    {
        tour obj1=new tour(100,"bus",50,25644,350,5,"jaipur","delhi");
        tour obj2=new tour(200,"taxi",2,4563,600,9,"jaipur","meerut");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

/*
run:

Vehicle no. 100
Vehicle type bus
Seating Capacity50
tour Id= 25644
Distance= 350
Toll tax=5
Source= jaipur
Destination= delhi
Tour Charge= 1750

Vehicle no. 200
Vehicle type taxi
Seating Capacity2
tour Id= 4563
Distance= 600
Toll tax=9
Source= jaipur
Destination= meerut
Tour Charge= 5400
*/