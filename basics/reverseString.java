package java1;

import java.util.Scanner;

public class reverseString {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char ch[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<(n/2);i++)
        {
            char temp=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=temp;
        }
        System.out.println(ch);
    } 
}
