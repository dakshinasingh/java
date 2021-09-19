package constructors;
class student{
    String name;
    int rollno;
    student(String name){
        this.name=name;
        
    }
    student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void print()
    {
        System.out.println("student name: "+name);
        System.out.println("student Roll no.: "+rollno);
    }
}
public class construct {
    public static void main(String args[]){
        student st1=new student("Dakshina");
        student st2=new student("Daksh",17);
        st1.print();
        st2.print();
        
    
}}
/*
output:
student name: Dakshina
student Roll no.: 0
student name: Daksh
student Roll no.: 17
*/