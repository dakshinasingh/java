
package java1;
import java.util.Scanner;
public class CommisionCalculate {
    public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Sales:");
        double sales=in.nextDouble();
        double comm;
        if(sales>=50000)
            comm=0.15*sales;
        else if(sales>=20000)
            comm=0.10*sales;
        else if(sales>=10000)
            comm=0.05*sales;
        else
            comm=0;
        System.out.println("Commision= "+comm);
    }  
}

