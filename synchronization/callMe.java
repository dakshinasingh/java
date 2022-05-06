package synchronization;

public class callMe {
    //synchronized public void call(String m){
    public void call(String m){
        
        System.out.print("["+m);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("]");
    }
    
}
