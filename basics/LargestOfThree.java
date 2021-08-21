package java1;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=0;
        if(a>b)
        {
            if(a>c)
                System.out.println("Largest number="+a);
            else
                System.out.println("Largest number="+c);
        }
        else
        {
            if(b>c)
                System.out.println("Largest number="+b);
            else
                System.out.println("Largest number="+c);
        }      
    }  
}

