
package synchronization;

public class Deadlock_Thread extends Thread {
    
    R1 obj= new R1();
    R2 obj1=new R2();
    
    Deadlock_Thread()
    {
        start();
        obj1.first(obj);
    }
    public void run()
    {
        obj.first(obj1);
    }
    public static void main(String args[])
    {
        Deadlock_Thread t1 = new Deadlock_Thread();
    }
}

/* OUTPUT 

main thread trying to call R1's second method
t1 thread trying to call R2's second method

*/
