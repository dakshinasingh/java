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
output:
Enter the number
2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20