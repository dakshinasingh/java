package stringfunctions;
import java.util.Scanner;
public class ParaToSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a paragaraph");
        String s=in.nextLine();
        String arr[]=s.split("[.]");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
 /*
output:
I am dakshina singh. I am a student. I am 20 years old.
I am dakshina singh
 I am a student
 I am 20 years old
*/