
package synchronization;

public class BankAccount {
    int balance;
    boolean busy=false;
    synchronized public boolean deposit(int amt){
        if(busy)
            try{
                wait();
            }catch(InterruptedException ex){
                
            }
        balance+=amt;
        System.out.println("Deposit="+amt);
        busy=true;
        notify();
        return true;
    }
    synchronized public boolean withdraw(int amt){
        if(!busy)
            try{
                wait();
            }catch(InterruptedException ex){
                
            }
        balance-=amt;
        System.out.println("Withdraw="+amt);
        busy=false;
        notify();
        return true;
    }
}
