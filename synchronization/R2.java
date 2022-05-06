
package synchronization;

public class R2 {
     synchronized public void first(R1 obj){
        System.out.println("main thread trying to call R1's second method");
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
               
       }
       obj.second();
     }
     synchronized public void second()
    {
        System.out.println("Inside R2's second method");
    }
}
