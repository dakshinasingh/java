package inheritance;

    class a{
        public a(){
            System.out.println("a class constructor invoked");
        }
    }
    class b extends a{
        public b(){
            System.out.println("b class constructor invoked");
        }
    }
    class c extends b{
        public c(){
            System.out.println("c class constructor invoked");
        }
    }
    class d extends c{
        public d(){
            System.out.println("d class constructor invoked");
        }
    }
    public class multilevelInheritance{
        public static void main(String args[]){
            d d1=new d();
        }
    }
    
/*
run:
a class constructor invoked
b class constructor invoked
c class constructor invoked
d class constructor invoked
*/
