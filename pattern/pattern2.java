package patterns;
import java.util.Scanner;
public class pattern2 {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=in.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
output:
Enter the number of rows:
5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

