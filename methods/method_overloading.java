package methods;
import java.util.Scanner;

public class method_overloading {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter how many numbers you want to compare:");
        int n = in.nextInt();
        
        if (n == 2) {
            System.out.println("enter the numbers");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("largest number: " + max(a, b));
        }
        else if (n == 3) {
            System.out.println("enter the numbers ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println("largest number: " + max(a, b, c));
        } 
        else {
            int arr[] = new int[n];
            System.out.println("enter numbers in array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("largest number: " + max(arr));
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    static int max(int a, int b, int c) {
        if (a > b && a > c) 
                return a;
        else if(b > c && b > a)
            return b;
        else
            return c;
    }

    static int max(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

}

/*output:
enter how many numbers you want to compare:2
enter the numbers
7
9
largest number: 9

enter how many numbers you want to compare:3
enter the numbers 
3
8
5
largest number: 8

enter how many numbers you want to compare:5
enter numbers in array: 
3
8
9
5
7
largest number: 9
*/

