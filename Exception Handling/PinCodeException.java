
package exceptionhandling;
//custom exception. pin code should be of 6 digits
import java.util.Scanner;

public class PinCodeException extends Exception{
    public PinCodeException(){
        super();
    }
    public PinCodeException(String x){
        super(x);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your area pin code/postal code:");
        String pin = sc.next(); 
        
        try{
            if(pin.length() != 6)
                throw new PinCodeException("invalid pin code. enter a 6 digit code only!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*
run:

Enter your area pin code/postal code:
2467624
invalid pin code. enter a 6 digit code only!
BUILD SUCCESSFUL (total time: 8 seconds)

Enter your area pin code/postal code:
246762
BUILD SUCCESSFUL (total time: 5 seconds)
*/