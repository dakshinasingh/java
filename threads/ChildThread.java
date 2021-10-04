package threads;

public class ChildThread extends Thread {
    ChildThread(String name)
    {
        super(name);
        start();
    }
    public void run()
    {
        for(int i=5;i>0;i--)
        {
            try{
                System.out.println(this.getName()+"\t"+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(this.getName()+ "Interrupted");
            }
        }
        System.out.println(this.getName()+" Terminated");
    }
     public static void main(String args[])
     {
         ChildThread c1=new ChildThread("first thread");
         ChildThread c2=new ChildThread("second thread");
         ChildThread c3=new ChildThread("third thread");
            for(int i=5;i>0;i--)
            {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                try{
                    Thread.sleep(1000);
                    }
                catch(InterruptedException e){
                    System.out.println(Thread.currentThread().getName()+" Interrupted");
                }
            }
            System.out.println(Thread.currentThread().getName()+" Terminated");
     }
 }

/*
run:
first thread	5
main : 5
second thread	5
third thread	5
first thread	4
main : 4
second thread	4
third thread	4
first thread	3
main : 3
second thread	3
third thread	3
first thread	2
main : 2
second thread	2
third thread	2
third thread	1
second thread	1
main : 1
first thread	1
second thread Terminated
third thread Terminated
main Terminated
first thread Terminated
BUILD SUCCESSFUL (total time: 6 seconds)
*/