package java1;
import java.util.Scanner;
public class CountVowelsConsonentDigits {
     public static void main(String args[])
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any alphanumeric string:");
        String str=in.next();
        char s[]=str.toCharArray();
        int v=0;
        int d=0;
        int c=0;
        for(int i=0;i<str.length();i++)
        {
        switch(s[i])
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                v=v+1;
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                d=d+1;
                break;
            default:
                c=c+1;
        }
        }
        System.out.println(" No. of Vowels="+v);
        System.out.println(" No. of Digits="+d);
        System.out.println(" No. of Consonents="+c);
    }
}
