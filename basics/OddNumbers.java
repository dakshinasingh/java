package java1;
import java.util.Scanner;
public class OddNumbers {
    public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int a=in.nextInt();
        System.out.println("Enter the ending range:");        
        int b=in.nextInt();
        for(int i=a;i<b;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
}
Enter the starting range:
5
Enter the ending range:
20
5
7
9
11
13
15
17
19