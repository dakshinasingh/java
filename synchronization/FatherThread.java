package synchronization;

public class FatherThread extends Thread{
    BankAccount ba;
    public FatherThread(BankAccount ba){
        this.ba=ba;
        start();
    }
    public void run(){
        for(int i=1;i<=5;i++)
            ba.deposit((int)(Math.random()*10000));
    }
}
