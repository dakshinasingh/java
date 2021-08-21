package java1;
import java.util.Scanner;
public class fibonacci {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int a=0,b=1,c=0;
        System.out.println("The fibonacci series is:");
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
