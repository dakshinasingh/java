package array;
import java.util.Scanner;
public class SumOfMatrix {
    
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        int a[][]={{1,2},{3,4}};
        int b[][]={{3,5},{5,8}};
        int c[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[j][j]+b[i][j];
            }
        }
        
        System.out.println("Matrix 1: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.print("  "+a[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Matrix 2: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.print("  "+b[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("sum of matrix:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.print("  "+(a[i][j]+b[i][j]));
            }
            System.out.println(" ");
        }
    }  
}

