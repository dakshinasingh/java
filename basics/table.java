package java1;
import java.util.Scanner;
public class table {
    public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n+ "*" +i+ "=" +(n*i));
            i++;
        }
    }
}
