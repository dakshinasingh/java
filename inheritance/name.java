package inheritance;

public class name {

    String first;
    String middle;
    String last;

    public name() {
        first = "ajay";
        middle = "pratap";
        last = "singh";
    }

    public name(String first, String middle, String last)

    {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    @Override
    public String toString() {
        return "first=" + first + "\nmiddle= " + middle + "\nlast= " + last;
    }
}

class student extends name {

    int rno;
    int m1,m2,m3;
    
    public student() {
        super();
        rno = 11;
        m1=72;
        m2=71;
        m3=84;
        
    }

    public student(String first, String middle, String last, int rno,int m1,int m2,int m3) {
        super(first, middle, last);
        this.rno = rno;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    @Override
    public String toString() {
        int total=m1+m2+m3;
        int percentage=total/3;
        String result="";
        if(percentage>90)
            result="A";
        else if((percentage>80)&&(percentage<90))
            result="B";
        else if(percentage<80)
            result="C";
        return (super.toString()+"\nrno="+rno +"\ntotal=" +total+ "\npercentage="+percentage+"\nresult="+result);
    }
}

class Teststudent {

    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student("harsh", "kumar", "singh", 26,79,90,81);
        System.out.println("Objec s1");
        System.out.println(s1);
        System.out.println();
        System.out.println("Objec s2");
        System.out.println(s2);

    }
}
/*
run:
Objec s1
first=ajay
middle= pratap
last= singh
rno=11
total=227
percentage=75
result=C

Objec s2
first=harsh
middle= kumar
last= singh
rno=26
total=250
percentage=83
result=B
*/