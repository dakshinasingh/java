package array;
import java.util.Scanner;
public class search {
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
        System.out.println("Enter the element to be searched:");
        int x=in.nextInt();
        int find=0;
        for(int i=0;i<n;i++)
        {
            if(x==a[i])
            {
                System.out.println(x+" is found at position "+(i+1));
                find=1;
                break;
            }  
        } 
        if(find==0)
            System.out.println("element not found");
}}

