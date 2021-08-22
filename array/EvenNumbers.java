package array;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int a=in.nextInt();
        System.out.println("Enter the ending range:");
        int b=in.nextInt();
        System.out.println("The even numbers between "+a+" and "+b+" are");
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
                continue;
            System.out.println(i);
        }
}
}
