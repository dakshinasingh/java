package patterns;
import java.util.Scanner;

public class pattern1 {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
}}
output:
Enter the value of n:
5
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
