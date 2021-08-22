package array;
import java.util.Scanner;
public class print4DArray {
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        int a[][][][]={{ {{1,2},
                          {4,3}
                         },
                       {
                          {2,3},
                          {2,5}
                       }},
                     { {{4,2},
                          {2,3}
                         },
                       {
                          {2,1},
                          {3,1}
                       }}};
                      
        System.out.println("4D Array: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    for(int l=0;l<a[i][j][k].length;l++)
                    {
                        System.out.print(a[i][j][k][l]+"  ");
                    }
                    System.out.println("  ");
                }
                System.out.println("  ");
            }
            System.out.println("  ");
        }
    System.out.println("  ");
}
}
