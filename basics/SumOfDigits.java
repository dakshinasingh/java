package java1;
import java.util.Scanner;
public class SumOfDigits {
     public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int m;
        int sum=0;
        while(n>0)
        {
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        
        System.out.println("Sum of digits"+sum);
    }
}
output:
Enter the number
1234
Sum of digits10
