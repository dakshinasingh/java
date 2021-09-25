package exceptionhandling;

import java.util.*;

public class ExceptionHandling {
    static Scanner in=new Scanner(System.in);
    
    //ARITHMETIC EXCEPTION
    
    public static int divide(int a,int b)
    {
        int temp=0;
        while(temp==0)
        {
            try{
                temp=a/b;
                return temp;
            }
            catch(ArithmeticException e){
                System.out.println("Exception raised: "+e.getMessage()+" Try again: ");
                System.out.println("Re-enter value: ");
                b=in.nextInt();
            }
        }
        return temp;
    }
    
   //ARRAY INDEX OUT OF BOUNDS EXCEPTION
    
    public static int array(int arr[])
    {
        System.out.println("Enter the position of element you want to print: ");
        int x=in.nextInt();
        int temp=0;
        while(temp==0)
        {
            try{
            temp=arr[x];
            return temp;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception raised: "+e.getMessage()+" Array index does not exist. Try again: ");
                System.out.println("Re-enter the position: ");
                x=in.nextInt();
            }
        }
        return temp;
    }
    
    //NULL POINTER EXCEPTION
    
    public static void compare_Strings(String s,String s1){
        try{
        if(s.equals(s1))
            System.out.println("Same");
        else
            System.out.println("Not Same");
        }
        catch(NullPointerException e)
        {
             System.out.println("Exception raised: "+e.getMessage()+" Try again");
        }
    }
    
    //NUMBER FORMAT EXCEPTION
    
    public static void number()
    {
        int n;
        while(true){
            System.out.println("Enter any valid integer");
            try{
                n=Integer.parseInt(in.next());
                System.out.println("You entered: "+n);
                break;
            } 
            catch(NumberFormatException e){
                System.out.println("Exception raised: "+e.getMessage()+" You entered an invalid integer. Try again" );
            
            }
        }
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println("Output 1.\n Enter the value of b: ");
        int b=in.nextInt();
        System.out.println("Result is "+divide(a,b));
        System.out.println(" ");
        System.out.println("Output 2. \n Enter the size of array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Result is "+array(arr));
        System.out.println(" ");
        System.out.println("Outout 3. ");
        String s=null;
        String s1=null;
        compare_Strings(s,s1);
        in.nextLine();
        System.out.println("Enter the string: ");
        s=in.nextLine();
        System.out.println("Enter the string you want to compare to "+s);
        s1=in.nextLine();
        compare_Strings(s,s1);
        System.out.println(" ");
        System.out.println("Output 4.");
        number();
    }
    
}

/*
run:
Output 1.
 Enter the value of b: 
0
Exception raised: / by zero Try again: 
Re-enter value: 
4
Result is 2
 
Output 2. 
 Enter the size of array: 
4
12
24
32
17
Enter the position of element you want to print: 
8
Exception raised: 8 Array index does not exist. Try again: 
Re-enter the position: 
3
Result is 17
 
Outout 3. 
Exception raised: null Try again
Enter the string: 
book
Enter the string you want to compare to book
book
Same
 
Output 4.
Enter any valid integer
400k
Exception raised: For input string: "400k" You entered an invalid integer. Try again
Enter any valid integer
574
You entered: 574
BUILD SUCCESSFUL (total time: 29 seconds)
*/