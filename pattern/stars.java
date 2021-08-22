package patterns;
import java.util.Scanner;
public class stars {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
            
        } 
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
            
        } 
    } 
}
output:
Enter the value of n:5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 