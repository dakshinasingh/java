package synchronization;

public class SonThread extends Thread{
    BankAccount ba;
    public SonThread(BankAccount ba){
        this.ba=ba;
        start();
    }
    public void run(){
        for(int i=1;i<=5;i++)
            ba.withdraw((int)(Math.random()*5000));
    }
}