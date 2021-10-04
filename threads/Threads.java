package threads;

public class Threads {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();//thread class
        System.out.println(t);
        t.setName("my current Thread");
        t.setPriority(7);
        for (int i = 5; i > 0; i--) {
            System.out.println(t.getName() + "=" + i);
            try {
                Thread.sleep(1000); //stop execution for 1000ms,i.e, 1 sec
            } 
            catch (InterruptedException e) {
            }
        }
    }
}

/*run:
Thread[main,5,main]
my current Thread=5
my current Thread=4
my current Thread=3
my current Thread=2
my current Thread=1
BUILD SUCCESSFUL (total time: 6 seconds)
 */
