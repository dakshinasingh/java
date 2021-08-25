package methods;
import java.util.Scanner;

public class AreaOfTriangle {
    double b, h;
    double area(){
        return 0.5*b*h;
    }
}

class testTriangle{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        AreaOfTriangle obj = new AreaOfTriangle();
        System.out.println("enter base of Triangle:");
        obj.b = in.nextDouble();
        System.out.println("enter height of Triangle:");
        obj.h = in.nextDouble();
        System.out.println("area of Triangle: " +obj.area()+"sq units");
    }
}

/*
output:
enter base of Triangle:
6
enter height of Triangle:
12
area of Triangle: 36.0sq units
*/