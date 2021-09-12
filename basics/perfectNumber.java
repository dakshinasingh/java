package java1;

import java.util.Scanner;

public class perfectNumber {
     public static void main(String args[]) {
        if(perfect()==1)
            System.out.println("Perfect number");
        else
            System.out.println("Not a Perfect number");
     }
     static int perfect()
     {
        Scanner in=new Scanner(System.in);
        int s=0;
        int n=in.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        if(s==n)
            return 1;
        else
            return 0;
     }
}
