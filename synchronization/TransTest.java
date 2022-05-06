
package synchronization;

public class TransTest {
    public static void main(String args[])
    {
        BankAccount ba=new BankAccount();
        FatherThread father=new FatherThread(ba);
        SonThread son=new SonThread(ba);
    }
}
/*
run:
Deposit=8787
Withdraw=2642
Deposit=6978
Withdraw=3175
Deposit=6032
Withdraw=279
Deposit=2329
Withdraw=2506
Deposit=4737
Withdraw=1324
BUILD SUCCESSFUL (total time: 1 second)

*/