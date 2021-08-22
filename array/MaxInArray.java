package array;
import java.util.Scanner;
public class MaxInArray {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]= in.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
        if(a[i]>max)
            max=a[i];
        }
        System.out.println("Maximum number: "+max);
   }
}
