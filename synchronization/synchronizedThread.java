package synchronization;

public class synchronizedThread extends Thread {
    callMe cm;
    String message;
    public synchronizedThread(callMe cm, String m){
        this.cm = cm;
        message = m;
        start();
    }
    @Override
    public void run(){
        synchronized(cm){
        cm.call(message);
    }
    }
    
    public static void main(String args[]){
        callMe c = new callMe();
        synchronizedThread t1 = new synchronizedThread(c, "hello");
        synchronizedThread t2 = new synchronizedThread(c, "synchronized");
        synchronizedThread t3 = new synchronizedThread(c, "world");
    }
}
/*run:
[hello]
[world]
[synchronized]
BUILD SUCCESSFUL (total time: 3 seconds)*/
