
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRunnable implements Runnable{
    Thread t;
    public ThreadRunnable(String n){
        t=new Thread(this,n);
        t.start();
    }
    public void run(){
        for(int i='A';i<'F';i++)
        {
            try{
                System.out.println(t.getName()+":\t"+(char)i);
                Thread.sleep(200);
            }
            catch(InterruptedException ex){
                System.out.println(t.getName()+"interrupted");
            }
        }
        System.out.println(t.getName()+"terminated");
    }
    public static void main(String args[]){
        ThreadRunnable t1 = new ThreadRunnable("First Thread"); 
        ThreadRunnable t2 = new ThreadRunnable("Second Thread"); 
        ThreadRunnable t3 = new ThreadRunnable("Third Thread"); 
        System.out.println(t1.t.getName()+" is alive: "+t1.t.isAlive());
        System.out.println(t2.t.getName()+" is alive: "+t2.t.isAlive());
        System.out.println(t3.t.getName()+" is alive: "+t2.t.isAlive());
        for(int i=50;i<56;i++)
        {
            System.out.println(Thread.currentThread().getName()+":\t"+i);
            try{
                t1.t.join();
//                t2.t.join();
//                t3.t.join();
            }
            catch(InterruptedException ex){
                Logger.getLogger(ThreadRunnable.class.getName()).log(Level.SEVERE,null,ex);
            }
            System.out.println(t1.t.getName()+" is alive: "+t1.t.isAlive());
            System.out.println(t2.t.getName()+" is alive: "+t2.t.isAlive());
            System.out.println(t3.t.getName()+" is alive: "+t2.t.isAlive());
        System.out.println(Thread.currentThread().getName()+" terminated");
    }
    }

}
/*
run:run:
First Thread is alive: true
Second Thread is alive: true
Third Thread is alive: true
main:	50
First Thread:	A
Second Thread:	A
Third Thread:	A
First Thread:	B
Third Thread:	B
Second Thread:	B
First Thread:	C
Third Thread:	C
Second Thread:	C
First Thread:	D
Third Thread:	D
Second Thread:	D
First Thread:	E
Third Thread:	E
Second Thread:	E
First Threadterminated
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
main:	51
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
main:	52
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
main:	53
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
main:	54
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
main:	55
First Thread is alive: false
Second Thread is alive: true
Third Thread is alive: true
main terminated
Third Threadterminated
Second Threadterminated
BUILD SUCCESSFUL (total time: 1 second)
*/