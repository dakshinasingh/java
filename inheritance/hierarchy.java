package inheritance;

    class A{
        int a1;
        public A(){
            System.out.println("Inside A");
        }
        public A(int a){
            a1=a;
        }
        @Override
        public String toString() {
        return ("\na1= "+a1);
        }
    }
    class B extends A{
        int a2;
        public B(){
            System.out.println("Inside B");
        }
        public B(int a,int b){
            super(a);
            a2=b;
        }
        public String toString() {
        return (super.toString()+"\na2= "+a2);
    }
    }
    class C extends B{
        int a3;
        public C(){
            System.out.println("Inside C");
        }
        public C(int a,int b,int c){
            super(a,b);
            a3=c;
        }
        @Override
        public String toString() {
        return (super.toString()+"\na3= "+a3);
    }
    }
    class D extends C{
        int a4;
        public D(){
            System.out.println("Inside D");
        }
        public D(int a,int b,int c,int d){
            super(a,b,c);
            a4=d;
        }
        @Override
         public String toString() {
        return (super.toString()+"\na4= "+a4);
    }
    }

public class hierarchy {
     public static void main(String args[]){
            D obj=new D(1,2,3,4);
            System.out.println(obj);
        }
}

/*
run:

a1= 1
a2= 2
a3= 3
a4= 4
*/
    

