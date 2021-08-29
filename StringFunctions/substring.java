package stringfunctions;
import java.util.Scanner;
public class substring {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your ID");
        String id=in.next();
        String i=id.substring(0,5);
        int a=Integer.parseInt(id.substring(5,10));
        System.out.println(i+(a+1));
    }
    
}
 /*output:
Enter your ID
BTBTI19114
BTBTI19115
*/