package array;
import java.util.Scanner;
public class break_implementation {
    
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        int a=10;
        first:
        {
            second:
            {
                third:
                {
                    if(a%2==0)break third;
                    System.out.println("inside third");
                }
                System.out.println("inside second");
            }
            System.out.println("inside first");
        }
    }
}
