package methodoverriding;

class AB {
    public int sum(int a, int b) 
    {
           return a+b;
    }
}

class ABC extends AB {

    public int sum(int a, int b, int c) 
    {
        return a+b+c;
    }
}

public class sumABC{

    public static void main(String args[]) {
        ABC obj = new ABC();
        System.out.println("sum1: "+obj.sum(5, 2, 7));
        System.out.println("sum2: "+obj.sum(3,2));
        AB obj1 = obj;
        System.out.println("sum1: "+obj.sum(8, 3, 2));
        System.out.println("sum2: "+obj.sum(8,1));
    }
}

/*run:
run:
sum1: 14
sum2: 5
sum1: 13
sum2: 9
*/
