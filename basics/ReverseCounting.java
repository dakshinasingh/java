package java1;
public class ReverseCounting {
    public static void main(String args[])
    {
        int i=100,a=0;
        do{
            System.out.print(i+"\t");
            a++;
            i--;
            if(a%4==0)
                System.out.println("\n");
           }while(i>0);
    }
}
