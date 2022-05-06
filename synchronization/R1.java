
package synchronization;

import java.util.logging.Level;
import java.util.logging.Logger;


public class R1 {
    synchronized public void first(R2 obj1){
        System.out.println("t1 thread trying to call R2's second method");
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
               Logger.getLogger(R1.class.getName()).log(Level.SEVERE,null, ex);   
        }
        obj1.second();
    }
    synchronized public void second()
    {
        System.out.println("Inside R1's second method");
    }
}
