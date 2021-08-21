
package java1;

import java.util.Scanner;

public class CI {
    public static void main(String args[])
    {
        double p,r,ci,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal,Time and Rate:");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        ci=p*(Math.pow((1+r/100),t));
        System.out.println("Compound Interest="+ci);
    }
    
}

