package methods;

import java.util.Scanner;

public class overriding {
    public static void main(String arg[]) {
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    ab ob1=new ab();
    abc ob2=new abc();
    System.out.println("sum of "+a+" and "+b+": "+ob1.sum(a, b));
    System.out.println("sum of "+a+" ,"+b+" and "+c+" :"+ob2.sum(a,b,c));
    }
}
class ab{
        public int sum(int a,int b){
            return a+b;
        }
    }
    class abc extends ab{
        public int sum(int a,int b,int c){
            return a+b+c;
        }
    }

/*
run:
3
4
5
sum of 3 and 4: 7
sum of 3 ,4 and 5 :12
*/