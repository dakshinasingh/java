package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CRUD_Customer {
    Connection con1;
    public void connect()
    {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");                
            con1=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");    //Connecting database and this
            System.out.println("Connected Successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void insert(int c_id,String name,String city)
    {
        try
        {
            PreparedStatement ps=con1.prepareStatement("insert into details(c_id,name,city)" + "values(?,?,?)");
            ps.setInt(1,c_id);
            ps.setString(2,name);
            ps.setString(3,city);
            if(ps.executeUpdate()>0)
                System.out.println("Record inserted successfully");
        
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    public void display(){
        try{
            PreparedStatement ps=con1.prepareStatement("Select * from details");
            ResultSet rs=ps.executeQuery();
            System.out.println("==================================================");
            System.out.println("c_id"+"\t"+"name"+"\t"+"city");
            System.out.println("==================================================");
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            con1.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        CRUD_Customer ob=new CRUD_Customer();
        ob.connect();
        System.out.println("Enter 1. to insert the values in the table");
        System.out.println("Enter 2. to display the data in the table");
        int ch=in.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter the customer id");
                int id=in.nextInt();
                System.out.println("Enter the name");
                String name=in.next();
                System.out.println("Enter the city");
                String city=in.next();
                ob.insert(id,name,city);
                break;
            case 2:
                ob.display();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
    
}

/*
run 1:
Connected Successfully
Enter 1. to insert the values in the table
Enter 2. to display the data in the table
1
Enter the customer id
23
Enter the name
daksh
Enter the city
bijnor
Record inserted successfully
BUILD SUCCESSFUL (total time: 13 seconds)


run 2:
Connected Successfully
Enter 1. to insert the values in the table
Enter 2. to display the data in the table
2
==================================================
c_id	name	city
==================================================
23	daksh	bijnor
BUILD SUCCESSFUL (total time: 4 seconds)
*/